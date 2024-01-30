package org.ArkAcademy.week2.InterfaceAbstraction.Challenge3GeometricShapeswithDrawables;

public class Triangle extends Shape{

    @Override
    public void drawShape() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void displayShapeType() {
        System.out.println("Type: Triangle");
    }
}
