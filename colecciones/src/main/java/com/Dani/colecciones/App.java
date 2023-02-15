package com.Dani.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.Dani.colecciones.entidades.Persona;

public class App {
	
	
	public static void ejemplosListas() {
		
								
		List<Integer> numeros = new ArrayList<Integer>(); 					// Lista que almacena números
		
		
		List<Integer> numeros2 = new ArrayList<>(12); 						// Podemos establecer una capacidad inicial reservada
		
		
		Integer[] array = {2, 3, 5}; 										// Se puede crear una lista a partir de un array
		List<Integer> numeros3 = Arrays.asList(array);
		
		
		List<Integer> numeros4 = new ArrayList<Integer>(numeros2);  		// Se puede crear una lista a partir de otra colección
		
		Integer[][] matriz = new Integer [4][5];							// Como se hacia un array de 2 dimensiones
		Integer [][][] show_red = new Integer [1012][728][128];				// Array de 3 dimensiones
	
		// Crear Listas de mas de una dimension
		
		List<List<Integer>> listaDeListas = new ArrayList<>();				// Lista de 2 dimensiones
		List<List<List<Integer>>> lista3Dimensiones =  new ArrayList<>();	// Lista de 3 dimensiones
		
		
		List<String> cadenas = new ArrayList<>();
		cadenas.add("Hola");
		cadenas.add("Mundo");
		cadenas.add("Cruel"); // Las listas si permiten elementos duplicados
		cadenas.add("Hola");
		cadenas.add("Otra");
		cadenas.add("Vez");
		
		System.out.println(cadenas.size());									// Imprime numero elementos imprime 6
		
		
		List<String> otra2 = new ArrayList<>(Arrays.asList("Hola", "en", "minúscula")); // Lo correcto para inicar una lista con datos iniciales
		cadenas.addAll(otra2);
		
		System.out.println(cadenas.size());									// Imprime 9
		
		otra2.clear();
		
		if(cadenas.contains("Hola")) {
			System.out.println("La cadena contiene la palabra hola");
		}
		
		
		cadenas.forEach(e -> System.out.println(e));			// Como recorrer una lista entera
		
		System.out.println(cadenas.indexOf("hola")); 			// Devuelve la posicion donde aparece la palabra hola // imprime 0
		
		System.out.println(cadenas.lastIndexOf("hola"));
		
		
		// Borrados lista 
		
		cadenas.remove("Mundo");						// Borra una palabra
		cadenas.removeAll(otra2);						// Borra todas las palabras
		otra2.forEach(e -> System.out.println(e));
		cadenas.removeIf(e -> e.equals("Hola"));		// Elimina todas las palabras que sean Hola
		cadenas.forEach(e -> System.out.println(e));
		
			
	}
	
	public static void ejemploMap() {
		// Diccionario que almacena cadenas y el índice también es una cadena
		Map<String, String> traducciones = new HashMap<>();						// El primero es la clave y el segundo string es el valor
		traducciones.put("mesa", "table");
		traducciones.put("silla", "chair");
		traducciones.put("cabeza", "head");
		traducciones.put("botella", "bottle");
		// {mesa=table, cabeza=head, botella=bottle, silla=chair}
		System.out.println(traducciones);
		
		// Accder a los valores 
		String palabra = traducciones.get("cabeza");
		System.out.println(palabra); // head
		
		// Recorrer los valores
		for(String key: traducciones.keySet()) {
			System.out.println(key + " en inglés es: " + traducciones.get(key));
			}
		for(String value: traducciones.values()) {
			System.out.println("Palabra: " + value + " (no puedo saber la clave...)");
			}
			
		// Con funcional 
		traducciones.forEach((clave, valor) -> System.out.println(clave + " en inglés es: " + valor));
			
		// Concepto pat clave valor
		Map<Integer, Persona> personas = new HashMap<>();
		personas.put(1, new Persona("Dani", 1500));
		personas.put(2, new Persona("Juan", 800));
		personas.put(3, new Persona("fran", 1200));
		personas.put(4, new Persona("Luis", 2000));
		personas.put(5, new Persona("pepe", 3254));
		
		Persona persona3 = personas.get(3);
		System.out.println(persona3);
		
	}
	
	public static void ejemploSet() {
			// NO PERMITE ELEMENTOS DUPLICADOS
			
			Set<Persona> personas = new HashSet<>();
			
			personas.add(new Persona("Fran", 1000));
			personas.add(new Persona("dani", 2000));
			personas.add(new Persona("Fran", 18500));  // Lo ignora
			personas.add(new Persona("fran", 12000));
			personas.add(new Persona("gabi", 10200));
			personas.add(new Persona("Fran", 7800));  // Lo ignora 
			
			System.out.println("El número de personas es: " + personas.size());
				
			
		}
	
	/**
	 * Crea una lista con los números 10, 20, 30 y 40. A continuación haz las siguientes
		operaciones:
		a. Añade los números 50 y 60 al final.
		b. Borra el número 20.
		c. Añade los valores 25 y 26 entre el 10 y el 30 (posición 1).
		d. Dale la vuelta a la lista y muéstrala por pantalla
		Los valores finales deberían ser: 60, 50, 30, 26, 25, 10
	 */
	public static void ejercicio01() {
		 List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		    
		    // Añade los números 50 y 60 al final
		    numeros.add(50);
		    numeros.add(60);

		    // Borra el número 20
		    numeros.removeIf(e -> e == 20);

		    // Añade los valores 25 y 26 entre el 10 y el 30 (posición 1)
		    numeros.add(1, 25);
		    numeros.add(2, 26);
//		    numeros.forEach(e -> System.out.println(e));

		    // Dale la vuelta a la lista y muéstrala por pantalla
		    
		    Collections.reverse(numeros);					// No ordena, ni desordena, le da la vuelta
//		    numeros.sort(Comparator.reverseOrder());		// forma 2
//		    numeros.sort((e1, e2) -> e2 -e1);				// Te creas tu un comparador
		    
		    numeros.forEach(e -> System.out.println(e));
		  }
		
		
	
		public static void main( String[] args ){
//    	ejemplosListas();
//    	ejemploMap();
//    	ejemploSet();
		ejercicio01();
    }
}
