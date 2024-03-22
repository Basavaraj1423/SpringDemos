package org.docterapp.service;

import org.docterapp.exceptions.DocterNotFoundException;
import org.docterapp.exceptions.IdNotFoundException;
import org.docterapp.model.Doctor;

import java.util.List;

public interface IDocterService {
    void addDocter(Doctor doctor);
    void updateDocter(int docterId, double fees);
    void deleteDocter(int docterId);
    void GetById(int docterId) throws IdNotFoundException;

    List<Doctor> getAll();
    List<Doctor> getBySpeciality(String speciality) throws DocterNotFoundException;
    List<Doctor> getBySpecialityAndExp(String speciality , int experience)throws DocterNotFoundException;
    List<Doctor> getBySpecialityAndLessFee(String speciality, double fees)throws DocterNotFoundException;
    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings)throws DocterNotFoundException;
    List<Doctor> getBySpecialityAndNameContains(String speciality, String docterName)throws DocterNotFoundException;


}
