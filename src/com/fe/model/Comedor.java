package com.fe.model;

/**
 * Clase Comedor
 * @author : David Garcia
 * @Dathe :  13-08-2014
 *
 */

public class Comedor {

	
	private int id_comedor;
	private String nombre_comedor;
	private String descripcion_comedor;
	private String calle_comedor;
	private String barrio_comedor;
	private String responsable_comedor;
	private String lat_comedor;
	private String long_comedor;
	
	
	public Comedor()
	{}
	
	public Comedor(int id_comedor, String nombre_comedor,
			String descripcion_comedor, String lat_comedor, String long_comedor) {
		super();
		this.id_comedor = id_comedor;
		this.nombre_comedor = nombre_comedor;
		this.descripcion_comedor = descripcion_comedor;
		this.lat_comedor = lat_comedor;
		this.long_comedor = long_comedor;
	}
	public int getId_comedor() {
		return id_comedor;
	}
	public void setId_comedor(int id_comedor) {
		this.id_comedor = id_comedor;
	}
	public String getNombre_comedor() {
		return nombre_comedor;
	}
	public void setNombre_comedor(String nombre_comedor) {
		this.nombre_comedor = nombre_comedor;
	}
	public String getDescripcion_comedor() {
		return descripcion_comedor;
	}
	public void setDescripcion_comedor(String descripcion_comedor) {
		this.descripcion_comedor = descripcion_comedor;
	}
	public String getLat_comedor() {
		return lat_comedor;
	}
	public void setLat_comedor(String lat_comedor) {
		this.lat_comedor = lat_comedor;
	}
	public String getLong_comedor() {
		return long_comedor;
	}
	public void setLong_comedor(String long_comedor) {
		this.long_comedor = long_comedor;
	}

	public String getCalle_comedor() {
		return calle_comedor;
	}

	public void setCalle_comedor(String calle_comedor) {
		this.calle_comedor = calle_comedor;
	}

	public String getBarrio_comedor() {
		return barrio_comedor;
	}

	public void setBarrio_comedor(String barrio_comedor) {
		this.barrio_comedor = barrio_comedor;
	}

	public String getResponsable_comedor() {
		return responsable_comedor;
	}

	public void setResponsable_comedor(String responsable_comedor) {
		this.responsable_comedor = responsable_comedor;
	}
	
	
	
}
