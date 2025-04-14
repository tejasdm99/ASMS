package com.animalShelter;

public class Cat extends Animal{
    private String color;
    private boolean indoor;

    public Cat(String name, int age, String healthStatus, String color, boolean indoor) {
        super(name, "Cat", age, healthStatus);
        this.color = color;
        this.indoor = indoor;
    }

    public void displayInfo() {
        String status = adoptionStatus ? "Adopted" : "Available";
        System.out.println(name + " - " + species + " - Color: " + color + ", Indoor: " + indoor + ", Status: " + status);
    }
}
