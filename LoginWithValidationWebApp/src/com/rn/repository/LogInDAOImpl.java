package com.rn.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rn.model.Student;
@Repository("logInDAO")
public class LogInDAOImpl implements LogInDAO {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	@Override
	public boolean registerStudent(Student student) {
		
		
		String sql="insert into student_details(student_id,student_name,student_email,student_mobile,student_password,student_conformpassword) values(:stdId,:stdName,:stdEmail,:stdMobile,:stdPassword,:stdCpassword)";
		MapSqlParameterSource mapList=new MapSqlParameterSource();

		mapList.addValue("stdId", student.getStudentId());
		mapList.addValue("stdName", student.getName());
		mapList.addValue("stdEmail", student.getEmail());
		mapList.addValue("stdMobile", student.getMobile());
		mapList.addValue("stdPassword", student.getPassword());
		mapList.addValue("stdCpassword", student.getConformPassword());
		
		int i=namedParameterJdbcTemplate.update(sql,mapList);
		if(i>0)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public Student fetchStudent(String email, String password) {

		String sql="select * from student_details where student_email=:stdEmail and student_password=:stdPassword";
		MapSqlParameterSource mapList=new MapSqlParameterSource();
		mapList.addValue("stdEmail",email );
		mapList.addValue("stdPassword",password);
		Student student=namedParameterJdbcTemplate.queryForObject(sql, mapList, new StudentRowMapper());
		return student;
	}

}
