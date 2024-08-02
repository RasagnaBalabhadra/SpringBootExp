package com.jdbc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.model.Student;
import com.jdbc.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/addstudent")
	public String createStudent(@RequestBody Student s) {
		service.addStudent(s);
		return "Student added successfully";
	}
	
	@GetMapping("/getstudentbyid/{id}")
	public Student displayStudentById(@PathVariable String id) {
		Student op = service.getStudentById(Long.parseLong(id));
		return op;
	}
	
	@GetMapping("/getallstudents")
	public List<Student> displayAllStudents(){
		return service.getAllStudents();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String removeStudentById(@PathVariable String id) {
		service.deleteStudentById(Long.parseLong(id));
		return "Student deleted Successfully.";
	}	

}
