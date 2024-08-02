package com.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	Long id;
	String name;
	String branch;
	String section;
}
