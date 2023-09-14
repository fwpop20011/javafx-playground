package com.example.todo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    private static String confirmTxt = "";
    @FXML
    private Label Difficulty;
    @FXML
    private ToggleGroup toggleGroup;



    public void initialize(){
        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue != null){
                RadioButton selectedButton = (RadioButton) newValue;
                System.out.println(selectedButton.getText());
                confirmTxt = selectedButton.getText();
            }
        });
    }

    //other methods and handlers
    @FXML
    public void openAds(){
        AlertBox.display("lmao", "Your car needs extended warrenty");
    }

    @FXML
    protected void onConfirmClk() {
        Difficulty.setText(confirmTxt);
    }
}