package com.mx.CrudPeliculas.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PELIS")
public class Peliculas {

	/*
	 * ID NUMBER PRIMARY KEY NOT NULL, NOMBRE NVARCHAR2(100) NOT NULL, ACTOR
	 * NVARCHAR2(100) NOT NULL, DURACION NUMBER, GENERO NVARCHAR2(100) NOT NULL
	 */

	// Mapeo de la tabla
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)", nullable = false)
	String nombre;
	@Column(name = "ACTOR", columnDefinition = "NVARCHAR2(100)", nullable = false)
	String actor;
	@Column(name = "DURACION", columnDefinition = "NUMBER", nullable = true)
	float duracion;
	@Column(name = "GENERO", columnDefinition = "NVARCHAR2(100)", nullable = false)
	String genero;

	public Peliculas() {
	}

	public Peliculas(int id, String nombre, String actor, float duracion, String genero) {
		this.id = id;
		this.nombre = nombre;
		this.actor = actor;
		this.duracion = duracion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", actor=" + actor + ", duracion=" + duracion
				+ ", genero=" + genero + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
