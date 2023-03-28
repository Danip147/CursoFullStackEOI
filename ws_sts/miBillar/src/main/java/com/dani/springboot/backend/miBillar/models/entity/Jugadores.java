package com.dani.springboot.backend.miBillar.models.entity;

// default package
// Generated 23 mar 2023 18:44:41 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;



@Entity
@Table(name = "jugadores", uniqueConstraints = @UniqueConstraint(columnNames = "correo"))
public class Jugadores implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String correo;
	private String password;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jugadores", targetEntity = Partidas.class)
	private Set<Partidas> partidases = new HashSet<>();

	public Jugadores() {
	}

	public Jugadores(int id) {
		this.id = id;
	}

	public Jugadores(int id, String nombre, String correo, String password, Set<Partidas> partidases) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.partidases = partidases;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "correo", unique = true)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Partidas> getPartidases() {
		return this.partidases;
	}

	public void setPartidases(Set<Partidas> partidases) {
		this.partidases = partidases;
	}

}