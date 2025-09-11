package es.erlantzg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;

public class HolaMundoController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnOk;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtNombre;

    /**
     * Cambia el contenido de los TextField
     *
     */
    @FXML
    void pulsarOk(ActionEvent event) {
        txtNombre.setText("nombre");
        txtApellidos.setText("apellidos");
    }

    /**
     * Cierra la aplicacion
     *
     */
    @FXML
    void handleCancel(ActionEvent event) {
        Platform.exit();
    }

}