package com.example.mockui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    protected void loginBtnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("main-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        //scene.getStylesheets().add(getClass().getResource("STYLE NAME").toExternalForm());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void createAccountAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("create-account.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        //scene.getStylesheets().add(getClass().getResource("STYLE NAME").toExternalForm());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}