package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.Student;

public interface StudentRepo extends MongoRepository<Student, Long> {

}
