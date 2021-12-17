package com.example.demo;

import io.github.danushka96.VimeoVideoService;
import io.github.danushka96.enums.EmbedOptions;
import io.github.danushka96.enums.PrivacyScope;
import io.github.danushka96.enums.PrivacyView;
import io.github.danushka96.models.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author danushka
 * 10/23/2020
 */
@RestController
public class VideoController {
    private final VimeoVideoService vimeoVideoService;

    public VideoController() {
        this.vimeoVideoService = new VimeoVideoService("YOU_TOKEN_HERE");
    }

    @GetMapping(value = "/api/stats", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<StatsResponse>> getMe() {
        return vimeoVideoService.getStats()
                .map(ResponseEntity::ok);
    }

    @GetMapping("/api/videos")
    public Mono<ResponseEntity<String>> getVideos() {
        return vimeoVideoService.getVideos()
                .map(ResponseEntity::ok);
    }

    @GetMapping("/api/videos/{videoId}")
    public Mono<ResponseEntity<VimeoGetVideoResponse>> getVideo(@PathVariable("videoId") String videoId) {
        return vimeoVideoService.getVideo(videoId)
                .map(ResponseEntity::ok);
    }

    @PostMapping(value = "/api/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Mono<String> uploadVideo(@RequestPart("file") Flux<FilePart> filePartFlux, UploadDTO uploadDTO) {
        VimeoVideoMeta videoMeta = VimeoVideoMeta.builder()
                .name("My test video")
                .description("Test video description")
                .embed(Embed.builder()
                        .playbar(true)
                        .volume(true)
                        .buttons(Buttons.builder()
                                .hd(true)
                                .like(false)
                                .scaling(true)
                                .share(false)
                                .watchlater(false)
                                .fullscreen(true)
                                .build())
                        .title(Title.builder()
                                .portrait(EmbedOptions.HIDE.getValue())
                                .owner(EmbedOptions.HIDE.getValue())
                                .name(EmbedOptions.HIDE.getValue())
                                .build())
                        .logos(Logos.builder()
                                .vimeo(false)
                                .build())
                        .build()
                )
                .privacy(Privacy.builder()
                        .download(false)
                        .embed(PrivacyScope.WHITELIST.getVal())
                        .view(PrivacyView.DISABLE.getVal())
                        .build())
                .build();

        return filePartFlux
                .flatMap(f -> vimeoVideoService.initVideoUploadMeta(videoMeta)
                        .flatMap(resp -> vimeoVideoService.uploadVideo(resp.getUpload().getUploadLink(), f)
                                .doOnError(System.out::println)
                                .doOnNext(System.out::println)))
                .then(Mono.just("SUCCESS"))
                .doOnError(System.out::println);
    }

    @DeleteMapping("/api/videos/{videoId}")
    public Mono<String> deleteVideo(@PathVariable("videoId") String videoId) {
        return this.vimeoVideoService.deleteVideo(videoId);
    }
}
