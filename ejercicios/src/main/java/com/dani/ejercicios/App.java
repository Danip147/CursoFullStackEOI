package com.dani.ejercicios;

import java.util.ArrayList;
import java.util.List;

import com.dani.ejercicios.entidades.Persona;

public class App {

	/**
	 * 3. A partir de una lista de personas, devuelve sus nombres ordenados alfabéticamente.
	 */
	public static void ejercicio03() {
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Dani", 28));
		personas.add(new Persona("Gabriel", 12));
		personas.add(new Persona("Francisco", 20));
		personas.add(new Persona("Ana", 45));
		
		personas.forEach(e -> System.out.println(e));
		
		personas.sort(null);
		
	}

	public static void main(String[] args) {
		ejercicio03();
	}
}
