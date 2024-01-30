package org.ArkAcademy.week2.InterfaceAbstraction.practicalExample;

public abstract class Shape implements Drawable{
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();


    public void displayColor() {
        System.out.println("Color: " + color);
    }
}
