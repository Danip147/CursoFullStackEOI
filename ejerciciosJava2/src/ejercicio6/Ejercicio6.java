/*
 * 6. Programa que pida al usuario tres números enteros y muestre el mayor de los tres
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void dimeNumMayor() {
		Scanner sc = new Scanner(System.in);
		// Pedimos datos usuario
		System.out.println("Introduzca primer número");
		int num1 = sc.nextInt();
		sc.nextLine(); // Limpiar Buffer

		System.out.println("Introduzca segundo número");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca tercer número");
		int num3 = sc.nextInt();
		sc.nextLine();

		// Condicional
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " es el mayor de los 3");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " es el mayor de los 3");
		} else {
			System.out.println(num3 + " es el mayor de los 3");
		}

		sc.close();
	}

	public static void main(String[] args) {
		dimeNumMayor();

	}

}
