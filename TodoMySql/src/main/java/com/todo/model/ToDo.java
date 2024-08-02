package com.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ToDo {
	
	@Id
	private Long id;
	
	private String description;
	
	private String created;
	
	private String modified;
	
	private boolean completed;
	
}
