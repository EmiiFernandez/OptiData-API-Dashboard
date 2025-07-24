package com.ef.optidata.entity;

import com.ef.optidata.entity.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name = "consultations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private Long idOrder;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;

    private String orderNumber;
    private String productDescription;
    private BigDecimal totalAmount;
    private BigDecimal paidAmount = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    private OrderStatus status = OrderStatus.PENDING;

    private LocalDate estimatedDelivery;
    private LocalDate actualDelivery;
    private String observations;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // Métodos útiles
    public BigDecimal getRemainingBalance() {
        return totalAmount.subtract(paidAmount);
    }

    public boolean isFullyPaid() {
        return paidAmount.compareTo(totalAmount) >= 0;
    }

    public boolean isOverdue() {
        return estimatedDelivery != null &&
                LocalDate.now().isAfter(estimatedDelivery) &&
                !OrderStatus.DELIVERED.equals(status);
    }
}