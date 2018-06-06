package it.uniroma3.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CentroDiFormazione {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String indirizzo;
	private String telefono;
	private String mail;
	private int capienza;
	
	@OneToMany
	@JoinColumn(name="allievi_id")
	private List<Allievo> allievi;
	
	@OneToMany(mappedBy="centro")
	private List<Attivita> attività;
	
	public CentroDiFormazione() {};
	
	
	public CentroDiFormazione(String nome, String indirizzo, String telefono, String mail, int capienza) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.mail = mail;
		this.capienza = capienza;
	}
	
	public Long getId() {
		return id;
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
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public List<Attivita> getAttività() {
		return attività;
	}

	public void setAttività(List<Attivita> attività) {
		this.attività = attività;
	}



}
