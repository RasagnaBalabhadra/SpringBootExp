package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/addstud")
	public String addStudent(@RequestBody Student stud) {
		service.addStudent(stud);
		return "Student added successfully";
	}
	
	@GetMapping("/getall")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/getByid/{id}")
	public Student getStudById(@PathVariable String id) {
		Optional<Student> op = service.getStudentById(Long.parseLong(id));
		return op.get();
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deleteById(@PathVariable String id) {
		service.deleteStudentById(Long.parseLong(id));
		return "Student deleted successfully";
	}
	
	@DeleteMapping("/deleteall")
	public String deleteAllStudents() {
		service.deleteAllStudents();
		return "All Students deleted successfully";
	}
	
	@GetMapping("/existbyid/{id}")
	public String isExist(String id) {
		return service.isStudentExist(Long.parseLong(id)) + "";	
	}
	
	@GetMapping("/count")
	public String studCount() {
		return service.getStudentCount() + "";
	}
}
