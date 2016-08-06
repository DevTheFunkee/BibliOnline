package it.formarete.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="libri")
public class Libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_libro")
	private int codLibro;
	private String titolo;
	private String descrizione;
	private String copertina;
	private String isbn;
	@ManyToOne(optional=true,cascade=CascadeType.PERSIST) 
	@JoinColumn(name = "cod_genere")  
	private Genere genere;
	@ManyToOne(optional=true,cascade=CascadeType.PERSIST) 
	@JoinColumn(name = "cod_lingua")  
	private Lingua lingua;
	@ManyToOne(optional=true,cascade=CascadeType.PERSIST) 
	@JoinColumn(name = "cod_editore")  
	private Editore editore;
	private String anno;
	@OneToMany(cascade=CascadeType.PERSIST,fetch = FetchType.LAZY,mappedBy = "libro")
	private Set<Copia> copie;
	@ManyToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinTable(name="libri_autori",
		joinColumns={@JoinColumn(name="cod_libro")},
		inverseJoinColumns={@JoinColumn(name="cod_autore")})
	private List<Autore> elencoAutori=new ArrayList<Autore>();
	public List<Autore> getElencoAutori() {
		return elencoAutori;
	}
	public void setElencoAutori(List<Autore> autori) {
		this.elencoAutori = autori;
	}
	public Set<Copia> getCopie() {
		return copie;
	}
	public void setCopie(Set<Copia> copie) {
		this.copie = copie;
	}
	public int getCodLibro() {
		return codLibro;
	}
	public void setCodLibro(int codLibro) {
		this.codLibro = codLibro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCopertina() {
		return copertina;
	}
	public void setCopertina(String copertina) {
		this.copertina = copertina;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Genere getGenere() {
		return genere;
	}
	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	public Lingua getLingua() {
		return lingua;
	}
	public void setLingua(Lingua lingua) {
		this.lingua = lingua;
	}
	public Editore getEditore() {
		return editore;
	}
	public void setEditore(Editore editore) {
		this.editore = editore;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	

	public Libro() {
		super();
	}
	public Libro(int codLibro, String titolo, String descrizione,
			String copertina, String isbn, Genere genere, Lingua lingua,
			Editore editore, String anno) {
		super();
		this.codLibro = codLibro;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.copertina = copertina;
		this.isbn = isbn;
		this.genere = genere;
		this.lingua = lingua;
		this.editore = editore;
		this.anno = anno;
	}
	public Libro(String titolo, String descrizione, String copertina,
			String isbn, Genere genere, Lingua lingua, Editore editore,
			String anno) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.copertina = copertina;
		this.isbn = isbn;
		this.genere = genere;
		this.lingua = lingua;
		this.editore = editore;
		this.anno = anno;
	}
	
	public Libro(int codLibro, String titolo, String descrizione,
			String copertina, String isbn, String anno) {
		super();
		this.codLibro = codLibro;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.copertina = copertina;
		this.isbn = isbn;
		this.anno = anno;
	}
	@Override
	public String toString() {
		return "" + titolo + ", " + isbn + ", "
				+ genere + ", " + lingua + ", " + editore
				+ ", " + anno + "";
	}
	
	
	
}
