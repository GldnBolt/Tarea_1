package com.example.tarea_1;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController {
    @FXML
    private TableColumn<?, ?> carne;
    @FXML
    private TableColumn<?, ?> email;
    @FXML
    private TableColumn<?, ?> exams;
    @FXML
    private TableColumn<?, ?> examsP;
    @FXML
    private TableColumn<?, ?> finalgrade;
    @FXML
    private TableColumn<?, ?> homeworks;
    @FXML
    private TableColumn<?, ?> homeworksP;
    @FXML
    private TableColumn<?, ?> name;
    @FXML
    private TableColumn<?, ?> nickname;
    @FXML
    private TableColumn<?, ?> p1;
    @FXML
    private TableColumn<?, ?> p2;
    @FXML
    private TableColumn<?, ?> p3;
    @FXML
    private TableColumn<?, ?> phone;
    @FXML
    private TableColumn<?, ?> proyectP;
    @FXML
    private TableColumn<?, ?> quices;
    @FXML
    private TableColumn<?, ?> quicesP;
    @FXML
    private TableColumn<?, ?> student_type;
    @FXML
    private TableView<?> table;
    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }
    private BufferedReader bufferedReader;
    private LinkedList linkedList;

    @FXML
    public void onHelloButtonClick()
    {
        FileChooser fc = new FileChooser();
        File document = fc.showOpenDialog(null);

        List<String> Datos = new ArrayList<String>();
    try {
        BufferedReader lector = new BufferedReader(new FileReader(document));
        String divisor = "";

        while ((divisor = lector.readLine()) != null){
            String[] items = divisor.split(",");
            for (int i = 0; i < 12; i++){
                Datos.add(items[i]);


            }
        }
        System.out.println(Datos);
    }

    catch (IOException ioException) {
        ioException.printStackTrace();

    }

    }
}