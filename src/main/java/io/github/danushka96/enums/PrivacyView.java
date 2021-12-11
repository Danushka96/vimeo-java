package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/1/2020
 */
public enum PrivacyView {
    ANYBODY("anybody"),
    CONTACTS("contacts"),
    DISABLE("disable"),
    NOBODY("nobody"),
    PASSWORD("password"),
    UNLISTED("UNLISTED"),
    USERS("USERS");

    private final String val;

    PrivacyView(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
