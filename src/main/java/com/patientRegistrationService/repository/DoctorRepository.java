package com.patientRegistrationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.patientRegistrationService.model.Doctor;
import org.springframework.stereotype.Repository;

/**
 * @author MR.k0F31n
 */
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
}
