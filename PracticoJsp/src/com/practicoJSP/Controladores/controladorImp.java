package com.practicoJSP.Controladores;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.practicoJSP.Persistencia.Persistencia;

import com.practicoJSP.clases.NoticiaJsp;

@Stateless(name="controlador")
@Remote(controladorIRemote.class)
public class controladorImp implements controladorILocal , controladorIRemote{

	public controladorImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	Persistencia pers;
	
	@Override
	public void crearNoticia(NoticiaJsp noticia) {
		
		pers.crearNoticia(noticia);
		
	}
	@Override
	public List<NoticiaJsp> getNoticias(){
		
		List<NoticiaJsp> noticias = pers.getNoticias();
		
		return noticias;
		
		
	}
	
	@Override
	public void crearNoticiaRemoto(String id, String titulo, String descripcion) {
		NoticiaJsp noticia = new NoticiaJsp();
		noticia.setId(id);
		noticia.setTitulo(titulo);
		noticia.setDescripcion(descripcion);
		pers.crearNoticia(noticia);
		
	}
}
