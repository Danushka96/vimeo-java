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
public class SimulcastDestinationsMetaData {
    private String description;
    private String event_id;
    private String parent_id;
    private String privacy;
    private boolean should_tweet;
    private String title;
    private String type;
    private String user_id;
    private String video_id;
}
