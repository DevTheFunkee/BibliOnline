package it.formarete.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="autori")
public class Autore {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_autore")
	private int codAutore;
	
	public int getCodAutore() {
		return codAutore;
	}
	public void setCodAutore(int codAutore) {
		this.codAutore = codAutore;
	}
	private String nome;
	private String cognome;
	private String foto;
	@ManyToMany(mappedBy="elencoAutori",cascade=CascadeType.PERSIST)
	private List<Libro> libri=new ArrayList<Libro>();
	public List<Libro> getLibri() {
		return libri;
	}
	public void setLibri(List<Libro> libri) {
		this.libri = libri;
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
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Autore(int codAutore, String nome, String cognome, String foto) {
		super();
		this.codAutore = codAutore;
		this.nome = nome;
		this.cognome = cognome;
		this.foto = foto;
	}
	public Autore(String nome, String cognome, String foto) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.foto = foto;
	}
	public Autore() {
		super();
	}
	@Override
	public String toString() {
		return "" + nome + " " + cognome + "";
	}
	
}
