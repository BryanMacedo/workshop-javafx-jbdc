module org.example.workshopjavafxjbdc {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.controller to javafx.fxml;
    exports gui.controller to javafx.fxml;

    opens org.example.workshopjavafxjbdc to javafx.fxml;
    exports org.example.workshopjavafxjbdc;
}