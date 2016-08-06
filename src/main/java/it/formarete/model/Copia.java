package it.formarete.model;

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
@Table(name="copie")
public class Copia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_copia")
	private int codCopia;
	@ManyToOne(cascade=CascadeType.PERSIST) 
	@JoinColumn(name = "cod_libro") 
	private Libro libro;
	public int getCodCopia() {
		return codCopia;
	}
	public void setCodCopia(int codCopia) {
		this.codCopia = codCopia;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Copia(int codCopia, Libro libro) {
		super();
		this.codCopia = codCopia;
		this.libro = libro;
	}
	public Copia(Libro libro) {
		super();
		this.libro = libro;
	}
	public Copia() {
		super();
	}
	@Override
	public String toString() {
		return "" + codCopia + ", " + libro + "";
	}
	
	
}
