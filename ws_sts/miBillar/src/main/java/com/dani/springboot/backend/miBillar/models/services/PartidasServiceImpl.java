package com.dani.springboot.backend.miBillar.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dani.springboot.backend.miBillar.models.dao.IpartidasDao;
import com.dani.springboot.backend.miBillar.models.entity.Partidas;


public class PartidasServiceImpl implements IpartidasService {

	@Autowired
	private IpartidasDao partidasDao;

	@Override
	@Transactional(readOnly=true)
	public List<Partidas> findAll() {
		return (List<Partidas>)partidasDao.findAll();
	}

}
