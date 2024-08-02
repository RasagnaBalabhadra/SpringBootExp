package com.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jdbc.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	JdbcTemplate  template;

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		template.update("Insert into student values(?,?,?,?)",new Object[] {s.getId(),s.getName(),s.getBranch(),s.getSection()});
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		Student st=template.queryForObject("SELECT* from student where id=?",BeanPropertyRowMapper.newInstance(Student.class),id);
		return st;

	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> st=template.query("SELECT* from student",BeanPropertyRowMapper.newInstance(Student.class));
		return st;

	}

	@Override
	public void deleteStudentById(long id) {
		// TODO Auto-generated method stub
		template.update("delete from student where id=?",new Object[] {id});
	}

}
