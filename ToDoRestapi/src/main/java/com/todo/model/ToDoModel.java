package com.todo.model;


import lombok.Data;


@Data

public class ToDoModel {
	
	private String id;
	
	private String description;
	
	private String created;
	
	private String modified;
	
	private boolean completed;
	
	
}
