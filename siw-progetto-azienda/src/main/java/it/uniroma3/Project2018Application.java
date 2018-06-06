package it.uniroma3;
/*
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
import it.uniroma3.model.CentroDiFormazione;
import it.uniroma3.repository.CentroDiFormazioneRepository;
import it.uniroma3.service.CentroDiFormazioneService;*/

@SpringBootApplication
public class Project2018Application {

		/*@Autowired
		private CentroDiFormazioneRepository centro;*/
		
		public static void main(String[] args){
			SpringApplication.run(Project2018Application.class, args);
		}
		
/*
		@PostConstruct
		public void init() {
			CentroDiFormazione centro = new CentroDiFormazione("Viola", "viale marconi", "34656898", "centroviola@azienda.it", 36);
			CentroDiFormazioneService.save(centro);
			for(CentroDiFormazione c : centro.findByNome("Viola")) {
				System.out.println(c.getNome());
			}
			
		}*/
	}

