package com.fe.database.helper;

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
   public static final String T_CARRERA="carreras";
   public static final String CARR_ID="carr_id";
   public static final String CARR_TITULO="carr_titulo";
   public static final String CARR_NIVEL="carr_nivel";
   public static final String CARR_ACREDITACION="carr_acreditacion";
   public static final String CARR_PERFIL="carr_perfil";
   public static final String CARR_ALCANCE="carr_alcance";
   public static final String CARR_DURACION="carr_duracion";
   public static final String CARR_GRADO="carr_grado";
   
   
	public static final String QUERY_CREATE_CARRERA=
			"CREATE TABLE carreras("+
	        "carr_id integer ,"+
			"carr_titulo text,"+
	        "carr_nivel text,"+
			"carr_acreditacion text,"+
	        "carr_perfil text,"+
			"carr_alcance text,"+
	        "carr_duracion text,"+
			"carr_grado text,"+
	        "uni_id text)";
	public static final String QUERY_DROP_CARRERA=
			"DROP TABLE IF EXISTS "+T_CARRERA;
   
	
	 //TABLE COMEDOR
	public static final String T_COMEDOR="comedor";
	public static final String COM_ID="com_id";
	public static final String COM_NOMBRE="com_nombre";
	public static final String COM_DIRECCION="com_direccion";

	
	public static final String QUERY_CREATE_COMEDOR=
			"CREATE TABLE  "+T_COMEDOR+"("+
	        COM_ID +" integer ,"+
		 	COM_NOMBRE+" text,"+
	        COM_DIRECCION+ " text)";
	public static final String QUERY_DROP_COMEDOR="DROP TABLE IF EXISTS "+T_COMEDOR;
	
	
}
