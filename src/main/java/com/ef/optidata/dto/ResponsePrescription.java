package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DiagnosisType;
import com.ef.optidata.entity.enums.DocumentType;
import com.ef.optidata.entity.enums.LensType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePrescription {
    private Long idPatient;
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
    private LocalDateTime createdAt;
}
