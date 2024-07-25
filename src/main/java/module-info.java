module com.materialfxtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.materialfxtest to javafx.fxml;
    opens com.materialfxtest.controllers to javafx.fxml;

    exports com.materialfxtest;
}