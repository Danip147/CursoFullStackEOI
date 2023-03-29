package com.dani.springboot.backend.partidas.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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
import org.springframework.http.ResponseEntity;


import com.dani.springboot.backend.partidas.entity.Partidas;
import com.dani.springboot.backend.partidas.services.IpartidaService;



@CrossOrigin(origins= {"*"})  // Todas las aplicaciones pueden acceder a los servicios web
@RestController
@RequestMapping("/partidas")
public class PartidaRestController {

	@Autowired
	private IpartidaService partidaService;
	
//	@GetMapping("")
//	public List<Partidas> index(){
//		return partidaService.findAll();
//	}
	
	@GetMapping("")
	public ResponseEntity<?> index(){
		
		List<Partidas> respuesta = new ArrayList<Partidas>();
		Map<String,Object> response = new HashMap<>();
		
		try {
			respuesta = partidaService.findAll();
		} catch (DataAccessException e) {  // Error al acceder a la base de datos
			response.put("mensaje", "Error al conectar con la base de datos");
			response.put("error", e.getMessage().concat(":")
					.concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Partidas>>(respuesta,HttpStatus.OK);
	}
	
//	@GetMapping("/{id}")  // Muestra una partida
//	public Partidas show(@PathVariable int id){
//		return partidaService.findById(id);
//	}
	
	
	@GetMapping("/{id}")  
	public ResponseEntity<?> show(@PathVariable int id){
		
		Partidas partida = null;
		Map<String,Object> response = new HashMap<>();
		try {
			partida = partidaService.findById(id);
		} catch (DataAccessException e) {  // fallo en la petición a la base de datos
			response.put("mensaje", "Error al conectar con la base de datos");
			response.put("error", e.getMessage().concat(":")
					.concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(partida==null) {  // no existe el id de cliente
			response.put("mensaje", "La partida con ID: ".concat(id+"").concat(" no existe"));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
		// ha encontrado el cliente
		return new ResponseEntity<Partidas>(partida,HttpStatus.OK);		
	}
	
//	@DeleteMapping("/{id}")  // Borra una partida
//	public void delete(@PathVariable int id){
//		partidaService.delete(id);
//	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable int id){
		Map<String,Object> response = new HashMap<>();
		try {
			partidaService.delete(id);
		} catch (DataAccessException e) {  // Error al acceder a la base de datos
			response.put("mensaje", "Error al eliminar el id");
			response.put("error", e.getMessage().concat(":")
					.concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
		response.put("mensaje", "La partida se ha borrado correctamente");
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
	
	
	
//	@PostMapping("")   // Inserta una partida
//	@ResponseStatus(HttpStatus.CREATED)
//	public Partidas create(@RequestBody Partidas partida) {
//		return partidaService.save(partida);
//	}
	
	@PostMapping("")
	public ResponseEntity<?> create(@RequestBody Partidas partida){
		
		Partidas nuevo = null;
		Map<String,Object> response = new HashMap<>();
					
		try {
			nuevo = partidaService.save(partida);
		} catch (DataAccessException e) {  // Error al acceder a la base de datos
			response.put("mensaje", "Error al conectar con la base de datos");
			response.put("error", e.getMessage().concat(":")
					.concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "La partida se ha insertado correctamente");
		response.put("evento", nuevo);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
	}
	
	
	
//	@PutMapping("/{id}")  // actualiza un cliente
//	@ResponseStatus(HttpStatus.CREATED)
//	public Partidas update(@RequestBody Partidas partida,@PathVariable int id) {
//		Partidas objetoActualizar = partidaService.findById(id);  // Buscamos el elemento a cambiar
//		objetoActualizar.setFecha(partida.getFecha());		// cambiamos los datos
//		objetoActualizar.setRival(partida.getRival());		// cambiamos los datos
//		objetoActualizar.setCarambolas(partida.getCarambolas());
//		objetoActualizar.setEntradas(partida.getEntradas());
//		objetoActualizar.setSerieMax(partida.getSerieMax());
//		objetoActualizar.setResultado(partida.getResultado());
//		objetoActualizar.setNumeroMesa(partida.getNumeroMesa());
//		return partidaService.save(objetoActualizar); // Guardo la nueva información
//	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Partidas partida, @PathVariable int id){
		
		Partidas objetoActualizar = null;
		Partidas objetoUpdated = null;
		Map<String,Object> response = new HashMap<>();
			
		try {
			objetoActualizar = partidaService.findById(id); // El cliente puede existir o no
		} catch (DataAccessException e) {  // Error al acceder a la base de datos
			response.put("mensaje", "Error al conectar con la base de datos");
			response.put("error", e.getMessage().concat(":")
					.concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(objetoActualizar==null) { // No existe en la base de datos
			response.put("mensaje", "El evento con ID: ".concat(id+"").concat(" no existe en la base de datos"));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
		// Si llegamos aquí es que el cliente que queremos modificar SI existe
		try {
			objetoActualizar.setFecha(partida.getFecha());		// cambiamos los datos
			objetoActualizar.setRival(partida.getRival());		// cambiamos los datos
			objetoActualizar.setCarambolas(partida.getCarambolas());
			objetoActualizar.setEntradas(partida.getEntradas());
			objetoActualizar.setSerieMax(partida.getSerieMax());
			objetoActualizar.setResultado(partida.getResultado());
			objetoActualizar.setNumeroMesa(partida.getNumeroMesa());
			objetoUpdated = partidaService.save(objetoActualizar);
		} catch (DataAccessException e) {  // Error al acceder a la base de datos
			response.put("mensaje", "Error al conectar con la base de datos");
			response.put("error", e.getMessage().concat(":")
					.concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "La partida se ha modificado correctamente");
		response.put("evento", objetoUpdated);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);

	}
}
