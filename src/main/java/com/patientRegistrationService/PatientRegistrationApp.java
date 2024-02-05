package com.patientRegistrationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(scanBasePackages = "com.patientRegistrationService")
@ComponentScan(basePackages = {"com.patientRegistrationService"})
public class PatientRegistrationApp {

	public static void main(String[] args) {
		SpringApplication.run(PatientRegistrationApp.class, args);
	}

}
