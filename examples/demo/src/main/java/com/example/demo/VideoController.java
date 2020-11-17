package com.example.demo;

import io.github.danushka96.VimeoEndPointHandler;
import io.github.danushka96.enums.PrivacyScope;
import io.github.danushka96.enums.PrivacyView;
import io.github.danushka96.models.Privacy;
import io.github.danushka96.models.VideoMeta;
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
  VimeoEndPointHandler endPointHandler;

  public VideoController() {
    endPointHandler = new VimeoEndPointHandler("YOU_TOKEN_HERE");
  }

  @GetMapping(value = "/api/me", produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<ResponseEntity<String>> getMe() {
    return endPointHandler.getMe().map(jo -> ResponseEntity.ok().body(jo));
  }

  @GetMapping("/api/videos")
  public Mono<ResponseEntity<String>> getVideos() {
    return this.endPointHandler.getVideos().map(o -> ResponseEntity.ok().body(o));
  }

  @GetMapping("/api/videos/{videoId}")
  public Mono<ResponseEntity<String>> getVideo(@PathVariable("videoId") String videoId) {
    return this.endPointHandler.getVideo(videoId).map(v -> ResponseEntity.ok().body(v));
  }

  @PostMapping(value = "/api/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Mono<String> uploadVideo(@RequestPart("file") Flux<FilePart> filePartFlux, UploadDTO uploadDTO) {
    return filePartFlux
      .flatMap(f -> endPointHandler.initUploadVideo(
        VideoMeta.builder()
          .withName(uploadDTO.getTitle())
          .withDescription(uploadDTO.getDescription())
          .withPrivacy(Privacy.builder()
            .withDownload(false)
            .withEmbed(PrivacyScope.PRIVATE)
            .withView(PrivacyView.DISABLE)
            .build())
          .build())
        .flatMap(resp -> endPointHandler.uploadVideo(resp.getUpload().getUploadLink(), f)
          .doOnError(System.out::println)
          .doOnNext(System.out::println))
      ).then(Mono.just("SUCCESS"))
      .doOnError(System.out::println);
  }

  @DeleteMapping("/api/videos/{videoId}")
  public Mono<String> deleteVideo(@PathVariable("videoId") String videoId) {
    return this.endPointHandler.deleteVideo(videoId);
  }
}
