/**
 * 28. Pide al usuario un número que será la altura de una pirámide. Dibuja una pirámide con 
 * asteriscos con dicha altura

 * Pista: El ancho (base) de la pirámide será: (altura * 2 – 1), y la posición del primer asterisco 
 * será el mismo que la altura si empiezas el bucle en 1 (o una menos si lo quieres empezar en 0).
 * Crea 2 variables auxiliares con la posición del primer asterisco, una la irás decrementando y 
 * otra incrementando. Si la posición actual está entre esas 2 variables dibujas un asterisco, y si 
 * no, un espacio.
 * Dime la altura de la pirámide: 4
    *
   ***
  *****
 *******
 */

package ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

	public static void ejercicio28() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce filas: ");
		int filas = sc.nextInt();

		for (int alto = 1; alto <= filas; alto++) {
			// Espacios
			for (int espacio = 1; espacio <= filas - alto; espacio++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int asteriscos = 1; asteriscos <= (alto * 2) - 1; asteriscos++) {
				System.out.print("*");
			}

			System.out.println();
		}
		sc.close();

	}

	public static void main(String[] args) {
		ejercicio28();

	}

}
