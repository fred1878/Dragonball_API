package com.bnta.dragonball_api.repositories;

import com.bnta.dragonball_api.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
         List<Person> findByNameContaining (String name);
         List<Person> findPersonByName (String name);

}
