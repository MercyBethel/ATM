package com.example.atm2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WithDraw implements EventHandler<ActionEvent> {
    PasswordField passwordField;
    TextField textField;
    String sql,str;
    int n,blc1;
    WithDraw(PasswordField passwordField,TextField textField){
        this.passwordField=passwordField;
        this.textField=textField;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        try {
            ConnectionDB cn = new ConnectionDB();
            Connection connection = cn.conMethod();
            Statement st = connection.createStatement();

            String p=passwordField.getText();
            str=textField.getText();
              n=Integer.parseInt(str);
            //String sql=null;
            sql="select Balance from ATM where PIN='"+p+"'";

            ResultSet resultSet;
            resultSet = st.executeQuery(sql);

            while(resultSet.next()){
                String blc=resultSet.getString("Balance");
                  blc1=Integer.parseInt(blc);
                display(blc);
                //opt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void  display(String blc){
        BorderPane borderPane = new BorderPane();

        if(blc1>=n){
            Alert alt = new Alert(Alert.AlertType.CONFIRMATION);
            alt.setContentText("Succesfully Withdraw");
            alt.showAndWait();
        }

        else{
            Alert alt = new Alert(Alert.AlertType.ERROR);
            alt.setContentText(" Not Enough Money");
            alt.showAndWait();
        }





    }



}

