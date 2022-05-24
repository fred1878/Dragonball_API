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
        Saga sonGokuSaga = new Saga("Son Goku Saga", Series.DragonBall, "1 - 28",
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

        Technique flight = new Technique("Flight","Movement"); //Anyone with ki
        Technique kamehameha = new Technique("Kamehameha", "Beam"); //Loads
        Technique galickGun = new Technique("Galick Gun", "Beam"); //Vegeta
        Technique instantTransmission = new Technique("Instant Transmission", "Teleportation"); //Like everyone
        Technique SSJ1 = new Technique("Super Saiyan 1", "Transformation"); //Loads
        Technique SSJ2 = new Technique("Super Saiyan 2", "Transformation"); //Loads
        Technique SSJ3 = new Technique("Super Saiyan 3", "Transformation"); //Loads
        Technique SSJ4 = new Technique("Super Saiyan 4", "Transformation"); //Loads
        Technique kaioken = new Technique("Kaio-ken","Power Up"); //Goku
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
        Technique spiritBomb = new Technique("Spirit Bomb","Energy Sphere"); //Cell, Goku
        Technique absorption = new Technique("Absoption","Support"); //Cell
        Technique eyeLaser = new Technique("Eye Laser","Beam"); //Cell (And loads of others...)
        Technique wolfFangFist = new Technique("Wolf Fang Fist","Rush"); //Yamcha
        Technique spiritBall = new Technique("Spirit Ball","Beam"); //Yamcha
        Technique eraserCannon = new Technique("Eraser Cannon","Beam"); //Broly
        Technique lariat = new Technique("Lariat","Rush"); //Broly & Kale
        Technique hellsFlash = new Technique("Hells Flash","Beam"); //Android 16
        Technique machineImpact = new Technique("Machine Impact","Beam"); //Android 16
        Technique hellBreaker = new Technique("Hell Breaker","Beam"); //Android 17
        Technique fusion = new Technique("Fusion","Transformation"); //.... A lot
        Technique fusionDance = new Technique("Fusion Dance","Transformation"); // .... A lot
        Technique volcanoExplosion = new Technique("Volcano Explosion","Exploding wave"); //Nappa
        Technique saturdayCrush = new Technique("Saturday Crush","Energy Sphere"); //Raditz
        Technique behindYou = new Technique("Behind You!","Rush"); //Raditz
        Technique begone = new Technique("Begone!","Beam"); //Raditz
        Technique rebellionSpear = new Technique("Rebellion Spear","Rush"); //Bardock
        Technique finalSpiritCannon = new Technique("Final Spirit Cannon","Beam/Energy Sphere"); //Bardock
        Technique bodyChange = new Technique("Body Change","Supportive"); //Captain Ginyu

        techniqueRepository.saveAll(Arrays.asList(kamehameha, galickGun, instantTransmission, SSJ1, SSJ2 , SSJ3, SSJ4,
                powerBlitz, deathBeam, deathCannon, deathSaucer, novaStrike, bestHeadbutt, destructoDisc,
                scatteringBullet, Doubletsuibikidan, solarFlare, lucoraGun, bigBangAttack, finalImapct, bodyManipulation,
                transfigurationBeam, demonHand, specialBeamCannon, masenko, doubleBuster, busterCannon,
                godBreak, dodonRay, fourWitches, leaveMyDaddyAlone, hiddenPotential, afterImage, drunkenFist,
                thunderShockSurprise, spiritBomb, absorption, eyeLaser, wolfFangFist, spiritBall, eraserCannon, lariat,
                hellsFlash, machineImpact, hellBreaker, fusion, fusionDance, volcanoExplosion, saturdayCrush, behindYou,
                begone, rebellionSpear, finalSpiritCannon, bodyChange, flight, kaioken));

        // Dragon ball  - Piccolo saga characters
        Person yamcha = new Person(Series.DragonBall, "Yamcha", 23, "Earth",
                "Human",
                piccoloSaga, Arrays.asList());

        Person bulma = new Person(Series.DragonBall, "Bulma", 23, "Earth", "Human", piccoloSaga,
                Arrays.asList());

        Person chiChi = new Person(Series.DragonBall, "Chi-Chi", 19, "Earth", "Human", piccoloSaga,
                Arrays.asList());

        Person piccolo = new Person(Series.DragonBall, "Piccolo", 3, "Namek", "Namekian", piccoloSaga,
                Arrays.asList());

        Person goku1 = new Person(Series.DragonBall, "Goku", 18, "Planet Vegeta", "Saiyan", piccoloSaga,
                Arrays.asList());

        Person chiaotzu = new Person(Series.DragonBall, "Chiaotzu", 18, "Earth", "Human", piccoloSaga,
                Arrays.asList());

        Person tienShinhan = new Person(Series.DragonBall, "Tien Shinhan", 23, "Earth", "Triclops", piccoloSaga,
                Arrays.asList());

        Person yajirobe = new Person(Series.DragonBall, "Yajirobe", 21, "Earth", "Human", piccoloSaga,
                Arrays.asList());

        Person oolong = new Person(Series.DragonBall, "Oolong", 16, "Earth", "Animal type Earthling",
                piccoloSaga,
                Arrays.asList());

        Person kami = new Person(Series.DragonBall, "Kami", 495, "Namek", "Namekian", piccoloSaga,
                Arrays.asList());

        Person paur = new Person(Series.DragonBall, "Paur", 13, "Earth", "Animal type Earthling", piccoloSaga,
                Arrays.asList());

        Person masterRoshi = new Person(Series.DragonBall, "Master Roshi", 326, "Earth", "Human", piccoloSaga,
                Arrays.asList());

        Person krillen = new Person(Series.DragonBall, "Krillen", 20, "Earth",
                "Human", piccoloSaga, Arrays.asList());

        // Dragon ball Z - Frieza saga
        Person krillen2 = new Person(Series.DragonBall_Z, "Krillen", 26, "Earth",
                "Human", friezaSaga, Arrays.asList());

        Person yajirobe2 = new Person(Series.DragonBall_Z, "Yajirobe", 27, "Earth",
                "Human", friezaSaga, Arrays.asList());

        Person dende = new Person(Series.DragonBall_Z, "Dende", 26, "Namek",
                "Namekian", friezaSaga, Arrays.asList());

        Person gohan = new Person(Series.DragonBall_Z, "Gohan", 5, "Earth",
                "Saiyan/Human", friezaSaga, Arrays.asList());

        Person piccolo2 = new Person(Series.DragonBall_Z, "Piccolo", 9, "Namek",
                "Namekian", friezaSaga, Arrays.asList());

        Person kingKai = new Person(Series.DragonBall_Z, "King Kai", 0, "King Kai's Planet",
                "Core Person", friezaSaga, Arrays.asList());

        Person bulma2 = new Person(Series.DragonBall_Z, "Bulma", 29, "Earth",
                "Human", friezaSaga, Arrays.asList());

        // Frieza saga / Ginyu Forces members
        Person recoome = new Person(Series.DragonBall_Z, "Recoome", 0, "Unknown",
                "Alien", friezaSaga, Arrays.asList());

        Person burter = new Person(Series.DragonBall_Z, "Burter", 0, "Unknown",
                "Alien", friezaSaga, Arrays.asList());

        Person jeice = new Person(Series.DragonBall_Z, "Jeice", 0, "Planet Brench",
                "Alien", friezaSaga, Arrays.asList());

        Person guldo = new Person(Series.DragonBall_Z, "Guldo", 0, "Bas",
                "Boulean", friezaSaga, Arrays.asList());

        Person captainGinyu = new Person(Series.DragonBall_Z, "Captain Ginyu", 0, "Unknown",
                "Alien", friezaSaga, Arrays.asList());

        Person zarbon = new Person(Series.DragonBall_Z, "Krillen", 0, "Unknown",
                "Alien", friezaSaga, Arrays.asList());

        Person goku2 = new Person(Series.DragonBall_Z, "Goku", 23, "Planet Vegeta",
                "Saiyan",friezaSaga, Arrays.asList(kamehameha, SSJ1));

        Person vegeta = new Person(Series.DragonBall_Z, "Vegeta", 29, "Planet Vegeta",
                "Saiyan",
                friezaSaga, Arrays.asList(galickGun));

        //Cell saga
        Person frieza = new Person(Series.DragonBall_Z, "Frieza", 32, "Unkonwn","Alien",
                friezaSaga, Arrays.asList());

        // Dragon ball Z - Cell saga
        Person teenGohan = new Person(Series.DragonBall_Z, "Teen Gohan", 10, "Earth",
                "Saiyan/Human", cellSaga, Arrays.asList(kamehameha, SSJ1, SSJ2));
        Person vegetaCellSaga = new Person(Series.DragonBall_Z, "Vegeta",48,"Planet Vegeta",
                "Saiyan", cellSaga, Arrays.asList());
        Person futureTrunks = new Person(Series.DragonBall_Z, "Future Trunks", 18, "Earth",
                "Sayian/Human", cellSaga, Arrays.asList());
        Person cell = new Person(Series.DragonBall_Z, "Cell", 6, "Earth",
                "Android", cellSaga, Arrays.asList());
        Person gokuCellSaga = new Person(Series.DragonBall_Z, "Goku", 30, "Planet Vegeta",
                "Saiyan", cellSaga, Arrays.asList());
        Person android18 = new Person(Series.DragonBall_Z, "Android 18", 3, "Earth",
                "Android", cellSaga, Arrays.asList());
        Person android16 = new Person(Series.DragonBall_Z, "Android 16", 3, "Earth",
                "Android", cellSaga, Arrays.asList());
        Person krillin = new Person(Series.DragonBall_Z, "Krillin", 31, "Earth",
                "Human", cellSaga, Arrays.asList());
        Person piccoloCellSaga = new Person(Series.DragonBall_Z, "Piccolo", 14, "Namek",
                "Namekian", cellSaga, Arrays.asList());
        Person tienCellSaga = new Person(Series.DragonBall_Z, "Tien", 34, "Earth",
                "Earthling/Cyclops", cellSaga,Arrays.asList());
        Person dendeCellSaga = new Person(Series.DragonBall_Z, "Dende", 6, "Namek",
                "Namekian", cellSaga, Arrays.asList());
        Person mrPopoCellSaga = new Person(Series.DragonBall_Z, "Mr Popo", 1000, "Earth",
                "Genie", cellSaga, Arrays.asList());
        Person chiaotzuCellSaga = new Person(Series.DragonBall_Z, "Chiaotzu", 29, "Earth",
                "Human", cellSaga, Arrays.asList());
        Person trunksCellSaga = new Person(Series.DragonBall_Z, "Trunks", 1, "Earth",
                "Human/Saiyan", cellSaga, Arrays.asList());

        //Majin Buu Saga
        Person gokuMajinBuuSaga = new Person(Series.DragonBall_Z, "Goku", 37, "Planet Vegeta",
                "Saiyan", majinBuuSaga, Arrays.asList());
        Person gotenMajinBuuSaga = new Person(Series.DragonBall_Z, "Goten", 7, "Earth",
                "Human/Saiyan", majinBuuSaga, Arrays.asList());
        Person trunksMajinBuuSaga = new Person(Series.DragonBall_Z, "Trunks", 8, "Earth",
                "Human/Saiyan", majinBuuSaga, Arrays.asList());
        Person gotenksMajibBuuSaga = new Person(Series.DragonBall_Z, "Gotenks", 8, "Earth",
                "Human/Saiyan", majinBuuSaga, Arrays.asList());
        Person majinBuu = new Person(Series.DragonBall_Z, "Majin Buu", 5000000, "Earth",
                "Majin/Core Person", majinBuuSaga, Arrays.asList());
        //Search for Babidi's planet
        Person babidi = new Person(Series.DragonBall_Z, "Babidi", 5000000, "?",
                "Babidis race - Alien Type", majinBuuSaga, Arrays.asList());
        Person gohanMajinBuuSaga = new Person(Series.DragonBall_Z, "Gohan", 17, "Earth",
                "Human/Saiyan", majinBuuSaga, Arrays.asList());
        Person mrSatanMajinBuuSaga = new Person(Series.DragonBall_Z, "Mr Satan", 38, "Earth",
                "Human", majinBuuSaga, Arrays.asList());

        personRepository.saveAll(Arrays.asList(yamcha, bulma, chiChi, piccolo, goku1, chiaotzu, tienShinhan, yajirobe, oolong, kami, paur, masterRoshi, krillen,
                                                    krillen2, yajirobe2, dende, gohan, piccolo2, kingKai, bulma2, recoome, burter, jeice, guldo, captainGinyu, zarbon, goku2, vegeta,
                                                    teenGohan));

    }

}
