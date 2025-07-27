package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCreatePatient {
    private Long idPatient;
    private String firstName;
    private String lastName;
    private DocumentType documentType;
    private String documentNumber;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
}
