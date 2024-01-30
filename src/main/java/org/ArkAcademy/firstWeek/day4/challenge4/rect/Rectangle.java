package day4.challenge4.rect;

public class Rectangle {
    private double length;
    private double width;

    // Contsructor : Pour initialiser les valeur
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void displayInfo() {
        System.out.println("Rectangle Dimensions - Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}
