package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.model.Student;
import com.mongo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/countstud") 
	public String getStudCount() { 
		return service.countStudents()+""; 
	} 
	
	@DeleteMapping("/deletestud/{id}") 
	public String removeStudById(@PathVariable String id) {
		service.deleteById(Long.parseLong(id)); 
		return "Student is removed successfully"; 
	} 
	
	@DeleteMapping("/deleteallstuds") 
	public String removeAllStuds() { 
		service.deleteAllStudents(); 
		return "All Students are deleted"; 
	} 
	
	@GetMapping("/studexists/{id}") 
		public String isExists(@PathVariable String id) { 
		return service.existsByid(Long.parseLong(id))+""; 
	} 
	
	@GetMapping("/getall") 
	public List<Student> getAllStud(){ 
		return service.findAll(); 
	} 
	
	@GetMapping("/getstud/{id}") 
	public Student getById(@PathVariable String id) { 
		return service.findById(Long.parseLong(id)); 
	} 
	
	@PostMapping("/insert") 
	public String create(@RequestBody Student s) { 
		service.insertStudent(s); 
		return "Student is inserted succesfully"; 
	} 
}
