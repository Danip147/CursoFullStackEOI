package otroJercicioPoo;

import java.util.Objects;

public class Direccion {
	
	private String nombreCalle;
	private int numeroCalle;
	
	public Direccion() {
		
	}

	public Direccion(String nombreCalle, int numeroCalle) {
		super();
		this.nombreCalle = nombreCalle;
		this.numeroCalle = numeroCalle;
	}
	
	public Direccion(Direccion d) {
		super();
		this.nombreCalle = d.nombreCalle;
		this.numeroCalle = d.numeroCalle;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public int getNumeroCalle() {
		return numeroCalle;
	}

	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	@Override
	public String toString() {
		return "Direccion [nombreCalle=" + nombreCalle + ", numeroCalle=" + numeroCalle + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreCalle, numeroCalle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(nombreCalle, other.nombreCalle) && numeroCalle == other.numeroCalle;
	}
	
	

}
