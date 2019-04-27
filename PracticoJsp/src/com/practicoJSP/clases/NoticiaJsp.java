package com.practicoJSP.clases;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;


public class NoticiaJsp implements Serializable{

	public NoticiaJsp() {
		// TODO Auto-generated constructor stub
	}
	private String id;
	private String titulo;
	private String descripcion;
	private List<PublicacionJsp> publicaciones;

	
	public NoticiaJsp(String titulo, String descripcion) {
		super();
		
		this.titulo = titulo;
		this.descripcion = descripcion;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<PublicacionJsp> getPublicaciones() {
		return publicaciones;
	}
	public void setPublicaciones(List<PublicacionJsp> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
