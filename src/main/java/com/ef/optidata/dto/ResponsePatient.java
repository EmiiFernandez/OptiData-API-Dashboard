package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DocumentType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePatient {
    private Long idPatient;
    private String firstName;
    private String lastName;
    private DocumentType documentType;
    private String identityDocument;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
