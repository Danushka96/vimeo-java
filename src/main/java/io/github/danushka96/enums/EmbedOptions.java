package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/1/2020
 */
public enum EmbedOptions {
    HIDE("hide"),
    SHOW("show"),
    USER("user");

    String value;

    EmbedOptions(String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
