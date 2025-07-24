package com.ef.optidata.repository;

import com.ef.optidata.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsultationRepository extends JpaRepository<Order, Long> {
}
