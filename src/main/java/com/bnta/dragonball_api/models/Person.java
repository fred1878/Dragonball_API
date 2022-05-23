package com.bnta.dragonball_api.models;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String planet;
    @Column
    private String race;
    @Column
    private Long powerLevel;
    @Column
    private int age;
    @Column
    private double height;
    @Column
    private double weight;

}
