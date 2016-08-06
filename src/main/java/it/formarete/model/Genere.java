package it.formarete.model;

import javax.persistence.*;

@Entity
@Table(name="generi")
public class Genere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_genere")
	private int codGenere;
	public int getCodGenere() {
		return codGenere;
	}
	public void setCodGenere(int codGenere) {
		this.codGenere = codGenere;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	private String descrizione;
	public Genere(int codGenere, String descrizione) {
		super();
		this.codGenere = codGenere;
		this.descrizione = descrizione;
	}
	public Genere(String descrizione) {
		super();
		this.descrizione = descrizione;
	}
	public Genere() {
		super();
	}
	@Override
	public String toString() {
		return "" + descrizione + "";
	}
	
	
}
