package org.docterapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.docterapp.model.Doctor;
import org.springframework.jdbc.core.RowMapper;

public class DoctorMapper  implements RowMapper<Doctor>{

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor  =  new Doctor();
		doctor.setDocterId(rs.getInt("docterId"));
		doctor.setDocterName(rs.getString("docter_name"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setRatings(rs.getInt("ratings"));
		doctor.setFees(rs.getDouble("fees"));
		doctor.setExperience(rs.getInt("experience"));
		return doctor ;
	}
	

}
