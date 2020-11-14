package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/14/2020
 */
public enum ServiceNames {
    CUSTOM_RTMP("custom_rtmp"),
    FACEBOOK("facebook"),
    LIVESTREAM("livestream"),
    PERISCOPE("periscope"),
    YOUTUBE("youtube");
    private final String val;

    ServiceNames(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
