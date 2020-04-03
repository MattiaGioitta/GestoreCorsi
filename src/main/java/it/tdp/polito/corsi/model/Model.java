package it.tdp.polito.corsi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	private CorsoDAO dao;
	
	public Model() {
		this.dao = new CorsoDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(Integer pd){
		return dao.getCorsiByPeriodo(pd);
	}
	
	public Map<Corso,Integer> getIscrittiByPeriodo(Integer pd){
		return dao.getIscrittiByPeriodo(pd);
	}

	public List<Studente> getStudentiByCorso(Corso c ){
		return this.dao.getStudentiByCorso(c);
	}
	public boolean esisteCorso(String codins) {
		return this.dao.esisteCorso(codins);
	}
	
	public Map<String,Integer> getDivisioneCDS(Corso c){
		/*List<Studente> studenti = this.dao.getStudentiByCorso(c);
		//HashMap perchè univoca
		Map<String,Integer> statistiche = new HashMap<String,Integer>();
		for (Studente s : studenti) {
			if(s.getCorso()!= null && s.getCorso().equals("")) {
			if(statistiche.containsKey(s.getCorso())) {
				statistiche.put(s.getCorso(), statistiche.get(s.getCorso())+1);
			}else {
				statistiche.put(s.getCorso(), 1);
			}
		}
			}
		return statistiche;*/
		return dao.getDivisioneCDS(c);
	}
}
