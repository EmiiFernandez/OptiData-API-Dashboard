package com.ef.optidata.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "sales")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sale_id")
    private Long idSale;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "delivery_date")
    private LocalDateTime deliveryDate;

    @Column(name = "delivery_by")
    private String deliveredBy;

    @Column(name = "customer_signature")
    private String customerSignature;

    @Column(name = "notes")
    private String deliveryNotes;

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createdAt;
}
