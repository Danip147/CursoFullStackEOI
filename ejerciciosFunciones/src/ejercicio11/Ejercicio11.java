/**
 * 11. Crea una función que reciba una cadena con una serie de números separados por
 * punto y coma “;”, y devuelva la media de dichos números.
 */

package ejercicio11;

public class Ejercicio11 {
	
	public static double mediaNumeros(String cadena) {
		
		String[] partes = cadena.split(";");
		int suma = 0;
		for(String parte : partes) {
			 suma += Integer.parseInt(parte);
		}
		
		
		return (double) suma / partes.length;
	}

	public static void main(String[] args) {
	double media = mediaNumeros("1;5;9;78;12");
	System.out.println(media);

	}

}
