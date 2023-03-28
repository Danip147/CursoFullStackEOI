package com.dani.springboot.backend.miBillar.models.services;

import java.util.List;

import com.dani.springboot.backend.miBillar.models.entity.Partidas;

public interface IpartidasService {

	public List<Partidas> findAll();
}
