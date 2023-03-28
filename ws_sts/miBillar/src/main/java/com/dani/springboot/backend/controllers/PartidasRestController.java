package com.dani.springboot.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dani.springboot.backend.miBillar.models.entity.Partidas;
import com.dani.springboot.backend.miBillar.models.services.IpartidasService;


@CrossOrigin(origins= {"*"})  // Todas las aplicaciones pueden acceder a los servicios web
@RestController
@RequestMapping("/partidas")
public class PartidasRestController {

	@Autowired
	private IpartidasService partidasService;
	
	@GetMapping("")
	public List<Partidas> index(){
		return partidasService.findAll();
	}
	
}
