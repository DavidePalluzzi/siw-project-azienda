package it.uniroma3.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Allievo;
import it.uniroma3.model.Attivita;


public interface AllievoRepository extends CrudRepository<Allievo,Long>{

	public List<Attivita> findByAttivita(String Allievo);

	public List<Allievo> findByNomeAndCognomeAndTelefonoAndMailAndLuogoNascitaAndDataNascita(String nome,
			String cognome, String telefono, String mail, String luogoNascita, Date dataNascita);
		
}
