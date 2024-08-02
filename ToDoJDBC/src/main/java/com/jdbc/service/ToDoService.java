package com.jdbc.service;

import java.util.List;

import com.jdbc.model.ToDo;

public interface ToDoService {
	public void addTask(ToDo t);
	public ToDo getTaskById(long id);
	public List<ToDo> getAllTasks();
	public void deleteTaskById(long id);


}
