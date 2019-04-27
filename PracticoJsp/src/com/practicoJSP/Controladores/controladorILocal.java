package com.practicoJSP.Controladores;

import java.util.List;

import javax.ejb.Local;

import com.practicoJSP.clases.NoticiaJsp;

@Local
public interface controladorILocal {
	
	public void crearNoticia(NoticiaJsp noticia);
	
	public List<NoticiaJsp> getNoticias();
	
}
