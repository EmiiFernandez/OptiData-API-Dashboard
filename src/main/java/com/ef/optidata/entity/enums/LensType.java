package com.ef.optidata.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LensType {
    MONOFOCAL("Monofocal"),
    BIFOCAL("Bifocal"),
    PROGRESIVO("Progresivo"),
    CERCA("Cerca"),
    INTERMEDIA ("Intermedia"),
    LEJOS("Lejos"),
    BLUE_LIGHT("Blue Light"),
    AR("Antirreflex");

    private final String description;

}