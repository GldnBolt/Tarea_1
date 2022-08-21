package com.example.tarea_1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

import java.io.*;
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
    private TableColumn<Student, String> carne;
    @FXML
    private TableColumn<Student, String> email;
    @FXML
    private TableColumn<Student, String> exams;
    @FXML
    private TableColumn<Student, String> examsP;
    @FXML
    private TableColumn<Student, String> finalgrade;
    @FXML
    private TableColumn<Student, String> homeworks;
    @FXML
    private TableColumn<Student, String> homeworksP;
    @FXML
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> nickname;
    @FXML
    private TableColumn<Student, String> p1;
    @FXML
    private TableColumn<Student, String> p2;
    @FXML
    private TableColumn<Student, String> p3;
    @FXML
    private TableColumn<Student, String> phone;
    @FXML
    private TableColumn<Student, String> projectP;
    @FXML
    private TableColumn<Student, String> quices;
    @FXML
    private TableColumn<Student, String> quicesP;
    @FXML
    private TableColumn<Student, String> student_type;
    @FXML
    private TableView<Student> table;


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

    }
    catch (FileNotFoundException e){
        e.printStackTrace();
    }
    catch (IOException ioException) {
        ioException.printStackTrace();

    }

        ObservableList<Student> list = FXCollections.observableArrayList(
                new Student(Datos.get(0), Datos.get(1), Datos.get(2), Datos.get(3), Datos.get(4), Datos.get(5), Datos.get(6), Datos.get(7), Datos.get(8), Datos.get(9), Datos.get(10), Datos.get(11), Datos.get(12), Datos.get(13), Datos.get(14), Datos.get(15), Datos.get(16))
        );
    table.refresh();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        student_type.setCellValueFactory(new PropertyValueFactory<Student, String>("student_type"));
        nickname.setCellValueFactory(new PropertyValueFactory<Student, String>("nickname"));
        email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        exams.setCellValueFactory(new PropertyValueFactory<Student, String>("exams"));
        examsP.setCellValueFactory(new PropertyValueFactory<Student, String>("examsP"));
        finalgrade.setCellValueFactory(new PropertyValueFactory<Student, String>("finalgrade"));
        homeworks.setCellValueFactory(new PropertyValueFactory<Student, String>("homeworks"));
        homeworksP.setCellValueFactory(new PropertyValueFactory<Student, String>("homeworksP"));
        quices.setCellValueFactory(new PropertyValueFactory<Student, String>("quices"));
        quicesP.setCellValueFactory(new PropertyValueFactory<Student, String>("quicesP"));
        p1.setCellValueFactory(new PropertyValueFactory<Student, String>("p1"));
        p2.setCellValueFactory(new PropertyValueFactory<Student, String>("p2"));
        p3.setCellValueFactory(new PropertyValueFactory<Student, String>("p3"));
        phone.setCellValueFactory(new PropertyValueFactory<Student, String>("phone"));
        projectP.setCellValueFactory(new PropertyValueFactory<Student, String>("projectP"));
        carne.setCellValueFactory(new PropertyValueFactory<Student, String>("carne"));

        table.setItems(List);
    }
}