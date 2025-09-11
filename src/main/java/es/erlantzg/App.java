package es.erlantzg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loaded = new FXMLLoader(getClass().getResource("/fxml/holamundo.fxml"));
        Scene scene = new Scene(loaded.load(), 320, 240);

        stage.setTitle("Hola Mundo desde FXML");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}