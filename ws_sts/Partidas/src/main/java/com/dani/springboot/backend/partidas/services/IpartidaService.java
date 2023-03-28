package com.dani.springboot.backend.partidas.services;

import java.util.List;

import com.dani.springboot.backend.partidas.entity.Partidas;


public interface IpartidaService {

	public List<Partidas> findAll();
	public Partidas findById(int id);
	public void delete(int id);
	public Partidas save (Partidas evento);
}
