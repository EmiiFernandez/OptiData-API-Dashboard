package com.ef.optidata.entity;

import com.ef.optidata.entity.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    @Column(name="order_number")
    private String orderNumber;

    @Column(name="product_description")
    private String productDescription;

    @Column(name="total_amount")
    private BigDecimal totalAmount;

    @Column(name="paid_amount")
    private BigDecimal paidAmount = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    @Column(name="order_status")
    private OrderStatus status = OrderStatus.PENDING;

    @Column(name="estimated_delivery")
    private LocalDate estimatedDelivery;

    @Column(name="actual_delivery")
    private LocalDate actualDelivery;

    @Column(name="observations")
    private String observations;

    @CreationTimestamp
    @Column(name="created_at")
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