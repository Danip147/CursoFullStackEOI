/**
 * 16. Pide al usuario un número y dibuja una línea con tantos asteriscos como el número introducido.
 */

package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void ejercicio16() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: "); 
		int numeroUsuario = sc.nextInt(); 
		
		for (int i = 1; i <= numeroUsuario; i++) {
			System.out.print("*");
			
		}
		
		sc.close();
	}

	public static void main(String[] args) {
	 ejercicio16();

	}

}
