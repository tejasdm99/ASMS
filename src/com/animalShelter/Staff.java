package com.animalShelter;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private int staffId;
    private String name;
    private String role;
    private List<String> tasks = new ArrayList<>();

    public Staff(int staffId, String name, String role) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
    }

    public void assignTask(String task) {
        tasks.add(task);
        System.out.println("Task assigned to " + name + ": " + task);
    }

    public void displayTasks() {
        System.out.println("\nTasks assigned to " + name + " (" + role + "):");
        if (tasks.isEmpty()) {
            System.out.println("No tasks assigned.");
        } else {
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }
}
