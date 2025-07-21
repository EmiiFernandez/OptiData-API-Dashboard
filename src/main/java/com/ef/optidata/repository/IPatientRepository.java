package com.ef.optidata.repository;

import com.ef.optidata.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Long> {
    Boolean existsByIdentityDocumentAndBirthDate(String identityDocument, LocalDate birthDate);
}
