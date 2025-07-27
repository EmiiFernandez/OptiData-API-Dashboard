package com.ef.optidata.entity.enums;

import com.ef.optidata.config.Translator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentType {
    DNI("documentType.dni"),
    PASSPORT("documentType.passport"),
    ID_CARD("documentType.id_card"),
    FOREIGN_ID("documentType.foreign_id");

    private final String messageKey;

    public String getDocumentTypeDescription() {
        return Translator.toLocale(this.messageKey);
    }
}