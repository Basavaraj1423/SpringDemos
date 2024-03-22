package org.docterapp.model;

public enum Specialization {
    CARDIO("CARDIOLOGY"),
    NEURO("NEUROLOGY"),
    ONCO("ONCOLOGY"),
    PEDIA("PEDIATRICIAN"),
    DERMA("DERMATOLOGIST"),
    ORDTHO("ORDTHOPEDICIAN"),
    URO("UROLOGY") ;

private String speciality;
    Specialization(String speciality) {
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}
