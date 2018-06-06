package it.uniroma3.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.model.Attivita;
import it.uniroma3.repository.AttivitaRepository;

@Transactional
@Service
public class AttivitaService {
	
	@Autowired
	private AttivitaRepository repository;
	
	
	public Attivita save(Attivita attivita){
		return this.repository.save(attivita);
	};
	
	public List<Attivita> findAll() {
		return (List<Attivita>) this.repository.findAll();
	}
	
	public Attivita findById(Long id) {
		Optional<Attivita> attivita = this.repository.findById(id);
		if (attivita.isPresent()) 
			return attivita.get();
		else
			return null;
	}
	
	public boolean alreadyExists(Attivita attivita) {
		List<Attivita> listattivita = this.repository.findByNomeAndDataOraAndCentro(attivita.getNome(), attivita.getDataOra(), attivita.getCentro());
		if (listattivita.size() > 0)
			return true;
		else 
			return false;
	}	}
