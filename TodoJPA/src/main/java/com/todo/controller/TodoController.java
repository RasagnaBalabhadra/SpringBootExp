package com.todo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.ToDo;

import com.todo.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@PostMapping("/addtodo")
	public String createToDo(@RequestBody ToDo todos) {
		service.addToDo(todos);
		return "Todos added";
	}
	
	@GetMapping("/getAllTodo")
	public List<ToDo> fetchAllTodo(){
		return service.getAllTodos();
	}
	
	@GetMapping("/getById/{id}")
	public ToDo fetchTodoById(@PathVariable String id){
		Optional<ToDo> op = service.getToDoById(Long.parseLong(id));
		return op.get();
	}
	
	@DeleteMapping("/deletetodo")
	public String removeTodos() {
		service.deleteTodos();
		return "All Todos deleted";
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String removeById(@PathVariable String id) {
		service.deleteToDoById(Long.parseLong(id));
		return "todo deleted";
	}
	
	@GetMapping("/existbyid/{id}")
	public String existTodo(@PathVariable String id) {
		return service.isExist(Long.parseLong(id)) + "";
	}
	
	@GetMapping("/todocount")
	public String countTodo() {
		return service.todoCount() + "";
	}
}
