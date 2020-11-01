package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/1/2020
 */
public enum PrivacyScope {
  PRIVATE("private"),
  PUBLIC("public"),
  WHITELIST("whitelist");

  private final String val;

  PrivacyScope(String val) {
    this.val = val;
  }

  public String getVal() {
    return val;
  }
}
