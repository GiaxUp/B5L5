package com.epicode.B5L5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.B5L5.model.Prenotazione;



@Repository
public interface PrenotazioneDAORepo extends CrudRepository<Prenotazione, Long> {

}
