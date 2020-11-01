package io.github.danushka96.models;

import io.github.danushka96.DefaultVideoMetaBuilder;

/**
 * @author danushka
 * 10/31/2020
 */
public class VideoMeta {
  private String description;
  private String name;
  private Privacy privacy;
//  private boolean embedButtonsembed;
//  private boolean embedButtonsFullScreen;
//  private boolean embedButtonsHd;
//  private boolean embedButtonsLike;
//  private boolean embedButtonsScaling;
//  private boolean embedButtonsShare;
//  private boolean embedButtonsWatchLater;
//  private boolean embedColor;
//  private String embedLogosCustomLink;
//  private boolean embedLogosCustomSticky;
//  private boolean embedLogosVimeo;
//  private boolean embedPlaybar;
//  private String embedTitleName;
//  private EmbedOptions embedTitleOwner;
//  private EmbedOptions embedTitlePortrait;
//  private boolean embedVolume;


  public VideoMeta(String description, String name, Privacy privacy) {
    this.description = description;
    this.name = name;
    this.privacy = privacy;
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
}

