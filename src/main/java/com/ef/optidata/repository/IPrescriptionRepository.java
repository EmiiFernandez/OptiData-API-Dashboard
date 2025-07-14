package com.ef.optidata.repository;

import com.ef.optidata.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrescriptionRepository extends JpaRepository<Prescription, Long> {
}
