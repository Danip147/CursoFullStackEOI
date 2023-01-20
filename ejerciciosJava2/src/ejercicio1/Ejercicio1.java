/*
 * 1. Muestra si un número es par o impar
 */

package ejercicio1;

public class Ejercicio1 {
	
	public static void parImpar() {
		int numero = 5;
		
		if(numero%2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}

	public static void main(String[] args) {
		parImpar();

	}

}
