package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/14/2020
 */
public enum SocialPrivacy {
    ALL_FRIENDS("all_friends "),
    CUSTOM("custom "),
    EVERYONE("everyone "),
    FRIEND_OF_FRIENDS("friends_of_friends "),
    PRIVATE("private "),
    PUBLIC("public"),
    SELF("self"),
    UNLISTED("unlisted");

    private String val;

    SocialPrivacy(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
