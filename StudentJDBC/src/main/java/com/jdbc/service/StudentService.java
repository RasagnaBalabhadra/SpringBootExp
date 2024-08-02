package com.jdbc.service;

import java.util.List;

import com.jdbc.model.Student;

public interface StudentService {
	public void addStudent(Student s);
	public Student getStudentById(long id);
	public List<Student> getAllStudents();
	public void deleteStudentById(long id);


}
