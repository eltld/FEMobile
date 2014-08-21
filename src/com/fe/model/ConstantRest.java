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
	private final static String URL_NOTICIAS="http://10.2.2.245/WebRest/noticias.php";
    private final static String URL_IMAGES="http://localhost:8080/Noticias/Image";
	
    
    public static String getUrlImages() {
		return URL_IMAGES;
	}


	public static String getUrlNoticias() {
		return URL_NOTICIAS;
	}
    
    
    
    
}
