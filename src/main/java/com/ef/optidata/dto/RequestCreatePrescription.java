package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DiagnosisType;
import com.ef.optidata.entity.enums.LensType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCreatePrescription {
    private String documentNumber;
    private Double sphereOD;
    private Double cylinderOD;
    private Integer axisOD;
    private Double sphereOS;
    private Double cylinderOS;
    private Integer axisOS;
    private Double addition;
    private LensType lensType;
    private Double pupillaryDistance;
    private DiagnosisType diagnosisType;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate prescriptionDate;
    private String notes;
}
