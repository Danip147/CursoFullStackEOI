package teoriaFicheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TeoriaFicherosPruebasDani {

	// poder leer un fichero
	public static String leerFicheroJava8(String nombreFichero) throws IOException {
	
		String contents = new String(Files.readAllBytes(Paths.get(nombreFichero)));
		System.out.println(contents);
		return contents;
	}
	
	public static double separaCadena(String contents, String separador) {
		String[] partes = contents.split(";");
		
		Double suma = Double.parseDouble(partes[1]) + Double.parseDouble(partes[3]) + Double.parseDouble(partes[5])
						+ Double.parseDouble(partes[7]) + Double.parseDouble(partes[9]);

		double media = suma / partes.length;

		return media;
	}
	

	public static void main(String[] args) throws IOException {
		String contenido = leerFicheroJava8("C:\\ficheros\\alumnos.txt");
		
		double mediaNumeros = separaCadena(contenido, ";");
		System.out.println(mediaNumeros);
	

	}

}
