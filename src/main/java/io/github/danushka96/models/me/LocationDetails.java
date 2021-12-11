package io.github.danushka96.models.me;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author danushka
 * 7/10/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationDetails {
    public String formatted_address;
    public Object latitude;
    public Object longitude;
    public Object city;
    public Object state;
    public Object neighborhood;
    public Object sub_locality;
    public Object state_iso_code;
    public Object country;
    public Object country_iso_code;
}
