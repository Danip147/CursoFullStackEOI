package com.dani.club_betis_florida.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {

	private int id_usuario;
	private String usu_nombre;
	private String usu_apellido1;
	private String usu_apellido2;
	private String usu_usuario;
	private String usu_email;
	private String email_rep;
	private String usu_pass;
	private String pass_rep;
	private LocalDate usu_fecha_registro;
	private LocalDate usu_fecha_ult_acceso;
	
	public Usuario () {
		
	}

	public Usuario(/*int id_usuario, */String usu_nombre, String usu_apellido1, String usu_apellido2, String usu_usuario,
			String usu_email, String email_rep, String usu_pass, String pass_rep, LocalDate usu_fecha_registro,
			LocalDate usu_fecha_ult_acceso) {
		super();
//		this.id_usuario = id_usuario;
		this.usu_nombre = usu_nombre;
		this.usu_apellido1 = usu_apellido1;
		this.usu_apellido2 = usu_apellido2;
		this.usu_usuario = usu_usuario;
		this.usu_email = usu_email;
		this.email_rep = email_rep;
		this.usu_pass = usu_pass;
		this.pass_rep = pass_rep;
		this.usu_fecha_registro = usu_fecha_registro;
		this.usu_fecha_ult_acceso = usu_fecha_ult_acceso;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsu_nombre() {
		return usu_nombre;
	}

	public void setUsu_nombre(String usu_nombre) {
		this.usu_nombre = usu_nombre;
	}

	public String getUsu_apellido1() {
		return usu_apellido1;
	}

	public void setUsu_apellido1(String usu_apellido1) {
		this.usu_apellido1 = usu_apellido1;
	}

	public String getUsu_apellido2() {
		return usu_apellido2;
	}

	public void setUsu_apellido2(String usu_apellido2) {
		this.usu_apellido2 = usu_apellido2;
	}

	public String getUsu_usuario() {
		return usu_usuario;
	}

	public void setUsu_usuario(String usu_usuario) {
		this.usu_usuario = usu_usuario;
	}

	public String getUsu_email() {
		return usu_email;
	}

	public void setUsu_email(String usu_email) {
		this.usu_email = usu_email;
	}

	public String getEmail_rep() {
		return email_rep;
	}

	public void setEmail_rep(String email_rep) {
		this.email_rep = email_rep;
	}

	public String getUsu_pass() {
		return usu_pass;
	}

	public void setUsu_pass(String usu_pass) {
		this.usu_pass = usu_pass;
	}

	public String getPass_rep() {
		return pass_rep;
	}

	public void setPass_rep(String pass_rep) {
		this.pass_rep = pass_rep;
	}

	public LocalDate getUsu_fecha_registro() {
		return usu_fecha_registro;
	}

	public void setUsu_fecha_registro(LocalDate usu_fecha_registro) {
		this.usu_fecha_registro = usu_fecha_registro;
	}

	public LocalDate getUsu_fecha_ult_acceso() {
		return usu_fecha_ult_acceso;
	}

	public void setUsu_fecha_ult_acceso(LocalDate usu_fecha_ult_acceso) {
		this.usu_fecha_ult_acceso = usu_fecha_ult_acceso;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", usu_nombre=" + usu_nombre + ", usu_apellido1=" + usu_apellido1
				+ ", usu_apellido2=" + usu_apellido2 + ", usu_usuario=" + usu_usuario + ", usu_email=" + usu_email
				+ ", email_rep=" + email_rep + ", usu_pass=" + usu_pass + ", pass_rep=" + pass_rep
				+ ", usu_fecha_registro=" + usu_fecha_registro + ", usu_fecha_ult_acceso=" + usu_fecha_ult_acceso + "]";
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
		Usuario other = (Usuario) obj;
		return id_usuario == other.id_usuario;
	}
	
	
	
	/**
	 * Método para comprobar que los email son iguales a la hora del registro
	 * @param usu_email
	 * @param email_rep
	 * @return
	 */
	public static boolean emailCorrecto(String usu_email,String email_rep) {
		if(usu_email == email_rep) {
			return true;
		}
		return false;
	}
	
	
	
	
	/**
	 * Método para comprobar que el password está correcto
	 * @param usu_pass
	 * @param pass_rep
	 * @return
	 */
	public static boolean passCorrecto(String usu_pass,String pass_rep) {
		if(usu_pass == pass_rep) {
			return true;
		}
		return false;
	}
	

	
	
	
	
	
}
