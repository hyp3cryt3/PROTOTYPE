package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes
{
    public void DrawShape(GraphicsContext gc, double start_x, double start_y) {
        gc.setStroke(ShapeColor);
        gc.strokeLine(start_x,start_y, start_x + 100, start_y);
    }


    public String toString() {
        return "Линия цвета - " + super.ShapeColor;
    }

    public Line(Color color) {
        super(color);
    }
}
