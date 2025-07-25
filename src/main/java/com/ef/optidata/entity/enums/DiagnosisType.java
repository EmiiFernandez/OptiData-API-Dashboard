package com.ef.optidata.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiagnosisType {
    MYOPIA("Miopía"),
    HYPEROPIA("Hipermetropía"),
    ASTIGMATISM("Astigmatismo"),
    PRESBYOPIA("Presbicia"),
    ANISOMETROPIA("Anisometropía"),
    AMBLYOPIA("Ambliopía"),
    STRABISMUS("Estrabismo"),
    DIABETIC_RETINOPATHY("Retinopatía diabética"),
    GLAUCOMA("Glaucoma"),
    CATARACT("Catarata"),
    DRY_EYE_SYNDROME("Síndrome de ojo seco"),
    MACULAR_DEGENERATION("Degeneración macular"),
    PHOTOPHOBIA("Fotofobia"),
    DIPLOPIA("Diplopía"),
    LOW_VISION("Baja visión");

    private final String description;
}
