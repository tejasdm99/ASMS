package com.animalShelter;

public class Bird extends Animal{
    private double wingSpan;
    private boolean canFly;

    public Bird(String name, int age, String healthStatus, double wingSpan, boolean canFly) {
        super(name, "Bird", age, healthStatus);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public void displayInfo() {
        String status = adoptionStatus ? "Adopted" : "Available";
        System.out.println(name + " - " + species + " - Wing Span: " + wingSpan + "m, Can Fly: " + canFly + ", Status: " + status);
    }
}
