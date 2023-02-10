package ejercicio04;

public class Main {
	 public static void main(String[] args) {
	        Equipo equipo = new Equipo();
	        equipo.setNombre("Betis Florida");
	        
	        equipo.addJugador(new Jugador("Daniel", 1000));
	        equipo.addJugador(new Jugador("Fran", 2000));
	        equipo.addJugador(new Jugador("Jesus", 1500));
	        equipo.addJugador(new Jugador("Paco", 2500));

	        // borrar un jugador
//	        equipo.deleteJugador(0);
	        
	        
	        // Muestra nombre del equipo
	        System.out.println("El nombre del equipo es: " + equipo);
	        
	        // Mostrar jugadores y sueldo
//	        for (int i = 0; i < equipo.getNumJugadores(); i++) {
//	            Jugador jugador = equipo.getJugador(i);
//	            System.out.println("Nombre: " + jugador.getNombre() + " Sueldo: " + jugador.getSueldo()+ " €");
//	        }
	        
	        equipo.getJugadores().forEach(e->System.out.println(e)); // Muestra todos los jugadores de la lista
	        System.out.println(equipo.totalSueldos());
	        
	        // ver un jugador en concreto
	        System.out.println("Buscando un jugador en concreto: ");
	        System.out.println(equipo.getJugador(1));
	        
	        // ver numero total de jugadores
	        System.out.println("El equipo tiene " + equipo.getNumJugadores()+ " jugadores ");
	        
	        System.out.println("Total sueldos: " + equipo.totalSueldos()+ " €");
	    }
	
	
}




	


