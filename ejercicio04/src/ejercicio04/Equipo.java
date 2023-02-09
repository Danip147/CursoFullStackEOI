package ejercicio04;

import java.util.ArrayList;
import java.util.List;



public class Equipo {
	private String nombre;
	private List<Jugador> jugadores;

    public Equipo() {
    	jugadores = new ArrayList<Jugador>();
    }

    
    public Equipo(String nombre, List<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}


    

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	@Override
	public String toString() {
		return nombre  ;
	}


	public List<Jugador> getJugadores() {
		return jugadores;
	}


	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}


	public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public int getNumJugadores() {
        return jugadores.size();
    }

    public Jugador getJugador(int pos) {
        if (pos >= 0 && pos < jugadores.size()) {
            return jugadores.get(pos);
        }
        return null;
    }

    public void deleteJugador(int pos) {
        if (pos >= 0 && pos < jugadores.size()) {
            jugadores.remove(pos);
        }
    }

    public int totalSueldos() {
        int suma = 0;
        for (Jugador jugador : jugadores) {
            suma += jugador.getSueldo();
        }
        return suma;
    }
}
