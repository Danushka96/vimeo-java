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
public class Versions {
    public String uri;
    public List<String> options;
    public int total;
    public String current_uri;
    public String resource_key;
}
