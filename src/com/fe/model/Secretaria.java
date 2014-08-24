package com.fe.model;

import com.fe.bean.BaseBean;


/**
 * Clase Secretaria Bean
 * @author David Garcia
 * @Dathe  :  7-8-2014
 * 
 *
 */
public class Secretaria  extends BaseBean{

	private String id_secretaria;
	private String titulo_secretaria;
	private String secretario;
	private String descripcion;
	private String direccion;
	private String telefono;
	private String email;
		
	
	
	public String getId_secretaria() {
		return id_secretaria;
	}
	public void setId_secretaria(String id_secretaria) {
		this.id_secretaria = id_secretaria;
	}
	public String getTitulo_secretaria() {
		return titulo_secretaria;
	}
	public void setTitulo_secretaria(String titulo_secretaria) {
		this.titulo_secretaria = titulo_secretaria;
	}
	public String getSecretario() {
		return secretario;
	}
	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Secretaria(String id_secretaria,String titulo_secretaria, String secretario,
			String descripcion, String direccion, String telefono, String email) {
		super();
		this.id_secretaria=id_secretaria;
		this.titulo_secretaria = titulo_secretaria;
		this.secretario = secretario;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	

	
}
