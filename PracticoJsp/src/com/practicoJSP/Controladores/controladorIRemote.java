package com.practicoJSP.Controladores;

import java.util.List;

import javax.ejb.Remote;

import com.practicoJSP.clases.NoticiaJsp;

@Remote
public interface controladorIRemote {

	
	public void crearNoticia(NoticiaJsp noticia);
	
	public List<NoticiaJsp> getNoticias();
}
