module com.example.quarternarycalc3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.quarternarycalc3 to javafx.fxml;
    exports com.example.quarternarycalc3;
    exports com.example.quarternarycalc3.QuaternaryConverter;
    opens com.example.quarternarycalc3.QuaternaryConverter to javafx.fxml;
}