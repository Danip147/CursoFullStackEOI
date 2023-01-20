/**
 * 10. Crea un programa que lea una letra tecleada por el usuario y diga si se trata de un signo de 
 * puntuación (. , ; :), una cifra numérica (del 0 al 9) u otro carácter, usando "switch" (pista: 
 * necesitarás usar un dato de tipo "char").
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void dimeCaracter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Precione un tecla: ");
		char letra = sc.nextLine().charAt(0);

		if (Character.isDigit(letra)) { // Si es un dígito
			System.out.println("La letra es una cifra numerica");
		} else if (letra == '.' || letra == ',' || letra == ';' || letra == ':') {
			System.out.println("La letra es un símbolo de puntuación");
		} else {
			System.out.println("Es otro caracter");
		}

		sc.close();

	}

	public static void dimeCaracter2() { // JAVA 17
			Scanner sc = new Scanner(System.in);
			System.out.println("Precione un tecla: ");
			char letra = sc.nextLine().charAt(0);
			
			switch(letra) {
			case '0','1','2','3','4','5','6','7','8','9' -> System.out.println("La letra es un dígito");
			case '.',',',';',':' -> System.out.println("La letra es un signo de puntuación");
			default -> System.out.println("Es otro caracter");
			}
				
			sc.close();
			
		}

	public static void main(String[] args) {
		// dimeCaracter();
		dimeCaracter2();

	}

}
