package com.hal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hal.model.Student;
import com.hal.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentDB;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDB.save(student);

	}

	@Override
	public Optional<Student> getStudentById(long id) {
		// TODO Auto-generated method stub
		return studentDB.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDB.findAll();
	}

	@Override
	public void deleteStudentById(long id) {
		// TODO Auto-generated method stub
		studentDB.deleteById(id);

	}

	@Override
	public void deleteAllStudents() {
		// TODO Auto-generated method stub
		studentDB.deleteAll();
	}

	@Override
	public boolean isStudentExist(long id) {
		// TODO Auto-generated method stub
		return studentDB.existsById(id);
	}

	@Override
	public long getStudentCount() {
		// TODO Auto-generated method stub
		return studentDB.count();
	}

}
