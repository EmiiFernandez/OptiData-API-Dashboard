package com.ef.optidata.entity;

import com.ef.optidata.entity.enums.DocumentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Entity
@Table(name = "patients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "document_type", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;

    @Column(name = "identity_document", nullable = false, unique = true, length = 20)
    private String identityDocument;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "email", length = 150)
    @Email
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "active", nullable = false)
    private Boolean active = true;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    // Methods
    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
