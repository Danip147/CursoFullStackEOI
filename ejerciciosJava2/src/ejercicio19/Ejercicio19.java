/**
 * 19. Pregunta al usuario un número y muestra del 1 hasta ese número, en una misma línea, 
 * separados por comas (debes comprobar cuando es el último y no poner una coma en ese 
 * caso).
 * Dime un número: 7
 * 1,2,3,4,5,6,7
*/

package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void ejercicio19() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: "); // 1234
		int numeroUsuario = sc.nextInt();

		for (int i = 1; i <= numeroUsuario; i++) {
			if (i != numeroUsuario) { // si no es el ultimo
				System.out.print(i + ",");
			} else { // Si es el ultimo
				System.out.print(i + "");
			}
		}

		sc.close();
	}
	
	public static void ejercicio19b() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: "); // 1234
		int numeroUsuario = sc.nextInt();

		for (int i = 1; i <= numeroUsuario; i++) {
			System.out.print(i + ((i != numeroUsuario) ? " ," : " "));
		}

		sc.close();
	}

	public static void main(String[] args) {
		ejercicio19();
		ejercicio19b();

	}

}
