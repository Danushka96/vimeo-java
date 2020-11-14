package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/4/2020
 */
public enum LiveStatus {
    DONE("done"),
    READY("ready");

    private final String val;

    LiveStatus(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
