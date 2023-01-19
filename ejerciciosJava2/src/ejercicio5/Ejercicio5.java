/*
 * 5. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por
 * el segundo. Se debe comprobar que el divisor no puede ser cero.
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primer número: "); //10
		int primerNumero = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce primer número: "); //5
		int segundoNumero = sc.nextInt();
		sc.nextLine();
		
		if(segundoNumero != 0) {
			System.out.println("El resultado de dividir " + primerNumero + " / " + segundoNumero + " es: " + (primerNumero/segundoNumero));
		}else {
			System.out.println("El número no se puede dividir entre 0");
		}
		
		
		}

	public static void main(String[] args) {
		division();

	}

}
