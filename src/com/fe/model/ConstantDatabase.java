package com.fe.model;

import android.database.sqlite.SQLiteDatabase.CursorFactory;


public final class ConstantDatabase {

	//DATABASE
	public static final int DATABASE_VERSION=1;
	public static final String DATABASE_NAME="UnjuDb";
	public static final CursorFactory dbDefaultCursorFactory = null;

	
	//TABLE NOTICIA
	public static final String T_NOTICIA="noticias";
	public static final String NOT_ID="not_id";
	public static final String NOT_TITULO="not_titulo";
	public static final String NOT_BAJADA="not_bajada";
	public static final String NOT_FECHA="not_fecha";
	public static final String NOT_URL="not_url";
	public static final String NOT_CUERPO="not_cuerpo";
	
	public static final String QUERY_CREATE_NOTICIA=
			"CREATE TABLE noticias("+
	        "not_id integer ,"+
			"not_titulo text,"+
	        "not_bajada text,"+
			"not_fecha text,"+
			"not_url text,"+
	        "not_cuerpo text)";
	public static final String QUERY_DROP_NOTICIA="DROP TABLE IF EXISTS "+T_NOTICIA;
	        

  //TABLE UNIVERSITY 
	public static final String T_UNIVERSITY="university";
	public static final String UNI_ID="uni_id";
	public static final String UNI_TITULO="uni_titulo";
	public static final String UNI_DESCRIPCION="uni_descripcion";
	
	
	
	
  //TABLE CARRERA  
   public static final String T_CARRERA="carrera";
   public static final String CARR_ID="carr_id";
   public static final String CARR_TITULO="carr_titulo";
   public static final String CARR_DESCRIPCION="carr_descripcion";
   public static final String CARR_DURACION="carr_duracion";
   
	public static final String QUERY_CREATE_CARRERA=
			"CREATE TABLE carrera("+
	        "carr_id integer ,"+
			"carr_titulo text,"+
	        "carr_descripcion text,"+
			"carr_duracion text,"+
	        "uni_id text)";
	public static final String QUERY_DROP_CARRERA=
			"DROP TABLE IF EXISTS "+T_CARRERA;
   
	
}
