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
	public static final String  NOTICIA_TITULO="TITULO";
    public static final String  NOTICIA_ID="ID";
    public static final String  NOTICIA_BAJADA="BAJADA";
    public static final String  NOTICIA_CONTENT="CONTENT";
	
    //TAG INTENT IMAGES
    public static final String IMAGE="IMAGE";
    public static final String IMAGE_POSITION="POSITION";
    
    
   //TAG INTENT COMEDOR 
    public static final String COMEDOR_TITULO="TITULO";
    public static final String COMEDOR_ID="ID";
    
    //TAG INTENT AUTORIDAD 
    public static final String AUTORIDAD_TITULO="TITULO";
    public static final String AUTORIDAD_ID="ID";
    
    //TAG INTENT MAIN ACTIVITY
    public static final String PARAMETER="parameter";
    public static final String TAG_UNIVERSITY_HEADER="OFERTA ACADEMICA";
    public static final String TAG_UNIVERSITY_HEADER_CARRERA="CARRERAS";
    public static final String UNIVERSITY_ID="id";
    public static final String CARRERA_ID="id";
    
	
   //TAG GRADOS 
    public static final int CARRERA_GRADO=1;
    public static final int CARRERA_PREGADO=2;
    
   public static final int FACU_INGENIERIA_ID=1;
   public static final int FACU_ECONOMICA_ID=2;
   public static final int FACU_AGRAGRIA_ID=3;
   public static final int FACU_HUMANIDADES_ID=4;
   public static final int ESC_MINAS=5; 
}
