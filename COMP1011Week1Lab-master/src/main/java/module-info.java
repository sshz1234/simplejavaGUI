module com.example.comp1011week1lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1011week1lab to javafx.fxml;
    exports com.example.comp1011week1lab;
}