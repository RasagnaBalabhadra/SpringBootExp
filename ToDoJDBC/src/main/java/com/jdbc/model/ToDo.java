package com.jdbc.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class ToDo {
	@Id
	private int id;
	private String description;
	private String created;
	private String modified;
	private String completed;

}
