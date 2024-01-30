package org.ArkAcademy.week2.EncapInheritPolym.Challenge2VehicleRentalSystem;

public class Bike extends Vehicle {
    private boolean hasBasket;

    public Bike(String make, String model, double rentalPrice, boolean hasBasket) {
        super(make, model, rentalPrice);
        this.hasBasket = hasBasket;
    }

    public boolean hasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Basket: " + (hasBasket ? "Yes" : "No"));
    }
}
