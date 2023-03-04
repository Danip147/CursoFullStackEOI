package com.dani.betisFlorida.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class RegistroUsuario {
	
	private int id_usuario;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nombreUsuario;
	private String email;
	private String telefono;
	private String password;
	private LocalDate fechaRegistro;
	private LocalDate fechaUltimoAcceso;
	

	public RegistroUsuario() {
		
	}


	public RegistroUsuario(String nombre, String apellido1, String apellido2, String nombreUsuario,
			String email, String telefono, String password, LocalDate fechaRegistro, LocalDate fechaUltimoAcceso) {
		super();
		
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.telefono = telefono;
		this.password = password;
		this.fechaRegistro = fechaRegistro;
		this.fechaUltimoAcceso = fechaUltimoAcceso;
	}


	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public LocalDate getFechaUltimoAcceso() {
		return fechaUltimoAcceso;
	}


	public void setFechaUltimoAcceso(LocalDate fechaUltimoAcceso) {
		this.fechaUltimoAcceso = fechaUltimoAcceso;
	}


	@Override
	public String toString() {
		return "RegistroUsuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", nombreUsuario=" + nombreUsuario + ", email=" + email + ", telefono="
				+ telefono + ", password=" + password + ", fechaRegistro=" + fechaRegistro + ", fechaUltimoAcceso="
				+ fechaUltimoAcceso + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_usuario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroUsuario other = (RegistroUsuario) obj;
		return id_usuario == other.id_usuario;
	}

	

	
	

	
	
}
