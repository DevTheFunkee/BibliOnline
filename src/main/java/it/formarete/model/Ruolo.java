package it.formarete.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ruoli")
public class Ruolo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_ruolo")
	private int codRuolo;
	private String descrizione;
	public int getCodRuolo() {
		return codRuolo;
	}
	public void setCodRuolo(int codRuolo) {
		this.codRuolo = codRuolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Ruolo(int codRuolo, String descrizione) {
		super();
		this.codRuolo = codRuolo;
		this.descrizione = descrizione;
	}
	public Ruolo(String descrizione) {
		super();
		this.descrizione = descrizione;
	}
	public Ruolo() {
		super();
	}
	@Override
	public String toString() {
		return "" + descrizione + "";
	}
	
}
