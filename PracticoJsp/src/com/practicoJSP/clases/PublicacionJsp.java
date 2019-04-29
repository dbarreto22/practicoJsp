package com.practicoJSP.clases;



public class PublicacionJsp  {

	public PublicacionJsp() {
		// TODO Auto-generated constructor stub
	}

private String id;
private String tipo;
private String url;



public PublicacionJsp(String id,String tipo, String url ) {
	super();
	this.id = id;
	this.tipo = tipo;
	this.url = url;

}





public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}


public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}


}
