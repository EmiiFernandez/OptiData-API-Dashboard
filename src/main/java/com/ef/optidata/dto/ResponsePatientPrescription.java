package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePatientPrescription {
    private Long idPatient;
    private String firstName;
    private String lastName;
    private DocumentType documentType;
    private String documentNumber;
    private List<ResponsePrescription> prescriptions;
}
