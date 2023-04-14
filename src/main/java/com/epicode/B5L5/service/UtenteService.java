package com.epicode.B5L5.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.B5L5.model.Utente;
import com.epicode.B5L5.repository.UtenteDAORepo;

@Service
public class UtenteService {
	
	@Autowired UtenteDAORepo repo;
	
	@Autowired @Qualifier("FakeUtente") private ObjectProvider<Utente> fakeUtenteProvider;
	@Autowired @Qualifier("CustomUtente") private ObjectProvider<Utente> customUtenteProvider;
	@Autowired @Qualifier("ParamsUtente") private ObjectProvider<Utente> paramsUtenteProvider;

	public void creaFakeUtente() {

		Utente u1 = fakeUtenteProvider.getObject();
		inserisciUtente(u1);
	}
	public void creaCustomUser() {
		Utente u1 = customUtenteProvider.getObject();
		inserisciUtente(u1);
	}

	public void creaParamsUtente() {
		Utente u1 = paramsUtenteProvider.getObject();
		inserisciUtente(u1);
	}
	
	public void inserisciUtente(Utente u0) {
		repo.save(u0);
	}
	public void rimuoviUtente(Utente u0) {
		repo.delete(u0);

	}
	
	public void aggiornaUtente(Utente u0) {
		repo.save(u0);
		
	}
	public Utente findUtenteById(Long id) {
		return repo.findById(id).get();
	}
	public List<Utente> findAllUtente() {
		return (List<Utente>) repo.findAll();
		
	}
}
