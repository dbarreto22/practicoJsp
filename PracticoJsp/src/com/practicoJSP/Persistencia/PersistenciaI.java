package com.practicoJSP.Persistencia;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.practicoJSP.clases.NoticiaJsp;


@LocalBean
public interface PersistenciaI {
	public List<NoticiaJsp> getNoticias();

	public void setNoticias(List<NoticiaJsp> noticias);

	
	public void crearNoticia(NoticiaJsp n);
	
}
