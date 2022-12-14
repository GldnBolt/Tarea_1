package com.example.tarea_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * La clase HelloApplication es el padre de Application ya que este heredara todo loque la otra tenga, aca se eviadencia
 * la herencia
 * @author Andres Blanco Coto
 */
public class main extends Application {
    /**
     * Crea el stage en donde se mostraran todos los datos y la tabla.
     * @param stage Es el escenario en donde se muestra todo
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1620, 620);
        stage.setTitle("Tarea 1 Andres Blanco");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Hace el inicio del programa
     * @param args son los argumentos que se le mandan al programa, en realidad no es practicamente nada
     */
    public static void main(String[] args) {
        launch();
    }
}