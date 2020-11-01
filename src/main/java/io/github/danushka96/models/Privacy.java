package io.github.danushka96.models;

import io.github.danushka96.enums.PrivacyScope;
import io.github.danushka96.enums.PrivacyView;

/**
 * @author danushka
 * 11/1/2020
 */
public class Privacy {
  public boolean download;
  public String embed;
  public String view;

  public Privacy(boolean download, String embed, String view) {
    this.download = download;
    this.embed = embed;
    this.view = view;
  }

  public Privacy() {
  }

  public boolean isDownload() {
    return download;
  }

  public void setDownload(boolean download) {
    this.download = download;
  }

  public String getEmbed() {
    return embed;
  }

  public void setEmbed(PrivacyScope embed) {
    this.embed = embed.getVal();
  }

  public String getView() {
    return view;
  }

  public void setView(PrivacyView view) {
    this.view = view.getVal();
  }
}
