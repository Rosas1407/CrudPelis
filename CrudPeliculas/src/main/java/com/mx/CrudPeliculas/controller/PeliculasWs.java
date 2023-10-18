package com.mx.CrudPeliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudPeliculas.dominio.Peliculas;
import com.mx.CrudPeliculas.service.PeliculasSerImp;

@RestController
@RequestMapping("/")
@CrossOrigin
public class PeliculasWs {

	@Autowired
	PeliculasSerImp peliculasSerImp;

	// http://localhost:9002/listar
	@GetMapping("listar")
	public List<Peliculas> listar() {
		return peliculasSerImp.listar();
	}

	// http://localhost:9002/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Peliculas pelicula) {
		peliculasSerImp.guardar(pelicula);
	}

	// http://localhost:9002/editar
	@PostMapping("editar")
	public void editar(@RequestBody Peliculas pelicula) {
		peliculasSerImp.editar(pelicula);
	}
	
	// http://localhost:9002/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Peliculas pelicula) {
		peliculasSerImp.eliminar(pelicula);
	}
	
	// http://localhost:9002/buscar
	@PostMapping("buscar")
	public Peliculas buscar(@RequestBody Peliculas pelicula) {
		return peliculasSerImp.buscar(pelicula);
	}
	
	
}
