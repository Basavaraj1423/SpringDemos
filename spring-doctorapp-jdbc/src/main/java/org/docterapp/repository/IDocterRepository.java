package org.docterapp.repository;

import org.docterapp.model.Doctor;

import java.util.List;

public interface IDocterRepository {
    void addDocter(Doctor doctor);
    void updateDocter(int docterId, double fees);
    void deleteDocter(int docterId);
    void findById(int docterId);

    List<Doctor> findAll();
    List<Doctor> findBySpeciality(String speciality);
    List<Doctor> findBySpecialityAndExp(String speciality , int experience);
    List<Doctor> findBySpecialityAndLessFee(String speciality, double fees);
    List<Doctor> findBySpecialityAndRatings(String speciality, int ratings);
    List<Doctor> findBySpecialityAndNameContains(String speciality, String docterName);
}
