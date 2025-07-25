package com.ef.optidata.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentType {
    NATIONAL_ID("DNI"),
    PASSPORT("Pasaporte"),
    ID_CARD("Cédula"),
    FOREIGN_ID("ID Extranjero");

    private final String description;
}
