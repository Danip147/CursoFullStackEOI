/**
 * 5. Crea una función que reciba un número y devuelva un booleano indicando si el número
 * recibido es primo o no. Llama a la función varias veces y muestra el resultado
 * devuelto. Recuerda que un número primo es aquel que solo es divisible (resto == 0)
 * entre 1 y él mismo.
 */

package ejercicio05;

public class Ejercicio05 {
	
	public static boolean dimePrimo(int numero) {
		
		  if (numero <= 1) {
		        return false;
		    }
		    for (int i = 2; i < numero; i++) {
		        if (numero % i == 0) {
		            return false;
		        }
		    }
		    return true;
		}
		
		
	public static void main(String[] args) {
		System.out.println(dimePrimo(6));

	}

}
