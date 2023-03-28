package it.polito.tdp.alien;
import java.util.*;

public class Dizionario {
	
	HashMap<String, List<String>> dizionario;
	
	
	public Dizionario() {
		dizionario = new HashMap<String, List<String>>();
		//traduzioni = new LinkedList<>();
	}
	
	public void putParolaDizionario(String parolaAliena, String traduzione) {
		//se la parola aliena non c'è ancora allora la aggiungo,
		//metto la traduzione nella lista delle traduzioni e metto quella 
		//for (String chiave: dizionario.keySet()){
			//if (!chiave.equals(parolaAliena)){
		if (!dizionario.containsKey(parolaAliena)) 
			dizionario.put(parolaAliena, new LinkedList<String>());
		//se la parola esiste già nel dizionario allora prendo la lista delle traduzioni
		//di quella parola e ci aggiungo la nuova traduzione
		dizionario.get(parolaAliena).add(traduzione);
	}
	
	
	public Map<String, List<String>> getDizionario(){
		return dizionario;
	}

	public String traduci(String parolaInserita) {
		String ritorno = "";
		if (!dizionario.containsKey(parolaInserita)) {
			ritorno = "Parola non esistente nel dizionario";
			return ritorno;
		}
		for (String traduzioneParola : dizionario.get(parolaInserita)) {
			ritorno += traduzioneParola +"\n";
		}
		return ritorno;
	}
}
