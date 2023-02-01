/**
* 13. Crea un array bidimensional de cadenas. En este array almacenaremos productos con
* sus respectivos datos. La primera dimensión hará referencia a la posición de cada
* producto. Y para cada producto (segunda dimensión), almacenaremos lo siguiente
* (son cadenas todo): Nombre, precio y cantidad (3 campos).
* Recorre los productos, y muéstralos en formato de tabla, con el nombre, precio,
* cantidad y precio total. Ten en cuenta que los datos están almacenados como cadenas y
* deberás convertir el precio a número decimal y la cantidad a número entero. Ejemplo de tabla
* (formatea con longitud fija para cada campo):
* NOMBRE PRECIO CANT TOTAL
* ------------------------------------------------
* Mesa 99,50€ 3 298,50€
* Silla 14,95€ 4 59,80€
*
*/

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void ejercicio13() {
		Scanner sc = new Scanner(System.in);
		String[][] productos = new String[10][3]; // podemos almacenar hasta 10 productos
		// String[][] productos = {{"mesa","99,50","3"},{"silla","14,95","4"}}; // 2
		// producos con 3 campos

		// Obtener los datos de productos INTRODUCCION DE DATOS
		System.out.println("¿Cúantos productos desea almacenar? (máximo 10): ");
		int numProductos = Integer.parseInt(sc.nextLine());
		if (numProductos > 10 || numProductos < 0) {
			System.out.println("No se pueden almacenar más de 10 productos o números negativos");
			sc.close(); // cierro el scanner porque el programa no va a llegar al final de la funcion
			return; // salgo de la funcion
		} else { // numero entra 0 y 10
			for (int i = 0; i < numProductos; i++) {
				System.out.println("Introduzca el nombre del producto " + (i + 1) + " : ");
				productos[i][0] = sc.nextLine();
				System.out.println("Introduzca el precio del producto " + (i + 1) + " : ");
				productos[i][1] = sc.nextLine();
				System.out.println("Introduzca el cantidad del producto " + (i + 1) + " : ");
				productos[i][2] = sc.nextLine();

			}
		}

		// Mostrar datos
		System.out.printf("%-17s%10s%10s%10s\n", "NOMBRE", "PRECIO", "CANTIDAD", "TOTAL");
		System.out.println(String.valueOf('-').repeat(47));

		for (int i = 0; i < numProductos; i++) { // si pedimos por pantalla seria numProductos
			double precio = Double.parseDouble(productos[i][1].replace(',', '.'));
			int cantidad = Integer.parseInt(productos[i][2]);
			double total = precio * cantidad;

			System.out.printf("%-17s%-9.2f€%10d%9.2f€\n", productos[i][0], precio, cantidad, total);
		}

		sc.close();
	}

	public static void main(String[] args) {
		ejercicio13();

	}

}
