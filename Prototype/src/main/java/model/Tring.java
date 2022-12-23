package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tring extends Shapes
{
    double length;
    double height;

    public void DrawShape(GraphicsContext gc, double start_x, double start_y){
        gc.setFill(ShapeColor);
        gc.fillPolygon(new double[]{start_x, length/2, this.length}, new double[]{start_y, height, 0}, 3);
    }


    public String toString() {
        return "Фигура цвета -" + super.ShapeColor;
    }

    public Tring(Color color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;

    }
}
