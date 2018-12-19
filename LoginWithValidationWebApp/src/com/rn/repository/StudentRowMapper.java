package com.rn.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rn.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int numRow) throws SQLException {
		Student student= new Student();
		student.setStudentId((rs.getInt("student_id")));
		student.setName(rs.getString("student_name"));
		student.setEmail(rs.getString("student_email"));
		student.setMobile(rs.getInt("student_mobile"));
		student.setPassword(rs.getString("student_password"));
		student.setPassword(rs.getString("student_conformpassword"));
		
		return student;
	}

}
