package com.bnta.dragonball_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    @Enumerated(EnumType.STRING)
    private Series series;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String planet;
    @Column
    private Long powerLevel;
    @Column
    private String race;
    @Column
    private double height;
    @Column
    private double weight;
    @ManyToMany
    @JoinTable(
            name = "persons_techniques",
            joinColumns = {@JoinColumn(name = "person_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "technique_id")}
    )
//    @JsonIgnoreProperties({"persons"})
    private List<Technique> techniques;

    @ManyToOne
    @JoinColumn(name = "saga_id",nullable = false)
//    @JsonIgnoreProperties({"person"})
    private Saga saga;

    public Person() {}

    public Person(Series series, String name, int age, String planet, Long powerLevel, String race, double height, double weight, List<Technique> techniques, Saga saga) {
        this.series = series;
        this.name = name;
        this.age = age;
        this.planet = planet;
        this.powerLevel = powerLevel;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.techniques = techniques;
        this.saga = saga;
    }

    public Long getId() {
        return id;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public Long getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(Long powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Technique> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<Technique> techniques) {
        this.techniques = techniques;
    }

    public Saga getSaga() {
        return saga;
    }

    public void setSaga(Saga saga) {
        this.saga = saga;
    }
}
