package com.fe.bean;

import android.graphics.drawable.Drawable;



/**
 * Clase ItemGrid : 
 * Clase que contiene los elementos de las 
 * imagenes que se mostraran junto con el texto
 * @author : David Garcia 
 * @Date   : 27-07-2014
 */
public class ItemGrid {

	private String text;
	private Drawable image;
	
	
	public ItemGrid()
	{}
	
	
	public ItemGrid(String text, Drawable image) {
		super();
		this.text = text;
		this.image = image;
	}


	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Drawable getImage() {
		return image;
	}
	public void setImage(Drawable image) {
		this.image = image;
	}
	
	
	
	
}
