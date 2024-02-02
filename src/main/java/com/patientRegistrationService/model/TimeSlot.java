package com.patientRegistrationService.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author MR.k0F31n
 */
@Data
public class TimeSlot {
    private Long id;
    private LocalDateTime timeStartReception;
}
