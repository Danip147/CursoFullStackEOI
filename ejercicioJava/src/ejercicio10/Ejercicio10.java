/**
 * 10. Escribe un programa que lee un número entero por teclado y obtiene y muestra por pantalla el doble y
 * el triple de ese número. 
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void ejercicio10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: "); 
		int numero = sc.nextInt();
		
		System.out.println("El doble del número " +numero+ " es: " +(numero*2)+ " el triple es: " + (numero*3));
		
		sc.close();
		
	}

	public static void main(String[] args) {
		ejercicio10();

	}

}
