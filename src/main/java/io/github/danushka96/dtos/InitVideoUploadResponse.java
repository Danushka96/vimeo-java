package io.github.danushka96.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author danushka
 * 10/31/2020
 */
public class InitVideoUploadResponse {
  @JsonProperty("status")
  private String status;
  @JsonProperty("upload_link")
  private String uploadLink;

  public String getStatus() {
    return status;
  }

  public String getUploadLink() {
    return uploadLink;
  }
}
