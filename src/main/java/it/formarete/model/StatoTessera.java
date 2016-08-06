package it.formarete.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stato_tessere")
public class StatoTessera {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_stato")
	private int codStato;
	private String descrizione;
	public int getCodStato() {
		return codStato;
	}
	public void setCodStato(int codStato) {
		this.codStato = codStato;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public StatoTessera(int codStato, String descrizione) {
		super();
		this.codStato = codStato;
		this.descrizione = descrizione;
	}
	public StatoTessera(String descrizione) {
		super();
		this.descrizione = descrizione;
	}
	public StatoTessera() {
		super();
	}
	@Override
	public String toString() {
		return "" + codStato + " - " + descrizione + "";
	}
	
}
