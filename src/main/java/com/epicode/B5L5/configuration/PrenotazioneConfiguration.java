package com.epicode.B5L5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.B5L5.model.Postazione;
import com.epicode.B5L5.model.Prenotazione;
import com.epicode.B5L5.model.Utente;

@Configuration
public class PrenotazioneConfiguration {
	
	@Bean("NuovaPrenotazione")
	@Scope("prototype")
	public Prenotazione nuovaPrenotazione(Utente utente, Postazione postazione) {
		return new Prenotazione(utente, postazione);
	}

}
