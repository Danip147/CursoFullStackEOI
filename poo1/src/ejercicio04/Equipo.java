package ejercicio04;

import java.util.ArrayList;
import java.util.List;

import poo1.Jugador;

public class Equipo {
	private String nombre;
	private List<Jugador1> jugadores;

    public Equipo() {
    	
        jugadores = new ArrayList<Jugador1>();
    }

	public Equipo(String nombre, List<Jugador1> jugadores) {
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
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}

	public List<Jugador1> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador1> jugadores) {
		this.jugadores = jugadores;
	}

	public void addJugador(Jugador1 jugador) {
	        jugadores.add(jugador);
	    }
	 
	 public int getNumJugadores() {
	        return jugadores.size();
	    }
    
	 public Jugador1 getJugador(int pos) {
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
	        for (Jugador1 jugador : jugadores) {
	            suma += jugador.getSueldo();
	        }
	        return suma;
	    }
	 
	    
	 
    
}
