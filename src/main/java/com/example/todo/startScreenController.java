package com.example.todo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class startScreenController {
    @FXML
    private ButtonBar buttonBar;
    @FXML
    private BorderPane boarderPane;


    public void initialize() throws IOException {
        Button btn1 = (Button) buttonBar.getButtons().get(0);
        btn1.setText("difficulty");
    }

    @FXML
    private void dfficultyScene() throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("difficulty-view.fxml"));
        boarderPane.setCenter(view);
    }

    @FXML
    private void mathsScene() throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("mathScreen-view.fxml"));
    }
}
