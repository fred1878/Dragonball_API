package com.bnta.dragonball_api;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.models.Series;
import com.bnta.dragonball_api.models.Technique;
import com.bnta.dragonball_api.repositories.PersonRepository;
import com.bnta.dragonball_api.repositories.SagaRepository;
import com.bnta.dragonball_api.repositories.TechniqueRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	SagaRepository sagaRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	TechniqueRepository techniqueRepository;

	@Test
	void contextLoads() {
	}

	// Saga query tests
	@Test
	public void canFindByReleaseDateAfter(){
		List<Saga> found = sagaRepository.findByReleaseDateAfter(LocalDate.of(2005, 2 ,05 ));
		assertThat(found.size()).isEqualTo(2);
	}

	@Test
	public void canFindByNameContainingIgnoreCase(){
		List<Saga> found = sagaRepository.findByNameContainingIgnoreCase("saga");
		assertThat(found.size()).isEqualTo(10);
	}

	@Test
	public void canFindBySeries(){
		List<Saga> found = sagaRepository.findBySeries(Series.DragonBall_Z);
		assertThat(found.size()).isEqualTo(4);
	}

	@Test
	public void canFindByPersonsName(){
		List<Saga> found = sagaRepository.findByPersonsName("Bulma");
		assertThat(found.size()).isEqualTo(3);
	}

	// For person
	@Test
	public void canFindByPersonNameContainingIgnoreCase(){
		List<Person> found = personRepository.findByNameContainingIgnoreCase("trunks");
		assertThat(found.size()).isEqualTo(3);
	}

	@Test
	public void canFindByPlanetContainingIgnoreCase(){
		List<Person> found = personRepository.findByPlanetContainingIgnoreCase("Namek");
		assertThat(found.size()).isEqualTo(7);
	}

	@Test
	public void canFindByAgeGreaterThan(){
		List<Person> found = personRepository.findByAgeGreaterThan(50);
		assertThat(found.size()).isEqualTo(6);
	}

	@Test
	public void canFindByRaceIgnoreCase(){
		List<Person> found = personRepository.findByRaceContainingIgnoreCase("namekian");
		assertThat(found.size()).isEqualTo(7);
	}

	@Test
	public void canFindPersonsBySeries(){
		List<Person> found = personRepository.findBySeries(Series.DragonBall);
		assertThat(found.size()).isEqualTo(13);
	}



}
