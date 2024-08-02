package com.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.model.ToDo;
import com.todo.repository.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {
	
	@Autowired
	ToDoRepository todoDB;
	
	@Override
	public void addToDo(ToDo todo) {
		// TODO Auto-generated method stub
		todoDB.save(todo);
	}

	@Override
	public List<ToDo> getAllTodos() {
		// TODO Auto-generated method stub
		return todoDB.findAll();
	}

	@Override
	public Optional<ToDo> getToDoById(Long id) {
		// TODO Auto-generated method stub
		return todoDB.findById(id);
	}

	@Override
	public void deleteTodos() {
		// TODO Auto-generated method stub
		todoDB.deleteAll();

	}

	@Override
	public void deleteToDoById(Long id) {
		// TODO Auto-generated method stub
		todoDB.deleteById(id);
	}

	@Override
	public boolean isExist(Long id) {
		// TODO Auto-generated method stub
		return todoDB.existsById(id);
	}

	@Override
	public long todoCount() {
		// TODO Auto-generated method stub
		return todoDB.count();
	}

}
