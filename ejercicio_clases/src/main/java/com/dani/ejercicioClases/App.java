package com.dani.ejercicioClases;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.dani.ejercicioClases.entidades.CuentaCaixa;
import com.dani.ejercicioClases.enumerados.NivelCatalan;
import com.dani.ejercicioClases.utilidades.FicherosUtils;


public class App {
	
	private static List<CuentaCaixa> cuentasCaixa = new ArrayList<CuentaCaixa>();
	
	
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
    	
    	cuentasCaixa.stream()
    		.filter(e -> e.getSaldo()< 15000)
    		.forEach(e -> System.out.println(e));
	}
	
	
    public static void main( String[] args ){
        
    	anyadirCuentasCaixa();

    	
    	
    }
}
