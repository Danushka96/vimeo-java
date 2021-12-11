package io.github.danushka96.models.me;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author danushka
 * 7/10/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Periodic {
    public long free;
    public long max;
    public long used;
    public Date reset_date;
}
