package com.ef.optidata.entity.enums;

import com.ef.optidata.config.Translator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LensType {
    SINGLE_VISION("lensType.single_vision"),
    BIFOCAL("lensType.bifocal"),
    PROGRESSIVE("lensType.progressive"),
    NEAR("lensType.near"),
    INTERMEDIATE("lensType.intermediate"),
    DISTANCE("lensType.distance"),
    BLUE_LIGHT("lensType.blue_light"),
    AR("lensType.ar");

    private final String messageKey;

    public String getLensTypeDescription() {
        return Translator.toLocale(this.messageKey);
    }
}
