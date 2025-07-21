package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.LensType;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionDTO {
    private Double sphereOD;
    private Double cylinderOD;
    private Integer axisOD;
    private Double sphereOS;
    private Double cylinderOS;
    private Integer axisOS;
    private Double addition;
    private LensType lensType;
    private LocalDate prescriptionDate;
    private Double pupillaryDistance;
    private LensType diagnosisType;
    private String notes;
}
