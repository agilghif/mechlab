module com.example.mechlab {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.mechlab to javafx.fxml;
    exports com.example.mechlab;
}