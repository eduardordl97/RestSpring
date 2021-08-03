package com.notas.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Nota")
@Entity
public class Nota {
	
	public Nota() {
		
	}
	
	public Nota(long id, String nombre, String titulo, String contenido) {
		this.id = id;
		this.nombre = nombre;
		this.titulo = titulo;
		this.contenido = contenido;
	}
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Id generado dinamicamente
	@Id //Definimos que este es el id
	@Column(name = "ID_NOTA") //nombre de la columna
	private long id;
	
	@Column(name = "NOMBRE") 
	private String nombre;
	
	@Column(name = "TITULO") 
	private String titulo;
	
	@Column(name = "CONTENIDO") 
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
