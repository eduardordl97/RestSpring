package com.notas.core.model;

import com.notas.core.entity.Nota;

public class MNota {
	
	public MNota(Nota nota) {
		this.id = nota.getId();
		this.nombre = nota.getNombre();
		this.titulo = nota.getTitulo();
		this.contenido = nota.getContenido();
	}

	public MNota(long id, String nombre, String titulo, String contenido) {
		this.id = id;
		this.nombre = nombre;
		this.titulo = titulo;
		this.contenido = contenido;
	}

	private long id;
	
	private String nombre;
	
	private String titulo;
	
	private String contenido;

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	

	
}
