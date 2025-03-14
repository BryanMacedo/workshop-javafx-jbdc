module org.example.workshopjavafxjbdc {
    requires javafx.controls;
    requires javafx.fxml;


    opens guiClasses.controller to javafx.fxml;
    exports guiClasses.controller to javafx.fxml;

    opens org.example.workshopjavafxjbdc to javafx.fxml;
    exports org.example.workshopjavafxjbdc;
}