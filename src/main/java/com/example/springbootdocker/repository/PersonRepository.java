package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByField(String field);

}