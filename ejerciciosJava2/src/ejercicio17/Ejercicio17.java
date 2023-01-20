/**
 * 17. Muestra los números del 1 al 30 menos los divisibles entre 3 (resto da cero).
 */

package ejercicio17;

public class Ejercicio17 {

	public static void ejercicio17() {

		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
		ejercicio17();

	}

}
