package com.patientRegistrationService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author MR.k0F31n
 */
@AllArgsConstructor
@Builder
@Data
@Entity(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long uuid;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(name = "specification")
    @Enumerated(EnumType.STRING)
    private Specialization specialization;
    @Column(name = "employment_date")
    private LocalDate employmentDate;
}
