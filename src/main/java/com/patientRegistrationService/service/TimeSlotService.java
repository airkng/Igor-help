package com.patientRegistrationService.service;

import com.patientRegistrationService.dto.talon.TimeSlotInfo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author MR.k0F31n
 */
public interface TimeSlotService {
    TimeSlotInfo registerPatient(Long idTimeSlot, Long idPatient);

    List<TimeSlotInfo> findAllTimeSlotFromPatient(Long idPatient);

    List<TimeSlotInfo> findAllFreeTimeSlotFromDoctor(Long idDoctor, LocalDate date);

    void createSchedule(Long idDoctor, Integer quality, LocalDate date, LocalTime startTime, LocalTime ShiftEndTime, Integer timeReceipt);
}
