/**
 * 2. Crea una función que reciba una cadena y 2 números enteros por parámetro y te
 * imprima si la longitud de la cadena está entre los 2 números o no. Llámala al menos 2
 * veces, una en la que sí esté en el rango, y otra en la que no.
 */

package ejercicio02;

public class Ejercicio02 {
	
	public static void longitudCadena(String cadena, int numero1, int numero2) {
		int tamanyoCadena = cadena.length();
		
		if(tamanyoCadena > numero1 && tamanyoCadena < numero2) {
			System.out.println("La longitud de la cadena esta en el rango");
		}else {
			System.out.println("La longitud de la cadena no está en el rango");
		}
		
	}
	

	public static void main(String[] args) {
		longitudCadena("Dani", 10 , 15);
		longitudCadena("Dani está contento ", 10 , 20);
		longitudCadena("Dani está contento de estar aquí con vosotros ", 10 , 20);

	}

}
