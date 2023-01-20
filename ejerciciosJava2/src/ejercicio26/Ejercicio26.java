/**
 * 26. Haz lo mismo pero con una escalera de subida (para generar los huecos debes escribir el 
 * carácter de espacio).
 * Dime un número: 4
 *    *
 *   **
 *  ***
 * ****
 */

package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {
	
	public static void ejercicio26() {
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
		ejercicio26();
	}

}
