package com.dani.ejercicioClases.entidades;

import java.time.LocalDate;
import java.util.Objects;

import com.dani.ejercicioClases.enumerados.NivelCatalan;

public final class CuentaSabadell extends Cuenta {

	private NivelCatalan nivelCatalan;
	
	public CuentaSabadell() {
		super();
		nivelCatalan = NivelCatalan.Medio;					// Dato por defecto
	}

	public CuentaSabadell(String cif, String nombre, LocalDate fechaNac, String pais, double saldo,
			NivelCatalan nivelCatalan) {
		super(cif, nombre, fechaNac, pais, saldo);
		this.nivelCatalan = nivelCatalan;
	}

	public NivelCatalan getNivelCatalan() {
		return nivelCatalan;
	}

	public void setNivelCatalan(NivelCatalan nivelCatalan) {
		this.nivelCatalan = nivelCatalan;
	}

	@Override
	public String toString() {
		return "CuentaSabadell [nivelCatalan=" + nivelCatalan + ", getCif()=" + getCif() + ", getNombre()="
				+ getNombre() + ", getFechaNac()=" + getFechaNac() + ", getPais()=" + getPais() + ", getSaldo()="
				+ getSaldo() + "]";
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
		CuentaSabadell other = (CuentaSabadell) obj;
		return nivelCatalan == other.nivelCatalan;
	}
	
	
	
}
