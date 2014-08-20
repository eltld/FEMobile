package com.fe.bean;

import android.graphics.drawable.Drawable;

public class Noticia {

	private int idNoticia;
	private String tituloNoticia;
	private String bajadaNoticia;
	private String dateNoticia;
	private String urlImageNoticia;
	private Drawable imageNoticia;
	
	public int getIdNoticia() {
		return idNoticia;
	}
	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}
	public String getTituloNoticia() {
		return tituloNoticia;
	}
	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}
	public String getBajadaNoticia() {
		return bajadaNoticia;
	}
	public void setBajadaNoticia(String bajadaNoticia) {
		this.bajadaNoticia = bajadaNoticia;
	}
	public String getDateNoticia() {
		return dateNoticia;
	}
	public void setDateNoticia(String dateNoticia) {
		this.dateNoticia = dateNoticia;
	}
	public Drawable getImageNoticia() {
		return imageNoticia;
	}
	public void setImageNoticia(Drawable imageNoticia) {
		this.imageNoticia = imageNoticia;
	}
	public String getUrlImageNoticia() {
		return urlImageNoticia;
	}
	public void setUrlImageNoticia(String urlImageNoticia) {
		this.urlImageNoticia = urlImageNoticia;
	}
	

	
}
