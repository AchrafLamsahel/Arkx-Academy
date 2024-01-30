package org.ArkAcademy.week2.InterfaceAbstraction.Challenge3GeometricShapeswithDrawables;

public abstract class Shape implements Drawable{
    @Override
    public abstract void drawShape();
    // Method to display the type of shape
    public abstract void displayShapeType();

}
