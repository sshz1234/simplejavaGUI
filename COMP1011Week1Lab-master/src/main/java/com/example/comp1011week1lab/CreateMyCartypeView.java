package com.example.comp1011week1lab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CreateMyCartypeView implements Initializable {

    @FXML
    private Button btnRegister;

    @FXML
    private Label lblRegister;

    @FXML
    private TextField txtMake;

    @FXML
    private TextField txtvehicle_type;

    @FXML
    private TextField txtlicnese_number;



    @FXML
    private ComboBox<String> cmbvehicle_type;



    public void CreateNewCartype(javafx.event.ActionEvent actionEvent) {

        Cartype cartype = new Cartype();
        cartype.setMake(txtMake.getText());
        cartype.setVehicletype(txtvehicle_type.getText());
        cartype.setLicense_number(txtlicnese_number.getText());

        lblRegister.setVisible(true);
        lblRegister.setText(cartype.toString());
    }



    @Override
    public void initialize(URL make, ResourceBundle resources) {
        List<String> makes = Arrays.asList("Toyota","Ford","Honda","Chevrolet");
        lblRegister.setVisible(false);
        cmbvehicle_type.getItems().addAll(makes);
    }

}
