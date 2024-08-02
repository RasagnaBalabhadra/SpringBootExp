package com.todo.service;

import java.util.List;
import java.util.Optional;

import com.todo.model.ToDo;

public interface ToDoService {
	public void addToDo(ToDo todo);
	public List<ToDo> getAllTodos();
	public Optional<ToDo> getToDoById(Long id);
	public void deleteTodos();
	public void deleteToDoById(Long id);
	public boolean isExist(Long id);
	public long todoCount();
}
