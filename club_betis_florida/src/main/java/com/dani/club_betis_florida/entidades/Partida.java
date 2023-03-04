package com.dani.club_betis_florida.entidades;

import java.util.Objects;

public class Partida {

	private int id_partida;
	private int par_num_caram_local;
	private int par_num_caram_visitante;
	private int par_num_entradas;
	private int par_serie_maxima_local;
	private int par_serie_maxima_visitante;
	private Double par_promedio_local;
	private Double par_promedio_visitante;
	private int par_mesa;
	private int fk_ganador;
	private int fk_usuario_local;
	private int fk_usuario_visitante;
	
	
	public Partida() {
		
	}


	
}
