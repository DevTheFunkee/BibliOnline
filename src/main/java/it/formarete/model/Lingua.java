package it.formarete.model;

import javax.persistence.*;

@Entity
@Table(name="lingue")
public class Lingua {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_lingua")
	private int codLingua;
	private String descrizione;
	public int getCodLingua() {
		return codLingua;
	}
	public void setCodLingua(int codLingua) {
		this.codLingua = codLingua;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Lingua(int codLingua, String descrizione) {
		super();
		this.codLingua = codLingua;
		this.descrizione = descrizione;
	}
	public Lingua(String descrizione) {
		super();
		this.descrizione = descrizione;
	}
	public Lingua() {
		super();
	}
	@Override
	public String toString() {
		return "" + descrizione + "";
	}
	
}
