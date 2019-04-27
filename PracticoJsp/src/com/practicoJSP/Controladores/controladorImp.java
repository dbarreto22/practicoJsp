package com.practicoJSP.Controladores;

import java.util.List;


import javax.inject.Inject;
import com.practicoJSP.Persistencia.PersistenciaI;
import com.practicoJSP.clases.NoticiaJsp;

public class controladorImp implements controladorILocal , controladorIRemote{

	public controladorImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	PersistenciaI pers;
	
	@Override
	public void crearNoticia(NoticiaJsp noticia) {
		
		pers.crearNoticia(noticia);
		
	}
	@Override
	public List<NoticiaJsp> getNoticias(){
		
		List<NoticiaJsp> noticias = pers.getNoticias();
		
		return noticias;
		
		
	}
}
