import com.animalShelter.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shelter shelter = new Shelter();

        // Add a new Dog
        System.out.println("Add a Dog");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Breed: ");
        String breed = scanner.nextLine();
        System.out.print("Trained (true/false): ");
        boolean trained = Boolean.parseBoolean(scanner.nextLine());
        Dog dog = new Dog(name, age, "Unknown", breed, trained);
        shelter.addAnimal(dog);

        // Add a Cat
        System.out.println("\nAdd a Cat");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Indoor (true/false): ");
        boolean indoor = Boolean.parseBoolean(scanner.nextLine());
        Cat cat = new Cat(name, age, "Unknown", color, indoor);
        shelter.addAnimal(cat);

        // Add a Bird
        System.out.println("\nAdd a Bird");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Wing Span (in meters): ");
        double wingSpan = Double.parseDouble(scanner.nextLine());
        System.out.print("Can Fly (true/false): ");
        boolean canFly = Boolean.parseBoolean(scanner.nextLine());
        Bird bird = new Bird(name, age, "Unknown", wingSpan, canFly);
        shelter.addAnimal(bird);

        // Display animals
        System.out.println("\n--- All Animals ---");
        shelter.viewAnimals();

        // Add a staff member
        System.out.println("\nAdd a Staff Member");
        System.out.print("Staff ID: ");
        int staffId = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String staffName = scanner.nextLine();
        System.out.print("Role: ");
        String role = scanner.nextLine();
        Staff staff = new Staff(staffId, staffName, role);

        // Assign task
        System.out.print("Enter task for staff: ");
        String task = scanner.nextLine();
        staff.assignTask(task);
        staff.displayTasks();

        // Add adopter and adopt an animal
        System.out.println("\nAdd an Adopter");
        System.out.print("Adopter ID: ");
        int adopterId = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String adopterName = scanner.nextLine();
        System.out.print("Contact Info: ");
        String contactInfo = scanner.nextLine();
        Adopter adopter = new Adopter(adopterId, adopterName, contactInfo);

        System.out.print("Enter name of animal to adopt: ");
        String animalToAdopt = scanner.nextLine();
        Animal animal = shelter.findAnimalByName(animalToAdopt);
        if (animal != null) {
            adopter.adoptAnimal(animal);
        } else {
            System.out.println("Animal not found.");
        }

        adopter.displayAdoptedAnimals();

        // Update health of adopted animal by staff
        if (!adopter.getAdoptedAnimals().isEmpty()) {
            Animal adoptedAnimal = adopter.getAdoptedAnimals().get(0);
            System.out.print("\nEnter new health status for " + adoptedAnimal.getName() + ": ");
            String newHealth = scanner.nextLine();
            shelter.updateAnimalHealth(adoptedAnimal.getName(), newHealth);
        }

        scanner.close();
    }
}