package com.bnta.dragonball_api.controllers;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.repositories.PersonRepository;
import com.bnta.dragonball_api.repositories.SagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("sagas")
public class SagaController {

    @Autowired
    SagaRepository sagaRepository;

    //INDEX
    @GetMapping //localhost:8080/sagas
    public ResponseEntity<List<Saga>> getAllSagas(){
        return new ResponseEntity<>(sagaRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "/{id}") //localhost:8080/sagas/1
    public ResponseEntity<Optional<Saga>> getSaga(@PathVariable Long id){
        return new ResponseEntity<>(sagaRepository.findById(id), HttpStatus.OK);
    }

    //POST
    @PostMapping // localhost:8080/sagas
    public ResponseEntity<Saga> createSaga(@RequestBody Saga newSaga){
        sagaRepository.save(newSaga);
        return new ResponseEntity<>(newSaga, HttpStatus.CREATED);
    }

    //DELETE
    @DeleteMapping(value = "/{id}") //localhost:8080/sagas/1
    public ResponseEntity<Saga> deleteSaga(@PathVariable Long id){
        sagaRepository.deleteById(id);
        return new ResponseEntity(id,HttpStatus.OK);
    }
}
