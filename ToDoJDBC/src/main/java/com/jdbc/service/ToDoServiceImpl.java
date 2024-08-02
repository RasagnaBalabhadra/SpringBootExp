package com.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jdbc.model.ToDo;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	JdbcTemplate template;

	@Override
	public void addTask(ToDo t) {
		// TODO Auto-generated method stub
		template.update("Insert into tasks values(?,?,?,?,?)",
				new Object[] {
						t.getId(),
						t.getDescription(),
						t.getCreated(),
						t.getModified(),
						t.getCompleted()
						});
	}

	@Override
	public ToDo getTaskById(long id) {
		// TODO Auto-generated method stub
		ToDo st=template.queryForObject("SELECT* from tasks where id=?",BeanPropertyRowMapper.newInstance(ToDo.class),id);
		return st;
	}

	@Override
	public List<ToDo> getAllTasks() {
		// TODO Auto-generated method stub
		List<ToDo> st=template.query("SELECT* from tasks",BeanPropertyRowMapper.newInstance(ToDo.class));
		return st;
	}

	@Override
	public void deleteTaskById(long id) {
		// TODO Auto-generated method stub
		template.update("delete from tasks where id=?",new Object[] {id});
	}


}
