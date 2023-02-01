package funciones;

import java.util.Arrays;

public class Ejercicios {
	
	/**
	 * 6. Crea una función que reciba un array de números y devuelva su media.
	 */
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

	
	/**
	 * 8. Crea una función que reciba un número indeterminado de parámetros enteros y
	devuelva el máximo. Ten en cuenta que si recibes cero números, debes devolver cero
	también.
	 * @param args
	 */
	public static int ejercicio08(int... numeros) {
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
		//double[] numeros = {10.5,6.5,8.1,9.2};
		//System.out.println(numeros);
		 
		//System.out.println(devuelveMedia(10.5,6.5,8.1,9.2));
		
		int maximo = ejercicio08(8,24,65,92,1);
		System.out.println(maximo);
		
		System.out.println(ejercicio08funcional(8,15,96,45,70));

	}

}
