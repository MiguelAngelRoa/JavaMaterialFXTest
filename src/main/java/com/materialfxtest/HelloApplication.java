package com.materialfxtest;

import com.materialfxtest.controllers.DashboardController;
import com.materialfxtest.controllers.HomeController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private FXMLLoader fxmlLoaderHome;
    private FXMLLoader fxmlLoaderDashboard;

    @Override
    public void start(Stage stage) throws IOException {
        this.fxmlLoaderHome = new FXMLLoader(HelloApplication.class.getResource("fxml/Home.fxml"));
        this.fxmlLoaderDashboard = new FXMLLoader(HelloApplication.class.getResource("fxml/Dashboard.fxml"));

        try{
            Parent vistaHome = fxmlLoaderHome.load();
            Parent vistaDashboard = fxmlLoaderDashboard.load();

            HomeController homeController = new HomeController(vistaDashboard);
            DashboardController dashboardController = new DashboardController(vistaHome);

            Scene scene = new Scene(vistaHome, 320, 240);

            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}