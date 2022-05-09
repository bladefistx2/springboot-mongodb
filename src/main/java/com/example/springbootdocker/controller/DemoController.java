package com.example.springbootdocker.controller;

//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.MongoDriverInformation;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.internal.MongoClientImpl;
import com.example.springbootdocker.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.springbootdocker.repository.PersonRepository;

@Controller
@RequestMapping("/demo")
@ResponseBody
public class DemoController {
    private PersonRepository repository;
//    private MongoClient mongoClient;

    @Autowired
    public DemoController(PersonRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/test")
    public String entry(@RequestParam(value = "name", defaultValue = "default") String name) {
        Person person = repository.findByField(name);
        if (person == null){
            return "null!";
        }
        return "hello " + person;
    }

    @GetMapping("/a")
    public String home() {
        return "Hello World from endpoint a";
    }

    @GetMapping("/error")
    public String error() {
        System.out.println("Error");
        return "ERROR!";
    }
}
