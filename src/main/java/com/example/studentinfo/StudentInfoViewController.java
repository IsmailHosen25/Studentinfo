package com.example.studentinfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;


public class StudentInfoViewController {

    ArrayList<String> EmployData=new ArrayList<String>();
    EmployInfo newInfo=new EmployInfo();

    @FXML private TableView<EmployInfo> tableOfEmploy;
    @FXML private TableColumn<EmployInfo, String > columOfCountry;
    @FXML private TableColumn<EmployInfo, String> columOfGender;
    @FXML private TableColumn<EmployInfo, Integer> columOfId;
    @FXML private TableColumn<EmployInfo, String> columOfMobile;
    @FXML private TableColumn<EmployInfo, String> columOfName;

    @FXML private ComboBox<String> comboboxCountry;

    @FXML private RadioButton femaleradieo;
    @FXML private RadioButton maleradieo;


    @FXML
    private TextField textFiledId;

    @FXML
    private TextField textFiledMobile;

    @FXML
    private TextField textFiledName;

    @FXML
    private TextField textFiledSearchId;

    @FXML
    void SearchButton(ActionEvent event) {

    }

    @FXML
    void addEmployButton(ActionEvent event) {

        String gender=null;
        if(maleradieo.isSelected()){
            gender="Male";
        }else{
            gender="Female";
        }
        newInfo=new EmployInfo(textFiledName.getText(),Integer.parseInt(textFiledId.getText()),textFiledMobile.getText(),gender,comboboxCountry.getValue());
        tableOfEmploy.getItems().add(newInfo);

    }
    @FXML
    void  initialize(){

        ToggleGroup gender=new ToggleGroup();
        maleradieo.setToggleGroup(gender);
        femaleradieo.setToggleGroup(gender);
        comboboxCountry.setValue("Select Country");
        comboboxCountry.getItems().addAll("Bangladesh","USA","UK","Canada","Japan");

        columOfName.setCellValueFactory(new PropertyValueFactory<EmployInfo,String>("name"));
        columOfId.setCellValueFactory(new PropertyValueFactory<EmployInfo,Integer>("id"));
        columOfMobile.setCellValueFactory(new PropertyValueFactory<EmployInfo,String>("mobile"));
        columOfGender.setCellValueFactory(new PropertyValueFactory<EmployInfo,String>("gender"));
        columOfCountry.setCellValueFactory(new PropertyValueFactory<EmployInfo,String>("country"));

    }

}
