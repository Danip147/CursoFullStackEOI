package ejercicio04;

public class Jugador {
    private String nombre;
    private int sueldo;
    
    
    public Jugador() {
    	
    }

    public Jugador(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", sueldo=" + sueldo ;
	}
    
    
}



