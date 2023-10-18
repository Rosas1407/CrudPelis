package com.mx.CrudPeliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudPeliculas.dao.PeliculasDao;
import com.mx.CrudPeliculas.dominio.Peliculas;

@Service
public class PeliculasSerImp implements PeliculasServ{
	
	//Inyeccion de dependencias
	@Autowired
	PeliculasDao peliculasDao;

	@Transactional
	@Override
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		peliculasDao.save(pelicula);
	}
	
	@Transactional
	@Override
	public void editar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		peliculasDao.save(pelicula);
	}

	@Transactional
	@Override
	public void eliminar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		peliculasDao.delete(pelicula);
	}

	@Transactional(readOnly = true)
	@Override
	public Peliculas buscar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		return peliculasDao.findById(pelicula.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return (List<Peliculas>) peliculasDao.findAll();
	}

}
