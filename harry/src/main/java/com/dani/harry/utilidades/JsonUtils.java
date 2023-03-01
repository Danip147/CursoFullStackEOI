package com.dani.harry.utilidades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class JsonUtils {
	
	
	
	public static <T> T leerObjeto(String url, Class<T> clase) {
		return new Gson().fromJson(InternetUtils.readUrl(url), clase);
	}
	
	public static <T> T leerObjetoConToken(String url,String token, Class<T> clase) {
		return new Gson().fromJson(InternetUtils.readUrl(url,token), clase);
	}
	
	
	
	public static <T> List<T> leerObjetos(String comienzoCadena, int numInicio, int numFin, String finCadena,Class<T> clase){
		List<T> resultado = new ArrayList<T>();
		for(int i=numInicio;i<=numFin;i++) {
			resultado.add(leerObjeto(comienzoCadena + i + finCadena,clase));
		}
		return resultado;
	}
	
	/**
	 * Método genérico que dada una url con un json donde se encuentra un array de objetos
	 * devuelve una lista de este tipo de objetos que contiene todos los objetos del array.
	 * Ejemplo de llamada: JsonUtils.devolverArrayGsonGenerico("https://jsonplaceholder.typicode.com/posts",Posts[].class);
	 * @param <T> Nombre de la clase genérica
	 * @param url Url de la web donde está el array en formato json
	 * @param clase Array de elementos del tipo de la clase
	 * @return Lista de elementos de esa clase
	 */
	public static <T> List<T> devolverArrayGsonGenerico(String url, Class<T[]> clase){
		return Arrays.asList(new Gson().fromJson(InternetUtils.readUrl(url), clase));
	}
	
	/**
	 * Creamos un String con un json a partir de un objeto
	 * @param <T> tipo del objeto
	 * @param object nombre de la variable
	 * @return String con el Json devuelto
	 */
	public static <T> String crearJson(T object) {
		return new Gson().toJson(object);
	}
	
	/**
	 * Creamos un String con un json en formato amigable a partir de un objeto
	 * @param <T> tipo del objeto
	 * @param object nombre de la variable
	 * @return String con el Json devuelto
	 */
	public static <T> String crearJsonPretty(T object) {
		return new GsonBuilder().setPrettyPrinting().create().toJson(object);
	}
	
}
