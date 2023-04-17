package com.epicode.B5L5.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.B5L5.model.Postazione;
import com.epicode.B5L5.model.Prenotazione;
import com.epicode.B5L5.model.Utente;
import com.epicode.B5L5.repository.PrenotazioneDAORepo;
import com.epicode.B5L5.runner.Runner;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PrenotazioneService {

	@Autowired
	PrenotazioneDAORepo repo;

	@Autowired
	@Qualifier("NuovaPrenotazione")
	private ObjectProvider<Prenotazione> nuovaPrenotazioneProvider;

	public void creaPrenotazione(Utente utente, Postazione post, LocalDate data) {
		Prenotazione p = nuovaPrenotazioneProvider.getObject(utente, post, data);
		inserisciPrenotazione(p);
	}

	public void inserisciPrenotazione(Prenotazione p) {
		List<Prenotazione> listaUtenti = findByUtenteData(p.getUtente(), p.getDataprenotazione());
		List<Prenotazione> listaPostazioni = findByPostazioneData(p.getPostazione(), p.getDataprenotazione());
		if(listaUtenti.size() > 0) {
			log.info("Data già prenotata. Selezionane un'altra.");
		} else if (listaPostazioni.size() > 0) {
			log.info("La postazione non è disponibile. Selezionane un'altra.");
		} else {
		repo.save(p);
		}
	}

	public void rimuoviPrenotazione(Prenotazione p) {
		repo.delete(p);

	}

	public void aggiornaPrenotazione(Prenotazione p) {
		repo.save(p);

	}

	public Prenotazione findPrenotazioneById(Long id) {
		return repo.findById(id).get();
	}

	public List<Prenotazione> findAllPrenotazione() {
		return (List<Prenotazione>) repo.findAll();

	}

	public List<Prenotazione> findByUtente(Utente u) {
		return (List<Prenotazione>) repo.listaDiUtenti(u);
	}

	public List<Prenotazione> findByUtenteData(Utente u, LocalDate data) {
		return (List<Prenotazione>) repo.listaDiUtentiConData(u, data);
	}

	public List<Prenotazione> findByPostazioneData(Postazione p, LocalDate data) {
		return (List<Prenotazione>) repo.listaDiPostazioniConData(p, data);
	}

}
