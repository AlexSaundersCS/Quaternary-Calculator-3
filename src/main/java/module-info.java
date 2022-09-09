module com.example.quarternarycalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    exports com.example.quarternarycalc.QuaternaryConverter;
    opens com.example.quarternarycalc.QuaternaryConverter to javafx.fxml;
}