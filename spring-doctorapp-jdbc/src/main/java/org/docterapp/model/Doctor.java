package org.docterapp.model;

import java.util.List;

public class Doctor  {
    private Integer docterId;
    private String docterName;
    private String speciality;
    private double fees;
    private int ratings;
    private int experience;

    public Doctor() {
    }

    public Doctor(String docterName, String speciality, double fees, int ratings, int experience) {
        this.docterName = docterName;
        this.speciality = speciality;
        this.fees = fees;
        this.ratings = ratings;
        this.experience = experience;
    }

    public Doctor(Integer docterId, String docterName, String speciality, double fees, int ratings, int experience) {
        this.docterId = docterId;
        this.docterName = docterName;
        this.speciality = speciality;
        this.fees = fees;
        this.ratings = ratings;
        this.experience = experience;
    }

    public Integer getDocterId() {
        return docterId;
    }

    public void setDocterId(Integer docterId) {
        this.docterId = docterId;
    }

    public String getDocterName() {
        return docterName;
    }

    public void setDocterName(String docterName) {
        this.docterName = docterName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Docter{" +
                "docterId=" + docterId +
                ", docterName='" + docterName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", fees=" + fees +
                ", ratings=" + ratings +
                ", experience=" + experience +
                '}';
    }
}
