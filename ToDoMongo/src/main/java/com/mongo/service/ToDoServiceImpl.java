package com.mongo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.model.ToDo;
import com.mongo.repository.ToDoRepo;

@Service
public class ToDoServiceImpl implements ToDoService {
	@Autowired
	ToDoRepo repo; 
	
	@Override
	public void addToDo(ToDo todo) {
		// TODO Auto-generated method stub
		repo.save(todo);

	}

	@Override
	public List<ToDo> getToDos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteToDo() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

	@Override
	public ToDo getToDoById(long id) {
		// TODO Auto-generated method stub
		Optional<ToDo> op = repo.findById(id);
		return op.get();
	}
	
	@Override
	public long countTodo() {
		// TODO Auto-generated method stub
		return repo.count();
	}

	@Override
	public boolean existsByid(long id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		repo.findById(id);
	}
}
