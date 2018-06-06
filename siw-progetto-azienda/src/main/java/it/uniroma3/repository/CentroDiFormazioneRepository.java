package it.uniroma3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.CentroDiFormazione;


public interface CentroDiFormazioneRepository extends CrudRepository<CentroDiFormazione, Long>{

	List<CentroDiFormazione> findByNomeAndIndirizzoAndTelefonoAndMailAndCapienza(String nome, String indirizzo, String telefono, String mail, int capienza);

	Optional<CentroDiFormazione> findByNome(String nome);
}