package it.polito.tdp.alien;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Dizionario dizionario = new Dizionario();
	
    @FXML
    private Button btnTranslate;

    @FXML
    private TextField txtParole;

    @FXML
    private TextArea txtTraduzione;

    @FXML
    void doTranslate(ActionEvent event) {
    	if (txtParole.getText().contains(" ")) { //allora devo inserire la parola nel dizionario
    		String array[] = txtParole.getText().toLowerCase().split(" ");
    		String parolaAliena = array[0];
    		String traduzione = array[1];
    		if (parolaAliena.matches("[A-Z a-z]*") == true && traduzione.matches("[A-Z a-z]*") == true) {
    			dizionario.putParolaDizionario(parolaAliena, traduzione); //inserisco le parole nel dizionario
    		}
    	}
    	else {
    		txtTraduzione.setText(dizionario.traduci(txtParole.getText().toLowerCase()));
    	}
    	txtParole.clear();
    }
    	

}
