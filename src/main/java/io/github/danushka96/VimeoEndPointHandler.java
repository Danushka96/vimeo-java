package io.github.danushka96;

import io.github.danushka96.dtos.InitVideoResponse;
import io.github.danushka96.models.VideoMeta;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author danushka
 * 10/23/2020
 */
public class VimeoEndPointHandler {
  private final WebClient webClient;
  private final String token;

  public VimeoEndPointHandler(String token) {
    this.token = token;
    String endPoint = "https://api.vimeo.com";
    this.webClient = WebClient.builder()
      .baseUrl(endPoint)
      .defaultHeader(HttpHeaders.AUTHORIZATION, "bearer" + " " + token)
      .build();
  }

  public Mono<String> getMe() {
    return this.webClient.get().uri("/me").retrieve().bodyToMono(String.class);
  }

  public Mono<String> getVideos() {
    return this.webClient.get().uri("/me/videos").retrieve().bodyToMono(String.class);
  }

  public Mono<String> getVideo(String videoId) {
    return this.webClient.get().uri(String.format("/videos/%s", videoId)).retrieve().bodyToMono(String.class);
  }

  public Mono<InitVideoResponse> initUploadVideo(VideoMeta meta) {
    try {
      return this.webClient.post()
        .uri("/me/videos")
        .body(BodyInserters.fromValue(meta))
        .retrieve().bodyToMono(InitVideoResponse.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return Mono.empty();
  }

  public Mono<String> uploadVideo(String uri, FilePart fileName) {
    return WebClient.builder()
      .baseUrl(uri)
      .defaultHeader(HttpHeaders.AUTHORIZATION, "bearer" + " " + token)
      .build()
      .post()
      .contentType(MediaType.MULTIPART_FORM_DATA)
      .body(BodyInserters.fromMultipartData(fromFile(fileName)))
      .retrieve().bodyToMono(String.class);
  }

  private MultiValueMap<String, HttpEntity<?>> fromFile(FilePart file) {
    MultipartBodyBuilder builder = new MultipartBodyBuilder();
    builder.part("file_data", file);
    return builder.build();
  }
}
