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
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private LocalDateTime deliveryDate;
    private String deliveredBy;
    private String customerSignature; 
    private String deliveryNotes;
    private Boolean customerSatisfied = true;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
