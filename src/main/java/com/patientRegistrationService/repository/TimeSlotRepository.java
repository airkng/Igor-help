package com.patientRegistrationService.repository;

import com.patientRegistrationService.model.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

/**
 * @author MR.k0F31n
 */
@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {
    //Optional<TimeSlot> findByIdDoctorAndDateAndIdPatientIsNull(Long idDoctor, LocalDate date);
}