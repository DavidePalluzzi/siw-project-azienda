package it.uniroma3.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.controller.validator.CentroDiFormazioneValidator;
import it.uniroma3.model.Allievo;
import it.uniroma3.model.CentroDiFormazione;
import it.uniroma3.service.CentroDiFormazioneService;

@Controller
public class CentroDiFormazioneController {
	
    @Autowired
    private CentroDiFormazioneService centro;

    @Autowired
    private CentroDiFormazioneValidator validator;

    @RequestMapping("/centri")
    public String centro(Model model) {
        model.addAttribute("centri", this.centro.findAll());
        return "centroList";
    }

    @RequestMapping("/addCentro")
    public String addCentro(Model model) {
        model.addAttribute("centro", new CentroDiFormazione());
        return "centroForm";
    }
    
  /*  @RequestMapping(value = "//{id}", method = RequestMethod.GET)
    public String addAllievoAdAttivita(@PathVariable("id") Long id, Model model) {
        model.addAttribute("allievo", this.allievo.findById(id));
    	return "showCentro";
    }*/
   
    @RequestMapping(value = "/centri/{id}", method = RequestMethod.GET)
    public String getCentro(@PathVariable("id") Long id, Model model) {
        model.addAttribute("centro", this.centro.findById(id));
    	return "showCentro";
    }

    @RequestMapping(value = "/centri", method = RequestMethod.POST)
    public String newCentro(@Valid @ModelAttribute("centri") CentroDiFormazione centro, 
    									Model model, BindingResult bindingResult) {
        this.validator.validate(centro, bindingResult);
        
        if (this.centro.alreadyExists(centro)) {
            model.addAttribute("exists", "Questo centro esiste già");
            return "centroForm";
        }
        else {
            if (!bindingResult.hasErrors()) {
                this.centro.save(centro);
                model.addAttribute("centri", this.centro.findAll());
                return "centroList";
            }
        }
        return "centroForm";
    }

}
