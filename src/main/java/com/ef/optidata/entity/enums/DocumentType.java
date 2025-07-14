package com.ef.optidata.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentType {
    DNI("DNI"),
    PASAPORTE("Pasaporte"),
    CEDULA("Cedula"),
    EXTRANJERO_ID("ID Extranjero");

    private final String description;

}