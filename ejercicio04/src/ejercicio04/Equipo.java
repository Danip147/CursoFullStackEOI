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

	/**
	 * Añadir jugador a la lista de jugadores del equipo
	 * @param jugador
	 */
	public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
	
//	public boolean addJugador(Jugador jugador) { // para evitar error soloucion PRO
//		try {
//			jugadores.add(jugador);
//			return true;
//		} catch (Exception e) {
//			return false;
//			
//		}
//	}

	/**
	 * Daevuelve numero de jugadores del equipo
	 * @return
	 */
    public int getNumJugadores() {
        return jugadores.size();
    }

    /**
     * Posicion de un jugador pasandole un indice
     * @param pos
     * @return
     */
	public Jugador getJugador(int pos) {

		try {
			return jugadores.get(pos);
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * Borrar jugador si existe
	 * @param pos
	 */
	public void deleteJugador(int pos) {

		try {
			jugadores.remove(pos);
		} catch (Exception e) {
			
		}
	}

	/**
	 * Devuelve la suma de los sueldos de todos los jugadores del equipo
	 * @return
	 */
    public int totalSueldos() {
        int suma = 0;
        for (Jugador jugador : jugadores) {
            suma += jugador.getSueldo();
        }
        return suma;
        
          // Funcional opcion A
//        int[] suma = new int[1];
//        jugadores.forEach(e -> suma += e.getSueldo());
//        return suma[0];
    	
    	  // Funcional B.
//    	  return (int) jugadores.stream().mapToDouble(e -> e.getSueldo()).sum();
    	
    	
        
    }
}
