module com.example.codeup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codeup to javafx.fxml;
    exports com.example.codeup;
}