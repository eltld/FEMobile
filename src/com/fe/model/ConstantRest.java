package com.fe.model;


/**
 * Clase que contiene las constantes
 * de los servicios Rest
 * @author : David Garcia
 * @Dathe :  13-08-2014
 *
 */
public abstract  class ConstantRest {

	
	//private final static String URL_NOTICIAS="http://10.2.2.245/WebRest/noticias.json.txt";
	//public final static String URL_NOTICIAS="http://10.2.2.245/projects/www/noticias.php";
    //public final static String URL_IMAGES="http://10.2.2.245/WebRest//fotos.php";
    //ip 170.210.240.251 - 10.2.0.66
	public final static String URL_BASE="http://170.210.240.251/php/";
	public final static String URL_BASE_NOTICIAS="http://170.210.240.251/noticias/imgnotis/";
	
	public final static String URL_NOTICIAS=URL_BASE+"noticias.php";
    public final static String URL_AUTORIDADES=URL_BASE+"autoridad.php";
	public final static String URL_IMAGES=URL_BASE+"fotos.php";
	public final static String URL_EVENTO=URL_BASE+"evento.php";
	public final static String URL_CONTACTO=URL_BASE+"contacto.php";
	//IMAGES
	 public final static String URL_IMAGE_UNJU="http://manuonda.netau.net/unju.jpg";

	 //Connection 
	 public final static String CONNECTION_ERROR="Verifique conexion de Internet";
		
}
