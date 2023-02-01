/**
 * 3. Crea una función que reciba un carácter y un número, dibuja un cuadrado usando ese 
 * carácter cuyo ancho y alto sea igual al número recibido. Prueba la función.
 */

package ejercicio03;

public class Ejercicio03 {

	public static void dibujaCuadrado(char caracter, int numero) {

		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print(caracter);
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		dibujaCuadrado('a', 4);
		dibujaCuadrado('z', 7);

	}

}
