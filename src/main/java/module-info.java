module com.example.carrollcop3330assignment4part2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens com.example.carrollcop3330assignment4part2 to javafx.fxml;
    exports com.example.carrollcop3330assignment4part2;
}