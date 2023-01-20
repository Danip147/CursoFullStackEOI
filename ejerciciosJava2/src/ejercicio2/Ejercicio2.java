/*
 * 2. Programa que lea un número entero y muestre si el número es múltiplo de 10 (si el resto de la 
 *	  división entre 10 da 0)
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void numeroMultiplo() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		if (num % 10 == 0) {
			System.out.println("El número es multiplo de 10");
		}else {
			System.out.println("El número no es multiplo de 10");
		}
		
		// Con operador ternario
		System.out.println(num % 10 == 0 ? "El número es multiplo de 10" : "El número no es multiplo de 10" );
		
		sc.close();
	}

		
	public static void main(String[] args) {
		numeroMultiplo();

	}

}
