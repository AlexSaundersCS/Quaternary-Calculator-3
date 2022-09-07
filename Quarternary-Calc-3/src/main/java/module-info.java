module com.example.quarternarycalc3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.quarternarycalc3 to javafx.fxml;
    exports com.example.quarternarycalc3;
}