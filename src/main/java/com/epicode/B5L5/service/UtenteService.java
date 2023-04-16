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

	@Autowired
	UtenteDAORepo repo;

	@Autowired
	@Qualifier("FakeUtente")
	private ObjectProvider<Utente> fakeUtenteProvider;
	@Autowired
	@Qualifier("CustomUtente")
	private ObjectProvider<Utente> customUtenteProvider;
	@Autowired
	@Qualifier("ParamsUtente")
	private ObjectProvider<Utente> paramsUtenteProvider;

	public void creaFakeUtente() {
		Utente u = fakeUtenteProvider.getObject();
		inserisciUtente(u);
	}

	public void creaCustomUtente() {
		Utente u = customUtenteProvider.getObject();
		inserisciUtente(u);
	}

	public void creaParamsUtente(String user, String nomin, String email) {
		Utente u = paramsUtenteProvider.getObject(user, nomin, email);
		inserisciUtente(u);
	}

	public void inserisciUtente(Utente u) {
		repo.save(u);
	}

	public void rimuoviUtente(Utente u) {
		repo.delete(u);

	}

	public void aggiornaUtente(Utente u) {
		repo.save(u);

	}

	public Utente findUtenteById(Long id) {
		return repo.findById(id).get();
	}

	public List<Utente> findAllUtente() {
		return (List<Utente>) repo.findAll();

	}

}