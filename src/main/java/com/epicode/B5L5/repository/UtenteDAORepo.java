package com.epicode.B5L5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.B5L5.model.Utente;

@Repository
public interface UtenteDAORepo extends CrudRepository<Utente, Long> {

}
