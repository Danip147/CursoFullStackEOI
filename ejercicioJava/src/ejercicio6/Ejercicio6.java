/*
 * 6. Programa que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A 
 * continuación escribe las instrucciones necesarias para que:  
 * a. B tome el valor de C 
 * b. C tome el valor de A 
 * c. A tome el valor de D 
 * d. D tome el valor de B 
 * Si por ejemplo: A = 1, B = 2, C = 3 y D = 4, el programa debe mostrar: 
 * Valores iniciales: A = 1 B = 2 C = 3 D = 4 
 * B toma el valor de C -> B = 3 
 * C toma el valor de A -> C = 1 
 * A toma el valor de D -> A = 4 
 * D toma el valor de B -> D = 2
 */

package ejercicio6;

public class Ejercicio6 {

	public static void ejercicio6() {
		// Ejemplo para almacenar valores iniciales de variables que podrán cambiar el código
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		final int AUX_B = B; // variable auxialiar para no perder valor original

		System.out.println("Valores iniciales: A= " + A + " B= " + B + " C= " + C + " D= " + D);
		B = C; // B = 3
		System.out.println("B toma el valor de C -> B = " + B);
		C = A;
		System.out.println("C toma el valor de A -> C = " + C);
		A = D;
		System.out.println("A toma el valor de D -> A = " + A);
		D = AUX_B;
		System.out.println("D toma el valor de B -> D = " + D);
	}

	public static void main(String[] args) {
		ejercicio6();

	}

}
