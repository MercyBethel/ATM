package com.example.atm2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloController implements EventHandler<ActionEvent> {

    PasswordField passwordField;
    String sql=null;
    public HelloController(PasswordField passwordField) {
        this.passwordField=passwordField;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        try {
            ConnectionDB cn = new ConnectionDB();
            Connection connection = cn.conMethod();
            Statement st = connection.createStatement();

            String p=passwordField.getText();
            //String sql=null;
              sql="select Balance from ATM where PIN='"+p+"'";

            ResultSet resultSet;
            resultSet = st.executeQuery(sql);

            while(resultSet.next()){
                 String blc=resultSet.getString("Balance");
                 display(blc);
                 //opt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
 public void  display(String blc){
     BorderPane borderPane = new BorderPane();
     Text label = new Text("Your balance is "+ blc);
     label.setFont(Font.font("times new roman", FontWeight.BOLD, FontPosture.ITALIC,20));
     borderPane.setCenter(label );
         borderPane.setStyle("-fx-background-color:THISTLE;");
        Stage stage = new Stage();
     Scene scene = new Scene(borderPane,500,500);
     stage.setScene(scene);
     stage.show();



 }



}




