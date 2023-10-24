module com.example.mockui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mockui to javafx.fxml;
    exports com.example.mockui;
}