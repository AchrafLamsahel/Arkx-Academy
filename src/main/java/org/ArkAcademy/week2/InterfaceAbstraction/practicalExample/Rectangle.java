package org.ArkAcademy.week2.InterfaceAbstraction.practicalExample;

public class Rectangle extends Shape{
    private double length;
    private double width;
    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementing the draw method from the interface
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
