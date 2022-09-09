module com.example.quarternarycalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.quarternarycalc to javafx.fxml;
    exports com.example.quarternarycalc;
    exports com.example.quarternarycalc.QuaternaryConverter;
    opens com.example.quarternarycalc.QuaternaryConverter to javafx.fxml;
}