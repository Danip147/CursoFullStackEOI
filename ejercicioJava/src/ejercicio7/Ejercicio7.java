/*
 * 7. Crea un programa donde definimos 2 variables de tipo carácter. Muestra la posición de cada carácter 
 * en la tabla unicode y la diferencia entre ambos caracteres. Si los caracteres son ‘b’ y ‘k’, la salida 
 * sería:
 * 'b' tiene la posición 98
 * 'k' tiene la posición 107
 * Diferencia entre 'b' y 'k': 9
 */

package ejercicio7;

public class Ejercicio7 {
	
	public static void ejercicio7() {
		char letra1 = 'b';
		char letra2 = 'k';
		System.out.println("'b' tiene la posición " + (int)letra1);
		System.out.println("'k' tiene la posición " + (int)letra2);
		System.out.println("La diferencia entre 'b' y 'k' es: "+ ((int)letra2-(int)letra1));		
		System.out.println("La diferencia entre 'b' y 'k' es: "+ ((int)(letra2-letra1)));		
	}

	public static void main(String[] args) {
		ejercicio7();
	}

}
