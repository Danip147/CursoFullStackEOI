package poo1;

import java.util.ArrayList;
import java.util.List;

public class Ejemplos {
	
	public static void ejemplosCoches() {
		Coche miCoche = new Coche(); // Me crea un coche sin datos. Usa el constructor vacio.
//		miCoche.numeroRuedas = 4;
//		miCoche.marca = "Seat";
//		miCoche.modelo = "Altea";
		miCoche.setNumeroRuedas(40);
		miCoche.setMarca("Seat");
		miCoche.setModelo("Altea");
		miCoche.setMatricula("0270LYK");
		miCoche.setPrecio(10000);
		System.out.println(miCoche); // Estamos probando el toString
		System.out.println("Mi coche es un " + miCoche.getMarca() + " " + miCoche.getModelo() + " con matricula: "
				+ miCoche.getMatricula());

		// vamos a probar el constructor con parametros
		Coche z3 = new Coche(40, "Bmw", "z3", "1245-LYJ", -20000);
		System.out.println(z3);
		System.out.println("Mi nuevo coche es un " + z3.getMarca() + " " + z3.getModelo() + " con matricula: "
				+ z3.getMatricula());

		Coche tercero = new Coche(4, "Mercedes", "Clase A", 15000);
		System.out.println(tercero);

		// Vamos a probar el constructor de copia

		Coche clonZ3 = new Coche(z3);
		System.out.println(clonZ3);
		clonZ3.setMatricula("2222-CCC");

		System.out.println("Imprimo z3 original: ");
		System.out.println(z3);
		System.out.println("Imprimo z3 clonado y cambiado matricula");
		System.out.println(clonZ3);

		// ERROR TIPICO DE UN PROGRAMADOR
		Coche intentoClon = z3; // Esto no crea un nuevo coche, al coche existente ahora se le puede llamar de
								// esta forma UN ALIAS
		z3.setPrecio(5000);
		System.out.println("Voy a imprimir intento clon: ");
		System.out.println(intentoClon);

		// Probar Equals

		if (z3.equals(clonZ3)) {
			System.out.println("Los coches son iguales");
		} else {
			System.out.println("Los coches son diferentes");
		}

	}

	
	public static void ejercicio01() {
		
		Jugador jugador1 = new Jugador("Daniel", -28, -15000);
		Jugador jugador2 = new Jugador("Jesus", 42, 60000);
		Jugador jugador3 = new Jugador("Enrique", 20, 100000);
		Jugador jugador4 = new Jugador("Jose", 18, 220000);
		Jugador jugador5 = new Jugador("Atenea", 19, 1000000);
		Jugador jugador6 = new Jugador("Vanesa", 15, 380000);
		Jugador jugador7 = new Jugador("Natalia", 30, 870000);
		Jugador jugador8 = new Jugador("Angel", 38, 410000);
		Jugador jugador9 = new Jugador();
		jugador9.setNombre("Nestor");
		jugador9.setEdad(25);
		jugador9.setSueldo(20000);
		
		Jugador jugador10 = new Jugador(jugador1);
		
		System.out.println(jugador1);
		System.out.println(jugador9);
		System.out.println(jugador10);
		
		
	}
	
	
	public static void ejemploListasJugadores() {
		
		// Creo una lista vacia para almacenar los jugadores
		List<Jugador> jugadores = new ArrayList<Jugador>();
		
		
		
		Jugador daniel = new Jugador("Daniel", -28, -15000);
		Jugador jesus = new Jugador("Jesus", 42, 60000);
		Jugador enrique = new Jugador("Enrique", 20, 100000);
		Jugador jose = new Jugador("Jose", 18, 220000);
		Jugador atenea = new Jugador("Atenea", 19, 1000000);
		Jugador vanesa = new Jugador("Vanesa", 15, 380000);
		Jugador natalia = new Jugador("Natalia", 30, 870000);
		Jugador angel = new Jugador("Angel", 38, 410000);
		Jugador nestor = new Jugador();
		nestor.setNombre("Nestor");
		nestor.setEdad(25);
		nestor.setSueldo(20000);
		
		Jugador dani = new Jugador(daniel);
		
		// forma de meter los jugadores en lista jugadores
		jugadores.add(daniel);
		jugadores.add(jesus);
		jugadores.add(enrique);
		jugadores.add(jose);
		jugadores.add(atenea);
		jugadores.add(vanesa);
		jugadores.add(natalia);
		jugadores.add(angel);
		jugadores.add(nestor);
		jugadores.add(dani);
		
		// Lo metes y lo creas a la vez
		jugadores.add(new Jugador("Naomi", 20, 80000));
		
		
		// Imprimir todos los jugadores
		jugadores.forEach(e -> System.out.println(e));
		
		// Filtra e imprime 
		System.out.println("Jugadores que ganan mas de 60000€: ");
		jugadores.stream().filter(e ->e.getSueldo()>60000).forEach(e -> System.out.println(e));
		
		// otro filtro
		System.out.println("Jugadores que ganan entre 50000 de 70000€ y su nombre tengan su nombre mas de 5 letras: ");
		jugadores.stream()
		.filter(e ->e.getSueldo()>=50000)
		.filter(e ->e.getSueldo()<=70000)
		.filter(e ->e.getNombre().length()>5)
		.forEach(e -> System.out.println(e));
		
		// otro filtro
		System.out.println("Jugadores que tengan un 'n' en su nombre: ");
		jugadores.stream()
		.filter(e ->e.getNombre().toLowerCase().contains("n"))
		.forEach(e -> System.out.println(e));
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
//		ejemplosCoches();
//		ejercicio01();
		ejemploListasJugadores();
		
		
	}
}
