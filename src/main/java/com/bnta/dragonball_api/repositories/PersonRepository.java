package com.bnta.dragonball_api.repositories;

import com.bnta.dragonball_api.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
