package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.database.DatabaseHandler;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class signupcontroller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField signuppass;

    @FXML
    private TextField signupname;

    @FXML
    private TextField signupusername;

    @FXML
    private Button signupbutton;

    @FXML
    private Button backbutton;

    @FXML
    private TextField signupemail;


    @FXML
    void initialize() {

        DatabaseHandler databaseHandler = new DatabaseHandler();

    signupbutton.setOnAction(event -> {

        try {
            databaseHandler.signupuser(signupname.getText(), signupusername.getText() ,
                    signupemail.getText() , signuppass.getText());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    });


    backbutton.setOnAction(event -> {


        backbutton.getScene().getWindow().hide();
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



    }
}
