package com.bnta.dragonball_api.controllers;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.repositories.PersonRepository;
import com.bnta.dragonball_api.repositories.SagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("sagas")
public class SagaController {

    @Autowired
    SagaRepository sagaRepository;

    //INDEX
    @GetMapping //localhost:8080/sagas
    public ResponseEntity<List<Saga>> getAllSagasAndFilter(
            @RequestParam(name = "releaseDate", required = false) String strDate,
            @RequestParam(name = "name", required = false) String name){
        if(strDate != null && name != null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list2 = sagaRepository.findPersonByName(name);
            List<Saga> out = new ArrayList<>(Stream.of(list1,list2).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate != null && name == null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            return new ResponseEntity<>(sagaRepository.findByReleaseDateAfter(date),HttpStatus.OK);
        }
        if(strDate == null && name != null){
            return new ResponseEntity<>(sagaRepository.findPersonByName(name),HttpStatus.OK);
        }
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
