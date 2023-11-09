package com.Rakesh;
// Superclass Animal
class Animal {
    // Method in the superclass
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Override the makeSound() method for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Override the makeSound() method for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call makeSound() for each object
        System.out.println("Calling makeSound() for genericAnimal:");
        genericAnimal.makeSound();

        System.out.println("\nCalling makeSound() for dog:");
        dog.makeSound();

        System.out.println("\nCalling makeSound() for cat:");
        cat.makeSound();
    }
}
