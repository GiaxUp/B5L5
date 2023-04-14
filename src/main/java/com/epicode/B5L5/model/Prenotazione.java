package com.epicode.B5L5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="prenotazioni")
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private Utente utente;
	@Column(nullable = false)
	@JoinColumn(name="prenotazione_postazione")
	@ManyToMany
	private Postazione postazione;
	public Prenotazione(Utente utente, Postazione postazione) {
		super();
		this.utente = utente;
		this.postazione = postazione;
	}
	
	

}
