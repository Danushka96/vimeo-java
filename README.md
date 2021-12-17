# Vimeo-Java Client SDK
[![Maven central release](https://github.com/Danushka96/vimeo-java/actions/workflows/maven.yml/badge.svg?branch=master)](https://github.com/Danushka96/vimeo-java/actions/workflows/maven.yml) [![Maven Central](https://img.shields.io/maven-central/v/io.github.danushka96/vimeo-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.danushka96%22%20AND%20a:%22vimeo-java%22)

Java Client for [Vimeo ](https://vimeo.com/)

## Features

1. Upload Videos
2. List All Videos
3. Single Video Details
4. Delete Video

## Todo

* Edit Uploaded Video
* Upload with Thus Protocol

## Install with maven

```
<dependency>
  <groupId>io.github.danushka96</groupId>
  <artifactId>vimeo-java</artifactId>
  <version>0.0.19</version>
</dependency>
```

## Install with Gradle

```
implementation 'io.github.danushka96:vimeo-java:0.0.19'
```

## How to Use

1. Create a new [API App](https://developer.vimeo.com/apps/new?source=topnav) in Vimeo 
2. Generate a personal access token with permissions
3. Give this key to the Vimeo-java-client

## Example

### Controller

```lang=java
@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
public Mono<ResponseEntity> uploadFile(@RequestPart("files") Flux<FilePart> filePartFlux) {
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
```

## Contribution

Feel free to open issues if you face some kind of problem.
