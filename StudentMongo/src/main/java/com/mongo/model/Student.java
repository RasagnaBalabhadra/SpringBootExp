package com.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "student")
public class Student {
	@Id
	long id;
	String name;
	String branch;
	String section;
}
