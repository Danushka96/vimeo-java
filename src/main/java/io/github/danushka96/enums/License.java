package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/4/2020
 */
public enum License {
    BY("by"),
    BY_NC("by-nc"),
    BY_NC_ND("by-nc-nd"),
    BY_NC_SA("by-nc-sa"),
    BY_ND("by-nd"),
    BY_SA("by-sa"),
    CC0("cc0");

    private final String val;

    License(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
