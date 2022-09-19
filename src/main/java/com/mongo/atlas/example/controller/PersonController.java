package com.mongo.atlas.example.controller;

import com.mongo.atlas.example.model.Person;
import com.mongo.atlas.example.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> getAllPersons(){

        return this.personRepository.findAll();
    }

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(@RequestBody Person person) {

        return this.personRepository.save(person);
    }
}
