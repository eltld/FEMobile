package com.fe.model;

public class Galeria {

	private int id_galeria;
	private String url_image;
	
	
	public Galeria()
	{}
	
	
	public Galeria(int id_galeria, String url_image) {
		super();
		this.id_galeria = id_galeria;
		this.url_image = url_image;
	}


	public int getId_galeria() {
		return id_galeria;
	}
	public void setId_galeria(int id_galeria) {
		this.id_galeria = id_galeria;
	}
	public String getUrl_image() {
		return url_image;
	}
	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}
	
	
	
	
	
}
