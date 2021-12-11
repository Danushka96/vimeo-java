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
public class ReviewPage {
    private boolean active;
    private boolean notes;
    private boolean vimeo_logo;
}
