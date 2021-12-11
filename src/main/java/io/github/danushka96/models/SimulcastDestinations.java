package io.github.danushka96.models;

import lombok.*;

/**
 * @author danushka
 * 11/14/2020
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SimulcastDestinations {
    private SimulcastDestinationsMetaData metaData;
    private String rtmp_link;
    private String service_name;
    private String stream_key;
}
