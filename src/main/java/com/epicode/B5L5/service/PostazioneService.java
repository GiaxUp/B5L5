package com.epicode.B5L5.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.B5L5.model.Edificio;
import com.epicode.B5L5.model.Postazione;
import com.epicode.B5L5.model.TipoPostazione;
import com.epicode.B5L5.repository.PostazioneDAORepo;

@Service
public class PostazioneService {

	@Autowired
	PostazioneDAORepo repo;

	@Autowired
	@Qualifier("NuovaPostazione")
	private ObjectProvider<Postazione> nuovaPostazioneProvider;
	@Autowired
	@Qualifier("ParamsPostazione")
	private ObjectProvider<Postazione> paramsPostazioneProvider;

	public void creaPostazione() {
		Postazione P = nuovaPostazioneProvider.getObject();
		inserisciPostazione(P);
	}

	public void paramsPostazione(String descr, TipoPostazione tipo, int numMax, Edificio edi) {
		Postazione P = paramsPostazioneProvider.getObject(descr, tipo, numMax, edi);
		inserisciPostazione(P);
	}

	public void inserisciPostazione(Postazione p) {
		repo.save(p);
	}

	public void rimuoviPostazione(Postazione p) {
		repo.delete(p);

	}

	public void aggiornaPostazione(Postazione p) {
		repo.save(p);

	}

	public Postazione findPostazioneById(Long id) {
		return repo.findById(id).get();
	}

	public List<Postazione> findAllPostazione() {
		return (List<Postazione>) repo.findAll();

	}

}
