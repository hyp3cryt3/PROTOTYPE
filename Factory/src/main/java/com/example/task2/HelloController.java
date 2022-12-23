package com.example.task2;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    Shapes sp = new Rectagle(Color.BLUE, 200, 200);
    @FXML
    public ColorPicker colPick;
    @FXML
    public TextField fieldKey;
    @FXML
    private Canvas my_canvas;
    @FXML
    private GraphicsContext gr;

    public Shapes getShape(String num){
        if (num.equals("Линия")){
            return new Line(Color.RED, 100.0, 130, 250, 130);
        }
        else if (num.equals("Квадрат")){
            return new Rectagle(Color.BLUE, 200, 200);
        }
        else if (num.equals("Треугольник")){
            return new Triug(Color.GREEN, 300, 100, 80, 100,180,200);
        }
        return new Rectagle(Color.BLUE, 200, 200);
    }

    public void drawKey(KeyEvent keyEvent) {
        gr.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight());

        if(!fieldKey.getText().equals("") ){
            sp = getShape(fieldKey.getText());
            sp.setShapeColor(colPick.getValue());
            sp.Draw(gr);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gr = my_canvas.getGraphicsContext2D();
    }


}