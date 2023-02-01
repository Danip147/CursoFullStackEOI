/**
 * 8. Crea una función que reciba un número indeterminado de parámetros enteros y
 * devuelva el máximo. Ten en cuenta que si recibes cero números, debes devolver cero
 * también.
 *
 */

package ejercicio08;

import java.util.Arrays;

public class Ejercicio08 {
	
	public static int dameNumeroMaximo(int... numeros) {
		int maximo = Integer.MIN_VALUE;
		if (numeros.length == 0) {
			return 0;
		}
		for (int numero : numeros) {
			if(numero > maximo) {
				maximo = numero;
			}
		}
		return maximo;
	}
	
	public static int ejercicio08funcional(int... numeros) {
		return Arrays.stream(numeros).max().orElse(0);
	}
	
	
	public static void main(String[] args) {
		System.out.println(dameNumeroMaximo(45,85,90,120));

	}

}
