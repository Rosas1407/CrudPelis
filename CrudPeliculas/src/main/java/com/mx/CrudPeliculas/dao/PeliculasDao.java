package com.mx.CrudPeliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudPeliculas.dominio.Peliculas;

public interface PeliculasDao extends CrudRepository<Peliculas, Integer>{
	

	
}
