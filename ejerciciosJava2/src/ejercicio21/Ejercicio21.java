/**
 * 21. Pide al usuario un número y dile los divisores de dicho número (resto da cero).

 */

package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void ejercicio21() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numUsuario = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numUsuario; i++) {
			if (numUsuario % i == 0) {
				System.out.println("Los números divisores de " + numUsuario + " son: " + i);
			}
		}

		sc.close();

	}

	public static void ejercicio21b() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numUsuario = Integer.parseInt(sc.nextLine());

		int i = 1;

		while (i <= numUsuario) {
			if (numUsuario % i == 0) {
				System.out.println("Los números divisores de " + numUsuario + " son: " + i);
			}
			i++;
		}

		sc.close();

	}

	/**
	 * Decir si un número es primo o no Primo es si solamente es divisible por el 1
	 * y por el mismo (ej:2,3,5,7,13,17...)
	 */
	public static void ejercicio21Primos() {
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numUsuario = sc.nextInt();
		sc.nextLine(); // Limpia buffer

		for (int i = 1; i <= numUsuario; i++) {
			if (numUsuario % i == 0) {
				contador++;
			}
		}
		if (contador == 2 || numUsuario == 1) {
			System.out.println("El número " + numUsuario + " es primo");
		} else {
			System.out.println("El número " + numUsuario + " no es primo");
		}

		sc.close();

	}

	public static void main(String[] args) {
		// ejercicio21();
		ejercicio21Primos();

	}

}
