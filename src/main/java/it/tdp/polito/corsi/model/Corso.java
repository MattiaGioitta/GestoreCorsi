package it.tdp.polito.corsi.model;

public class Corso {

	private String codins;
	private int crediti;
	private String nome;
	private int periodoDidattico;
	
	public Corso() {
		
	}
	
	

	/**
	 * Costruttore di Corso con tutti i campi
	 * @param codins
	 * @param crediti
	 * @param nome
	 * @param periodoDidattico
	 */
	public Corso(String codins, int crediti, String nome, int periodoDidattico) {
		super();
		this.codins = codins;
		this.crediti = crediti;
		this.nome = nome;
		this.periodoDidattico = periodoDidattico;
	}



	/**
	 * @return the codins
	 */
	public String getCodins() {
		return codins;
	}

	/**
	 * @param codins the codins to set
	 */
	public void setCodins(String codins) {
		this.codins = codins;
	}

	/**
	 * @return the crediti
	 */
	public int getCrediti() {
		return crediti;
	}

	/**
	 * @param crediti the crediti to set
	 */
	public void setCrediti(int crediti) {
		this.crediti = crediti;
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
	 * @return the periodoDidattico
	 */
	public int getPeriodoDidattico() {
		return periodoDidattico;
	}

	/**
	 * @param periodoDidattico the periodoDidattico to set
	 */
	public void setPeriodoDidattico(int periodoDidattico) {
		this.periodoDidattico = periodoDidattico;
	}



	@Override
	public String toString() {
		return "Corso [codins=" + codins + ", crediti=" + crediti + ", nome=" + nome + ", periodoDidattico="
				+ periodoDidattico + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codins == null) ? 0 : codins.hashCode());
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
		Corso other = (Corso) obj;
		if (codins == null) {
			if (other.codins != null)
				return false;
		} else if (!codins.equals(other.codins))
			return false;
		return true;
	}
	
	
	
	
}
