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
		Utente u1 = new Utente();
		u1.setUsername(fake.internet().domainName());
		u1.setNominativo(fake.name().fullName());
		u1.setEmail(u1.getNominativo() + "@example.com");
		return u1;
	}
	
	@Bean("CustomUtente")
	@Scope("prototype")
	public Utente customUtente () {
		return new Utente();
	}
	
	@Bean("ParamsUser")
	@Scope("prototype")
	public Utente paramsUser (String user, String nominativo, String email) {
		return new Utente(user, nominativo, email);
	}
	

}
