package com.animalShelter;

import com.animalShelter.Displayable;

public abstract class Animal implements Displayable {
    protected String name;
    protected String species;
    protected int age;
    protected String healthStatus;
    protected boolean adoptionStatus;

    public Animal(String name, String species, int age, String healthStatus) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.healthStatus = healthStatus;
        this.adoptionStatus = false;
    }

    public void updateHealthStatus(String status) {
        this.healthStatus = status;
    }

    public void markAdopted() {
        this.adoptionStatus = true;
    }

    public boolean isAdopted() {
        return adoptionStatus;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
