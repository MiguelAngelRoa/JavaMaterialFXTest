package com.materialfxtest.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    private Parent parent;

    @FXML
    private Label dashboardLabel;

    public DashboardController(){}

    public DashboardController (Parent parent) {
        this.parent = parent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
