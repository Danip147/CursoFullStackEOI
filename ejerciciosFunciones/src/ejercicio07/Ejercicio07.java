/**
 * 7. Crea una función que reciba un array de cadenas por parámetro y devuelva una de las
 * cadenas al azar. Pista: puedes generar un número aleatorio entre 0 y la última
 * posición del array usando new Random().nextInt(array.length).
 * A continuación pide al usuario que adivine la palabra seleccionada (tiene 3 intentos,
 * usa un bucle). Si la acierta felicítale, y si no, dile cual era la correcta.
 */

package ejercicio07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
	/**
	 * Te devuelve un elemento aleatoriamente dentro de un conjunto de elementos En
	 * este caso trabajamos con cadenas
	 * 
	 * @param cadenas
	 * @return
	 */
	public static String devolverAzar(String[] cadenas) {
		// new Random().nextInt(array.length).
		return cadenas[new Random().nextInt(cadenas.length)];
	}

	/**
	 * Mostrar por pantalla todos los elementos de un conjunto
	 * 
	 * @param cadenas
	 */
	public static void mostrarElementos(String[] cadenas) {
		// for(String candena : cadenas) {
		// System.out.println(cadena);
		// }
		Arrays.stream(cadenas).forEach(e -> System.out.println(e));
	}

	public static void ejercicio07() {
		Scanner sc = new Scanner(System.in);

		final int MAXIMO_INTENTOS = 3;
		boolean acierto = false;
		String[] palabras = { "hola", "casa", "dani", "cruel", "java" };
		String palabraAleatoria = devolverAzar(palabras);
		int intentos = 0;

		do {
			System.out.println("Introduzca una palabra (le quedan  " + (MAXIMO_INTENTOS - intentos) + " intentos ");
			mostrarElementos(palabras);
			String palabra = sc.nextLine();
			if (palabra.equals(palabraAleatoria)) {
				acierto = true;
			}

			intentos++;
		} while (intentos < MAXIMO_INTENTOS && !acierto);
		if (acierto) { // he salido del bucle acertando
			System.out.println("Enhorabuena! acertaste");
		} else {
			System.out.println("Gastaste tus intentos la palabra era: " + palabraAleatoria);
		}

		sc.close();
	}

	public static void main(String[] args) {
		ejercicio07();
	}

}
