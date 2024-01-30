package org.ArkAcademy.week2.InterfaceAbstraction.practicalExample;

public class ShapeExample {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Using methods from the abstract class and interface
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());
        circle.draw();

        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        rectangle.draw();
    }
}
