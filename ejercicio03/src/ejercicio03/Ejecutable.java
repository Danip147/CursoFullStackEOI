package ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {

	public static void creandoPersonas() {
		Persona persona1 = new Persona("48672151C", "Daniel", 28);
		Persona persona2 = new Persona("75672151C", "Juan", 20);
		Persona persona3 = new Persona("69572151C", "Fran", 18);
		Persona persona4 = new Persona("14272151C", "Emma", 80);
		// creo la lista y meto a las 4 personas
		List<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);

		//Creo una copia de persona
		Persona copiaPersona = new Persona(persona3);
		copiaPersona.setNombre("Emma");

		// recorro la lista
		int contador = 0;
		for (Persona persona : listaPersonas) {
			if (persona.equals(copiaPersona)) {
				System.out.println("Persona encontrada en la posición: " + contador);
				System.out.println("Persona encontrada : " + listaPersonas);
				System.out.println("Copia: " + copiaPersona);
			}
			contador++;
		}

	}

	
	public static void main(String[] args) {
		creandoPersonas();

	}

}
