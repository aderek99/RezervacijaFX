package ba.sum.fpmoz.rezervacijafx.rezervacijafx.controller;

import ba.sum.fpmoz.rezervacijafx.rezervacijafx.Program;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PrijavaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void prijavaButton(ActionEvent evt){
        Stage stage = (Stage)((Node) evt.getSource()).getScene().getWindow();
        Program.swapScene(stage, "rezervacija.fxml", "Rezervacija korisnika");
    }
}