/* 5. Escribe un programa que declare una variable entera N y asígnale un valor. A continuación escribe las
 * instrucciones que realicen los siguientes:
 * a. Incrementar N en 77.
 * b. Decrementarla en 3.
 * c. Duplicar su valor.
 * Si por ejemplo N vale 1, la salida del programa será:
 * Valor inicial de N = 1
 * N + 77 = 78
 * N - 3 = 75
 * N * 2 = 150 
 */

package ejercicio5;

public class Ejercicio5 {

	public static void operacionN() {
		int num1 = 1;

		System.out.println("Valor inicial de N = " + num1);
		System.out.println("N + 77  =  " + (num1 + 77));
		System.out.println("N - 3  = " + ((num1 + 77) - 3));
		System.out.println("N * 2  = " + ((num1 + 77) - 3) * 2);

	}

	public static void main(String[] args) {
		operacionN();

	}

}
