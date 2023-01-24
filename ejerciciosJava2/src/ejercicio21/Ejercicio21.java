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
				System.out.println("Los números divisores de " + numUsuario+ " son: " +i);
			}
		}

		sc.close();

	}

	public static void main(String[] args) {
		ejercicio21();

	}

}
