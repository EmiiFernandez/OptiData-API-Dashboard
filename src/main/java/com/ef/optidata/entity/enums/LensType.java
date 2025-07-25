package com.ef.optidata.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LensType {
    SINGLE_VISION("Monofocal"),
    BIFOCAL("Bifocal"),
    PROGRESSIVE("Progresivo"),
    NEAR("Cerca"),
    INTERMEDIATE("Intermedia"),
    DISTANCE("Lejos"),
    BLUE_LIGHT("Blue Light"), // Puede dejarse así si se usa tal cual comercialmente
    AR("Antirreflex");

    private final String description;
}
