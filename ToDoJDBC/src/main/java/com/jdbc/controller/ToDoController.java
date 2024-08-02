package com.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.model.ToDo;
import com.jdbc.service.ToDoService;

@RestController
public class ToDoController {
	@Autowired
	ToDoService service;
	
	@PostMapping("/addtask")
	public String createTask(@RequestBody ToDo s) {
		service.addTask(s);
		return "added successfully";
	}
	@GetMapping("/getaskbyid/{id}")
	public ToDo displayTaskById(@PathVariable String id) {
		ToDo op = service.getTaskById(Long.parseLong(id));
		return op;
	}
	@GetMapping("/getall")
	public List<ToDo> displayAllTasks(){
		return service.getAllTasks();
	}
	@DeleteMapping("/deletebyid/{id}")
	public String removeTaskById(@PathVariable String id) {
		service.deleteTaskById(Long.parseLong(id));
		return "Task deleted .";
	}


}
