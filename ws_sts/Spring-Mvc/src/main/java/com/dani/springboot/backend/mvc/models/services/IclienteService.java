package com.dani.springboot.backend.mvc.models.services;

import java.util.List;

import com.dani.springboot.backend.mvc.models.entity.Cliente;

public interface IclienteService {

	public List<Cliente> findAll();
}
