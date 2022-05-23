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
import java.time.temporal.TemporalQueries;
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
        Technique powerBlitz = new Technique("Power Blitz", "Beam"); //Android 18 and 17
        Technique deathBeam = new Technique("Death Beam", "Beam"); //Frieza
        Technique deathCannon = new Technique("Death Cannon", "Beam"); //Frieza
        Technique deathSaucer = new Technique("Death Saucer", "Disc"); //Frieza
        Technique novaStrike = new Technique("Nova Strike", "Rush"); //Frieza
        Technique bestHeadbutt = new Technique("Best Headbutt","Rush"); //Krillin
        Technique destructoDisc = new Technique("Destructo Disc","Disc"); //Krillin
        Technique scatteringBullet = new Technique("Scattering Bullet","Bullet"); //Krillin
        Technique Doubletsuibikidan = new Technique("Double Tsuibikidan", "Beam"); //Krillin
        Technique solarFlare = new Technique("Soalr Flare","Supportive"); //Krillin
        Technique lucoraGun = new Technique("Lucora Gun","Continuous Energy Bullet"); //Vegeta
        Technique bigBangAttack = new Technique("Big Bang Attack","Beam"); //Vegeta
        Technique finalImapct = new Technique("Final Impact","Beam"); //Vegeta
        Technique bodyManipulation = new Technique("Body Manipulation","Rush"); //Kid Buu
        Technique transfigurationBeam = new Technique("Transfiguration Beam","Beam"); //All buus?
        Technique demonHand = new Technique("Demon Hand","Rush"); //Piccolo
        Technique specialBeamCannon = new Technique("Special Beam Cannon","Beam"); //Piccolo
        Technique masenko = new Technique("Masenko","Beam"); //Piccolo, Gohan ...
        Technique doubleBuster = new Technique("Double Buster","Beam"); //Trunks
        Technique busterCannon = new Technique("Buster Cannon","Beam"); //Trunks
        Technique godBreak = new Technique("God Breaker","Beam"); //Trunks
        Technique dodonRay = new Technique("Dodon Ray", "Beam"); //Tien
        Technique fourWitches = new Technique("Four Witches","Rush"); //Tien
        Technique leaveMyDaddyAlone = new Technique("Leave My Daddy Alone!","Rush"); //Gohan (Very young)
        Technique hiddenPotential = new Technique("Hidden Potential","Beam"); //Gohan (Very young)
        Technique afterImage = new Technique("Afterimage","Movement"); //Master Roshi (And like everyone...)
        Technique drunkenFist = new Technique("Drunken Fists","Rush"); //Master Roshi
        Technique thunderShockSurprise = new Technique("Thunder Shock Surprise","Beam"); //Master Roshi
        Technique spiritBomb = new Technique("Spirit Bomb","Beam"); //Cell, Goku
        Technique absorption = new Technique("Absoption","Support"); //Cell
        Technique eyeLaser = new Technique("Eye Laser","Beam"); //Cell (And loads of others...)
        Technique wolfFangFist = new Technique("Wolf Fang Fist","Rush"); //Yamcha
        Technique spiritBall = new Technique("Spirit Ball","Beam"); //Yamcha
        Technique eraserCannon = new Technique("Eraser Cannon","Beam"); //Broly
        Technique lariat = new Technique("Lariat","Rush"); //Broly & Kale

        techniqueRepository.saveAll(Arrays.asList(kamehameha, galickGun, instantTransmission, SSJ1, SSJ2 , SSJ3, SSJ4));

        Person goku = new Person(Series.DragonBall_Z, "Goku", 23, "Planet Vegeta", (long)3_000_000,
                "Saiyan", 175, 62,
                 friezaSaga, Arrays.asList(kamehameha, SSJ1));

        personRepository.saveAll(Arrays.asList(goku));

    }

}
