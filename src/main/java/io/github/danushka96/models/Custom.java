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
public class Custom {
    private boolean active;
    private boolean id;
    private boolean sticky;
    private String link;
}
