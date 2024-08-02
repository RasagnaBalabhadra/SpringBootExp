package com.mongo.service;

import java.util.List;

import com.mongo.model.Student;

public interface StudentService {
	public long countStudents(); 
	public void deleteById(long id); 
	public void deleteAllStudents(); 
	public boolean existsByid(long id); 
	public List<Student> findAll(); 
	public Student findById(long id); 
	public void insertStudent(Student student); 
}
