module es.erlantzg {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.erlantzg to javafx.fxml;
    exports es.erlantzg;
}
