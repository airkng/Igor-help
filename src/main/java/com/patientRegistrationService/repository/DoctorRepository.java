package com.patientRegistrationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.patientRegistrationService.model.Doctor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

/**
 * @author MR.k0F31n
 */
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
}
