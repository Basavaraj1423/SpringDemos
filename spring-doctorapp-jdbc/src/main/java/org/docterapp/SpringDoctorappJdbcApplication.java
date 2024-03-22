package org.docterapp;

import java.util.List;

import org.docterapp.model.Doctor;

import org.docterapp.model.Specialization;
import org.docterapp.service.IDocterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}
	
	@Autowired
	IDocterService idocterService;

	@Override
	public void run(String... args) throws Exception {
		String specialization = Specialization.CARDIO.getSpeciality();
//        Doctor doctor = new Doctor("Steeve",specialization,9,500,5);
//        idocterService.addDocter(doctor);
        List<Doctor> doctorList = idocterService.getAll();
        for (Doctor doctors : doctorList){
            System.out.println(doctors);
        }
//        List<Doctor> doctors = docterService.getBySpeciality("CARDIOLOGY");
//        for (Doctor specialityOfDoctors : doctors){
//            System.out.println(specialityOfDoctors);
//        }
		
	}

}
