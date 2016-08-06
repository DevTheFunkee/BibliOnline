package it.formarete.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="utenti")
public class Utente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_utente")
	private int codUtente;
	private String nome;
	private String cognome;
	private String telefono;
	private String mail;
	@Column(name="data_registrazione")
	private Date dataRegistrazione;
	public int getCodUtente() {
		return codUtente;
	}
	public void setCodUtente(int codUtente) {
		this.codUtente = codUtente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(Date data_registrazione) {
		this.dataRegistrazione = data_registrazione;
	}
	public Utente(int codUtente, String nome, String cognome, String telefono, String mail, Date data_registrazione) {
		super();
		this.codUtente = codUtente;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.mail = mail;
		this.dataRegistrazione = data_registrazione;
	}
	public Utente(String nome, String cognome, String telefono, String mail, Date data_registrazione) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.mail = mail;
		this.dataRegistrazione = data_registrazione;
	}
	public Utente() {
		super();
	}
	@Override
	public String toString() {
		return "" + nome + " " + cognome + "";
	}
	
}
