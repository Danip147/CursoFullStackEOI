/**
 * Ejercicio 1
 * Crea una clase llamada Jugador que tendrá las siguientes propiedades: nombre, edad, sueldo
 * Crea los constructores que necesites, incluyendo el constructor de copia, getters, setters, etc
 * Comprueba que la edad que se pone al jugador no pueda ser negativa, ni el salario
 * Crea 2 jugadores y muéstralos por pantalla
 *
 */


package poo1;

import java.util.Objects;

public class Jugador {
	
	// 1. propiedades o atributos
		private String nombre;
		private int edad;
		private int sueldo;
		
		
		// constructor vacio
		public Jugador() {
			
		}

		// constructor con parametros
		public Jugador(String nombre, int edad, int sueldo) {
			super();
			this.nombre = nombre;
			this.setEdad(edad);
			this.setSueldo(sueldo);
		}
		
		// Constructor de copia
		public Jugador(Jugador j) {
			super();
			this.nombre = j.nombre;
			this.setEdad(j.edad);
			this.setSueldo(j.sueldo);
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = Math.abs(edad);
		}

		public int getSueldo() {
			return sueldo;
		}

		public void setSueldo(int sueldo) {
			this.sueldo = Math.abs(sueldo);
		}

		// toString
		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
		}

		
		
		// hasCode and Equals
		@Override
		public int hashCode() {
			return Objects.hash(edad, nombre, sueldo);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Jugador other = (Jugador) obj;
			return edad == other.edad && Objects.equals(nombre, other.nombre) && sueldo == other.sueldo;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}


