package com.dani.Ejercicio_FicherosFechasColecciones.utilidades;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FicherosUtils {
	
	/**
	 * Método que lee un fichero y devuelve sus líneas en una lista
	 * @param ruta Path con la ruta del fichero
	 * @return Lista de cadenas, una por cada linea.
	 */
	public static List<String> devolverLineasJava8(Path ruta){
		
		try { // intenta ejecutar este codigo
			List<String> lineas = Files.readAllLines(ruta,Charset.forName("UTF-8"));
			return lineas;
		} catch (IOException e) {
//			e.printStackTrace(); // mensaje ERROR por defecto del sistema
			System.out.println("No se puede acceder al fichero"); // mensaje de ERROR personalizado
			return null; // tiene que devolver algo
		}
		
	}

}
