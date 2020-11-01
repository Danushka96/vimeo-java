package io.github.danushka96.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author danushka
 * 10/31/2020
 */
public class InitVideoResponse {
  @JsonProperty("uri")
  private String uri;
  @JsonProperty("name")
  private String name;
  @JsonProperty("description")
  private String description;
  @JsonProperty("link")
  private String link;
  @JsonProperty("upload")
  private InitVideoUploadResponse upload;

  public String getUri() {
    return uri;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getLink() {
    return link;
  }

  public InitVideoUploadResponse getUpload() {
    return upload;
  }
}
