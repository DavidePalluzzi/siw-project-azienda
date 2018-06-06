package it.uniroma3.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Attivita;
import it.uniroma3.model.CentroDiFormazione;


public interface AttivitaRepository extends CrudRepository<Attivita,Long>{

	public List<Attivita> findByAllievi(String Allievo);
	
	public List<Attivita> findByCentro(String centroDiFormazione);

	public List<Attivita> findByNomeAndDataOraAndCentro(String nome, Date dataOra, CentroDiFormazione centro);
	
}
