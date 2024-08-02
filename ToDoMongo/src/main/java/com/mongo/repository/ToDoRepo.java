package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.ToDo;

public interface ToDoRepo extends MongoRepository<ToDo,Long> {

}
