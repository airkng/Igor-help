package com.patientRegistrationService.dto.doctor;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

/**
 * @author MR.k0F31n
 */
@Data
public class DoctorNew {
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastName;
    @NotBlank
    private String Specification;
}
