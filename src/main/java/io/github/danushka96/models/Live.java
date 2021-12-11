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
public class Live {
    private SimulcastDestinations[] simulcast_destinations;
    private boolean simulcast_only;
    private String status;
}
