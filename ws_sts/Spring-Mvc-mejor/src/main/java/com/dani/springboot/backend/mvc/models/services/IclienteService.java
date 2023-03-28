package com.dani.springboot.backend.mvc.models.services;

import java.util.List;

import com.dani.springboot.backend.mvc.models.entity.Cliente;

public interface IclienteService {

	public List<Cliente> findAll();	// GET mostrar todos los clientes
	public Cliente findById(Long id);	//  GET mostrar 1 cliente
	public void delete(Long id);	//  DELETE eliminar 1 cliente
	public Cliente save(Cliente cliente);	// agrega un cliente VALE PARA: POST(inseccion) y PUT (actualizacion)
}
