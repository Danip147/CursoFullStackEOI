package com.dani.springboot.backend.mvc.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/clientes") // Muestra todos los clientes
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}") // Muestra solo un cliente
	public Cliente show(@PathVariable Long id){
		return clienteService.findById(id);
	}
	
	@DeleteMapping("/clientes/{id}") // Elimina a un cliente
	public void delete(@PathVariable Long id){
		 clienteService.delete(id);
	}
	
	@PostMapping("/clientes") // Servicio web que inserta a un cliente
	public Cliente create(@RequestBody Cliente cliente) {
		cliente.setCreateAt(LocalDate.now()); //Le pogno la fecha de creacion de hoy
		return clienteService.save(cliente);
	}
	
	@PutMapping("/clientes/{id}") // Actualiza un cliente 
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteActualizar = clienteService.findById(id); // PRIMERO buscamos el elemento a cambiar
		clienteActualizar.setNombre(cliente.getNombre());	//cambiamos los datos
		clienteActualizar.setApellido(cliente.getApellido());
		clienteActualizar.setEmail(cliente.getEmail());
		return clienteService.save(clienteActualizar); // Guardo la nueva información
		
	}
	
	
}
