package model;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.paint.Color;

public class Rect extends Shapes
{
    double length;
    double width;


    public String toString()
    {
        return "Цвет фигуры - " + super.ShapeColor;
    }

    @Override
    public void DrawShape(GraphicsContext gc, double start_x, double start_y) {
        gc.setFill(ShapeColor);
        gc.fillRect(start_x, start_y, length, width);
    }

    public Rect(Color color, double length, double width)
    {
        super(color);
        this.length = length;
        this.width = width;
    }
}