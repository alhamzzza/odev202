package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.database.DatabaseHandler;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class editprofilecontroller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label text;

    @FXML
    private TextField name;

    @FXML
    private TextField username;

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private Button backbutt;

    @FXML
    private Button savebutton;

    @FXML
    void initialize(){
        DatabaseHandler databaseHandler = new DatabaseHandler();



        backbutt.setOnAction(event -> {

            backbutt.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmlfiles/youin.fxml"));

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
    DatabaseHandler databaseHandler1 = new DatabaseHandler();
        savebutton.setOnAction(event -> {


            try {
                databaseHandler.update(name.getText(), username.getText() ,
                        email.getText() , password.getText());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });


        }

    }



