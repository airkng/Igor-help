package com.patientRegistrationService.repository;

import com.patientRegistrationService.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author MR.k0F31n
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
