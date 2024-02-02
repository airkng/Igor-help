package com.patientRegistrationService.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

/**
 * @author MR.k0F31n
 */

@Data
public class Doctor {
    private Long id;
    private Long uuid;
    private String firstname;
    private String lastname;
    private String Specification;
    private LocalDate EmploymentDate;
}
