/**
 * 22. Escribe en una misma línea los números del 1 al 9, 5 veces:
 * 123456789123456789123456789123456789123456789
 */

package ejercicio22;

public class Ejercicio22 {

	public static void ejercicio22() {

		for (int i = 1; i < 10; i++) {
			System.out.print(i);
		}

		for (int i = 1; i < 10; i++) {
			System.out.print(i);
		}
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
		}
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
		}
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
		}

	}

	public static void ejercicio22b() {
		for (int i = 1; i <= 5; i++) { // cuantás veces queremos repetir
			for (int j = 1; j <= 9; j++) { // repetimos lo de dentro
				System.out.print(j);
			}

		}
	}

	public static void main(String[] args) {
		// ejercicio22();
		ejercicio22b();

	}

}
