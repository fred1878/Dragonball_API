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

        //Dragon ball sagas
        Saga sonGokuSaga = new Saga("Son Goku", Series.DragonBall, "1 - 28",
                LocalDate.of(2001, 8, 20));

        Saga redRibbonArmySaga = new Saga("Red Ribbon Army Saga", Series.DragonBall, "29 - 83",
                LocalDate.of(2002, 2, 11));

        Saga piccoloSaga = new Saga("Piccolo Saga", Series.DragonBall, "84 - 153",
                LocalDate.of(2002, 12, 5));



        // Dragon ball Z sagas
        Saga saiyanSaga = new Saga("Saiyan Saga", Series.DragonBall_Z,"1 - 35",
                LocalDate.of(1996,9,13));


        Saga friezaSaga = new Saga("Frieza Saga", Series.DragonBall_Z, "36 - 117",
                LocalDate.of(1997,9,13));


        Saga cellSaga = new Saga("Cell Saga", Series.DragonBall_Z, "118 - 194",
                LocalDate.of(2000,9,04));

        Saga majinBuuSaga = new Saga("Majin Buu Saga", Series.DragonBall_Z, "195 - 291",
                LocalDate.of(2001, 9, 10));


        //Dragon ball Super
        Saga godsOfTheUniverseSaga = new Saga("Gods of the Universe Saga", Series.DragonBall_Super, "1 - 27",
                LocalDate.of(2017, 1, 07));

        Saga zenoSaga = new Saga("Zeno Saga", Series.DragonBall_Super, "28 - 131",
                LocalDate.of(2017, 8, 05));


        //Dragon ball GT
        Saga grandTourSaga = new Saga("Grand Tour Saga", Series.DragonBall_GT, "1- 64",
                LocalDate.of(2005, 2 ,05 ));


        sagaRepository.saveAll(Arrays.asList(sonGokuSaga, redRibbonArmySaga, piccoloSaga,
                                             saiyanSaga, friezaSaga, cellSaga, majinBuuSaga,
                                             godsOfTheUniverseSaga, zenoSaga,
                                             grandTourSaga));


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
                 friezaSaga, Arrays.asList(kamehameha, SSJ1));

        personRepository.saveAll(Arrays.asList(goku));
    }




}
