module org.education.loancalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.education.loancalculator to javafx.fxml;
    exports org.education.loancalculator;
}