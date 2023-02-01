/**
 * 1. Crea una función que te dibuje una fila de 20 asteriscos usando un bucle. Llámala
 * desde el main 3 veces.
 */


package ejercicio01;

public class Ejercicio01 {
	
	public static void dibujaFila(int numero) {
		for (int i = 1; i <= numero; i++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
		dibujaFila(20);
		dibujaFila(20);
		dibujaFila(20);

	}

}
