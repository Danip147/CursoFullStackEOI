/*
 * 14. Pregunta al usuario su edad e infórmale de cuantos años tendrá dentro de 15
 */

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void edadUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca su edad: ");
		int edad = sc.nextInt();

		System.out.println("Dento de 15 años, usted tendrá " + (edad + 15) + " años");
	}

	public static void main(String[] args) {
		edadUsuario();
	}

}
