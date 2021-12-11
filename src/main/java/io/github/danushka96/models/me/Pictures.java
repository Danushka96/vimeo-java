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
public class Pictures {
    public String uri;
    public boolean active;
    public String type;
    public List<Size> sizes;
    public String resource_key;
    public boolean default_picture;
    public List<String> options;
    public int total;
}
