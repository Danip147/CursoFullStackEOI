/**
 * 9. Crea una función que reciba una cadena y una subcadena por parámetro y devuelva
 * cuantas veces aparece la subcadena dentro de la cadena. Para ello debes saber que
 * como segundo parámetro a indexOf le puedes pasar la posición a partir de la cual
 * buscar (empezaríamos en cero). Cuando te devuelva -1 es que ya no la ha encontrado
 * (utiliza un bucle).
 * Por ejemplo, si recibimos “cocinando cocos con chocolate” y “co” devolveremos el
 * número 5.
 */

package ejercicio09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio09 {
	
	public static int apareceSubCadena(String cadena, String subCadena) {
		    int contador = 0;
		    int indice = 0;
		    while ((indice = cadena.indexOf(subCadena, indice)) != -1) {
		        contador++;
		        indice += subCadena.length();
		    }
		    return contador;
		}
	
	public static int ejercicio09(String cadena, String subCadena) {
		int posicionBuscar = 0; // variable que almacena a partir de que poscion buscar la subcadena
		int resultado = 0; // veces que en cuentra la subcadena
		
		while((posicionBuscar = cadena.indexOf(subCadena, posicionBuscar)) != -1) { // la encuentra
			resultado++;
			posicionBuscar++;
			
		}
		return resultado;
	}

	public static int ejercicio09b(String cadena, String subCadena) {
		int veces = 0;
		Pattern patron = Pattern.compile(subCadena);
		Matcher coincidencia = patron.matcher(cadena);
		while(coincidencia.find()) {
			veces++;
		}
		return veces;
	}
	
	
	
	public static void main(String[] args) {
		int veces = apareceSubCadena("cocinando cocos con chocolate", "co");
		System.out.println(veces);
		
		int veces1 = ejercicio09("cocinando cocos con chocolate", "co");
		System.out.println(veces1);
		
		int veces2 = ejercicio09b("cocinando cocos con chocolate", "co");
		System.out.println(veces2);

	}

}
