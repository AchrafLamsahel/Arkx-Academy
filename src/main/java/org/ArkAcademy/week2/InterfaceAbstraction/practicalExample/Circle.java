package org.ArkAcademy.week2.InterfaceAbstraction.practicalExample;

public class Circle extends Shape{
    private double radius;
    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing the draw method from the interface
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
