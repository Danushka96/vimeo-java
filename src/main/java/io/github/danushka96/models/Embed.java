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
public class Embed {
    private Buttons buttons;
    private String color;
    private Logos logos;
    private boolean playbar;
    private Title title;
    private boolean volume;
}

