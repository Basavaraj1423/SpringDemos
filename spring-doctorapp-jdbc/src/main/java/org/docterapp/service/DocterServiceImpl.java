package org.docterapp.service;

import org.docterapp.exceptions.DocterNotFoundException;
import org.docterapp.model.Doctor;
import org.docterapp.repository.DocterRepositoryImpl;
import org.docterapp.repository.IDocterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DocterServiceImpl implements IDocterService {
	@Autowired
	private IDocterRepository iDocterRepository;

	@Override
	public void addDocter(Doctor doctor) {
		iDocterRepository.addDocter(doctor);
	}

	@Override
	public void updateDocter(int docterId, double fees) {
		iDocterRepository.updateDocter(docterId, fees);
	}

	@Override
	public void deleteDocter(int docterId) {
		iDocterRepository.deleteDocter(docterId);
	}

	@Override
	public void GetById(int docterId) {
		iDocterRepository.findById(docterId);
	}

	@Override
	public List<Doctor> getAll() {
		return iDocterRepository.findAll();
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DocterNotFoundException {
		List<Doctor> doctorList = iDocterRepository.findBySpeciality(speciality);
		if (doctorList.isEmpty()) {
			throw new DocterNotFoundException("Docter with this speciality not found");
		}
		Collections.sort(doctorList, (d1, d2) -> ((d2.getDocterName())).compareTo(d1.getDocterName()));
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DocterNotFoundException {
		List<Doctor> doctorList = iDocterRepository.findBySpecialityAndExp(speciality, experience);
		if (doctorList.isEmpty()) {
			throw new DocterNotFoundException("Docter with this speciality and exp not found");
		}
		Collections.sort(doctorList, (d1, d2) -> ((Integer) (d2.getExperience())).compareTo(d1.getExperience()));
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndLessFee(String speciality, double fees) throws DocterNotFoundException {
		List<Doctor> doctorList = iDocterRepository.findBySpecialityAndLessFee(speciality, fees);
		if (doctorList.isEmpty()) {
			throw new DocterNotFoundException("Docter with this speciality and fee not found");
		}
		Collections.sort(doctorList, (d1, d2) -> ((Double) (d1.getFees())).compareTo(d2.getFees()));
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DocterNotFoundException {
		List<Doctor> doctorList = iDocterRepository.findBySpecialityAndRatings(speciality, ratings);
		if (doctorList.isEmpty()) {
			throw new DocterNotFoundException("Docter with this speciality and ratings not found");
		}
		Collections.sort(doctorList, (d1, d2) -> ((Integer) (d1.getRatings())).compareTo(d2.getRatings()));
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndNameContains(String speciality, String docterName)
			throws DocterNotFoundException {
		List<Doctor> doctorList = iDocterRepository.findBySpecialityAndNameContains(speciality, docterName);
		if (doctorList.isEmpty()) {
			throw new DocterNotFoundException("Docter with this speciality and Name not found");
		}
		Collections.sort(doctorList, (d1, d2) -> ((d1.getDocterName())).compareTo(d2.getDocterName()));
		return doctorList;
	}
}
