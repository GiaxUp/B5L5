package com.epicode.B5L5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="edifici")
public class Edificio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome_edificio;
	@Column(nullable = false)
	private String indirizzo;
	@Column(nullable = false)
	private String citta;
	
	@OneToMany
	private Postazione postazione;

	public Edificio(String nome_edificio, String indirizzo, String citta) {
		super();
		this.nome_edificio = nome_edificio;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
	
	

}