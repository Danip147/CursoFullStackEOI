/**
 * 12. Crea una variable con el precio de una entrada que inicialmente valga 50. Pregunta al usuario 
 * su edad. 
 * a. Si es menor de edad se le hará un descuento del 25% en la entrada.
 * b. Si es mayor de edad pero no está jubilado (65 años), pregúntale si es socio. Si el usuario 
 * responde “sí” hazle un descuento del 40%.
 * c. Si está jubilado se le hará un descuento del 75%.
 * d. Finalmente muéstrale el precio que tiene que pagar por la entrada
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void descuento() {
		int precioEntrada = 50;

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca su edad: ");
		int edad = sc.nextInt();

		double precioTotal1 = precioEntrada - precioEntrada * 0.25;
		double precioTotal2 = precioEntrada - precioEntrada * 0.40;
		double precioTotal3 = precioEntrada - precioEntrada * 0.75;

		if (edad < 18) {
			System.out.println("El precio de la entrada se queda en : " + precioTotal1 + "€");
		} else if (edad >= 18 && edad <= 65) {
			System.out.println("¿Es usted socio?");
			String respuesta = sc.next();

			if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("s")) {
				System.out.println("El precio de la entrada se queda en : " + precioTotal2 + "€");
			} else {
				System.out.println("El precio de la entrada se queda en : " + precioEntrada + "€");
			}

		} else {
			System.out.println("El precio de la entrada se queda en : " + precioTotal3 + "€");
		}

		sc.close();

	}

	public static void main(String[] args) {
		descuento();

	}

}
