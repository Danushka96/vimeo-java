package com.example.demo;

/**
 * @author danushka
 * 11/1/2020
 */
public class UploadDTO {
  private String title;
  private String description;

  public UploadDTO(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
