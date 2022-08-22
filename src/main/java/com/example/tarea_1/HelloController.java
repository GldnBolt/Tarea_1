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
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> email;
    @FXML
    private TableColumn<Student, String> phone;
    @FXML
    private TableColumn<Student, String> nickname;
    @FXML
    private TableColumn<Student, String> student_type;
    @FXML
    private TableColumn<Student, String> exams;
    @FXML
    private TableColumn<Student, String> quices;
    @FXML
    private TableColumn<Student, String> homeworks;
    @FXML
    private TableColumn<Student, String> p1;
    @FXML
    private TableColumn<Student, String> p2;
    @FXML
    private TableColumn<Student, String> p3;
    @FXML
    private TableColumn<Student, String> projectP;
    @FXML
    private TableColumn<Student, String> allP;
    @FXML
    private TableColumn<Student, String> finalgrade;



    @FXML
    private TableView<Student> table;


    private BufferedReader bufferedReader;
    private LinkedList linkedList;
    ObservableList<Student> list = FXCollections.observableArrayList();
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
    projectP = (Datos.get(p1)+Datos.get(p2)+Datos.get(p3))/3;
    allP = (Datos.get(exams)+Datos.get(quices)+Datos.get(homeworks))/3;
    finalgrade = ();

    for (int j = 0; j < Datos.size(); j++){
        list.add(new Student(
                Datos.get(0),
                Datos.get(1),
                Datos.get(2),
                Datos.get(3),
                Datos.get(4),
                Datos.get(5),
                Datos.get(6),
                Datos.get(7),
                Datos.get(8),
                Datos.get(9),
                Datos.get(10),
                Datos.get(11),
                projectP,
                allP,
                finalgrade));
    }
    table.refresh();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carne.setCellValueFactory(new PropertyValueFactory<Student, String>("carne"));
        name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        phone.setCellValueFactory(new PropertyValueFactory<Student, String>("phone"));
        nickname.setCellValueFactory(new PropertyValueFactory<Student, String>("nickname"));
        student_type.setCellValueFactory(new PropertyValueFactory<Student, String>("student_type"));
        exams.setCellValueFactory(new PropertyValueFactory<Student, String>("exams"));
        quices.setCellValueFactory(new PropertyValueFactory<Student, String>("quices"));
        homeworks.setCellValueFactory(new PropertyValueFactory<Student, String>("homeworks"));
        p1.setCellValueFactory(new PropertyValueFactory<Student, String>("p1"));
        p2.setCellValueFactory(new PropertyValueFactory<Student, String>("p2"));
        p3.setCellValueFactory(new PropertyValueFactory<Student, String>("p3"));
        projectP.setCellValueFactory(new PropertyValueFactory<Student, String>("projectP"));
        allP.setCellValueFactory(new PropertyValueFactory<Student, String>("allP"));
        finalgrade.setCellValueFactory(new PropertyValueFactory<Student, String>("finalgrade"));
        table.setItems(list);
    }
}