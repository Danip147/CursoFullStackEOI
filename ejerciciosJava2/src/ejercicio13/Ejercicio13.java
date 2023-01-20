/**
 * 13. Muestra por pantalla los números de 20 al 1 usando un bucle while, y después hazlo otra vez 
 * usando un bucle for.
 */

package ejercicio13;

public class Ejercicio13 {
	
	public static void muestraNumeros() {
		int numero = 20;
		
		while (numero > 0) {
			System.out.println(numero);
			numero--; // decremento necesarioa para que el bucle no sea infinito
		}
			
	}

	public static void main(String[] args) {
		muestraNumeros();
		
	}

}
