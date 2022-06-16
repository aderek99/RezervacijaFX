package ba.sum.fpmoz.rezervacijafx.rezervacijafx.controller;

import ba.sum.fpmoz.rezervacijafx.rezervacijafx.model.Table;
import ba.sum.fpmoz.rezervacijafx.rezervacijafx.model.putnik;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;



public class RezervacijaController implements Initializable {
    @FXML
    TextField nameTxt;

    @FXML
    TextField usernameTxt;

    @FXML
    TextField uidTxt;

    @FXML
    TextField emailTxt;

    @FXML
    TableColumn tableColumnId;

    @FXML
    TableColumn tableColumnName;

    @FXML
    TableColumn tableColumnUsername;

    @FXML
    TableColumn tableColumnUid;

    @FXML
    TableColumn tableColumnEmail;

    @FXML
    TableView tableViewPutnik;

    @FXML
    Button deleteBtn;
    putnik selectedPutnik;

    @FXML
    protected void selectPutnik (){
        this.selectedPutnik = (putnik) this.tableViewPutnik.getSelectionModel().getSelectedItem();
        this.deleteBtn.setDisable(false);
        this.nameTxt.setText(this.selectedPutnik.getFirstname());
        this.usernameTxt.setText(this.selectedPutnik.getLastname());
        this.uidTxt.setText(this.selectedPutnik.getJMBG());
        this.emailTxt.setText(this.selectedPutnik.getEmail());
    }

    @FXML
    protected void deletePutnik() throws Exception {
        if(this.selectedPutnik != null){
            this.selectedPutnik.delete();
            this.fillPutnici();
        }
    }


    @FXML
    protected void savePutnik() throws Exception {
        if(this.selectedPutnik==null) {
            putnik newPutnik = new putnik();
            newPutnik.setFirstname(this.nameTxt.getText());
            newPutnik.setLastname(this.usernameTxt.getText());
            newPutnik.setJMBG(this.uidTxt.getText());
            newPutnik.setEmail(this.emailTxt.getText());
            newPutnik.save();
        }
        else{
            this.selectedPutnik.setFirstname(this.nameTxt.getText());
            this.selectedPutnik.setLastname(this.usernameTxt.getText());
            this.selectedPutnik.setJMBG(this.uidTxt.getText());
            this.selectedPutnik.setEmail(this.emailTxt.getText());
            this.selectedPutnik.update();
            this.selectedPutnik = null;


        }
        this.fillPutnici();
        this.nameTxt.setText("");
        this.usernameTxt.setText("");
        this.uidTxt.setText("");
        this.emailTxt.setText("");
    }

    private void fillPutnici(){
        try {
            ObservableList<?> putnici= FXCollections.observableList(Table.list(putnik.class));
            this.tableViewPutnik.setItems(putnici);
        } catch (Exception e) {
            System.out.println("Nastala je greska:" + e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.tableColumnName.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        this.tableColumnUsername.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        this.tableColumnUid.setCellValueFactory(new PropertyValueFactory<>("JMBG"));
        this.tableColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        this.fillPutnici();

    }
}
