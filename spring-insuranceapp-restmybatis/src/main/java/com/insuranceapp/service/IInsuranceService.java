package com.insuranceapp.service;

import java.util.List;

import com.insuranceapp.model.Insurance;

public interface IInsuranceService {

	void addInsurance(Insurance insurance);
	void updateInsurance(int insuranceId, double premium);
	void deleteInsurance(int insuranceId);

	List<Insurance> getAll();
	List<Insurance> getByBrand(String brand);
	List<Insurance> getByBrandAndType(String brand, String type);
	List<Insurance> getByTypeAndLessPremium(String type, double premium);

	Insurance getById(int insuranceId);

}
