package com.epicode.B5L5.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.epicode.B5L5.model.Edificio;
import com.epicode.B5L5.repository.EdificioDAORepo;



public class EdificioService {

@Autowired EdificioDAORepo repo;
	
	@Autowired @Qualifier("FakeEdificio") private ObjectProvider<Edificio> fakeEdificioProvider;
	@Autowired @Qualifier("NuovoEdificio") private ObjectProvider<Edificio> nuovoEdificioProvider;
	

	public void creaFakeEdificio() {

		Edificio E = fakeEdificioProvider.getObject();
		inserisciEdificio(E);
	}
	public void creaNuovoEdificio() {
		Edificio E = nuovoEdificioProvider.getObject();
		inserisciEdificio(E);
	}

	
	public void inserisciEdificio(Edificio e) {
		repo.save(e);
	}
	public void rimuoviEdificio(Edificio e) {
		repo.delete(e);

	}
	
	public void aggiornaEdificio(Edificio e) {
		repo.save(e);
		
	}
	public Edificio findUtenteById(Long id) {
		return repo.findById(id).get();
	}
	public List<Edificio> findAllUtente() {
		return (List<Edificio>) repo.findAll();
		
	}
}
