package com.dani.springboot.backend.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dani.springboot.backend.mvc.models.entity.Cliente;
import com.dani.springboot.backend.mvc.models.services.IclienteService;

@CrossOrigin(origins= {"*"}) // TODAS LAS APLICACIONES PUEDEN ACCEDER A LOS SERVICIOS !!IMPORTANTE!!
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IclienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
}
