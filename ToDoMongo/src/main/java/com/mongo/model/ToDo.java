package com.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "todo")

public class ToDo {
	@Id
	private long id;
	private String description;
	private String created;
	private String modified;
	private boolean completed;
}
