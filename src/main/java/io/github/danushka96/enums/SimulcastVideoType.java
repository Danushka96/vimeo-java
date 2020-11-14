package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/14/2020
 */
public enum SimulcastVideoType {
    EVENT("event"),
    GROUP("group"),
    PAGE("page"),
    PROFILE("profile"),
    SCHEDULED_BROADCAST("scheduled_broadcast");

    private final String val;

    SimulcastVideoType(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
