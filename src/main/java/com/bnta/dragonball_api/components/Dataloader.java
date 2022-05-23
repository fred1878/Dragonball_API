package com.bnta.dragonball_api.components;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.models.Series;
import com.bnta.dragonball_api.models.Technique;
import com.bnta.dragonball_api.repositories.PersonRepository;
import com.bnta.dragonball_api.repositories.SagaRepository;
import com.bnta.dragonball_api.repositories.TechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    SagaRepository sagaRepository;
    @Autowired
    TechniqueRepository techniqueRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Saga friezaSaga = new Saga("Frieza saga", Series.DragonBall_Z, "75 - 125",
                LocalDate.of(1999,9,21));

        Saga cellSaga = new Saga("Cell saga", Series.DragonBall_Z, "140 - 194",
                LocalDate.of(2000,10,04));


        sagaRepository.saveAll(Arrays.asList(friezaSaga, cellSaga));

        Technique kamehameha = new Technique("Kamehameha", "Beam");
        Technique galickGun = new Technique("Galick Gun", "Beam");
        Technique instantTransmission = new Technique("Instant Transmission", "Teleportation");
        Technique SSJ1 = new Technique("Super Saiyan 1", "Transformation");
        Technique SSJ2 = new Technique("Super Saiyan 2", "Transformation");
        Technique SSJ3 = new Technique("Super Saiyan 3", "Transformation");
        Technique SSJ4 = new Technique("Super Saiyan 4", "Transformation");

        techniqueRepository.saveAll(Arrays.asList(kamehameha, galickGun, instantTransmission, SSJ1, SSJ2 , SSJ3, SSJ4));

        Person goku = new Person(Series.DragonBall_Z, "Goku", 23, "Planet Vegeta", (long)3_000_000,
                "Saiyan", 175, 62,
                Arrays.asList(kamehameha, SSJ1), friezaSaga);

        personRepository.saveAll(Arrays.asList(goku));



    }




}
