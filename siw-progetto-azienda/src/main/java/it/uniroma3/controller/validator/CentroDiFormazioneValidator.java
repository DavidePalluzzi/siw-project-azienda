package it.uniroma3.controller.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.model.CentroDiFormazione;

@Component
public class CentroDiFormazioneValidator implements Validator {

	   @Override
	    public void validate(Object o, Errors errors) {
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "indirizzo", "required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono", "required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mail", "required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "capienza", "required");
	    }

	    @Override
	    public boolean supports(Class<?> aClass) {
	        return CentroDiFormazione.class.equals(aClass);
	    }	
}