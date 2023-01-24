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

	public static void ejercicio12() {
		final double MENOR_EDAD = 0.25;
		final double DESCUENTO_SOCIO = 0.40;
		final double DESCUENTO_JUBILADO = 0.75;
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		double precioEntrada = 50;
		System.out.println("Introduzca su edad:");
		int edad = sc.nextInt();
		sc.nextLine();
		if(edad<18) {
			precioEntrada = precioEntrada * (1-MENOR_EDAD);  // precio * 0,75
		} else if(edad>=18 && edad<65) {
			System.out.println("Es usted socio (sí/no):");
			String respuesta = sc.nextLine();
			// Solución con expresión regular		
			/*Pattern regex = Pattern.compile("^s[iíÍ]?$", Pattern.CASE_INSENSITIVE);			
			Matcher m = regex.matcher(respuesta);
			if(m.matches()) {
				precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
			*/
			// Solución sin expresión regular
			if(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("s")) {
				precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
			}
		} else {
			precioEntrada = precioEntrada * (1-DESCUENTO_JUBILADO);
		}
		System.out.println("Su precio es: " + precioEntrada);
		sc.close();
	}
	/**
	 * Mismo ejercicio para un grupo de personas
	 */
	public static void ejercicio12Grupo() {
		final double MENOR_EDAD = 0.25;
		final double DESCUENTO_SOCIO = 0.40;
		final double DESCUENTO_JUBILADO = 0.75;
		final int PRECIO_ENTRADA = 50;
		final int MAYORIA_EDAD = 18;
		final int EDAD_JUBILACION = 65;
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		double precioEntrada = PRECIO_ENTRADA;  // Precio estándar sin descuentos
		double precioTotalGrupo = 0;  // Almacenará el precio total
		System.out.println("¿Cuántos sois?");
		int personas = sc.nextInt();  // Ya tengo las personas
		sc.nextLine();
		int personasAtendidas = 0;
		while(personasAtendidas<personas) {
			System.out.println("Datos de la persona " + (personasAtendidas+1));
			System.out.println("Introduzca su edad:");
			int edad = sc.nextInt();
			sc.nextLine();
			precioEntrada = PRECIO_ENTRADA;  // Volver a poner el precio que toca para ver si se aplican descuentos
			if(edad<MAYORIA_EDAD) {
				precioEntrada = precioEntrada * (1-MENOR_EDAD);  
			} else if(edad>=MAYORIA_EDAD && edad<EDAD_JUBILACION) {
				System.out.println("Es usted socio (sí/no):");
				String respuesta = sc.nextLine();
				if(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("s")) {
					precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
				}
			} else {
				precioEntrada = precioEntrada * (1-DESCUENTO_JUBILADO);
			}
			precioTotalGrupo += precioEntrada;
			System.out.println("Precio de la entrada de la persona " + (personasAtendidas+1) + " es " + precioEntrada);
			System.out.println("Precio del grupo hasta el momento: " + precioTotalGrupo);
			personasAtendidas++;
		}
				
		System.out.println("El precio FINAL del grupo es: " + precioTotalGrupo);
		sc.close();
	}
	

	public static void main(String[] args) {
		//descuento();
		//ejercicio12();
		ejercicio12Grupo();
	}

}
