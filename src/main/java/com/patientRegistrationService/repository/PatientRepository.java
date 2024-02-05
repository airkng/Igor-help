package com.patientRegistrationService.repository;

import com.patientRegistrationService.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

/**
 * @author MR.k0F31n
 */

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
