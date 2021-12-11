package io.github.danushka96.dtos;

import io.github.danushka96.models.StatsResponse;
import io.github.danushka96.models.me.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * @author danushka
 * 7/10/2021
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GetMeResponse extends StatsResponse {
    public String uri;
    public String name;
    public String link;
    public Capabilities capabilities;
    public String location;
    public String gender;
    public Object bio;
    public Object short_bio;
    public Date created_time;
    public Pictures pictures;
    public List<Object> websites;
    public Metadata metadata;
    public LocationDetails location_details;
    public List<Object> skills;
    public boolean available_for_hire;
    public boolean can_work_remotely;
    public Preferences preferences;
    public List<String> content_filter;
    public UploadQuota upload_quota;
    public String resource_key;
    public String account;
}

