package com.dani.chucknorris;

import java.util.ArrayList;
import java.util.List;

import com.dani.chucknorris.entidades.Frase;
import com.dani.chucknorris.utilidades.JsonUtils;
import com.dani.chucknorris.utilidades.SerializacionUtils;

public class App {
	
	static List<Frase> frasesChuck = new ArrayList<Frase>();
	
	public static void atrapandoFrases() {
		
		  Frase frasesChuck =  JsonUtils.leerObjeto("https://api.chucknorris.io/jokes/random", Frase.class);
		  System.out.println(frasesChuck);
	}
	
	public static void ejemploSerializar(){
		 // Probamos la serializacion
       if(SerializacionUtils.serializarListaObjetos("frasesChuck.dat", frasesChuck)) {
       	System.out.println("La serializacion fue satisfactoria");
       } else {
       	System.out.println("La serializacion falló");
       }
	}
	
	public static void ejemploDesSerializar() {
		frasesChuck = SerializacionUtils.desSerializarListaObjetos("frasesChuck.dat");
		System.out.println(frasesChuck);
		
	}
	
	public static void mostrarFrases() {
		frasesChuck.forEach(e -> System.out.println(e));
	}
	

	
	
    public static void main( String[] args ) {
    	atrapandoFrases();
    	ejemploSerializar();
    	ejemploDesSerializar();
//    	mostrarFrases();
    	
    
    	
    }
}
