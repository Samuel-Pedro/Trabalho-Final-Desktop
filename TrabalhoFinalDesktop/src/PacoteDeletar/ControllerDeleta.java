/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteDeletar;

import Principal.TableController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author tuba1
 */
public class ControllerDeleta implements Initializable {
    static String id;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        ControllerDeleta.id = id;
    }
    @FXML
    private Button deleteLabelCancelar;

    @FXML
    private Button deleteLabelConfirmar;

    @FXML
    void confirma(ActionEvent event) {
        TableController controle = new TableController();
        controle.deleta(getId());
                
        fecha();
    }

    @FXML
    void cancela(ActionEvent event) {
        fecha();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void fecha(){
        MainDeleta.getStage().close();
    }
    
}
