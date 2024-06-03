package io.github.danushka96.dtos;

import io.github.danushka96.models.Clip;
import io.github.danushka96.models.InitVideoResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author danushka
 * 10/31/2020
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VimeoInitVideoResponse extends InitVideoResponse {
    private String upload_link;
    private Clip clip;
}
