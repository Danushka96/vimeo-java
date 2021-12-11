package io.github.danushka96.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author danushka
 * 9/26/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Badges {
    public boolean hdr;
    public Live live;
    public StaffPick staff_pick;
    public boolean vod;
    public boolean weekend_challenge;
}
