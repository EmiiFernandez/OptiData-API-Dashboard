package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.LensType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class PrescriptionDTO {
    private Double sphereOD;
    private Double cylinderOD;
    private Integer axisOD;
    private Double sphereOS;
    private Double cylinderOS;
    private Integer axisOS;
    private Double addition;
    @Enumerated(EnumType.STRING)
    private LensType lensType;
    private LocalDate prescriptionDate;
    private Double pupillaryDistance;
    @Enumerated(EnumType.STRING)
    private LensType diagnosisType;
    private String notes;
}
