package com.ef.optidata.entity.enums;

import com.ef.optidata.config.Translator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiagnosisType {
    MYOPIA("diagnosisType.myopia"),
    HYPEROPIA("diagnosisType.hyperopia"),
    ASTIGMATISM("diagnosisType.astigmatism"),
    PRESBYOPIA("diagnosisType.presbyopia"),
    ANISOMETROPIA("diagnosisType.anisometropia"),
    AMBLYOPIA("diagnosisType.amblyopia"),
    STRABISMUS("diagnosisType.strabismus"),
    DIABETIC_RETINOPATHY("diagnosisType.diabetic_retinopathy"),
    GLAUCOMA("diagnosisType.glaucoma"),
    CATARACT("diagnosisType.cataract"),
    DRY_EYE_SYNDROME("diagnosisType.dry_eye_syndrome"),
    MACULAR_DEGENERATION("diagnosisType.macular_degeneration"),
    PHOTOPHOBIA("diagnosisType.photophobia"),
    DIPLOPIA("diagnosisType.diplopia"),
    LOW_VISION("diagnosisType.low_vision");

    private final String messageKey;

    public String getDiagnosisTypeDescription() {
        return Translator.toLocale(this.messageKey);
    }
}

