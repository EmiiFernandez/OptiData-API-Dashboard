package com.ef.optidata.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiagnosisType {
    MIOPIA ("Miopía"),
    HIPERMETROPIA ("Hipermetropía"),
    ASTIGMATISMO ("Astigmatismo"),
    PRESBICIA ("Presbicia"),
    ANISOMETROPIA ("Anisometropía"),
    AMBLIOPIA ("Ambliopía"),
    ESTRABISMO ("Estrabismo"),
    RETINOPATIA_DIABETICA ("Retinopatía diabética"),
    GLAUCOMA ("Glaucoma"),
    CATARATA ("Catarata"),
    SINDROME_OJO_SECO ("Sindrome de ojo seco"),
    DEGENERACION_MACULAR ("Degeneración macular"),
    FOTOFOBIA ("Fotofobia"),
    DIPLOPIA ("Diplopia"),
    BAJA_VISION ("Baja visión");

    private final String description;
}
