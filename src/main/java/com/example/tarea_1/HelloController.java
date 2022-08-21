package com.example.tarea_1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController implements Initializable {
    @FXML
    private TableColumn<Student, Integer> carne;
    @FXML
    private TableColumn<Student, String> email;
    @FXML
    private TableColumn<Student, Integer> exams;
    @FXML
    private TableColumn<Student, Integer> examsP;
    @FXML
    private TableColumn<Student, Integer> finalgrade;
    @FXML
    private TableColumn<Student, Integer> homeworks;
    @FXML
    private TableColumn<Student, Integer> homeworksP;
    @FXML
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> nickname;
    @FXML
    private TableColumn<Student, Integer> p1;
    @FXML
    private TableColumn<Student, Integer> p2;
    @FXML
    private TableColumn<Student, Integer> p3;
    @FXML
    private TableColumn<Student, Integer> phone;
    @FXML
    private TableColumn<Student, Integer> projectP;
    @FXML
    private TableColumn<Student, Integer> quices;
    @FXML
    private TableColumn<Student, Integer> quicesP;
    @FXML
    private TableColumn<Student, String> student_type;
    @FXML
    private TableView<Student> table;

    ObservableList<Student> list = FXCollections.observableArrayList(
            new Student()
    );
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        student_type.setCellValueFactory(new PropertyValueFactory<Student, String>("student_type"));
        nickname.setCellValueFactory(new PropertyValueFactory<Student, String>("nickname"));
        email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        exams.setCellValueFactory(new PropertyValueFactory<Student, Integer>("exams"));
        examsP.setCellValueFactory(new PropertyValueFactory<Student, Integer>("examsP"));
        finalgrade.setCellValueFactory(new PropertyValueFactory<Student, Integer>("finalgrade"));
        homeworks.setCellValueFactory(new PropertyValueFactory<Student, Integer>("homeworks"));
        homeworksP.setCellValueFactory(new PropertyValueFactory<Student, Integer>("homeworksP"));
        quices.setCellValueFactory(new PropertyValueFactory<Student, Integer>("quices"));
        quicesP.setCellValueFactory(new PropertyValueFactory<Student, Integer>("quicesP"));
        p1.setCellValueFactory(new PropertyValueFactory<Student, Integer>("p1"));
        p2.setCellValueFactory(new PropertyValueFactory<Student, Integer>("p2"));
        p3.setCellValueFactory(new PropertyValueFactory<Student, Integer>("p3"));
        phone.setCellValueFactory(new PropertyValueFactory<Student, Integer>("phone"));
        projectP.setCellValueFactory(new PropertyValueFactory<Student, Integer>("projectP"));
    }
}