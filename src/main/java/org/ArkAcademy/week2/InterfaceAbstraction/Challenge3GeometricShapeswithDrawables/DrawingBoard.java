package org.ArkAcademy.week2.InterfaceAbstraction.Challenge3GeometricShapeswithDrawables;

import java.util.ArrayList;
import java.util.List;

public class DrawingBoard {
    private List<Drawable> shapes;

    public DrawingBoard() {
        this.shapes = new ArrayList<>();
    }


    public void addShape(Drawable shape) {
        shapes.add(shape);
    }

    public void displayAndDrawShapes() {
        for (Drawable shape : shapes) {
            if (shape instanceof Shape) {
                ((Shape) shape).displayShapeType();
            }
            shape.drawShape();
        }
    }
}
