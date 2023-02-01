/**
 * 4. Crea una función con 2 parámetros. El primero será una cadena y representa al
 * nombre de una persona, mientras que el segundo contendrá al resto de parámetros
 * recibidos (…), que serán cadenas con los trabajos que la persona ha realizado.
 * Imprime por consola el nombre de la persona seguido de la lista de trabajos realizados
 * por la misma. Si no hay ningún trabajo, indica que no ha trabajado nunca. Prueba la función
 * varias veces, al menos una de ellas no le pases ningún trabajo.
 */

package ejercicio04;

public class Ejercicio04 {

	public static void trabajos(String nombre, String... trabajos) {

		if (trabajos.length >= 1) {
			System.out.print(nombre + " ");
			for (String trabajo : trabajos) {
				System.out.print(trabajo + " ");
		
			}

		} else {
			System.out.println(nombre + " no ha trabajado nunca");
		}
	}

	public static void main(String[] args) {
		trabajos("Daniel", "Electricista", "Bombero\n" );
		trabajos("Juan");

	}

}
