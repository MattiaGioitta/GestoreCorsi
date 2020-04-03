package it.tdp.polito.corsi.model;

public class Studente {

	private Integer matricola;
	private String nome;
	private String cognome;
	private String corso;
	/**
	 * @param matricola
	 * @param nome
	 * @param cognome
	 * @param corso
	 */
	public Studente(Integer matricola, String nome, String cognome, String corso) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.corso = corso;
	}
	/**
	 * @return the matricola
	 */
	public Integer getMatricola() {
		return matricola;
	}
	/**
	 * @param matricola the matricola to set
	 */
	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return the corso
	 */
	public String getCorso() {
		return corso;
	}
	/**
	 * @param corso the corso to set
	 */
	public void setCorso(String corso) {
		this.corso = corso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricola == null) ? 0 : matricola.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		if (matricola == null) {
			if (other.matricola != null)
				return false;
		} else if (!matricola.equals(other.matricola))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return matricola + " " +nome + " " + cognome;
	}
	
	
}
