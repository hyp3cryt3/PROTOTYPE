module com.example.Prototype {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example;
    opens com.example to javafx.fxml;
}