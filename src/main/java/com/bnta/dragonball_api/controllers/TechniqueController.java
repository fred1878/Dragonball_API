package com.bnta.dragonball_api.controllers;

import com.bnta.dragonball_api.models.Technique;
import com.bnta.dragonball_api.repositories.TechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("techniques")
public class TechniqueController {

    @Autowired
    TechniqueRepository techniqueRepository;

    //INDEX
    @GetMapping //localhost:8080/techniques
    public ResponseEntity<List<Technique>> getAllTechniques(){
        return new ResponseEntity<>(techniqueRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "/{id}") //localhost:8080/techniques/1
    public ResponseEntity<Optional<Technique>> getTechnique(@PathVariable Long id){
        return new ResponseEntity<>(techniqueRepository.findById(id), HttpStatus.OK);
    }

    //POST
    @PostMapping // localhost:8080/techniques
    public ResponseEntity<Technique> createTechnique(@RequestBody Technique newTechnique){
        techniqueRepository.save(newTechnique);
        return new ResponseEntity<>(newTechnique, HttpStatus.CREATED);
    }

    //DELETE
    @DeleteMapping(value = "/{id}") //localhost:8080/techniques/1
    public ResponseEntity<Technique> deleteTechnique(@PathVariable Long id){
        techniqueRepository.deleteById(id);
        return new ResponseEntity(id,HttpStatus.OK);
    }
}
