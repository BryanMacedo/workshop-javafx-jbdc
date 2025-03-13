module org.example.workshopjavafxjbdc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.workshopjavafxjbdc to javafx.fxml;
    exports org.example.workshopjavafxjbdc;
}