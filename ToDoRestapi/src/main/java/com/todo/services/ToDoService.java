package com.todo.services;

import java.util.HashSet;

import com.todo.model.ToDoModel;

public interface ToDoService {
	public void addToDo(ToDoModel todo);
	public HashSet<ToDoModel> getToDos();
	public void deleteToDo();
	public ToDoModel getToDoById(String id);
}
