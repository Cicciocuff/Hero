package com.example.demo.superhero.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Superhero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String superpower;

    private String mainEnemy;

    // Altri attributi come età, origine, descrizione, etc. possono essere aggiunti a seconda delle necessità.

    // Costruttori, getter e setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void setMainEnemy(String mainEnemy) {
        this.mainEnemy = mainEnemy;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public String getMainEnemy() {
        return mainEnemy;
    }

    public Superhero(Long id, String name, String superpower, String mainEnemy) {
        this.id = id;
        this.name = name;
        this.superpower = superpower;
        this.mainEnemy = mainEnemy;
    }

    public Superhero(Long id) {
        this.id = id;
    }

    public Superhero() {
    }
}
