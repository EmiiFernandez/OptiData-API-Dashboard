package com.ef.optidata.repository;

import com.ef.optidata.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPrescriptionRepository extends JpaRepository<Prescription, Long> {
    List<Prescription> findAllPrescriptionByPatient_IdPatient(Long idPatient);
    @Query("SELECT p FROM Prescription p JOIN FETCH p.patient")
    List<Prescription> findAllWithPatient();
}
