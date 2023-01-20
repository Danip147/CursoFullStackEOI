/**
 * 25. Pide al usuario un número y dibuja una escalera de bajada con asteriscos. La base será igual 
 * al número recibido.
 * Dime un número: 4
 * *
 * **
 * ***
 * ****
 */


package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {
	
	public static void ejercicio25() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: "); 
		int numeroUsuario = sc.nextInt();
		
		for (int i = 1; i <= numeroUsuario; i++) { // esto son las filas
			for (int j = 0; j < i; j++) { // lo que hay en cada fila
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

	public static void main(String[] args) {
		ejercicio25();

	}

}
