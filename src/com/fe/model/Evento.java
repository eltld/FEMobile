package com.fe.model;

public class Evento {

 private String idEvento;
 private String tituloEvento;
 private String bajadaEvento;
 private String fechaEvento;
 private String horarioEvento;
 private String cuerpoEvento;
 private String urlWebEvento;
 
 
 public Evento()
 {}
 
public String getIdEvento() {
	return idEvento;
}
public void setIdEvento(String idEvento) {
	this.idEvento = idEvento;
}
public String getTituloEvento() {
	return tituloEvento;
}
public void setTituloEvento(String tituloEvento) {
	this.tituloEvento = tituloEvento;
}
public String getFechaEvento() {
	return fechaEvento;
}
public void setFechaEvento(String fechaEvento) {
	this.fechaEvento = fechaEvento;
}
public String getHorarioEvento() {
	return horarioEvento;
}
public void setHorarioEvento(String horarioEvento) {
	this.horarioEvento = horarioEvento;
}
public String getCuerpoEvento() {
	return cuerpoEvento;
}
public void setCuerpoEvento(String cuerpoEvento) {
	this.cuerpoEvento = cuerpoEvento;
}
public String getUrlWebEvento() {
	return urlWebEvento;
}
public void setUrlWebEvento(String urlWebEvento) {
	this.urlWebEvento = urlWebEvento;
}
 
 
 public String getBajadaEvento() {
	return bajadaEvento;
}

public void setBajadaEvento(String bajadaEvento) {
	this.bajadaEvento = bajadaEvento;
}

@Override
 public String toString()
 {
	 return "idEvento : "+idEvento + " titulo: "+tituloEvento + " bajadas : " +bajadaEvento+ " fecha: "+fechaEvento 
			 + " horario : "+horarioEvento + " cuerpo : "+cuerpoEvento + " urlWeb : "+urlWebEvento;
	 
	 
 }
 
 


}
