package com.mongo.service;


import java.util.List;

import com.mongo.model.ToDo;


public interface ToDoService {
	public void addToDo(ToDo todo);
	public List<ToDo> getToDos();
	public void deleteToDo();
	public ToDo getToDoById(long id);
	public boolean existsByid(long id); 
	public long countTodo(); 
	public void deleteById(long id); 
}
