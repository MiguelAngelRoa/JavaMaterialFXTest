package com.materialfxtest.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class HomeController implements Initializable {
    private Parent parent;

    @FXML
    private Label homeLabel;

    @FXML
    private Button buttonDashboard;

    public HomeController (){}

    public HomeController (Parent parent) {
        this.parent = parent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Event to go to other view
        this.buttonDashboard.setOnAction(actionEvent -> {
            try {
                Stage stage = (Stage) buttonDashboard.getScene().getWindow();

                stage.setScene(new Scene(parent));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
