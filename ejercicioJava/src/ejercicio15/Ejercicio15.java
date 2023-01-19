/* Pregunta al usuario el nombre de 3 productos con sus respectivos precios. Debes mostrar dichos datos 
 * formateados por la consola. El nombre tendrá 15 caracteres, el precio 12 (con 2 decimales) y 
 * finalmente, muestra el precio con IVA (21%), también con 12 caracteres y 2 decimales. El nombre 
 * debe estar alineado a la izquierda (espacios a la derecha) y los precios a la derecha.
 */

package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void dameDatos() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce producto: ");
		String producto1 = sc.nextLine();
		
		System.out.println("Introduce precio del producto");
		double precioProducto1 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		System.out.println("Introduce producto: ");
		String producto2 = sc.nextLine();
		
		System.out.println("Introduce precio del producto 2");
		double precioProducto2 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		System.out.println("Introduce producto: ");
		String producto3 = sc.nextLine();
		
		System.out.println("Introduce precio del producto 2");
		double precioProducto3 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		
		final double IVA= 0.21;
		
		System.out.printf("%-15s%12s%12s\n","NOMBRE", "PRECIO", "CON IVA");
		System.out.printf("%-15s%11.2f€%11.2f€\n", producto1,precioProducto1, (precioProducto1 *(1+IVA))); // el .2 es para los numeros de decimales a mostrar
		System.out.printf("%-15s%11.2f€%11.2f€\n", producto2,precioProducto2,(precioProducto2 *(1+IVA))); // el .2 es para los numeros de decimales a mostrar
		System.out.printf("%-15s%11.2f€%11.2f€\n", producto3,precioProducto3,(precioProducto3 *(1+IVA))); // el .2 es para los numeros de decimales a mostrar
		
		sc.close();
		
	}

	public static void main(String[] args) {
		dameDatos();

	}

}
