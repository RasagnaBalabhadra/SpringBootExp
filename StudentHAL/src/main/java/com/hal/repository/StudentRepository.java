package com.hal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hal.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
