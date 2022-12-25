module com.example.atm2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.atm2 to javafx.fxml;
    exports com.example.atm2;
}