package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;

@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Override
	public List<Insurance> getAll() {
		// TODO Auto-generated method stub
		return getAllInsurance();
	}

	@Override
	public Insurance getById(int insuranceId) {
		List<Insurance> insurances = getAllInsurance();
		for(Insurance insurance : insurances) {
			if(insurance.getInsuranceId()==insuranceId) {
				return insurance;
			}
		}
		return null;
	}

	private List<Insurance> getAllInsurance() {
		return Arrays.asList(new Insurance(101, "VH-H001", "Voya", "Health", 10, 150000),
				new Insurance(102, "BH-S111", "Bajaj", "Personal", 8, 120000),
				new Insurance(103, "GDF-SG", "fidelitv", "Wealth", 9, 150000),
				new Insurance(104, "EE-NGD", "Mutooth", "Gold", 10, 160000),
				new Insurance(105, "EW-FGDSD", "Kotak", "Life", 7, 170000));

	}

}
