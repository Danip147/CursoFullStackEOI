package com.fran.springboot.backend.mvc.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fran.springboot.backend.mvc.models.dao.IClienteDAO;
import com.fran.springboot.backend.mvc.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDAO iClienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) iClienteDao.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return iClienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return iClienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		iClienteDao.deleteById(id);		
	}
	
}
