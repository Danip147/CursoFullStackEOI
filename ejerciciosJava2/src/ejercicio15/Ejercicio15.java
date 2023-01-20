/**
 * 15. Pide al usuario un número y calcula cuantas cifras tiene dicho número. Para ello puedes dividir 
 * el número entre 10 hasta que el resultado sea cero.
 */

package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void ejercicio15() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: "); // 1234
		int numeroUsuario = sc.nextInt();
		int contador = 0;
		
		while (numeroUsuario > 0) {
			numeroUsuario /= 10;
			contador++;
			}
		System.out.println("El número tiene " +contador+ " cifras ");
		
		
		
	
		
		sc.close();
	}

	public static void main(String[] args) {
		ejercicio15();
	}

}
