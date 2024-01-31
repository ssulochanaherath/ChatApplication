package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/loading_window_form.fxml"))));
        Image icon = new Image(getClass().getResourceAsStream("/images/Logo.jpeg"));
        stage.getIcons().add(icon);
        stage.setTitle("openChat");
        stage.show();
    }
}
