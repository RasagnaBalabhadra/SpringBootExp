package com.jdbc.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Student {
	@Id
	int id;
	String name;
	String branch;
	String section;

}
