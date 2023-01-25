/**
 * 2. Crea un array de enteros con 10 posiciones. A continuación pide al usuario que vaya
 * introduciendo uno a uno los 10 números por consola. Muestra lo siguiente:
 * a. La lista de números introducidos
 * b. La suma de los números
 * c. La media de los números
 * d. El mayor y el menor de los números (crea un máximo y un mínimo provisional que
 * será igual al primer número del array, después vas comparando con el resto de
 * posiciones).
 */

package ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void ejercicio02() {
		int total = 0;

		Integer[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // creamos el array donde se va a almacenar
		// a
		for (int numero : numeros) { // mostramos los numeros
			System.out.println(numero);
		}

		// b suma de los números
		for (int numero : numeros) { // mostramos los numeros
			total += numero;
		}
		System.out.println("El total es: " + total);
		
		//c sacamos la media
		System.out.println((double)total/numeros.length);

		//d mayor y el menor	
		int mayorProvisional = numeros[0];
		int menorProvisional = numeros[0];
		
		for (int numero : numeros) { 
			if(numero > mayorProvisional) {
				mayorProvisional = numero;
			}
			
			if (numero < menorProvisional) {
				menorProvisional = numero;
			}
		}		
		System.out.println("El número mayor es: " + mayorProvisional);
		System.out.println("El número menor es: " + menorProvisional);
		
		//opcion b
		Arrays.sort(numeros); // aqui ordenamos el array
		System.out.println("El número mayor es: " + numeros[numeros.length-1]);
		System.out.println("El número menor es: " + numeros[0]);
	}
	

	public static void main(String[] args) {
		ejercicio02();

	}

}
