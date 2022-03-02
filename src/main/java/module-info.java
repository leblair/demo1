module com.m7.practica1.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.m7.practica1.demo1 to javafx.fxml;
    exports com.m7.practica1.demo1;
}