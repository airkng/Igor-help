package com.patientRegistrationService.service.impl;

import com.patientRegistrationService.dto.talon.TimeSlotInfo;
import com.patientRegistrationService.repository.DoctorRepository;
import com.patientRegistrationService.repository.PatientRepository;
import com.patientRegistrationService.repository.TimeSlotRepository;
import com.patientRegistrationService.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author MR.k0F31n
 */
@Service
@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService {
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final TimeSlotRepository timeSlots;

    @Override
    public TimeSlotInfo registerPatient(Long idTimeSlot, Long idPatient) {
        return null;
    }

    @Override
    public List<TimeSlotInfo> findAllTimeSlotFromPatient(Long idPatient) {
        return null;
    }

    @Override
    public List<TimeSlotInfo> findAllFreeTimeSlotFromDoctor(Long idDoctor, LocalDate date) {
        return null;
    }

    @Override
    public void createSchedule(Long idDoctor, Integer quality, LocalDate date, LocalTime startTime, LocalTime shiftEndTime, Integer timeReceipt) {
        //первоначальные проверки
        /*if (date.isBefore(LocalDate.now()) || startTime.isAfter(shiftEndTime))
            throw new IncorrectParametersException("Invalid date '" + date + "'  or start time receipt '" + startTime + "'");
        Doctor doctor = doctorRepository.findById(idDoctor).orElseThrow(
                () -> new NotFoundException("Doctor not found!"));
        //инициализируем первый талон
        TimeSlot timeSlot = new TimeSlot();
        timeSlot.setDoctor(doctor);
        timeSlot.setStartTime(startTime);
        timeSlot.setEndTime(startTime.plusMinutes(timeReceipt));

        if (timeSlot.getEndTime().isAfter(shiftEndTime))
            throw new IncorrectParametersException("Time receipt after shift end time");
        timeSlots.save(timeSlot);
        //Проверочное время что талон "умещяется" в рабочую смену доктора
        LocalTime deadlineTime = timeSlot.getEndTime().plusMinutes(timeReceipt);
        while (deadlineTime.isBefore(shiftEndTime)) {
            //Считаем талоны дальше, ориентировочно после окончалия приема беру время 5 минут для завершение приёма
            timeSlot.setStartTime(timeSlot.getEndTime().plusMinutes(5));
            timeSlot.setEndTime(timeSlot.getStartTime().plusMinutes(timeReceipt));
            deadlineTime = timeSlot.getEndTime().plusMinutes(timeReceipt);
            timeSlots.save(timeSlot);
        } */
    }
}
