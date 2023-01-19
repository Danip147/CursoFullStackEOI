/*
 * 3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. Una letra mayúscula 
 * es aquella que está entre la ‘A’ y la ‘Z’. Recuerda que se pueden comparar los caracteres como si 
 * fueran números
 * Utiliza cadena.charAt(0) para acceder al primer carácter recibido.
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void compruebaCaracter() {
		// Introducimos datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce caracter: ");
		char caracter = sc.nextLine().charAt(0);

		// Comparamos datos
		if (Character.isUpperCase(caracter)) {
			System.out.println("La letra introducida por el usuario es mayúscula");
		} else {
			System.out.println("La letra introducida por el usuario es minúscula");
		}
	}

	public static void main(String[] args) {
		compruebaCaracter();

	}

}
