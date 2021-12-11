package io.github.danushka96.dtos;

import io.github.danushka96.models.InitVideoResponse;
import io.github.danushka96.models.me.Pictures;
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
    private String uri;
    private String name;
    private String description;
    private String link;
    private Pictures pictures;
    private InitVideoUploadResponse upload;
}
