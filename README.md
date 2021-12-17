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

```lang=java
public static void main(String[] args) {
    VimeoEndPointHandler endPointHandler = new VimeoEndPointHandler("YOUR-TOKEN-HERE");
    VideoMeta videoMeta = VideoMeta.builder()
      .withName("Title Here")
      .withDescription("Description Here")
      .withPrivacy(Privacy.builder()
        .withDownload(false)
        .withEmbed(PrivacyScope.PRIVATE)
        .withView(PrivacyView.DISABLE)
        .build())
      .build();
    endPointHandler.initUploadVideo(videoMeta).subscribe(response -> {
      endPointHandler.uploadVideo(response.getUri(), new File("./path/to/your/file"));
    });
  }
```

## Contribution

Feel free to open issues if you face some kind of problem.
