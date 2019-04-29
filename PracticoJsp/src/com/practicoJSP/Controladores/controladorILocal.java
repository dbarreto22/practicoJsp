package com.practicoJSP.Controladores;

import java.util.List;

import javax.ejb.Local;
import javax.enterprise.inject.Model;

import com.practicoJSP.clases.NoticiaJsp;

@Local
@Model
public interface controladorILocal {
	
	public void crearNoticia(NoticiaJsp noticia);
	
	public List<NoticiaJsp> getNoticias();
	
}
