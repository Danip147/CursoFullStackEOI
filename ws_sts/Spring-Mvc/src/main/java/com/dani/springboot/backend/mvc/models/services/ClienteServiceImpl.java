package com.dani.springboot.backend.mvc.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dani.springboot.backend.mvc.models.dao.IclienteDao;
import com.dani.springboot.backend.mvc.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IclienteService {

	@Autowired // Para incorporar un componenete dentro de otro componente
	private IclienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true) // Auto exiges que dentro del metodo no usaras nada que modifique el dato
	public List<Cliente> findAll() {
		return (List<Cliente>)clienteDao.findAll();
	}

}
