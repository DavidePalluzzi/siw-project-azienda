package it.uniroma3.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Attivita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataOra;
	
	@ManyToOne
	private CentroDiFormazione centro;
	
	@ManyToMany(mappedBy="attivita")
	private List<Allievo> allievi;

	public Attivita() {};
	
	public Attivita(String nome, Date dataOra, CentroDiFormazione centro) {
		this.nome = nome;
		this.dataOra = dataOra;
		this.centro = centro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataOra() {
		return dataOra;
	}

	public void setDataOra(Date dataOra) {
		this.dataOra = dataOra;
	}

	public CentroDiFormazione getCentro() {
		return centro;
	}

	public void setCentro(CentroDiFormazione centro) {
		this.centro = centro;
	}
	
	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}


}
