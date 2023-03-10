package poo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

	private String nombre; // variable simple
	private Estadio estadio; // objeto
	private List<Jugador> jugadores; // listas
	private double presupuesto;
	
	public Equipo() {  // El constructor vacío que contenga objetos o listas de objetos debe asignar memoria para ellos.
		estadio = new Estadio();
		jugadores = new ArrayList<Jugador>(); // Creamos el objeto para poder meter elementos
	}

	public Equipo(String nombre, Estadio estadio, List<Jugador> jugadores, double presupuesto) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		this.jugadores = jugadores;
		this.presupuesto = presupuesto;
	}

	public Equipo(Equipo e) {
		super();
		this.nombre = e.nombre;
		this.presupuesto = e.presupuesto;
		this.estadio = new Estadio(e.estadio); // forma correcta de copiar un objeto
		this.jugadores = new ArrayList<Jugador>(); // creo la lista vacia.
		e.getJugadores().forEach(j -> this.jugadores.add(new Jugador(j))); // voy rellenando la lista jugador a jugador
		
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return nombre + "\nPresupuesto=" + presupuesto + "\n" + estadio + "\n" + jugadores; 
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
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
}
