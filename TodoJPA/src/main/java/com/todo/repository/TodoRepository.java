package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.model.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {

}
