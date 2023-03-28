package com.dani.springboot.backend.partidas.controllers;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.dani.springboot.backend.partidas.entity.Partidas;
import com.dani.springboot.backend.partidas.services.IpartidaService;



@CrossOrigin(origins= {"*"})  // Todas las aplicaciones pueden acceder a los servicios web
@RestController
@RequestMapping("/partidas")
public class PartidaRestController {

	@Autowired
	private IpartidaService partidaService;
	
	@GetMapping("")
	public List<Partidas> index(){
		return partidaService.findAll();
	}
	
	@GetMapping("/{id}")  // Muestra un solo evento
	public Partidas show(@PathVariable int id){
		return partidaService.findById(id);
	}
	
	@DeleteMapping("/{id}")  // Borra un evento
	public void delete(@PathVariable int id){
		partidaService.delete(id);
	}
	
	
	@PostMapping("")   // Inserta un evento
	@ResponseStatus(HttpStatus.CREATED)
	public Partidas create(@RequestBody Partidas partida) {
		return partidaService.save(partida);
	}
	
	@PutMapping("/{id}")  // actualiza un cliente
	@ResponseStatus(HttpStatus.CREATED)
	public Partidas update(@RequestBody Partidas evento,@PathVariable int id) {
		Partidas objetoActualizar = partidaService.findById(id);  // Buscamos el elemento a cambiar
		objetoActualizar.setFecha(evento.getFecha());		// cambiamos los datos
		objetoActualizar.setRival(evento.getRival());		// cambiamos los datos
		objetoActualizar.setCarambolas(evento.getCarambolas());
		objetoActualizar.setEntradas(evento.getEntradas());
		objetoActualizar.setSerieMax(evento.getSerieMax());
		objetoActualizar.setResultado(evento.getResultado());
		objetoActualizar.setNumeroMesa(evento.getNumeroMesa());
		return partidaService.save(objetoActualizar); // Guardo la nueva información
	}
}
