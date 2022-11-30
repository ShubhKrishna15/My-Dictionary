module com.example.my_dictonary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.my_dictonary to javafx.fxml;
    exports com.example.my_dictonary;
}