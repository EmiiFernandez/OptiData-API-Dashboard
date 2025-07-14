package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DocumentType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ResponsePatientDTO {
    private Long idPatient;
    private String firstName;
    private String lastName;
    private String identityDocument;
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
