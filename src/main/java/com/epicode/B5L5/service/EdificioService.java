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

		Edificio e1 = fakeEdificioProvider.getObject();
		inserisciEdificio(e1);
	}
	public void creaNuovoEdificio() {
		Edificio e1 = nuovoEdificioProvider.getObject();
		inserisciEdificio(e1);
	}

	
	public void inserisciEdificio(Edificio e0) {
		repo.save(e0);
	}
	public void rimuoviEdificio(Edificio e0) {
		repo.delete(e0);

	}
	
	public void aggiornaEdificio(Edificio e0) {
		repo.save(e0);
		
	}
	public Edificio findUtenteById(Long id) {
		return repo.findById(id).get();
	}
	public List<Edificio> findAllUtente() {
		return (List<Edificio>) repo.findAll();
		
	}
}
