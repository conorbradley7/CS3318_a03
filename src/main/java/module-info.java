module com.example.cs3318_a03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cs3318_a03 to javafx.fxml;
    exports com.example.cs3318_a03;
}