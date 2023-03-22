package com.dani.Ejercicio_FicherosFechasColecciones_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.dani.Ejercicio_FicherosFechasColecciones.utilidades.FicherosUtils;


public class App {
	

	// Aqui estan todos los ficheros en 1
	static List<String> datosSabadell = devolverLineasJava8(Paths.get("C://ficheros/bancos/sabadell.txt"));
	static List<String> datosCaixa = devolverLineasJava8(Paths.get("C://ficheros/bancos/caixa.txt"));
	static List<String> datosSantander = devolverLineasJava8(Paths.get("C://ficheros/bancos/santander.txt"));
	static List<String> productos = devolverLineasJava8(Paths.get("C://ficheros/bancos/productosofertados.txt"));
	private static List<String> todasLasCuentas = new ArrayList<>();
	static List<String> fechasNacimiento = new ArrayList<>();
	static List<Integer> saldoTotal = new ArrayList<>();
	
	
	public static List<String> devolverLineasJava8(Path ruta) {

		try { // intenta ejecutar este codigo
			List<String> lineas = Files.readAllLines(ruta, Charset.forName("UTF-8"));
			return lineas;
		} catch (IOException e) {
//			e.printStackTrace(); // mensaje ERROR por defecto del sistema
			System.out.println("No se puede acceder al fichero"); // mensaje de ERROR personalizado
			return null; // tiene que devolver algo
		}

	}

	public static void anyadirListas() {
		// Meto todos los datos en una lista 
				try {
					todasLasCuentas.addAll(datosSabadell);
					todasLasCuentas.addAll(datosCaixa);
					todasLasCuentas.addAll(datosSantander);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public static void buscarProductoAdecuado(String fechaNacimiento) {
		for (String producto : productos) {
			String[] camposProducto = producto.split(";");

			int edadMinima = Integer.parseInt(camposProducto[0]);
			int edadMaxima = Integer.parseInt(camposProducto[1]);
			int saldoMinimo = Integer.parseInt(camposProducto[2]);
			int saldoMaximo = Integer.parseInt(camposProducto[3]);
			String nombreProducto = camposProducto[4];

			int edadCliente = Period.between(fechaNacimiento, LocalDate.now()).getYears();

			
			if (edadCliente >= edadMinima && edadCliente <= edadMaxima && total >= saldoMinimo && total <= saldoMaximo) {
				System.out.println("El producto " + nombreProducto + " es adecuado para ti.");
			}
		}
	}
	
	
	public static void saldoTotal() {
		int total = saldoTotal.stream().mapToInt(Integer::intValue).sum();

		System.out.println("El saldo total del usuario elegido es: " + total);
	}
	
	public static void cogerDatosUsuario(String dni) {
		String nombre = "";
		String codigoPais = "";
		LocalDate fechaNacimiento = null;
		int saldo = 0;

		for (String linea : todasLasCuentas) {
			String[] campos = linea.split(";");
			if (campos[0].equals(dni)) {
				nombre = campos[1];
				codigoPais = campos[3];
				fechaNacimiento = LocalDate.parse(campos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				fechasNacimiento.add(campos[2]);
				saldo = Integer.parseInt(campos[4]);
				saldoTotal.add(saldo);
				
			}
		}

		LocalDateTime horaActual = LocalDateTime.now();
		DateTimeFormatter formatoHora;

		if (codigoPais.equals("ES")) {
			formatoHora = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss");
			String horaActualFormateada = horaActual.format(formatoHora);
			System.out.println("Bienvenido " + nombre + " " + horaActualFormateada);
		} else {
			formatoHora = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss");
			String horaActualFormateada = horaActual.format(formatoHora);
			System.out.println("Welcome " + nombre + " " + horaActualFormateada);
		}
		
	}
	
	
		
	
	///////// ESTO ES EL MAIN /////////
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dni:");
		String dni = sc.nextLine();
		anyadirListas();
		cogerDatosUsuario(dni);
		saldoTotal();
		
		HashSet<String> fechasUnicas = new HashSet<String>(fechasNacimiento);
		if (fechasUnicas.size() > 1) {
			System.out.println("El cliente tiene más de una fecha de nacimiento en los ficheros:");
			int i = 1;
			for (String fecha : fechasUnicas) {
				System.out.println((i++) + ". " + fecha);
			}
			System.out.println("Seleccione la fecha de nacimiento correcta:");
			int opcion = sc.nextInt();
			while (opcion < 1 || opcion > fechasUnicas.size()) {
				System.out.println("Opción inválida, seleccione de nuevo:");
				opcion = sc.nextInt();
			}
			
			fechaNacimiento = LocalDate.parse(fechasNacimiento.get(opcion - 1),
					DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			System.out.println("La fecha de nacimiento seleccionada es: "
					+ fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
		} else if (fechasUnicas.size() == 1) {
			fechaNacimiento = LocalDate.parse(fechasNacimiento.get(0),
					DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.println("La fecha de nacimiento del cliente es: "
					+ fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		} else {
			System.out.println("No se encontraron fechas de nacimiento para el cliente.");
		}
		
	
		
		

		
		
		
	

		
		


		
		
	}

}