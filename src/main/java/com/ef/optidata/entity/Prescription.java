package com.ef.optidata.entity;

import com.ef.optidata.entity.enums.LensType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "prescriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrescription;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // Right Eye (OD - Oculus Dexter)
    @Column(name = "sphere_od", precision = 4, scale = 2)
    private BigDecimal sphereOD;

    @Column(name = "cylinder_od", precision = 4, scale = 2)
    private BigDecimal cylinderOD;

    @Column(name = "axis_od")
    @Min(0)
    @Max(180)
    private Integer axisOD;

    // Left Eye (OS - Oculus Sinister)
    @Column(name = "sphere_os", precision = 4, scale = 2)
    private BigDecimal sphereOS;

    @Column(name = "cylinder_os", precision = 4, scale = 2)
    private BigDecimal cylinderOS;

    @Column(name = "axis_os")
    @Min(0)
    @Max(180)
    private Integer axisOS;

    @Column(name = "addition", precision = 4, scale = 2)
    private BigDecimal addition;


    @Column(name = "prescription_date", nullable = false)
    private LocalDate prescriptionDate;

    @Column(name = "pupillary_distance")
    private BigDecimal pupillaryDistance;

    @Column(name = "diagnosis_type", nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private LensType diagnosisType;

    @Column(name = "lens_type", nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private LensType lensType;

    @Column(name = "notes", length = 1000)
    private String notes;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    // Methods
    public boolean hasAstigmatism() {
        return (cylinderOD != null && cylinderOD.compareTo(BigDecimal.ZERO) != 0) ||
                (cylinderOS != null && cylinderOS.compareTo(BigDecimal.ZERO) != 0);
    }

    public boolean requiresProgressive() {
        return lensType == LensType.PROGRESIVO &&
                addition != null &&
                addition.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isSymmetric() {
        return Objects.equals(sphereOD, sphereOS) &&
                Objects.equals(cylinderOD, cylinderOS) &&
                Objects.equals(axisOD, axisOS);
    }

    private static final DecimalFormat FORMAT = new DecimalFormat("+0.00;-0.00");

    public String getFormattedPrescriptionOD() {
        StringBuilder sb = new StringBuilder();
        if (sphereOD != null) {
            sb.append("Sph: ").append(FORMAT.format(sphereOD));
        }
        if (cylinderOD != null && cylinderOD.compareTo(BigDecimal.ZERO) != 0) {
            sb.append(" Cyl: ").append(FORMAT.format(cylinderOD));
            if (axisOD != null) {
                sb.append(" Axis: ").append(axisOD).append("°");
            }
        }
        return sb.toString();
    }

    public String getFormattedPrescriptionOS() {
        StringBuilder sb = new StringBuilder();
        if (sphereOS != null) {
            sb.append("Sph: ").append(FORMAT.format(sphereOS));
        }
        if (cylinderOS != null && cylinderOS.compareTo(BigDecimal.ZERO) != 0) {
            sb.append(" Cyl: ").append(FORMAT.format(cylinderOS));
            if (axisOS != null) {
                sb.append(" Axis: ").append(axisOS).append("°");
            }
        }
        return sb.toString();
    }

    public boolean isExpired(int validityMonths) {
        return prescriptionDate.isBefore(LocalDate.now().minusMonths(validityMonths));
    }
}


