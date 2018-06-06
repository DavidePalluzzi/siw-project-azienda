package it.uniroma3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.model.CentroDiFormazione;
import it.uniroma3.repository.CentroDiFormazioneRepository;

@Transactional
@Service
public class CentroDiFormazioneService {
	
	@Autowired
	private CentroDiFormazioneRepository repository;
	
	
	public CentroDiFormazione save(CentroDiFormazione centro){
		return this.repository.save(centro);
	};
	
	public List<CentroDiFormazione> findAll() {
		return (List<CentroDiFormazione>) this.repository.findAll();
	}
	
	public CentroDiFormazione findById(Long id) {
		Optional<CentroDiFormazione> centro = this.repository.findById(id);
		if (centro.isPresent()) 
			return centro.get();
		else
			return null;
	}
	public boolean alreadyExists(CentroDiFormazione centro) {
		List<CentroDiFormazione> centri = this.repository.findByNomeAndIndirizzoAndTelefonoAndMailAndCapienza(centro.getNome(), centro.getIndirizzo(), centro.getTelefono(),centro.getMail(),centro.getCapienza());
		if (centri.size() > 0)
			return true;
		else 
			return false;
	}	

}
