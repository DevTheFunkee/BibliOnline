package it.formarete.model;

import javax.persistence.*;

@Entity
@Table(name="editori")
public class Editore {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_editore")
	private int codEditore;
	private String nome;
	private String indirizzo;
	public int getCodEditore() {
		return codEditore;
	}
	public void setCodEditore(int codEditore) {
		this.codEditore = codEditore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Editore(int codEditore, String nome, String indirizzo) {
		super();
		this.codEditore = codEditore;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	public Editore(String nome, String indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	public Editore() {
		super();
	}
	@Override
	public String toString() {
		return  nome + " Editore, " + indirizzo ;
	}

}
