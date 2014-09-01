package com.fe.model;

public class Universidad {

	private int id_universidad;
	private String nombre_universidad;
	private String descripcion_universidad;
	private String lat_universidad;
	private String long_universidad;
	
	
	public Universidad() 
	{
		
	}
	
	
	
	public Universidad(int id_universidad, String nombre_universidad,
			String descripcion_universidad) {
		super();
		this.id_universidad = id_universidad;
		this.nombre_universidad = nombre_universidad;
		this.descripcion_universidad = descripcion_universidad;
	}

	


	public Universidad(int id_universidad, String nombre_universidad,
			String descripcion_universidad, String lat_universidad,
			String long_universidad) {
		super();
		this.id_universidad = id_universidad;
		this.nombre_universidad = nombre_universidad;
		this.descripcion_universidad = descripcion_universidad;
		this.lat_universidad = lat_universidad;
		this.long_universidad = long_universidad;
	}


	
	

	public int getId_universidad() {
		return id_universidad;
	}



	public void setId_universidad(int id_universidad) {
		this.id_universidad = id_universidad;
	}



	public String getNombre_universidad() {
		return nombre_universidad;
	}



	public void setNombre_universidad(String nombre_universidad) {
		this.nombre_universidad = nombre_universidad;
	}



	public String getDescripcion_universidad() {
		return descripcion_universidad;
	}



	public void setDescripcion_universidad(String descripcion_universidad) {
		this.descripcion_universidad = descripcion_universidad;
	}



	public String getLat_universidad() {
		return lat_universidad;
	}



	public void setLat_universidad(String lat_universidad) {
		this.lat_universidad = lat_universidad;
	}



	public String getLong_universidad() {
		return long_universidad;
	}



	public void setLong_universidad(String long_universidad) {
		this.long_universidad = long_universidad;
	}



	@Override
	public String toString()
	{
		return "id_universidad : "+id_universidad + " universidad : "+nombre_universidad + 
				" descripcion :  "+ descripcion_universidad ;
		
		
		
	}
	
	
}
