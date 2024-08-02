package com.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.model.Student;
import com.mongo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo studentDB;
	
	@Override
	public long countStudents() {
		// TODO Auto-generated method stub
		return studentDB.count();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		studentDB.deleteById(id);
	}

	@Override
	public void deleteAllStudents() {
		// TODO Auto-generated method stub
		studentDB.deleteAll();
	}

	@Override
	public boolean existsByid(long id) {
		// TODO Auto-generated method stub
		return studentDB.existsById(id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDB.findAll();
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		Optional<Student> op = studentDB.findById(id);
		return op.get();
		}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		studentDB.save(student);
	}

}
