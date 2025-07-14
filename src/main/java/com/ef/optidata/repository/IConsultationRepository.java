package com.ef.optidata.repository;

import com.ef.optidata.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsultationRepository extends JpaRepository<Consultation, Long> {
}
