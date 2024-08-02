package com.jpa.service;

import java.util.List;
import java.util.Optional;

import com.jpa.model.Student;

public interface StudentService {
	public void addStudent(Student student);
	public Optional<Student> getStudentById(long id);
	public List<Student> getAllStudents();
	public void deleteStudentById(long id);
	public void deleteAllStudents();
	public boolean isStudentExist(long id);
	public long getStudentCount();

}
