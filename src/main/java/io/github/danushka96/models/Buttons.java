package io.github.danushka96.models;

import lombok.*;

/**
 * @author danushka
 * 11/4/2020
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Buttons {
    private boolean embed;
    private boolean fullscreen;
    private boolean hd;
    private boolean like;
    private boolean scaling;
    private boolean share;
    private boolean watchlater;
}