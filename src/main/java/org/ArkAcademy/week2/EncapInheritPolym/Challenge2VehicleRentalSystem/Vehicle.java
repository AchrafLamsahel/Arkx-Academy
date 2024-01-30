package org.ArkAcademy.week2.EncapInheritPolym.Challenge2VehicleRentalSystem;

public class Vehicle {
    private String make;
    private String model;
    private double rentalPrice;
    private boolean rented;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rented = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    // Display vehicle information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rentalPrice);
        System.out.println("Status: " + (rented ? "Rented" : "Available"));
    }
}
