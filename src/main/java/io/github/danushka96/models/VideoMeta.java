package io.github.danushka96.models;

import io.github.danushka96.DefaultVideoMetaBuilder;

/**
 * @author danushka
 * 10/31/2020
 */
public class VideoMeta {
  private String[] content_rating;
  private String description;
  private Privacy privacy;
  private Embed embed;
  private String license;
  private Live live;
  private String locale;
  private String name;
  private String password;
  private ReviewPage review_page;
  private String scheduled_start_time;
  private Spatial spatial;

  public VideoMeta(String[] content_rating, String description, Privacy privacy, Embed embed, String license, Live live,
                   String locale, String name, String password, ReviewPage review_page, String scheduled_start_time,
                   Spatial spatial) {
    this.content_rating = content_rating;
    this.description = description;
    this.privacy = privacy;
    this.embed = embed;
    this.license = license;
    this.live = live;
    this.locale = locale;
    this.name = name;
    this.password = password;
    this.review_page = review_page;
    this.scheduled_start_time = scheduled_start_time;
    this.spatial = spatial;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Privacy getPrivacy() {
    return privacy;
  }

  public void setPrivacy(Privacy privacy) {
    this.privacy = privacy;
  }

  public static DefaultVideoMetaBuilder builder(){
    return new DefaultVideoMetaBuilder();
  }

  public String[] getContent_rating() {
    return content_rating;
  }

  public void setContent_rating(String[] content_rating) {
    this.content_rating = content_rating;
  }

  public Embed getEmbed() {
    return embed;
  }

  public void setEmbed(Embed embed) {
    this.embed = embed;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Live getLive() {
    return live;
  }

  public void setLive(Live live) {
    this.live = live;
  }

  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ReviewPage getReview_page() {
    return review_page;
  }

  public void setReview_page(ReviewPage review_page) {
    this.review_page = review_page;
  }

  public String getScheduled_start_time() {
    return scheduled_start_time;
  }

  public void setScheduled_start_time(String scheduled_start_time) {
    this.scheduled_start_time = scheduled_start_time;
  }

  public Spatial getSpatial() {
    return spatial;
  }

  public void setSpatial(Spatial spatial) {
    this.spatial = spatial;
  }
}

