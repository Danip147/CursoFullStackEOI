/**
 * 23. Escribe los números del 1 al 9, después del 1 al 8, del 1 al 7, y así sucesivamente en líneas 
 * diferentes.
 * 123456789
 * 12345678
 * 1234567
 * 123456
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */

package ejercicio23;

public class Ejercicio23 {

	public static void ejercicio23() {

		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}

			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		ejercicio23();

	}

}
