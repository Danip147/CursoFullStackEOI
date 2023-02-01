/**
 * 6. Crea una función que reciba un array de números y devuelva su media.
 */

package ejercicio06;

import java.util.Arrays;

public class Ejercicio06 {
	
public static double devuelveMedia(double... numeros) {
		
		double resultado = 0;
		
		for(double numero : numeros) {
			 resultado += numero;
		}
		return resultado/numeros.length;
	}
	
	public static double ejercicio06(double... numeros) {
		return Arrays.stream(numeros).average().getAsDouble();
	}

	public static void main(String[] args) {
		System.out.println(devuelveMedia(5,6.4,87,1,6,92.3));

	}

}
