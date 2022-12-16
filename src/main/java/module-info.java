module com.builtdifferently.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.builtdifferently.calculator to javafx.fxml;
    exports com.builtdifferently.calculator;
}