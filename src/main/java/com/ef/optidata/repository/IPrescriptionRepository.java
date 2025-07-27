package com.ef.optidata.repository;

import com.ef.optidata.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPrescriptionRepository extends JpaRepository<Prescription, Long> {
    List<Prescription> findAllPrescriptionByPatient_IdPatient(Long idPatient);
}
