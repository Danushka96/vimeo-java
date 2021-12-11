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
public class DirectorTimeline {
    private int pitch;
    private int roll;
    private int time_code;
    private int yaw;
}
