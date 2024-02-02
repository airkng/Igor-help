package com.patientRegistrationService.service;

import com.patientRegistrationService.dto.doctor.DoctorInfo;
import com.patientRegistrationService.dto.doctor.DoctorNew;
import com.patientRegistrationService.model.Doctor;

/**
 * @author MR.k0F31n
 */
public interface doctorsService {
    DoctorInfo createDoctor(DoctorNew doctorNew);
    void deleteDoctor(Integer id);
}
