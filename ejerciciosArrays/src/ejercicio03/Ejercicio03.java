/**
 * 3. Pide al usuario 10 números con decimales (double). Usa un array para almacenarlos.
 * Muestra la media y los números que están por encima de esa media.
 */

package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static void ejercicio03() {
		
		double[] numeros = new double[10]; // creación del array
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número decimal: " );
			numeros[i] = sc.nextDouble();
			
		}
		
		double suma = 0;
		for(double numero : numeros) {
			suma += numero;
			
		}System.out.println("La suma es: " +suma);
		
		double media = (suma/numeros.length); // 5.27
		System.out.println("La media es: " + media );
		
		System.out.println("Los números que están por encima de la media son: ");
		for (double numero : numeros)  {
			if (numero > media) {
				System.out.println(numero);
			}
		}
		
		sc.close();
			
	}

	public static void main(String[] args) {
		ejercicio03();

	}

}
