/**
 * 24. Pide al usuario un número y dibuja un cuadrado (mismo alto que ancho) con asteriscos según 
 * el número recibido.
 * Dime un número: 4
 * ****
 * ****
 * ****
 * ****
 */

package ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {
	
	public static void ejercicio24() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: "); 
		int numeroUsuario = sc.nextInt();
		
		for (int i = 1; i <= numeroUsuario ; i++) {
			for (int j = 1; j <= numeroUsuario; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
		
		sc.close();

	}

	public static void main(String[] args) {
		ejercicio24();

	}

}
