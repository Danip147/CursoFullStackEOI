package com.dani.springboot.backend.eventos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dani.springboot.backend.eventos.models.dao.IeventoDao;
import com.dani.springboot.backend.eventos.models.entity.Evento;


@Service
public class EventoServiceImpl implements IeventoService{
	
	@Autowired
	private IeventoDao eventoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Evento> findAll() {
		return (List<Evento>)eventoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Evento findById(int id) {
		return eventoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(int id) {
		eventoDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public Evento save(Evento evento) {
		return eventoDao.save(evento);
	}

}