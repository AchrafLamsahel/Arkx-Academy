package org.ArkAcademy.week2.EncapInheritPolym.Challenge2VehicleRentalSystem;

public class RentalAgency {
    private Vehicle[] fleet;

    public RentalAgency(int capacity) {
        fleet = new Vehicle[capacity];
    }

    public void addVehicle(Vehicle vehicle, int index) {
        if (index >= 0 && index < fleet.length) {
            fleet[index] = vehicle;
        } else {
            System.out.println("Invalid index. Vehicle not added to the fleet.");
        }
    }

    public void rentVehicle(int index) {
        if (index >= 0 && index < fleet.length) {
            Vehicle vehicle = fleet[index];
            if (vehicle != null && !vehicle.isRented()) {
                vehicle.setRented(true);
                System.out.println("Vehicle rented successfully!");
            } else {
                System.out.println("Vehicle is not available for rent.");
            }
        } else {
            System.out.println("Invalid index. Unable to rent the vehicle.");
        }
    }

    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : fleet) {
            if (vehicle != null && !vehicle.isRented()) {
                vehicle.displayInfo();
                System.out.println("-----------------------");
            }
        }
    }
}
