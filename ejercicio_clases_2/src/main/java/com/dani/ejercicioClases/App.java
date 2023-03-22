package com.dani.ejercicioClases;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;

import com.dani.ejercicioClases.entidades.Cuenta;
import com.dani.ejercicioClases.entidades.CuentaCaixa;
import com.dani.ejercicioClases.entidades.CuentaSabadell;
import com.dani.ejercicioClases.entidades.CuentaSantander;
import com.dani.ejercicioClases.enumerados.NivelCatalan;
import com.dani.ejercicioClases.utilidades.FicherosUtils;



public class App {
	
	private static List<CuentaCaixa> cuentasCaixa = new ArrayList<CuentaCaixa>();
	private static List<CuentaSabadell> cuentasSabadell = new ArrayList<CuentaSabadell>();
	private static List<CuentaSantander> cuentasSantander = new ArrayList<CuentaSantander>();
	private static List<Object> todasLasCuentas = new ArrayList<>();
	
	
	public static void anyadirCuentasCaixa() {
		
		List<String> listaccstring = FicherosUtils.devolverLineasJava8(Paths.get("C:/ficheros/bancos/caixa.txt")); // pon ahi la direccion donde esta el fichero
    	
    	for(String cuenta : listaccstring) { // a partir de las lineas del fichero las añado a la lista de la caixa.
    		String[] partes = cuenta.split(";") ;
    		cuentasCaixa.add(new CuentaCaixa(partes[0],
    				partes[1],
    				LocalDate.parse(partes[2],
    				DateTimeFormatter.ofPattern("dd/MM/yyyy")),
    				partes[3], 
    				Double.parseDouble(partes[4]), 
    				NivelCatalan.Medio));
    	}
    	
	}
	
	public static void anyadirCuentasSabadell() {
		
		List<String> listaccstring = FicherosUtils.devolverLineasJava8(Paths.get("C:/ficheros/bancos/sabadell.txt")); // pon ahi la direccion donde esta el fichero
    	
    	for(String cuenta : listaccstring) { // a partir de las lineas del fichero las añado a la lista de la caixa.
    		String[] partes = cuenta.split(";") ;
    		cuentasSabadell.add(new CuentaSabadell(partes[0],
    				partes[1],
    				LocalDate.parse(partes[2],
    				DateTimeFormatter.ofPattern("dd/MM/yyyy")),
    				partes[3], 
    				Double.parseDouble(partes[4]), 
    				NivelCatalan.Medio));
    	}
    	
}
		
	public static void anyadirCuentasSantander() {
			
			List<String> listaccstring = FicherosUtils.devolverLineasJava8(Paths.get("C:/ficheros/bancos/santander.txt")); // pon ahi la direccion donde esta el fichero
	    	
	    	for(String cuenta : listaccstring) { // a partir de las lineas del fichero las añado a la lista de la caixa.
	    		String[] partes = cuenta.split(";") ;
	    		cuentasSantander.add(new CuentaSantander(partes[0],
	    				partes[1],
	    				LocalDate.parse(partes[2],
	    				DateTimeFormatter.ofPattern("dd/MM/yyyy")),
	    				partes[3], 
	    				Double.parseDouble(partes[4]), 
	    				false));
	    	}
	    
	    	
	    	
	   	
	}
	
	
	/**
	 * Uniendo todas las listas en una
	 */
	public static void juntarListas() {
		
	    todasLasCuentas.addAll(cuentasCaixa);
	    todasLasCuentas.addAll(cuentasSabadell);
	    todasLasCuentas.addAll(cuentasSantander);

	    todasLasCuentas.forEach(e -> System.out.println(e));
	}
	


	public static void eliminarCuentaAleatoria() {
	    if (todasLasCuentas.isEmpty()) {
	        System.out.println("La lista está vacía, no se puede eliminar ninguna cuenta.");
	    } else {
	        Random random = new Random();
	        int indice = random.nextInt(todasLasCuentas.size());
	        Cuenta cuentaEliminada = (Cuenta) todasLasCuentas.get(indice);
	        todasLasCuentas.remove(indice);
	        System.out.println("La cuenta eliminada al azar es: " + cuentaEliminada);
	    }
	}
	
	
	public static void sumarTotalSantander() {
//		cuentasSantander.stream().forEach(e -> System.out.println(e));

		Double saldoTotalesSantander = cuentasSantander.stream().mapToDouble(e -> e.getSaldo()).sum();
		System.out.println("El saldo total de las cuentas santander es: " + saldoTotalesSantander + "€");

		long numeroCuentas = cuentasSantander.stream().map(e -> e.getNombre()).count();
		System.out.println("El número totales de cuentas que hay es: " + numeroCuentas);

		OptionalDouble saldoMax = cuentasSantander.stream().mapToDouble(e -> e.getSaldo()).max();

		System.out.println("El saldo máximo es : " + saldoMax.getAsDouble() + " €");
	}
	

    public static void main( String[] args ){
        
    	anyadirCuentasCaixa();
    	anyadirCuentasSabadell();
    	anyadirCuentasSantander();
    	juntarListas();
    	System.out.println("");
    	eliminarCuentaAleatoria();
    	System.out.println("");
    	System.out.println("12. Datos de la cuenta Santander: ");
    	sumarTotalSantander();
    	
    	
    	
    	
    	
    	
    	
    	
		
    	
    	
    	
    
    	
    }
}
