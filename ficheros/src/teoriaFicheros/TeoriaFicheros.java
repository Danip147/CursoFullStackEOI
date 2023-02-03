package teoriaFicheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TeoriaFicheros {

	// poder leer un fichero
	public static void leerFicheroJava8(String nombreFichero) throws IOException {
		Files.readAllLines(Paths.get(nombreFichero)).forEach(l -> System.out.println(l));

		
	}

	public static void main(String[] args) throws IOException {
		leerFicheroJava8("C:\\ficheros\\alumnos.txt");

	}

}
