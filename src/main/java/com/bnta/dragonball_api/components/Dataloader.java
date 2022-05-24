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
import java.util.ArrayList;
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

        // Shared Techniques
        Technique flight = new Technique("Flight","Movement");
        Technique kamehameha = new Technique("Kamehameha", "Beam");
        Technique instantTransmission = new Technique("Instant Transmission", "Teleportation");
        Technique spiritBomb = new Technique("Spirit Bomb","Energy Sphere"); //Cell, Goku
        Technique eyeLaser = new Technique("Eye Laser","Beam"); //Cell (And loads of others...)
        Technique afterImage = new Technique("Afterimage","Movement");
        Technique fusion = new Technique("Fusion","Transformation");
        Technique fusionDance = new Technique("Fusion Dance","Transformation");
        Technique lariat = new Technique("Lariat","Rush"); //Broly & Kale
        // Goku Techniques
        Technique powerPole = new Technique("Power pole", "Rush"); //early goku
        Technique kaioken = new Technique("Kaio-ken","Power Up"); //Goku from saiyan sage onwards
        // Gohan Techniques
        Technique leaveMyDaddyAlone = new Technique("Leave My Daddy Alone!","Rush"); //Gohan (Very young)
        Technique hiddenPotential = new Technique("Hidden Potential","Beam"); //Gohan (Very young)
        // Bardock
        Technique rebellionSpear = new Technique("Rebellion Spear","Rush");
        Technique finalSpiritCannon = new Technique("Final Spirit Cannon","Beam/Energy Sphere");
        // Cells Techniques
        Technique absorption = new Technique("Absorption","Support");
        // Tien Techniques
        Technique dodonRay = new Technique("Dodon Ray", "Beam");
        Technique fourWitches = new Technique("Four Witches","Rush");
        // Piccolo Techniques
        Technique demonHand = new Technique("Demon Hand","Rush");
        Technique specialBeamCannon = new Technique("Special Beam Cannon","Beam");
        Technique masenko = new Technique("Masenko","Beam"); //Piccolo, Gohan ...
        // Master Roshi Techniques
        Technique drunkenFist = new Technique("Drunken Fists","Rush");
        Technique thunderShockSurprise = new Technique("Thunder Shock Surprise","Beam");
        // Frieza Techniques
        Technique deathBeam = new Technique("Death Beam", "Beam");
        Technique deathCannon = new Technique("Death Cannon", "Beam");
        Technique deathSaucer = new Technique("Death Saucer", "Disc");
        Technique novaStrike = new Technique("Nova Strike", "Rush");
        // Yamcha Techniques
        Technique wolfFangFist = new Technique("Wolf Fang Fist","Rush");
        Technique spiritBall = new Technique("Spirit Ball","Beam");
        // Nappa Techniques
        Technique volcanoExplosion = new Technique("Volcano Explosion","Exploding wave");
        // Raditz Techniques
        Technique saturdayCrush = new Technique("Saturday Crush","Energy Sphere");
        Technique behindYou = new Technique("Behind You!","Rush");
        Technique begone = new Technique("Begone!","Beam");
        // Trunks Techniques
        Technique doubleBuster = new Technique("Double Buster","Beam");
        Technique busterCannon = new Technique("Buster Cannon","Beam");
        Technique godBreak = new Technique("God Breaker","Beam");
        // Krillin Techniques
        Technique bestHeadbutt = new Technique("Best Headbutt","Rush");
        Technique destructoDisc = new Technique("Destructo Disc","Disc");
        Technique scatteringBullet = new Technique("Scattering Bullet","Bullet");
        Technique doubletsuibikidan = new Technique("Double Tsuibikidan", "Beam");
        Technique solarFlare = new Technique("Solar Flare","Supportive");
        // Vegeta Techniques
        Technique galickGun = new Technique("Galick Gun", "Beam");
        Technique lucoraGun = new Technique("Lucora Gun","Continuous Energy Bullet");
        Technique bigBangAttack = new Technique("Big Bang Attack","Beam");
        Technique finalImapct = new Technique("Final Impact","Beam");
        // Android Techniques
        Technique hellsFlash = new Technique("Hells Flash","Beam"); //Android 16
        Technique machineImpact = new Technique("Machine Impact","Beam"); //Android 16
        Technique hellBreaker = new Technique("Hell Breaker","Beam"); //Android 17
        Technique powerBlitz = new Technique("Power Blitz", "Beam"); //Android 18 and 17
        Technique selfDestructDevice = new Technique("Self Destruct device", "Suicide"); //Android 8
        Technique eighterAttack = new Technique("Eighter Attck", "Rush"); //Android 8
        // Ginuy Force Techniques
        Technique bodyChange = new Technique("Body Change","Supportive"); //Captain Ginyu
        // Buu Techniques
        Technique bodyManipulation = new Technique("Body Manipulation","Rush"); //Kid Buu
        Technique transfigurationBeam = new Technique("Transfiguration Beam","Beam"); //All buus?
        // Broly Techniques
        Technique eraserCannon = new Technique("Eraser Cannon","Beam"); //Broly
        // Mecenary Tao Techniques
        Technique craneStyleAssassinStrike = new Technique("Crane Style Assassin Strike", "Rush");
        Technique pressurePointAttack = new Technique("Pressure Point Attack", "Rush");
        // Super Saiyan Transformations
        Technique SSJ1 = new Technique("Super Saiyan 1", "Transformation"); //Loads
        Technique SSJ2 = new Technique("Super Saiyan 2", "Transformation"); //Loads
        Technique SSJ3 = new Technique("Super Saiyan 3", "Transformation"); //Loads
        Technique SSJ4 = new Technique("Super Saiyan 4", "Transformation"); //Loads
        // Cells Transformations
        Technique imperfectForm = new Technique("Imperfect Form", "Transformation");
        Technique semiPerfectForm = new Technique("Semi-Perfect Form", "Transformation");
        Technique perfectForm = new Technique("Perfect Form", "Transformation");
        Technique superPerfectForm = new Technique("Super Perfect Form", "Transformation");
        // Frieza Transformations
        Technique firstForm = new Technique("First Form", "Transformation");
        Technique secondForm = new Technique("Second Form", "Transformation");
        Technique thirdForm = new Technique("Third Form", "Transformation");
        Technique finalForm = new Technique("Final Form", "Transformation");
        Technique finalForm100 = new Technique("100% Final Form", "Transformation");
        //
        Technique greatSaiyaman = new Technique("Great Saiyaman", "Transformation"); // MajinBuusaga Gohan
        Technique potaraVegito = new Technique("Potara: Vegito (w/Vegeta)", "Transformation"); //MajinBuusaga Goku
        Technique greatApe = new Technique("Great Ape", "Transformation"); // kid Goku in dragon ball
        Technique maxPower = new Technique("Max Power", "Transformation"); // Master Roshi

        techniqueRepository.saveAll(Arrays.asList(kamehameha, galickGun, instantTransmission, SSJ1, SSJ2 , SSJ3, SSJ4, powerPole,
                powerBlitz, deathBeam, deathCannon, deathSaucer, novaStrike, bestHeadbutt, destructoDisc,
                scatteringBullet, doubletsuibikidan, solarFlare, lucoraGun, bigBangAttack, finalImapct, bodyManipulation,
                transfigurationBeam, demonHand, specialBeamCannon, masenko, doubleBuster, busterCannon,
                godBreak, dodonRay, fourWitches, leaveMyDaddyAlone, hiddenPotential, afterImage, drunkenFist,
                thunderShockSurprise, spiritBomb, absorption, eyeLaser, wolfFangFist, spiritBall, eraserCannon, lariat,
                hellsFlash, machineImpact, hellBreaker, fusion, fusionDance, volcanoExplosion, saturdayCrush, behindYou,
                begone, rebellionSpear, finalSpiritCannon, bodyChange, flight, kaioken,
                imperfectForm, semiPerfectForm, perfectForm, superPerfectForm, firstForm, secondForm, thirdForm, finalForm, finalForm100, greatSaiyaman,
                potaraVegito, greatApe, maxPower, selfDestructDevice, eighterAttack, craneStyleAssassinStrike, pressurePointAttack));

        //Dragon ball - Son Goku Characters
        Person gokuSonGokuSaga = new Person(Series.DragonBall, "Goku", 13, "Planet Vegeta",
                "Saiyan", sonGokuSaga, Arrays.asList(powerPole,kamehameha));
        Person bulmaSonGokuSaga = new Person(Series.DragonBall, "Bulma", 16, "Earth",
                "Saiyan", sonGokuSaga, Arrays.asList());
        Person chichiSonGokuSaga = new Person(Series.DragonBall, "Chi-Chi", 12, "Earth",
                "Saiyan", sonGokuSaga, Arrays.asList());
        Person krillinSonGokuSaga = new Person(Series.DragonBall, "Krillin", 14, "Earth",
                "Human", sonGokuSaga, Arrays.asList());
        Person yamchaSonGokuSaga = new Person(Series.DragonBall, "Yamcha", 17, "Earth",
                "Human", sonGokuSaga, Arrays.asList(wolfFangFist));
        Person roshiSonGokuSaga = new Person(Series.DragonBall, "Master Roshi", 320, "Earth",
                "Human", sonGokuSaga,Arrays.asList(kamehameha));
        Person launchSonGokuSaga = new Person(Series.DragonBall, "Launch", 17, "Earth",
                "Human", sonGokuSaga, Arrays.asList());
        Person namSonGokuSaga = new Person(Series.DragonBall, "Nam", 29, "Earth",
                "Human", sonGokuSaga, Arrays.asList());
        Person giranSonGokuSaga = new Person(Series.DragonBall, "Giran", 33, "Unkown",
                "Giras", sonGokuSaga, Arrays.asList());

        // Dragon ball - red ribbon army
        Person boraRedRibbonArmySaga = new Person(Series.DragonBall, "Bora", 0, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person android8RedRibbonArmySaga = new Person(Series.DragonBall, "Android 8", 0, "Earth",
                "Android", redRibbonArmySaga, Arrays.asList(selfDestructDevice, eighterAttack));
        Person generalBlue = new Person(Series.DragonBall, "General Blue", 28, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person bandagesTheMummy= new Person(Series.DragonBall, "Bandages The Mummy", 0, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person masterRoshiRedRibbonArmySaga = new Person(Series.DragonBall, "Master Roshi", 320, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList(kamehameha, thunderShockSurprise, drunkenFist));
        Person akkumanRedRibbonArmySaga = new Person(Series.DragonBall, "Akkuman", 0, "Earth",
                "Devil", redRibbonArmySaga, Arrays.asList());
        Person mercenaryTaoRedRibbonArmySaga = new Person(Series.DragonBall, "Mercenary Tao", 291, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList(dodonRay, pressurePointAttack, craneStyleAssassinStrike));
        Person korinRedRibbonArmySaga = new Person(Series.DragonBall, "Korin", 800, "Earth",
                "Cat", redRibbonArmySaga, Arrays.asList(flight, afterImage));
        Person kidGokuRedRibbonArmySaga = new Person(Series.DragonBall, "Kid Goku", 12, "Planet Vegeta",
                "Saiyan", redRibbonArmySaga, Arrays.asList(powerPole, kamehameha));
        Person grandpaGohanRedRibbonArmySaga = new Person(Series.DragonBall, "Grandpa Gohan", 0, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person commanderRed = new Person(Series.DragonBall, "Commander Red", 0, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person ninjaMurasaki = new Person(Series.DragonBall, "Ninja Murasaki", 35, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person colonelSilver = new Person(Series.DragonBall, "Colonel Silver", 0, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person generalWhite = new Person(Series.DragonBall, "generalWhite", 0, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList());
        Person krillinRedRibbonArmySaga = new Person(Series.DragonBall, "Krillin", 13, "Earth",
                "Earthling", redRibbonArmySaga, Arrays.asList(afterImage));

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

        Person goku = new Person(Series.DragonBall, "Goku", 18, "Planet Vegeta", "Saiyan", piccoloSaga,
                Arrays.asList());

        Person chiaotzu = new Person(Series.DragonBall, "Chiaotzu", 18, "Earth", "Human", piccoloSaga,
                Arrays.asList());

        Person tienShinhan = new Person(Series.DragonBall, "Tien Shinhan", 23, "Earth", "Earthling/Cyclops", piccoloSaga,
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

        Person krillinPiccoloSaga= new Person(Series.DragonBall, "Krillin", 20, "Earth",
                "Human", piccoloSaga, Arrays.asList());

        // Dragon ball Z - Saiyan saga
        Person saibamanSaiyanSaga = new Person(Series.DragonBall_Z, "Saibaman", 0, "Planet Vegeta", "Alien",
                saiyanSaga, Arrays.asList());

        Person yajirobeSaiyanSaga = new Person(Series.DragonBall_Z, "Yajirobe", 26, "Earth", "Human",
                saiyanSaga, Arrays.asList());

        Person gohanSaiyanSaga = new Person(Series.DragonBall_Z, "Gohan", 4, "Earth", "Saiyan/Human",
                saiyanSaga, Arrays.asList());

        Person bulmaSaiyanSaga = new Person(Series.DragonBall_Z, "Bulma", 28, "Earth", "Human",
                saiyanSaga, Arrays.asList());

        Person nappaSaiyanSaga = new Person(Series.DragonBall_Z, "Nappa", 50, "Planet Vegeta", "Saiyan",
                saiyanSaga, Arrays.asList());

        Person chiaotzuSaiyanSaga = new Person(Series.DragonBall_Z, "Chiaotzu", 23, "Earth", "Human",
                saiyanSaga, Arrays.asList());

        Person raditzSaiyanSaga = new Person(Series.DragonBall_Z, "Raditz", 29, "Planet Vegeta", "Saiyan",
                saiyanSaga, Arrays.asList());

        Person masterRoshiSaiyanSaga = new Person(Series.DragonBall_Z, "Master Roshi", 331, "Earth", "Human",
                saiyanSaga, Arrays.asList());

        Person yamchaSaiyanSaga = new Person(Series.DragonBall_Z, "Yamcha", 28, "Earth", "Human",
                saiyanSaga, Arrays.asList());

        Person tienSaiyanSaga = new Person(Series.DragonBall_Z, "Tien Shinhan", 28, "Earth", "Earthling/Cyclops",
                saiyanSaga, Arrays.asList());

        Person vegetaSaiyanSaga = new Person(Series.DragonBall_Z, "Vegeta", 29, "Planet Vegeta", "Saiyan",
                saiyanSaga, Arrays.asList());

        Person gokuSaiyanSaga = new Person(Series.DragonBall_Z, "Goku", 24, "Planet Vegeta", "Saiyan",
                saiyanSaga, Arrays.asList());

        Person kingKaiSaiyanSaga = new Person(Series.DragonBall_Z, "King Kai", 0, "King Kai's Planet", "Core Person",
                saiyanSaga, Arrays.asList());

        Person piccoloSaiyanSaga = new Person(Series.DragonBall_Z, "Piccolo", 8, "Namek", "Namekian",
                saiyanSaga, Arrays.asList());

        Person krillinSaiyanSaga = new Person(Series.DragonBall_Z, "Krillin", 25, "Earth", "Human",
                saiyanSaga, Arrays.asList());

        // Dragon ball Z - Frieza saga
        Person krillinFriezaSaga = new Person(Series.DragonBall_Z, "Krillin", 26, "Earth",
                "Human", friezaSaga, Arrays.asList());

        Person yajirobeFriezaSaga = new Person(Series.DragonBall_Z, "Yajirobe", 27, "Earth",
                "Human", friezaSaga, Arrays.asList());

        Person dendeFriezaSaga = new Person(Series.DragonBall_Z, "Dende", 26, "Namek",
                "Namekian", friezaSaga, Arrays.asList());

        Person gohanFriezaSaga = new Person(Series.DragonBall_Z, "Gohan", 5, "Earth",
                "Saiyan/Human", friezaSaga, Arrays.asList());

        Person piccoloFriezaSaga = new Person(Series.DragonBall_Z, "Piccolo", 9, "Namek",
                "Namekian", friezaSaga, Arrays.asList());

        Person kingKaiFriezaSaga = new Person(Series.DragonBall_Z, "King Kai", 0, "King Kai's Planet",
                "Core Person", friezaSaga, Arrays.asList());

        Person bulmaFriezaSaga = new Person(Series.DragonBall_Z, "Bulma", 29, "Earth",
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

        Person zarbon = new Person(Series.DragonBall_Z, "Zarbon", 0, "Unknown",
                "Alien", friezaSaga, Arrays.asList());

        Person gokuFriezaSaga = new Person(Series.DragonBall_Z, "Goku", 23, "Planet Vegeta",
                "Saiyan",friezaSaga, Arrays.asList(kamehameha, SSJ1));

        Person vegetaFriezaSaga = new Person(Series.DragonBall_Z, "Vegeta", 29, "Planet Vegeta",
                "Saiyan",
                friezaSaga, Arrays.asList(galickGun));

        Person frieza = new Person(Series.DragonBall_Z, "Frieza", 32, "Unknown","Alien",
                friezaSaga, Arrays.asList());

        // Dragon ball Z - Cell saga
        Person teenGohan = new Person(Series.DragonBall_Z, "Teen Gohan", 10, "Earth",
                "Saiyan/Human", cellSaga, Arrays.asList(kamehameha, SSJ1, SSJ2));

        Person vegetaCellSaga = new Person(Series.DragonBall_Z, "Vegeta",48,"Planet Vegeta",
                "Saiyan", cellSaga, Arrays.asList());

        Person futureTrunks = new Person(Series.DragonBall_Z, "Future Trunks", 18, "Earth",
                "Saiyan/Human", cellSaga, Arrays.asList());

        Person cell = new Person(Series.DragonBall_Z, "Cell", 6, "Earth",
                "Android", cellSaga, Arrays.asList());

        Person gokuCellSaga = new Person(Series.DragonBall_Z, "Goku", 30, "Planet Vegeta",
                "Saiyan", cellSaga, Arrays.asList());

        Person android18 = new Person(Series.DragonBall_Z, "Android 18", 3, "Earth",
                "Android", cellSaga, Arrays.asList());

        Person android16 = new Person(Series.DragonBall_Z, "Android 16", 3, "Earth",
                "Android", cellSaga, Arrays.asList());

        Person krillinCellSaga = new Person(Series.DragonBall_Z, "Krillin", 31, "Earth",
                "Human", cellSaga, Arrays.asList());

        Person piccoloCellSaga = new Person(Series.DragonBall_Z, "Piccolo", 14, "Namek",
                "Namekian", cellSaga, Arrays.asList());

        Person tienCellSaga = new Person(Series.DragonBall_Z, "Tien Shinhan", 34, "Earth",
                "Earthling/Cyclops", cellSaga,Arrays.asList());

        Person dendeCellSaga = new Person(Series.DragonBall_Z, "Dende", 6, "Namek",
                "Namekian", cellSaga, Arrays.asList());

        Person mrPopoCellSaga = new Person(Series.DragonBall_Z, "Mr Popo", 1000, "Earth",
                "Genie", cellSaga, Arrays.asList());

        Person chiaotzuCellSaga = new Person(Series.DragonBall_Z, "Chiaotzu", 29, "Earth",
                "Human", cellSaga, Arrays.asList());

        Person trunksCellSaga = new Person(Series.DragonBall_Z, "Trunks", 1, "Earth",
                "Saiyan/Human", cellSaga, Arrays.asList());

        //Majin Buu Saga
        Person gokuMajinBuuSaga = new Person(Series.DragonBall_Z, "Goku", 37, "Planet Vegeta",
                "Saiyan", majinBuuSaga, Arrays.asList());
        Person gotenMajinBuuSaga = new Person(Series.DragonBall_Z, "Goten", 7, "Earth",
                "Saiyan/Human", majinBuuSaga, Arrays.asList());
        Person trunksMajinBuuSaga = new Person(Series.DragonBall_Z, "Trunks", 8, "Earth",
                "Saiyan/Human", majinBuuSaga, Arrays.asList());
        Person gotenksMajibBuuSaga = new Person(Series.DragonBall_Z, "Gotenks", 8, "Earth",
                "Saiyan/Human", majinBuuSaga, Arrays.asList());
        Person majinBuu = new Person(Series.DragonBall_Z, "Majin Buu", 5000000, "Earth",
                "Majin/Core Person", majinBuuSaga, Arrays.asList());
        //Search for Babidi's planet
        Person babidi = new Person(Series.DragonBall_Z, "Babidi", 5000000, "Unknown",
                "Babidis race - Alien Type", majinBuuSaga, Arrays.asList());
        Person gohanMajinBuuSaga = new Person(Series.DragonBall_Z, "Gohan", 17, "Earth",
                "Saiyan/Human", majinBuuSaga, Arrays.asList());
        Person mrSatanMajinBuuSaga = new Person(Series.DragonBall_Z, "Mr Satan", 38, "Earth",
                "Human", majinBuuSaga, Arrays.asList());

        personRepository.saveAll(Arrays.asList(boraRedRibbonArmySaga, android8RedRibbonArmySaga, generalBlue, bandagesTheMummy, masterRoshiRedRibbonArmySaga, akkumanRedRibbonArmySaga, mercenaryTaoRedRibbonArmySaga, korinRedRibbonArmySaga, kidGokuRedRibbonArmySaga, grandpaGohanRedRibbonArmySaga, commanderRed, ninjaMurasaki, colonelSilver, generalWhite, krillinRedRibbonArmySaga,
                                                    yamcha, bulma, chiChi, piccolo, goku, chiaotzu, tienShinhan, yajirobe, oolong, kami, paur, masterRoshi, krillinPiccoloSaga,
                                                    saibamanSaiyanSaga, yajirobeSaiyanSaga, gohanSaiyanSaga, bulmaSaiyanSaga, nappaSaiyanSaga, chiaotzuSaiyanSaga, raditzSaiyanSaga, masterRoshiSaiyanSaga, yamchaSaiyanSaga, tienSaiyanSaga, vegetaSaiyanSaga, gokuSaiyanSaga, kingKaiSaiyanSaga, piccoloSaiyanSaga, krillinSaiyanSaga,
                                                    krillinFriezaSaga, yajirobeFriezaSaga, dendeFriezaSaga, gohanFriezaSaga, piccoloFriezaSaga, kingKaiFriezaSaga, bulmaFriezaSaga, recoome, burter, jeice, guldo, captainGinyu, zarbon, gokuFriezaSaga, vegetaFriezaSaga,
                                                    teenGohan, vegetaCellSaga, futureTrunks, cell, gokuCellSaga, android18, android16, krillinCellSaga, piccoloCellSaga, tienCellSaga, dendeCellSaga, mrPopoCellSaga, chiaotzuCellSaga, trunksCellSaga,
                                                    gokuMajinBuuSaga, gotenMajinBuuSaga, trunksMajinBuuSaga, gotenksMajibBuuSaga, majinBuu, babidi, gohanMajinBuuSaga, mrSatanMajinBuuSaga));

    }

}
