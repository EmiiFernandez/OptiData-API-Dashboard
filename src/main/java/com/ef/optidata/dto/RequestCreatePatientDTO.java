package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DocumentType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class RequestCreatePatientDTO {
    private String firstName;
    private String lastName;
    private String identityDocument;
    private DocumentType documentType;
    private LocalDate birthDate;
    private String email;
    private String phone;
}
