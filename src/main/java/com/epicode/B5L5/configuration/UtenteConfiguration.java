package com.epicode.B5L5.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import com.epicode.B5L5.model.Utente;


@Configuration
public class UtenteConfiguration {
	@Bean("FakeUtente")
	@Scope("prototype")
	public Utente fakeUtente() {
		Faker fake = Faker.instance(Locale.of("it"));
		Utente U = new Utente();
		U.setUsername(fake.internet().domainName());
		U.setNominativo(fake.name().fullName());
		U.setEmail(U.getNominativo() + "@example.com");
		return U;
	}
	
	@Bean("CustomUtente")
	@Scope("prototype")
	public Utente customUtente () {
		return new Utente();
	}
	
	@Bean("ParamsUser")
	@Scope("prototype")
	public Utente paramsUser (String user, String nomin, String email) {
		return new Utente(user, nomin, email);
	}
	

}
