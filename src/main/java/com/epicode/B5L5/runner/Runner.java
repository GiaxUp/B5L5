package com.epicode.B5L5.runner;

import java.time.LocalDate;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.epicode.B5L5.model.Edificio;
import com.epicode.B5L5.model.Postazione;
import com.epicode.B5L5.model.Prenotazione;
import com.epicode.B5L5.model.TipoPostazione;
import com.epicode.B5L5.model.Utente;
import com.epicode.B5L5.repository.PrenotazioneDAORepo;
import com.epicode.B5L5.service.EdificioService;
import com.epicode.B5L5.service.PostazioneService;
import com.epicode.B5L5.service.PrenotazioneService;
import com.epicode.B5L5.service.UtenteService;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

	@Autowired
	EdificioService Edificio_S;
	@Autowired
	PostazioneService Postazione_S;
	@Autowired
	PrenotazioneService Prenotazione_S;
	@Autowired
	UtenteService Utente_S;

	@Override
	public void run(String... args) throws Exception {

		// CREAZIONE UTENTE
		// Utente_S.creaParamsUtente("Giacs", "Giacomo Della Peruta",
		// "giacomo.dellaperuta@example.com");
		// Utente_S.creaFakeUtente();

		// CREAZIONE EDIFICIO
//		Edificio_S.creaFakeEdificio();
//
//		for (int i = 0; i < 10; i++) {
//			Utente_S.creaFakeUtente();
//		}
//		for (int i = 0; i < 10; i++) {
//			Edificio_S.creaFakeEdificio();
//		}

		// RICERCA EDIFICI DISPONIBILI
//		Edificio e1 = Edificio_S.findEdificioById(1l);
//		Edificio e2 = Edificio_S.findEdificioById(2l);
//		Edificio e3 = Edificio_S.findEdificioById(3l);
//		Edificio e4 = Edificio_S.findEdificioById(4l);
//		Edificio e5 = Edificio_S.findEdificioById(5l);

		// CREAZIONE POSTAZIONE
//		Postazione_S.paramsPostazione("Postazione #1457", TipoPostazione.PRIVATO, 20, e2);
//		Postazione_S.paramsPostazione("Postazione #8465", TipoPostazione.PRIVATO, 10, e1);
//		Postazione_S.paramsPostazione("Postazione #1784", TipoPostazione.OPENSPACE, 100, e1);
//		Postazione_S.paramsPostazione("Postazione #4534", TipoPostazione.OPENSPACE, 150, e5);
//		Postazione_S.paramsPostazione("Postazione #3459", TipoPostazione.SALA_RIUNIONI, 120, e4);
//		Postazione_S.paramsPostazione("Postazione #1443", TipoPostazione.SALA_RIUNIONI, 75, e3);

		// RICERCA POSTAZIONI OCCUPATE
//		Postazione p1 = Postazione_S.findPostazioneById(1l);
//		Postazione p2 = Postazione_S.findPostazioneById(2l);
//		Postazione p3 = Postazione_S.findPostazioneById(3l);
//		Postazione p4 = Postazione_S.findPostazioneById(4l);
//		Postazione p5 = Postazione_S.findPostazioneById(5l);
//		Postazione p6 = Postazione_S.findPostazioneById(6l);
//		Postazione p7 = Postazione_S.findPostazioneById(7l);
//		Postazione p8 = Postazione_S.findPostazioneById(8l);

		// RICERCA UTENTI
//		Utente u1 = Utente_S.findUtenteById(1l);
//		Utente u2 = Utente_S.findUtenteById(2l);
//		Utente u3 = Utente_S.findUtenteById(3l);
//		Utente u4 = Utente_S.findUtenteById(4l);
//		Utente u5 = Utente_S.findUtenteById(5l);
//		Utente u6 = Utente_S.findUtenteById(6l);
//		Utente u7 = Utente_S.findUtenteById(7l);
//		Utente u8 = Utente_S.findUtenteById(8l);
//		Utente u9 = Utente_S.findUtenteById(9l);

		/// CREAZIONE PRENOTAZIONI
//		Prenotazione_S.creaPrenotazione(u2, p3, LocalDate.of(2023, 2, 3));
//		Prenotazione_S.creaPrenotazione(u4, p2, LocalDate.of(2023, 6, 4));
//		Prenotazione_S.creaPrenotazione(u1, p5, LocalDate.of(2023, 5, 2));
//		Prenotazione_S.creaPrenotazione(u5, p6, LocalDate.of(2023, 7, 9));
	}

}
