/**
 * 12. Crea una función que reciba un array de cadenas y te lo devuelva ordenado
 * alfabéticamente de la ‘z’ a la ‘a’.
 */

package ejercicio12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio12 {
	
	public static void ordenaCadena(String... cadenas) {
		
		//Arrays.sort(cadenas); // lo ordeno
		
		//Collections.reverse(Arrays.asList(cadenas)); // lo invierto lo paso a lista
		
		Arrays.sort(cadenas, Comparator.reverseOrder()); // orden descendete
		
		 for (String cadena : cadenas) { // lo imprimo
			System.out.println(cadena);
		}
		
			
	}

	public static void main(String[] args) {
		ordenaCadena("Dani", "Natalia", "Zoca", "Jaime");

	}

}
