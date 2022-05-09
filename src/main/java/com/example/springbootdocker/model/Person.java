package com.example.springbootdocker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stam")
public class Person {

    @Id
    private String id;

    private String field;

    public Person(String id, String field) {
        super();
        this.id = id;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
