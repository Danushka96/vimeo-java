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
public class StaffPick {
    public boolean normal;
    public boolean best_of_the_month;
    public boolean best_of_the_year;
    public boolean premiere;
}
