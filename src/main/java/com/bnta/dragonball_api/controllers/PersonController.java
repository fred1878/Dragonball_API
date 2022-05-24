package com.bnta.dragonball_api.controllers;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.models.Series;
import com.bnta.dragonball_api.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    //INDEX
    @GetMapping //localhost:8080/persons
    public ResponseEntity<List<Person>> getAllPersonsAndFilter(
            @RequestParam(name = "name",required = false) String name,
            @RequestParam(name = "planet",required = false) String planet,
            @RequestParam(name = "age", required = false) Integer age,
            @RequestParam(name = "race",required = false) String race,
            @RequestParam(name = "series", required = false) String series){
        if(name != null && planet != null && age != null && race != null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list2, list3, list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet != null && age != null && race != null && series == null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> out = new ArrayList<>(Stream.of(list1, list2, list3, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet != null && age != null && race == null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list2, list3, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet != null && age == null && race != null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list2, list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet == null && age != null && race != null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list3, list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet != null && age != null && race != null && series != null){
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list2, list3, list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet != null && age != null && race == null && series == null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> out = new ArrayList<>(Stream.of(list1, list2, list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet != null && age == null && race != null && series == null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> out = new ArrayList<>(Stream.of(list1, list2, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet == null && age != null && race != null && series == null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> out = new ArrayList<>(Stream.of(list1, list3, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet != null && age != null && race != null && series == null){
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> out = new ArrayList<>(Stream.of(list2, list3, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet != null && age == null && race == null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list2, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet == null && age != null && race == null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list3, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet != null && age != null && race == null && series != null){
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list2, list3, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet == null && age == null && race != null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet != null && age == null && race != null && series != null){
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list2, list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet == null && age != null && race != null && series != null){
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list3, list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet == null && age == null && race != null && series != null){
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list4, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet == null && age != null && race == null && series != null){
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list3, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet != null && age == null && race == null && series != null){
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list2, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet == null && age == null && race == null && series != null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            List<Person> out = new ArrayList<>(Stream.of(list1, list5).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet == null && age != null && race != null && series == null){
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> out = new ArrayList<>(Stream.of(list3, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet != null && age == null && race != null && series == null){
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> out = new ArrayList<>(Stream.of(list2, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet == null && age == null && race != null && series == null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list4 = personRepository.findByRaceContainingIgnoreCase(race);
            List<Person> out = new ArrayList<>(Stream.of(list1, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet != null && age != null && race == null && series == null){
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> out = new ArrayList<>(Stream.of(list2, list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet == null && age != null && race == null && series == null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list3 = personRepository.findByAgeGreaterThan(age);
            List<Person> out = new ArrayList<>(Stream.of(list1, list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && planet != null && age == null && race == null && series == null){
            List<Person> list1 = personRepository.findByNameContainingIgnoreCase(name);
            List<Person> list2 = personRepository.findByPlanetContainingIgnoreCase(planet);
            List<Person> out = new ArrayList<>(Stream.of(list1, list2).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Person::getId, d -> d, (Person x, Person y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && planet == null && age == null && race == null && series != null){
            List<Person> list5 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list5 = (personRepository.findBySeries(s));
                }
            }
            return new ResponseEntity<>(list5, HttpStatus.OK);
        }
        if(name == null && planet == null && age == null && race != null && series == null){
            return new ResponseEntity<>(personRepository.findByRaceContainingIgnoreCase(race),HttpStatus.OK);
        }
        if(name == null && planet == null && age != null && race == null && series == null){
            return new ResponseEntity<>(personRepository.findByAgeGreaterThan(age),HttpStatus.OK);
        }
        if(name == null && planet != null && age == null && race == null && series == null){
            return new ResponseEntity<>(personRepository.findByPlanetContainingIgnoreCase(planet),HttpStatus.OK);
        }
        if(name != null && planet == null && age == null && race == null && series == null){
            return new ResponseEntity<>(personRepository.findByNameContainingIgnoreCase(name),HttpStatus.OK);
        }
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
