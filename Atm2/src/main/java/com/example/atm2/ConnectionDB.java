package com.example.atm2;
import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class  ConnectionDB {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String USERNAME = "java11";
    private static final   String PASSWORD = "1111";
    Connection connection = null;

    public Connection conMethod() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (Exception e) {


            //setContentText(e.toString());
        }




        return connection;
    }


}
