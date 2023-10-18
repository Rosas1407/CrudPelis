package com.mx.CrudPeliculas.service;

import java.util.List;

import com.mx.CrudPeliculas.dominio.Peliculas;

public interface PeliculasServ {
	
	public void guardar(Peliculas pelicula);

	public void editar(Peliculas pelicula);

	public void eliminar(Peliculas pelicula);

	public Peliculas buscar(Peliculas pelicula);

	public List<Peliculas> listar();

}
