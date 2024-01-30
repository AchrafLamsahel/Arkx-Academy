package org.ArkAcademy.week2.EncapInheritPolym.practicalExample;

public class Lion extends  Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    // Override method for polymorphism
    @Override
    public void displayInfo() {
        System.out.println("Lion Information:");
        super.displayInfo();
        System.out.println("Type: Mammal");
    }
}
