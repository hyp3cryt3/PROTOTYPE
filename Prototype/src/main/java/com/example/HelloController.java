package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import model.*;
import model.Shapes;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ListView listboxforfigure;

    Shapes sp = new Rect(Color.ORANGE, 150, 200);
    private ObservableList<Shapes> items;
    public ColorPicker picker;
    @FXML
    private Canvas my_canvas;
    private GraphicsContext gc;

    public void addShape(MouseEvent x) {

        GraphicsContext gr = my_canvas.getGraphicsContext2D();

        listboxforfigure.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int a = listboxforfigure.getSelectionModel().getSelectedIndex();

        Shapes new_figure = (Shapes) items.get(a).clone();
        new_figure.setShapeColor(picker.getValue());
        new_figure.DrawShape(gr, x.getX(), x.getY());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Rect rect = new Rect(Color.ORANGE, 200, 100);
        Tring trig = new Tring(Color.ORANGE, 60, 60);
        Line line = new Line(Color.ORANGE);


        listboxforfigure.setCellFactory(new Callback<ListView<Shapes>, ListCell<Shapes>>() {
            @Override
            public ListCell<Shapes> call(ListView<Shapes> list) {

                return new ShapeCell();
            }

        }

        );

        items = FXCollections.observableArrayList(rect, trig, line);
        listboxforfigure.setItems(items);
        listboxforfigure.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
}