package com.fe.model;

import java.util.List;

public class Carrera {

    private int id_carrera;
    private String titulo_carrera;
    private String nivel_carrera;
    private String acreditacion_carrera;
    private String perfil_carrera;
    private String alcance_carrera;
    private String duracion_carrera;
    private int id_university;
    private int id_grado;
    
    private List<Materias> listMateria;
    

  
    
    
	public Carrera()
	{}
    
	public int getId_carrera() {
		return id_carrera;
	}
	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public int getId_university() {
		return id_university;
	}

	public void setId_university(int id_university) {
		this.id_university = id_university;
	}

	public String getTitulo_carrera() {
		return titulo_carrera;
	}

	public void setTitulo_carrera(String titulo_carrera) {
		this.titulo_carrera = titulo_carrera;
	}


	public String getDuracion_carrera() {
		return duracion_carrera;
	}

	public void setDuracion_carrera(String duracion_carrera) {
		this.duracion_carrera = duracion_carrera;
	}
	public String getNivel_carrera() {
		return nivel_carrera;
	}
	public void setNivel_carrera(String nivel_carrera) {
		this.nivel_carrera = nivel_carrera;
	}

	public String getAcreditacion_carrera() {
		return acreditacion_carrera;
	}

	public void setAcreditacion_carrera(String acreditacion_carrera) {
		this.acreditacion_carrera = acreditacion_carrera;
	}

	public String getPerfil_carrera() {
		return perfil_carrera;
	}

	public void setPerfil_carrera(String perfil_carrera) {
		this.perfil_carrera = perfil_carrera;
	}

	public String getAlcance_carrera() {
		return alcance_carrera;
	}
	public void setAlcance_carrera(String alcance_carrera) {
		this.alcance_carrera = alcance_carrera;
	}
	
    public int getId_grado() {
		return id_grado;
	}

	public void setId_grado(int id_grado) {
		this.id_grado = id_grado;
	}

	public List<Materias> getListMateria() {
		return listMateria;
	}

	public void setListMateria(List<Materias> listMateria) {
		this.listMateria = listMateria;
	}

	@Override
	public String toString()
	{
		return "id_carrera: "+id_carrera + " titulo : "+titulo_carrera + " nivel :"+nivel_carrera
				+ " acreditacion : "+acreditacion_carrera + " perfil : "+perfil_carrera +
				" alcance : "+alcance_carrera + " duracion : "+duracion_carrera;
		
	}
}
