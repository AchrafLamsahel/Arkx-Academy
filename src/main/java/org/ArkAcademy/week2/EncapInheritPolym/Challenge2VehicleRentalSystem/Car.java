package org.ArkAcademy.week2.EncapInheritPolym.Challenge2VehicleRentalSystem;

public class Car extends Vehicle {
    private int numSeats;

    public Car(String make, String model, double rentalPrice, int numSeats) {
        super(make, model, rentalPrice);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Seats: " + numSeats);
    }
}

