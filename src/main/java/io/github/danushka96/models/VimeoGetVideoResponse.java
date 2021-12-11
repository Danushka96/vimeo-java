package io.github.danushka96.models;

import io.github.danushka96.models.me.Metadata;
import io.github.danushka96.models.me.Pictures;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author danushka
 * 9/26/2021
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VimeoGetVideoResponse extends GetVideoResponse {
    public String uri;
    public String name;
    public String description;
    public String type;
    public String link;
    public int duration;
    public int width;
    public Object language;
    public int height;
    public Embed embed;
    public Date created_time;
    public Date modified_time;
    public Date release_time;
    public List<String> content_rating;
    public String content_rating_class;
    public boolean rating_mod_locked;
    public Object license;
    public Privacy privacy;
    public Pictures pictures;
    public List<Object> tags;
    public Stats stats;
    public List<Object> categories;
    public Uploader uploader;
    public Metadata metadata;
    public String manage_link;
    public User user;
    public Object parent_folder;
    public Date last_user_action_event_date;
    public ReviewPage review_page;
    public String status;
    public String resource_key;
    public boolean is_playable;
    public boolean has_audio;
}
