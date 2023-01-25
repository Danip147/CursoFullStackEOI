/**
 * 18. Muestra de 5 en 5, los números del 0 al 100.
 */

package ejercicio18;

public class Ejercicio18 {

	public static void ejercicio18() {

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}

		}
	}

	public static void ejercicio18B() {

		for (int i = 0; i <= 100; i += 5) {
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		ejercicio18();
		ejercicio18B();

	}

}
