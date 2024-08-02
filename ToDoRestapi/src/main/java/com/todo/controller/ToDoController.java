package com.todo.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.ToDoModel;
import com.todo.services.ToDoService;

@RestController

public class ToDoController{
	@Autowired
	ToDoService service;
	
	@PostMapping("/addtodo")
	public String addToDo(@RequestBody ToDoModel todo) {
		service.addToDo(todo);
		return "Todo added successfully";
	}
	
	@GetMapping("/gettodo")
	public HashSet<ToDoModel> gettodos(){
		return service.getToDos();
	}
	
	@DeleteMapping("/deletetodo")
	public String deletetodos() {
		service.deleteToDo();
		return "Todo deleted successfully";
	}
	
	@GetMapping("/gettodobyid/{id}")
	public ToDoModel getToDoById(@PathVariable String id) {
		return service.getToDoById(id);
	}
	
	
}
