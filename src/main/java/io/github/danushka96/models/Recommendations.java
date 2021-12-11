package io.github.danushka96.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author danushka
 * 9/26/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recommendations {
    public String uri;
    public List<String> options;
}
