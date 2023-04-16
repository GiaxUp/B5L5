package com.epicode.B5L5.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.B5L5.model.Postazione;
import com.epicode.B5L5.model.Prenotazione;
import com.epicode.B5L5.model.Utente;

@Repository
public interface PrenotazioneDAORepo extends CrudRepository<Prenotazione, Long> {
	@Query(value = "SELECT p FROM Prenotazione p INNER JOIN p.utente u WHERE u = :utente")
	public List<Prenotazione> listaDiUtenti(Utente utente);

	@Query(value = "SELECT p FROM Prenotazione p INNER JOIN p.utente u WHERE u = :utente AND p.dataprenotazione = :data")
	public List<Prenotazione> listaDiUtentiConData(Utente utente, LocalDate data);

	@Query(value = "SELECT p FROM Prenotazione p INNER JOIN p.postazione ps WHERE ps = :post AND ps.dataprenotazione = :data")
	public List<Prenotazione> listaDiPostazioniConData(Postazione post, LocalDate data);
}