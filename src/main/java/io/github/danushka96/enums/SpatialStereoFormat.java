package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/4/2020
 */
public enum SpatialStereoFormat {
    LEFT_RIGHT("left-right"),
    MONO("mono"),
    TOP_BOTTOM("top_bottom");

    private final String val;

    SpatialStereoFormat(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
