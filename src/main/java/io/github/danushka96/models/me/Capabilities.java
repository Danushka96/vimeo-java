package io.github.danushka96.models.me;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author danushka
 * 7/10/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Capabilities {
    public boolean hasLiveSubscription;
    public boolean hasEnterpriseLihp;
    public boolean hasSvvTimecodedComments;
}
