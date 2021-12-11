package io.github.danushka96.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author danushka
 * 10/31/2020
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
public class VimeoVideoMeta extends VideoMeta {
    private String[] content_rating;
    private String description;
    private Privacy privacy;
    private Embed embed;
    private String license;
    private Live live;
    private String locale;
    private String name;
    private String password;
    private ReviewPage review_page;
    private String scheduled_start_time;
    private Spatial spatial;
}

