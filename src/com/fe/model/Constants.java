package com.fe.model;

public final class Constants {
    
	
	//SERVICES REST
	private static final String URL_CONNECTION="http://localhost:3000/";
	private static final String  SERVICE_NEWS="/noticias";
	private static final String  METHOD_GET="GET";
	private static final String  METHOD_POST="POST";
	private static final String  METHOD_PUT="PUT";
	
	
	//DATABASE
	private static final String DATABASE_NAME="fe";
	private static final String APP_NAME="APPFE";
	private static final String FILE_NAME="db_fe";
	private static final String TABLE_NEWS="TB_NEWS";
	
	
	//TAG INTENT NOTICIAS
	public static final String  PUT_TITULO="TITULO";
    public static final String  PUT_ID="ID";
	
    
    
    
    public static String getPutTitulo() {
		return PUT_TITULO;
	}
	public static String getPutId() {
		return PUT_ID;
	}
    
    
    
	//HEADER XML 
	
	
    
    
	
}
