package com.insuranceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.IInsuranceService;

@SpringBootApplication
public class SpringInsuranceappRestmybatisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringInsuranceappRestmybatisApplication.class, args);
	}

	@Autowired
	IInsuranceService iInsuranceService;

	@Override
	public void run(String... args) throws Exception {
//		Insurance insurance = new Insurance(101, "VH-H001", "Voya", "Health", 10, 150000);
//		iInsuranceService.addInsurance(insurance);

	}

}
