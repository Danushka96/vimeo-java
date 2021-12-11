package io.github.danushka96.models.me;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author danushka
 * 7/10/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Likes {
    public String uri;
    public List<String> options;
    public int total;
}
