package com.dani.springboot.backend.eventos.models.services;

import java.util.List;

import com.dani.springboot.backend.eventos.models.entity.Evento;

public interface IeventoService {
	
	public List<Evento> findAll();
	public Evento findById(int id);
	public void delete(int id);
	public Evento save (Evento evento);
	

}