/**
 * 1. Crea una clase llamada Tienda con un método llamado bienvenida que
imprima por consola “¡Bienvenido a nuestra tienda!”. Crea otra clase llamada
TiendaLicores que herede de Tienda. Crea un objeto del tipo
TiendaLicores y llama al método bienvenida.
2. Sobrescribe el método bienvenida en la clase TiendaLicores. Deberá
hacer lo mismo que la clase base y añadir el mensaje “Si eres menor de
18 años, fuera de aquí”.
 */

package ejercicioPOO;

public class Ejecutable {

	public static void main(String[] args) {
		
		TiendaLicores tiendaLicores = new TiendaLicores();
        tiendaLicores.bienvenida();
	}

}
