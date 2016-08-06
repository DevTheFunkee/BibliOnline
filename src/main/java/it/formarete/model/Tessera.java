package it.formarete.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="tessere")
public class Tessera {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numero_tessera")
	private int numeroTessera;
	@Column(name="data_emissione")
	private Date dataEmissione;
	private String password;
	
	@ManyToOne(optional=true,cascade=CascadeType.PERSIST)
	@JoinColumn(name="cod_stato")
	private StatoTessera statoTessera;
	
	@ManyToOne(optional=true,cascade=CascadeType.PERSIST)
	@JoinColumn(name="cod_utente")	
	private Utente utente;
	
	@ManyToOne(optional=true,cascade=CascadeType.PERSIST)
	@JoinColumn(name="cod_ruolo")	
	private Ruolo ruolo;
	
	public int getNumeroTessera() {
		return numeroTessera;
	}
	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
	public Date getDataEmissione() {
		return dataEmissione;
	}
	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StatoTessera getStatoTessera() {
		return statoTessera;
	}
	public void setStatoTessera(StatoTessera statoTessera) {
		this.statoTessera = statoTessera;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Ruolo getRuolo() {
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}
	
	public Tessera() {
		super();
	}
	
	public Tessera(Date dataEmissione, String password, StatoTessera statoTessera, Utente utente, Ruolo ruolo) {
		super();
		this.dataEmissione = dataEmissione;
		this.password = password;
		this.statoTessera = statoTessera;
		this.utente = utente;
		this.ruolo = ruolo;
	}
	
	public Tessera(int numeroTessera, Date dataEmissione, String password, StatoTessera statoTessera, Utente utente,
			Ruolo ruolo) {
		super();
		this.numeroTessera = numeroTessera;
		this.dataEmissione = dataEmissione;
		this.password = password;
		this.statoTessera = statoTessera;
		this.utente = utente;
		this.ruolo = ruolo;
	}
	
	@Override
	public String toString() {
		return "Tessera numero " + numeroTessera + "";
	}
	
	
}
