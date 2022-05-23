package com.bnta.dragonball_api.controllers;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    //INDEX
    @GetMapping //localhost:8080/persons
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "/{id}") //localhost:8080/persons/1
    public ResponseEntity<Optional<Person>> getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }


    //POST
    @PostMapping // localhost:8080/persons
    public ResponseEntity<Person> createPerson(@RequestBody Person newPerson){
        personRepository.save(newPerson);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    //DELETE
    @DeleteMapping(value = "/{id}") //localhost:8080/persons/1
    public ResponseEntity<Person> deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return new ResponseEntity(id,HttpStatus.OK);
    }
}
