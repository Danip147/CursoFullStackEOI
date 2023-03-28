package com.dani.springboot.backend.partidas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dani.springboot.backend.partidas.dao.IpartidaDao;
import com.dani.springboot.backend.partidas.entity.Partidas;

@Service
public class PartidaServiceImpl implements IpartidaService {

	@Autowired
	private IpartidaDao partidaDao;

	@Override
	@Transactional(readOnly=true)
	public List<Partidas> findAll() {
		return (List<Partidas>)partidaDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Partidas findById(int id) {
		return partidaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(int id) {
		partidaDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public Partidas save(Partidas evento) {
		return partidaDao.save(evento);
	}

}
