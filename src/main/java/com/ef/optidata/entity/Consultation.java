package com.ef.optidata.entity;

import com.ef.optidata.entity.enums.LensType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name = "consultations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsultation;

    @Column(name = "patient_id", nullable = false)
    private Long patientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
    private Patient patient;

    @Column(name = "consultation_date", nullable = false)
    private LocalDateTime consultationDate;

    @Column(name = "reason", nullable = false, length = 500)
    private String reason;

    @Column(name = "observations", length = 2000)
    private String observations;

    @Column(name = "active", nullable = false)
    private Boolean active = true;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    // Methods
    public boolean hasObservations() {
        return observations != null && !observations.trim().isEmpty();
    }

    public String getFormattedConsultationDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return consultationDate.format(formatter);
    }

    public boolean isToday() {
        return consultationDate.toLocalDate().equals(LocalDate.now());
    }

    public long getDaysSinceConsultation() {
        return ChronoUnit.DAYS.between(consultationDate.toLocalDate(), LocalDate.now());
    }
}