package io.github.danushka96.models;

import lombok.*;

/**
 * @author danushka
 * 11/1/2020
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Privacy {
    public boolean add;
    public String comments;
    public boolean download;
    public String embed;
    public String view;
}
