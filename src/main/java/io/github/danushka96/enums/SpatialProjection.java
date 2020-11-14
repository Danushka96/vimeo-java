package io.github.danushka96.enums;

/**
 * @author danushka
 * 11/4/2020
 */
public enum  SpatialProjection {
    CUBICAL("cubical"),
    CYLINDRICAL("cylindrical"),
    DOME("dome"),
    EQUIRECTANGULAR("equirectangular"),
    PYRAMID("pyramid");

    private final String val;

    SpatialProjection(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
