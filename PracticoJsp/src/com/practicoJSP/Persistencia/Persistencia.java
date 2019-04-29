package com.practicoJSP.Persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.enterprise.inject.Model;

import com.practicoJSP.clases.NoticiaJsp;


/**
 * Session Bean implementation class controlador
 */

@Singleton
public class Persistencia{

    /**
     * Default constructor. 
     */

   
    
    private List<NoticiaJsp> noticias = new ArrayList<>();
    
    //@Override
	public List<NoticiaJsp> getNoticias() {
		return noticias;
	}
   // @Override
	public void setNoticias(List<NoticiaJsp> noticias) {
		this.noticias = noticias;
	}

    //@Override
	public void crearNoticia(NoticiaJsp n) {
	
		this.noticias.add(n);
	}
	
	
    
    

}
