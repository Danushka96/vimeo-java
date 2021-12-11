package io.github.danushka96;

import io.github.danushka96.dtos.GetMeResponse;
import io.github.danushka96.dtos.VimeoInitVideoResponse;
import io.github.danushka96.models.VideoMeta;
import io.github.danushka96.models.VimeoGetVideoResponse;
import io.github.danushka96.models.VimeoVideoMeta;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;

/**
 * @author danushka
 * 10/23/2020
 */
@SuppressWarnings({"unchecked"})
public class VimeoVideoService implements VideoService {
    private final WebClient webClient;
    private final String token;

    public VimeoVideoService(String token) {
        this.token = token;
        String endPoint = "https://api.vimeo.com";
        this.webClient = WebClient.builder()
                .baseUrl(endPoint)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "bearer" + " " + token)
                .build();
    }

    @Override
    public Mono<String> getVideos() {
        return this.webClient.get().uri("/me/videos")
                .retrieve()
                .bodyToMono(String.class)
                .retryWhen(Retry.backoff(3, Duration.ofSeconds(2)).jitter(0.75));
    }

    @Override
    public Mono<String> uploadVideo(String uri, FilePart fileName) {
        return WebClient.builder()
                .baseUrl(uri)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "bearer" + " " + token)
                .build()
                .post()
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(fromFile(fileName)))
                .retrieve().bodyToMono(String.class)
                .retryWhen(Retry.backoff(3, Duration.ofSeconds(2)).jitter(0.75));
    }

    @Override
    public Mono<String> deleteVideo(String videoId) {
        return this.webClient.delete()
                .uri("/videos/" + videoId)
                .retrieve().bodyToMono(String.class)
                .retryWhen(Retry.backoff(3, Duration.ofSeconds(2)).jitter(0.75));
    }

    private MultiValueMap<String, HttpEntity<?>> fromFile(FilePart file) {
        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("file_data", file);
        return builder.build();
    }

    @Override
    public Mono<GetMeResponse> getStats() {
        return this.webClient.get().uri("/me")
                .retrieve()
                .bodyToMono(GetMeResponse.class)
                .retryWhen(Retry.backoff(3, Duration.ofSeconds(2)).jitter(0.75));
    }

    @Override
    public Mono<VimeoGetVideoResponse> getVideo(String videoId) {
        return this.webClient
                .get()
                .uri(String.format("/videos/%s", videoId))
                .retrieve()
                .bodyToMono(VimeoGetVideoResponse.class)
                .doOnError(err -> new VimeoGetVideoResponse())
                .retryWhen(Retry.backoff(3, Duration.ofSeconds(2))
                        .filter(err -> !(err instanceof WebClientResponseException.NotFound))
                        .jitter(0.75));
    }

    @Override
    public Mono<VimeoInitVideoResponse> initVideoUploadMeta(VideoMeta videoMeta) {
        if (videoMeta instanceof VimeoVideoMeta) {
            VimeoVideoMeta meta = (VimeoVideoMeta) videoMeta;
            try {
                return this.webClient.post()
                        .uri("/me/videos")
                        .body(BodyInserters.fromValue(meta))
                        .retrieve().bodyToMono(VimeoInitVideoResponse.class)
                        .retryWhen(Retry.backoff(3, Duration.ofSeconds(2)).jitter(0.75));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Mono.empty();
    }
}
