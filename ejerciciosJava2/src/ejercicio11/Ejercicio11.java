/**
 * Pide al usuario 2 números. Después muestra al usuario un menú con las siguientes opciones: 
 * 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir. Comprueba la opción elegida, haz la operación y 
 * muestra el resultado de la misma.
 * Si la operación elegida es la división, comprueba que el segundo número (divisor) no sea cero 
 * antes de hacer la operación.
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void operacionUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primer número: ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduce segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println("-- MENÚ --");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("Pulse una opción: ");
		int operacion = sc.nextInt();

		switch (operacion) {
		case 1:
			System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + (num1 + num2));
			break;
		case 2:
			System.out.println("El resultado de restar " + num1 + " - " + num2 + " es: " + (num1 - num2));
			break;
		case 3:
			System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es: " + (num1 * num2));
			break;
		case 4:
			if (num2 != 0) {
				System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es: " + (num1 / num2));
			} else {
				System.out.println("No se puede divir entre 0");

			}
			break;
		default:
			System.out.println("Datos incorrectos");

		}

		sc.close();
	}

	public static void main(String[] args) {
		operacionUsuario();

	}

}
