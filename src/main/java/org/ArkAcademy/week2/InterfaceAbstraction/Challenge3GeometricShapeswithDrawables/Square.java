package org.ArkAcademy.week2.InterfaceAbstraction.Challenge3GeometricShapeswithDrawables;

public class Square extends Shape{
    @Override
    public void drawShape() {
        System.out.println("Drawing Square");
    }

    @Override
    public void displayShapeType() {
        System.out.println("Type: Square");
    }
}
