package com.example.sdlspring.sdlspring.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sdlspring.sdlspring.models.Students;


public interface StudentsRepository extends MongoRepository<Students, String> {
	Students findBy_id(ObjectId _id);
}
