package ejercicio04;

import java.util.Objects;

public class Jugador1 {
	
    private String nombre;
    private int sueldo;
    
    public Jugador1() {
    	
    }

    public Jugador1(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador1 other = (Jugador1) obj;
		return Objects.equals(nombre, other.nombre);
	}

   
}

