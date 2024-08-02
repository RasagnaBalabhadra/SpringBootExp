package com.mongo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.model.ToDo;
import com.mongo.service.ToDoService;


@RestController
public class ToDoController {
	@Autowired
	ToDoService service;
	
	@PostMapping("/addtodo")
	public String addToDo(@RequestBody ToDo todo) {
		service.addToDo(todo);
		return "Todo added successfully";
	}
	
	@GetMapping("/gettodo")
	public List<ToDo> gettodos(){
		return service.getToDos();
	}
	
	@GetMapping("/gettodobyid/{id}")
	public ToDo getToDoById(@PathVariable String id) {
		return service.getToDoById(Long.parseLong(id));
	}
	
	@DeleteMapping("/deletetodo")
	public String deleteTodos() {
		service.deleteToDo();
		return "All Todos deleted successfully";
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable String id) {
		service.deleteById(Long.parseLong(id));
		return "Todo deleted successfully.";
	}
	
	@GetMapping("/exist/{id}")
	public String Exist(@PathVariable String id) {
		return service.existsByid(Long.parseLong(id)) + "";
	}
	
	@GetMapping("/count")
	public String todoCount() {
		return service.countTodo() + "";
	}
}
