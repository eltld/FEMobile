package com.fe.model;

public class Universidad {

	private int id_universidad;
	private String nombre_universidad;
	private String descripcion_universidad;
	private String lat_universidad;
	private String long_universidad;
    private String direccion;
    private String codigoPostal;
    private String telefono;
    private String fax;
    private String email;
    private String web;
   
    
	
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	

	@Override
	public String toString()
	{
		return "id_universidad : "+id_universidad + " universidad : "+nombre_universidad + 
			   " direccion : "+direccion + " codigo : "+codigoPostal+
			   " telefono : "+telefono + " fax : "+fax+
			   " email : "+email+ " web : "+web;
		
		
		
	}
	
	
}
