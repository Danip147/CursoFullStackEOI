package ejercicio04;

import java.util.ArrayList;
import java.util.List;

import poo1.Jugador;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo(); 
        equipo.setNombre("Betis Florida");
        System.out.println(equipo);
        
        List<Jugador1> jugadoresBetis = new ArrayList<Jugador1>();
        jugadoresBetis.add(new Jugador1("Daniel", 1500));
        jugadoresBetis.add(new Jugador1("Gabriel", 800));
        jugadoresBetis.add(new Jugador1("Jesus", 2000));
        
        System.out.println(jugadoresBetis);
        
        equipo.deleteJugador(0);

        for (int i = 0; i < jugadoresBetis.getNumJugadores(); i++) {
            Jugador1 jugador = equipo.getJugador(i);
            System.out.println("Nombre: " + jugador.getNombre() + " Sueldo: " + jugador.getSueldo());
        }

        System.out.println("Total sueldos: " + equipo.totalSueldos());
    }
}
