package com.epicode.B5L5.configuration;

import java.time.LocalDate;

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
	public Prenotazione nuovaPrenotazione(Utente utente, Postazione postazione, LocalDate data) {
		Prenotazione pr = new Prenotazione();
		pr.setUtente(utente);
		pr.setPostazione(postazione);
		pr.setDataprenotazione(data);
		return pr;
	}

}
