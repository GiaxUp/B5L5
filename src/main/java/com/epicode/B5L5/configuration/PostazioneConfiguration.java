package com.epicode.B5L5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.B5L5.model.Edificio;
import com.epicode.B5L5.model.Postazione;
import com.epicode.B5L5.model.TipoPostazione;

@Configuration
public class PostazioneConfiguration {

	@Bean("NuovaPostazione")
	@Scope("prototype")
	public Postazione nuovaPostazione() {
		return new Postazione();
	}

	@Bean("ParamsPostazione")
	@Scope("prototype")
	public Postazione paramsPostazione(String descr, TipoPostazione tipo, int numMax, Edificio edif) {
		return new Postazione(descr, tipo, numMax, edif);
	}

}