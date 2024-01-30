package org.ArkAcademy.week2.EncapInheritPolym.practicalExample;

public class Penguin extends Animal{
    public Penguin(String name, int age) {
        super(name, age);
    }

    // Override method for polymorphism
    @Override
    public void displayInfo() {
        System.out.println("Penguin Information:");
        super.displayInfo();
        System.out.println("Type: Bird");
    }
}
