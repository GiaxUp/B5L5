package com.epicode.B5L5.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import com.epicode.B5L5.model.Edificio;


@Configuration
public class EdificioConfiguration {
	
	@Bean("NuovoEdificio")
	@Scope("prototype")
	public Edificio nuovoEdificio(String nome, String indirizzo, String città) {
		return new Edificio(nome, indirizzo, città);
	}
	
	@Bean("FakeEdificio")
	@Scope("prototype")
	public Edificio fakeEdificio() {
		Faker fake = Faker.instance(Locale.of("it"));
		Edificio e1 = new Edificio();
		
		e1.setNome_edificio(fake.company().name());
		e1.setIndirizzo(fake.address().streetAddress() + fake.address().streetAddressNumber());
		e1.setCitta(fake.address().city());
		
		return e1;
	}

}