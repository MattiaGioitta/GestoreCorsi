/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.corsi;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import it.tdp.polito.corsi.model.Corso;
import it.tdp.polito.corsi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPeriodo;

    @FXML
    private TextField TxtCorso;

    @FXML
    private Button btnCorsiPerPeriodo;

    @FXML
    private Button btnStudenti;

    @FXML
    private Button btnNumStudenti;

    @FXML
    private Button btnDivisioneStudenti;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void CorsiPerPeriodo(ActionEvent event) {
    	this.txtRisultato.clear();
    	
    	String pdString = txtPeriodo.getText();
    	Integer pd;
    	try {
    	pd = Integer.parseInt(pdString);
    	}catch(NumberFormatException e) {
    		this.txtRisultato.setText("Devi inserire 1 o 2");
    		return;
    	}
    	if(!pd.equals(1) && !pd.equals(2)) {
    		this.txtRisultato.setText("Devi inserire 1 o 2");
    		return;
    	}
    	//Input corretto
    	
    	List<Corso> lista = this.model.getCorsiByPeriodo(pd);
    	
    	for(Corso c : lista) {
    		this.txtRisultato.appendText(c.toString()+"\n");
    	}
    	

    }

    @FXML
    void StampaDivisione(ActionEvent event) {

    }

    @FXML
    void StampaNumStudenti(ActionEvent event) {
this.txtRisultato.clear();
    	
    	String pdString = txtPeriodo.getText();
    	Integer pd;
    	try {
    	pd = Integer.parseInt(pdString);
    	}catch(NumberFormatException e) {
    		this.txtRisultato.setText("Devi inserire 1 o 2");
    		return;
    	}
    	if(!pd.equals(1) && !pd.equals(2)) {
    		this.txtRisultato.setText("Devi inserire 1 o 2");
    		return;
    	}
    	Map<Corso,Integer> statistiche = this.model.getIscrittiByPeriodo(pd);
    	
    	for (Corso c: statistiche.keySet()) {
    		this.txtRisultato.appendText(c.getNome()+" "+statistiche.get(c)+"\n");
    		
    	}

    }

    @FXML
    void StampaStudenti(ActionEvent event) {

    }
    
    public void setModel(Model model) {
    	this.model = model;
    }

    @FXML
    void initialize() {
        assert txtPeriodo != null : "fx:id=\"txtPeriodo\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtCorso != null : "fx:id=\"TxtCorso\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCorsiPerPeriodo != null : "fx:id=\"btnCorsiPerPeriodo\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnStudenti != null : "fx:id=\"btnStudenti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnNumStudenti != null : "fx:id=\"btnNumStudenti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnDivisioneStudenti != null : "fx:id=\"btnDivisioneStudenti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
