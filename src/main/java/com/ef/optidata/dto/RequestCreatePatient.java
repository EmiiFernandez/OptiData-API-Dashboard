package com.ef.optidata.dto;

import com.ef.optidata.entity.enums.DocumentType;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCreatePatient {
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String firstName;

    @NotBlank(message = "El apellido es obligatorio")
    @Size(min = 2, max = 50, message = "El apellido debe tener entre 2 y 50 caracteres")
    private String lastName;

    @NotNull(message = "El tipo de documento es obligatorio")
    private DocumentType documentType;

    @NotBlank(message = "El documento de identidad es obligatorio")
    private String documentNumber;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Past(message = "La fecha de nacimiento debe ser anterior a hoy")
    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private LocalDate birthDate;

    @Email(message = "El email debe tener un formato válido")
    private String email;

    @Pattern(regexp = "^[0-9+\\-\\s()]+$", message = "El teléfono solo puede contener números, espacios, +, - y paréntesis")
    private String phone;
}
