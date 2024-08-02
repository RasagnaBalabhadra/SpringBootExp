package com.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.Student;
import com.jpa.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/addstudent")
	public String createStudent(@RequestBody Student student) {
		service.addStudent(student);
		return "Student successfully added into database.";
	}
	
	@GetMapping("/getstudbyid/{id}")
	public Student displayStudentById(@PathVariable String id) {
		Optional<Student> op = service.getStudentById(Long.parseLong(id));
		return op.get();
	}
	
	@GetMapping("/getallstud")
	public List<Student> displayAllStudents(){
		return service.getAllStudents();
	}
	
	@DeleteMapping("/deletestudbyid/{id}")
	public String removeStudentById(@PathVariable String id) {
		service.deleteStudentById(Long.parseLong(id));
		return "Stduent deleted successfully from DB.";
	}
	
	@DeleteMapping("/deleteallstud")
	public String removeAllStudents() {
		service.deleteAllStudents();
		return "All Students Deleted from DB Successfully.";
	}
	
	@GetMapping("/studexists/{id}")
	public String existed(@PathVariable String id) {
		return service.isStudentExist(Long.parseLong(id)) + "";
	}
	
	@GetMapping("/studcount")
	public String studentCount() {
		return service.getStudentCount() + "";
	}
}
