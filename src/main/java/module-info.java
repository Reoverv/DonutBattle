module com.donutbattle.donutbattle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.donutbattle.donutbattle to javafx.fxml;
    exports com.donutbattle.donutbattle;
}