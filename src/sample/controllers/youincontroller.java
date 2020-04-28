package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class youincontroller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createreportbut;

    @FXML
    private Button editbutt;

    @FXML
    private Button deletbutt;

    @FXML
    private Button addbutt;

    @FXML
    private Button signoutbutt;

    @FXML
    void initialize() {


        signoutbutt.setOnAction(event -> {

            signoutbutt.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmlfiles/loginmenu.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });


        deletbutt.setOnAction(event -> {

            deletbutt.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmlfiles/loshen.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        addbutt.setOnAction(event -> {

            addbutt.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmlfiles/addemploee.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        });



      editbutt.setOnAction(event -> {

          editbutt.getScene().getWindow().hide();
          FXMLLoader loader = new FXMLLoader();
          loader.setLocation(getClass().getResource("/sample/fxmlfiles/editprofile.fxml"));
          try {
              loader.load();
          } catch (IOException e) {
              e.printStackTrace();
          }
          Parent root = loader.getRoot();
          Stage stage = new Stage();
          stage.setScene(new Scene(root));
          stage.show();

      });






        }
    }


