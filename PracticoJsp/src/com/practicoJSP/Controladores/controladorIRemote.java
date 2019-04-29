package com.practicoJSP.Controladores;

import java.util.List;

import javax.ejb.Remote;

import com.practicoJSP.clases.NoticiaJsp;


public interface controladorIRemote {

	
	public void crearNoticia(NoticiaJsp noticia);
	
	public void crearNoticiaRemoto(String id, String titulo, String descripcion);
	
	public List<NoticiaJsp> getNoticias();
}
