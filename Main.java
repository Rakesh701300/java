package com.Rakesh;
// Parent class Vehicle
class Vehicle {
    public String make;
    public String model;
    public int year;
    public int maximumSpeed;

    // Constructor to initialize the attributes
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method to drive the vehicle (to be overridden by subclasses)
    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }
}

// Subclass Car
class Car1 extends Vehicle {
    public Car1(String make, String model, int year, int maximumSpeed) {
        // Call the constructor of the parent class using super()
        super(make, model, year, maximumSpeed);
    }

    // Override the drive() method for Car
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

      // Subclass Bike
      class Bike extends Vehicle {
       public Bike(String make, String model, int year, int maximumSpeed) {
        // Call the constructor of the parent class using super()
        super(make, model, year, maximumSpeed);
    }

    // Override the drive() method for Bike
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
       }
   }

   public class Main {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Car1 car = new Car1("Toyota", "Camry", 2023, 150);
        Bike bike = new Bike("Honda", "CBR500R", 2023, 120);

        // Print attributes for Car
        System.out.println("Car attributes: ");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Maximum Speed: " + car.maximumSpeed);

        // Print attributes for Bike
        System.out.println("\nBike attributes: ");
        System.out.println("Make: " + bike.make);
        System.out.println("Model: " + bike.model);
        System.out.println("Year: " + bike.year);
        System.out.println("Maximum Speed: " + bike.maximumSpeed);

        // Call the drive() method for Car and Bike
        car.drive();
        bike.drive();
    }
}
