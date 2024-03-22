package org.docterapp.repository;

import java.util.List;

import org.docterapp.model.Doctor;
import org.docterapp.util.Querries;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DocterRepositoryImpl implements IDocterRepository {

	private JdbcTemplate jdbcTemplate;
	
	
    public DocterRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
//docter_name,speciality,experience,ratings,fees
	@Override
    public void addDocter(Doctor doctor) {
		Object[] docArr = {doctor.getDocterName(),doctor.getSpeciality(),doctor.getExperience(),doctor.getRatings(),doctor.getFees()};
		jdbcTemplate.update(Querries.INSERTQUERRY,docArr);
    }

    @Override
    public void updateDocter(int docterId, double fees) {
    	jdbcTemplate.update(Querries.UPDATEQUERRY,new DoctorMapper(),docterId,fees);

    }

    @Override
    public void deleteDocter(int docterId) {
    	jdbcTemplate.update(Querries.DELETEQUERRY,new DoctorMapper(),docterId);

    }

    @Override
    public void findById(int docterId) {
    	jdbcTemplate.queryForObject(Querries.FINDBYidQUERRY,new DoctorMapper(),docterId);
    }

    @Override
    public List<Doctor> findAll() {
       return jdbcTemplate.query(Querries.FINDALLQUERRY,new DoctorMapper());
    }


    @Override
    public List<Doctor> findBySpeciality(String speciality) {
    	return jdbcTemplate.query(Querries.FINDBYSPECIALITYQUERRY,new DoctorMapper(),speciality);
    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
    	return jdbcTemplate.query(Querries.FINDBYSPECIALITYANDEXPQUERRY,new DoctorMapper(),speciality,experience);
    }

    @Override
    public List<Doctor> findBySpecialityAndLessFee(String speciality, double fees) {
    	return jdbcTemplate.query(Querries.FINDBYSPECIALITYANDFEESQUERRY,new DoctorMapper(),speciality,fees);
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
    	return jdbcTemplate.query(Querries.FINDBYSPECIALITYANDRATINGSQUERRY,new DoctorMapper(),speciality,ratings);
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String docterName) {
    	return jdbcTemplate.query(Querries.FINDBYSPECIALITYANDNAMEQUERRY,new DoctorMapper(),speciality,docterName);
    }
}
