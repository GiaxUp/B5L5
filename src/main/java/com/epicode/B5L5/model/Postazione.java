package com.epicode.B5L5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="postazioni")
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String descrizione;
	@Column
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo_postazione;
	@Column(nullable = false)
	private int num_max_partecipanti;
	@Column(nullable = false)
	@JoinColumn(name="postazione_edificio")
	@ManyToOne
	private Edificio edificio;
	@ManyToOne
	private Prenotazione prenotazione;
	public Postazione(String descrizione, TipoPostazione tipo_postazione, int num_max_partecipanti, Edificio edificio,
			Prenotazione prenotazione) {
		super();
		this.descrizione = descrizione;
		this.tipo_postazione = tipo_postazione;
		this.num_max_partecipanti = num_max_partecipanti;
		this.edificio = edificio;
		this.prenotazione = prenotazione;
	}

	
}
