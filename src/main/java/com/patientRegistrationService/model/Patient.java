package com.patientRegistrationService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author MR.k0F31n
 */
@Data
@Entity
@Table(name = "patients")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long uuid;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(name = "birthday")
    private LocalDate birthDay;
    @Column(name = "date_last_appointment")
    private LocalDateTime lastTimeAppointment;
    @Column(name = "number_phone", nullable = false)
    private Integer numberPhone;
    private String email;
}
