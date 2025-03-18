module org.example.workshopjavafxjbdc {
    requires javafx.controls;
    requires javafx.fxml;


    opens guiClasses.controller to javafx.fxml;
    exports guiClasses.controller to javafx.fxml;

    opens model.services to javafx.base;
    exports model.services to javafx.base;

    opens model.entities to javafx.base;
    exports model.entities to javafx.base;

    opens org.example.workshopjavafxjbdc to javafx.fxml;
    exports org.example.workshopjavafxjbdc;
}