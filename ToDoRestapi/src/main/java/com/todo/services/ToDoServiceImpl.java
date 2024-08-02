package com.todo.services;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.todo.model.ToDoModel;

@Service
public class ToDoServiceImpl implements ToDoService {
	HashSet<ToDoModel> todosDB = new HashSet<ToDoModel>();

	@Override
	public void addToDo(ToDoModel todo) {
		// TODO Auto-generated method stub
		todosDB.add(todo);

	}

	@Override
	public HashSet<ToDoModel> getToDos() {
		// TODO Auto-generated method stub
		return todosDB;
	}

	@Override
	public void deleteToDo() {
		// TODO Auto-generated method stub
		todosDB.clear();

	}

	@Override
	public ToDoModel getToDoById(String id) {
		// TODO Auto-generated method stub
		ToDoModel todo = todosDB.stream().filter((obj) -> obj.getId().equals(id)).findAny().orElse(null);
		return todo;
	}

}
