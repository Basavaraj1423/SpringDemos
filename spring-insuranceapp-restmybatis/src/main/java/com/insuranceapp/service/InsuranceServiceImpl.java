package com.insuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;

@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Autowired
	IInsuranceRepository iInsuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		iInsuranceRepository.addInsurance(insurance);

	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		iInsuranceRepository.updateInsurance(insuranceId, premium);

	}

	@Override
	public void deleteInsurance(int insuranceId) {
		iInsuranceRepository.deleteInsurance(insuranceId);

	}

	@Override
	public List<Insurance> getAll() {

		return iInsuranceRepository.findAll();
	}

	@Override
	public List<Insurance> getByBrand(String brand) {

		return iInsuranceRepository.findByBrand(brand);
	}

	@Override
	public List<Insurance> getByBrandAndType(String brand, String type) {

		return iInsuranceRepository.findByBrandAndType(brand, type);
	}

	@Override
	public List<Insurance> getByTypeAndLessPremium(String type, double premium) {

		return iInsuranceRepository.findByTypeAndLessPremium(type, premium);
	}

	@Override
	public Insurance getById(int insuranceId) {

		return iInsuranceRepository.findById(insuranceId);
	}

}
