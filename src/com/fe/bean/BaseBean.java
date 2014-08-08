package com.fe.bean;


/**
 * Clase Base 
 * @author David Garcia
 * @Dathe  7-8-2014
 *
 */
public abstract class BaseBean {

	private int id;
    private long latitud;
	private long longitud;
	
	
	
	public BaseBean()
	{}
	
	public BaseBean(int id, long latitud, long longitud) {
		super();
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	
	
	public BaseBean(int id, long telefono, long latitud, long longitud) {
		super();
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getLatitud() {
		return latitud;
	}
	public void setLatitud(long latitud) {
		this.latitud = latitud;
	}
	public long getLongitud() {
		return longitud;
	}
	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}
    
	


}
