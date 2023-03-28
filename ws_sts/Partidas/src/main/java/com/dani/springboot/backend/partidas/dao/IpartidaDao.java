package com.dani.springboot.backend.partidas.dao;

import org.springframework.data.repository.CrudRepository;

import com.dani.springboot.backend.partidas.entity.Partidas;

public interface IpartidaDao extends CrudRepository<Partidas,Integer>{

}
