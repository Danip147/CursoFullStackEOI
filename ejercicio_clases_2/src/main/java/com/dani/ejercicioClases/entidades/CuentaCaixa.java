package com.dani.ejercicioClases.entidades;

import java.time.LocalDate;
import java.util.Objects;

import com.dani.ejercicioClases.enumerados.NivelCatalan;

public final class CuentaCaixa extends Cuenta{				// final cuando no quieres que se pueda heredar

	private NivelCatalan nivelCatalan;
	
	
	public CuentaCaixa() {
		super();
		nivelCatalan = NivelCatalan.Medio;					// Dato por defecto
	}


	
	public CuentaCaixa(String cif, String nombre, LocalDate fechaNac, String pais, double saldo, NivelCatalan nivelCatalan) {
		super(cif, nombre, fechaNac, pais, saldo);
		this.nivelCatalan = nivelCatalan;
		
	}
	
	public CuentaCaixa(CuentaCaixa c) {
		super(c);
		this.nivelCatalan = c.nivelCatalan;
		
	}



	public NivelCatalan getNivelCatalan() {
		return nivelCatalan;
	}



	public void setNivelCatalan(NivelCatalan nivelCatalan) {
		this.nivelCatalan = nivelCatalan;
	}



	@Override
	public String toString() {
		return "CuentaCaixa --- CIF:" + getCif() + ", Nombre: " + getNombre() + ", nivelCatalan: " + nivelCatalan +
				 ", Fecha de nacimiento: " + getFechaNac() + ", País: " + getPais() + ", Saldo: " + getSaldo() + " €";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nivelCatalan);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCaixa other = (CuentaCaixa) obj;
		return nivelCatalan == other.nivelCatalan;
	}



	


	
	
	
	
	
	
	


	


	
	
	
	
	
}
