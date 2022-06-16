module ba.sum.fpmoz.rezervacijafx.rezervacijafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.kordamp.bootstrapfx.core;

    opens ba.sum.fpmoz.rezervacijafx.rezervacijafx to javafx.fxml;
    opens ba.sum.fpmoz.rezervacijafx.rezervacijafx.model to javafx.fxml;
    exports ba.sum.fpmoz.rezervacijafx.rezervacijafx;
    exports ba.sum.fpmoz.rezervacijafx.rezervacijafx.controller;
    exports ba.sum.fpmoz.rezervacijafx.rezervacijafx.model;
    opens ba.sum.fpmoz.rezervacijafx.rezervacijafx.controller to javafx.fxml;


}