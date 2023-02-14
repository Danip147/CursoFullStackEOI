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
		
		if(miCoche.esCaro()) {
			System.out.println("El coche es caro");
		}else {
			System.out.println("El coche es barato");
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
	
	
	public static void ejercicio02() {
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Jugador jugador1 = new Jugador("Daniel", -28, -15000);
		Jugador jugador2 = new Jugador("Jesus", 42, 60000);
		jugadores.add(jugador1); // jugador que ocupa la posicion 0
		jugadores.add(jugador2); // jugador que ocupa la posicion 1
		jugadores.add(null); // jugador que ocupa la posicion 2
		jugadores.add(null); // jugador que ocupa la posicion 3
		Jugador jugador4 = new Jugador("Paco", -28, -15000);
		Jugador jugador5 = new Jugador("Ximo", 42, 60000);
		jugadores.add(jugador4); 
		jugadores.add(jugador5);
		
		//System.out.println(jugadores);
		
		//Programacion Estructurada
//		for(Jugador jugador: jugadores ) {
//			if(jugador != null) {
//				System.out.println(jugador.getNombre());
//			}
//			
//		}
		// Programacion Funcional
		jugadores.stream()
			.filter(e -> e != null) // filtro para no trabajar con los nulos
			.forEach(e -> System.out.println(e.getNombre())); // obtengo el nombere de los que quedan
		
		
	}
	
	
	public static void ejercicio03() {
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Jugador jugador1 = new Jugador("Daniel", -28, -15000);
		Jugador jugador2 = new Jugador("Jesus", 42, 60000);
		jugadores.add(jugador1); // jugador que ocupa la posicion 0
		jugadores.add(jugador2); // jugador que ocupa la posicion 1
		jugadores.add(null); // jugador que ocupa la posicion 2
		jugadores.add(null); // jugador que ocupa la posicion 3
		Jugador jugador4 = new Jugador("Paco", -28, -15000);
		Jugador jugador5 = new Jugador("Ximo", 42, 60000);
		jugadores.add(jugador4); 
		jugadores.add(jugador5);
		
		List<Jugador> jugadores2 = new ArrayList<Jugador>(); // la segunda lista inicialmente esta vacia
		// Copiar una lista a partir de otra con programacion estructurada
		for(Jugador jugador : jugadores) {
			if (jugador != null) {
				jugadores2.add(new Jugador(jugador));
			}else {
				jugadores2.add(null);
			}
		}
		jugadores.stream().forEach(e ->{
			if (e != null) {
				jugadores2.add(new Jugador(e)); 
			}else {
				jugadores2.add(null);
			}
		});
		jugadores2.get(0).setNombre("Posicion 0");	
		System.out.println(jugadores);
		System.out.println(jugadores2);
		
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
	
	
	public static void ejemploEquipos() {
		Equipo barsa = new Equipo(); // creo el equipo
		barsa.setNombre("F.C. Barcelona");
		barsa.setPresupuesto(40000000);
		
		
		Estadio campNou = new Estadio(); // creo el estadio
		campNou.setNombre("Spotify Camp Nou");
		campNou.setCapacidad(1000000);
		barsa.setEstadio(campNou); // asigno el estadio al equipo
		
		List<Jugador> jugadoresBarsa = new ArrayList<Jugador>(); // creo la lista y le meto datos
		jugadoresBarsa.add(new Jugador("Dani",28, 100000));
		jugadoresBarsa.add(new Jugador("Fran",25, 200000));
		jugadoresBarsa.add(new Jugador("Paco",21, 200000));
		jugadoresBarsa.add(new Jugador("Juan",18, 800000));
		
		barsa.setJugadores(jugadoresBarsa);
		// imprimo el equipo
//		System.out.println(barsa);
		
		
		Equipo madrid = new Equipo(barsa);
		madrid.setNombre("Real Madrid");
		madrid.setPresupuesto(100000);
		barsa.getEstadio().setNombre("Nuevo campo"); // le cambio el nombre del estadio del barsa
		madrid.getEstadio().setNombre("Santiago Bernabeu");
		madrid.getEstadio().setCapacidad(80000);
		barsa.getJugadores().get(0).setNombre("Daniel");  // accede al equipo, luego a su primer elemento y luego cambia el nombre
		madrid.getJugadores().get(1).setNombre("Ate");
		
		
		System.out.println(barsa); // imprimo barca
		System.out.println(madrid); // imprimo madrid
		
		
	}
	
	public static void falloSiNoSeCorrige() {
		Equipo equipo = new Equipo();
		Jugador fran = new Jugador("Fran", 45, 50000);
		equipo.getJugadores().add(fran);
		equipo.getEstadio().setNombre("Mi estadio");
		System.out.println("Fin del programa");
	}
	
	
	public static void ejemplosHerencias() {
		//Animal animal = new Animal ("Mi animal", 10);
		
		Ave pajaro = new Ave(true);
//		Ave gallina = new Ave("Gallina", 3, false);
		Ave gallina = new Ave("Animal desconocido", 1, false);
		
//		animal.comer();
		
		
		
		
//		pajaro.comer();
		pajaro.ponerHuevos();
		System.out.println("El pajaro se llama : " + pajaro.getNombre());
		
		Mamifero leon = new Mamifero("León", 210, true);
		leon.comer();
		System.out.println(leon);
		System.out.println(pajaro);
		
		Mamifero gato = new Mamifero("Animal desconocido", 1, true);
		
		if(pajaro.equals(gallina)) {
			System.out.println("El pajaro y la gallina son iguales");
		}else {
			System.out.println("El pajaro y la gallina NO son iguales");
		}
		
		// aqui aunque se llaman igaul y pesan lo mismo y son animales los 
		// detecta diferente porque son de distinta clase.
		if(pajaro.equals(gato)) {
			System.out.println("El pajaro y la gato son iguales");
		}else {
			System.out.println("El pajaro y la gato NO son iguales");
		}
		
		
		List<Animal> animales = new ArrayList<Animal>();
		animales.add(pajaro);
		animales.add(gallina);
		animales.add(leon);
		animales.forEach(e -> System.out.println(e)); // Aqui hay polimorfismo
		
		System.out.println("Ejemplo instanceOf: ");
		for (Animal animal : animales) {
			if(animal instanceof Ave) {// es un animal pero cual???
				System.out.println("El número de pollitos es: " + ((Ave)animal).pollitos(animal.getNombre()));
				System.out.println(animal.rugido());
			}else if (animal instanceof Mamifero) {
				System.out.println(animal.rugido());
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
//		ejemplosCoches();
//		ejercicio01();
//		ejemploListasJugadores();
//		ejemploEquipos();
//		ejercicio02();
//		ejercicio03();
		ejemplosHerencias();
		
	}
}
