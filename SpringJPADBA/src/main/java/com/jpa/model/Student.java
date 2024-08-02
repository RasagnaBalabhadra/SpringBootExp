package com.jpa.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	long id;
	String name;
	String branch;
	String section;

}
