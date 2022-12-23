package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.lang.Cloneable;

public abstract class Shapes implements Cloneable{
    protected Color ShapeColor;

    public abstract String toString();
    public abstract void DrawShape(GraphicsContext gc, double start_x, double start_y);


    public Shapes(Color color) {
        System.out.println("Вызов конструктора");
        this.ShapeColor = color;

    }

    public void setShapeColor(Color shapeColor) {
        this.ShapeColor = shapeColor;
    }

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
