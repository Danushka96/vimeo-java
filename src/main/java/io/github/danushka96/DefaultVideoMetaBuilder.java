package io.github.danushka96;

import io.github.danushka96.enums.License;
import io.github.danushka96.enums.PrivacyScope;
import io.github.danushka96.enums.PrivacyView;
import io.github.danushka96.models.*;

/**
 * @author danushka
 * 11/1/2020
 */
public final class DefaultVideoMetaBuilder {
  private String[] content_rating;
  private String description;
  private Embed embed;
  private Privacy privacy;
  private String license;
  private Live live;
  private String locale;
  private String name;
  private String password;
  private ReviewPage review_page;
  private String scheduled_start_time;
  private Spatial spatial;

  public DefaultVideoMetaBuilder() {
    this.embed = new Embed();
    this.privacy = new Privacy();
    this.live = new Live();
    this.review_page = new ReviewPage();
    this.spatial = new Spatial();
  }

  /**A list of values describing the content in this video.
   * Find the full list in the /contentratings endpoint.
   * @param content_rating
   * @return DefaultVideoMetaBuilder
   */
  public DefaultVideoMetaBuilder withContentRating(String[] content_rating) {
    this.content_rating = content_rating;
    return this;
  }

  /**
   * The description of the video. This field can hold a maximum of 5000 characters.
   * @param description
   * @return DefaultVideoMetaBuilder
   */
  public DefaultVideoMetaBuilder withDescription(String description) {
    this.description = description;
    return this;
  }

  public DefaultVideoMetaBuilder withEmbed(Embed embed){
    this.embed = embed;
    return this;
  }

  /**
   * The Creative Commons license under which the video is offered.
   * by
   * by-nc
   * by-nc-nd
   * by-nc-sa
   * by-nd
   * by-sa
   * cc0
   * @param license
   * @return DefaultVideoMetaBuilder
   */
  public DefaultVideoMetaBuilder withLicence(License license){
    this.license = license.getVal();
    return this;
  }

  public DefaultVideoMetaBuilder withLive(Live live){
    this.live = live;
    return this;
  }

  /**
   * The video's default language. For a full list of supported languages, use the /languages?filter=texttracks endpoint.
   * @param local
   * @return
   */
  public DefaultVideoMetaBuilder withLocal(String local){
    this.locale = local;
    return this;
  }

  /**
   * The title of the video. This field can hold a maximum of 128 characters.
   * @param name
   * @return
   */
  public DefaultVideoMetaBuilder withName(String name) {
    this.name = name;
    return this;
  }

  /**
   * The password. When you set privacy.view to password, you must provide the password as an additional parameter.
   * This field can hold a maximum of 32 characters.
   * @param password
   * @return
   */
  public DefaultVideoMetaBuilder withPassword(String password) {
    this.password = password;
    return this;
  }

  public DefaultVideoMetaBuilder withPrivacy(Privacy privacy){
    this.privacy = privacy;
    return this;
  }

  public DefaultVideoMetaBuilder withReviewPage(ReviewPage review_page){
    this.review_page = review_page;
    return this;
  }

  public DefaultVideoMetaBuilder withScheduledStartTime(String scheduledStartTime){
    this.scheduled_start_time = scheduledStartTime;
    return this;
  }



  public VideoMeta build() {
    return new VideoMeta(description, name, privacy);
  }
}
