package io.github.danushka96;

import io.github.danushka96.enums.PrivacyScope;
import io.github.danushka96.enums.PrivacyView;
import io.github.danushka96.models.Privacy;
import io.github.danushka96.models.VideoMeta;

/**
 * @author danushka
 * 11/1/2020
 */
public final class DefaultVideoMetaBuilder {
  private String description;
  private String name;
  private final Privacy privacy = new Privacy();

  public DefaultVideoMetaBuilder() {
  }

  public DefaultVideoMetaBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public DefaultVideoMetaBuilder withDescription(String description) {
    this.description = description;
    return this;
  }

  public DefaultVideoMetaBuilder withDownloadEnabled(boolean value) {
    this.privacy.download = value;
    return this;
  }

  public DefaultVideoMetaBuilder withPrivacyEmbed(PrivacyScope embed) {
    this.privacy.embed = embed.getVal();
    return this;
  }

  public DefaultVideoMetaBuilder withPrivacyView(PrivacyView view) {
    this.privacy.view = view.getVal();
    return this;
  }

  public VideoMeta build() {
    return new VideoMeta(description, name, privacy);
  }
}
