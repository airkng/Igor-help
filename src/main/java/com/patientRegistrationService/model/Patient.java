package com.patientRegistrationService.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author MR.k0F31n
 */
@Data
public class Patient {
    private Long id;
    private Long uuid;
    private String firstname;
    private String lastname;
    private LocalDate birthDay;
    private LocalDateTime lastTimeAppointment;
}
