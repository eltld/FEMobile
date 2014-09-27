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
	
	
	
	//TABLE UNIVERSITY
	public static final String T_UNIVERSIDAD="universidad";
	public static final String UNI_ID="uni_id";
	public static final String UNI_NOMBRE="uni_nombre";
	public static final String UNI_DIRECCION="uni_direccion";
	public static final String UNI_CODIGO_POSTAL="uni_codigo";
	public static final String UNI_TELEFONO="uni_telefono";
	public static final String UNI_FAX="uni_fax";
	public static final String UNI_EMAIL="uni_email";
	public static final String UNI_WEB="uni_web";
    public static final String UNI_INS="uni_ins"; //INSRIPCION
    public static final String UNI_PRE="uni_pre"; //PREINSCRIPCION
    public static final String UNI_INF="uni_inf"; //INFORME
    public static final String UNI_REQ="uni_req"; //REQUISITOS
	
	

	public static final String QUERY_CREATE_UNIVERSITY=
			"CREATE TABLE "+T_UNIVERSIDAD+"("+
	         UNI_ID +" integer ,"+
		     UNI_NOMBRE +" text,"+
	         UNI_DIRECCION +" text,"+
			 UNI_CODIGO_POSTAL+" text,"+
	         UNI_TELEFONO+" text,"+
			 UNI_FAX+ " text,"+
	         UNI_EMAIL+" text,"+
			 UNI_WEB+" text ,"+
	         UNI_INS+" text , "+
			 UNI_PRE+ " text,"+
	         UNI_INF+ " text,"+
			 UNI_REQ+" text)";
	public static final String QUERY_DROP_UNIVERSITY=
			"DROP TABLE IF EXISTS "+T_UNIVERSIDAD;
   
	
	//TABLE AUTORIDAD
	public static final String T_AUTORIDAD="autoridad";
	public static final String AUTO_ID="aut_id";
	public static final String AUTO_NOMBRE="aut_nombre";
	public static final String AUTO_TITULO="aut_titulo";
	public static final String AUTO_EMAIL="aut_email";
	public static final String AUTO_TELEFONO="aut_telefono";
	public static final String AUTO_IMAGE_URL="aut_image";
	
	

	public static final String QUERY_CREATE_AUTORIDAD="CREATE TABLE "+T_AUTORIDAD+"("+
	         AUTO_ID +" integer ,"+
		     AUTO_NOMBRE +" text,"+
	         AUTO_TITULO +" text,"+
			 AUTO_EMAIL+" text,"+
	         AUTO_TELEFONO+" text,"+
			 AUTO_IMAGE_URL+" text)";
	public static final String QUERY_DROP_AUTORIDAD=
			"DROP TABLE IF EXISTS "+T_AUTORIDAD;
	
	
	//TABLE EVENTO
		public static final String T_EVENTO="evento";
		public static final String EVENTO_ID="eve_id";
		public static final String EVENTO_TITULO="eve_titulo";
		public static final String EVENTO_FECHA="eve_fecha";
		public static final String EVENTO_HORA="eve_hora";
		public static final String EVENTO_CUERPO="eve_cuerpo";
		public static final String EVENTO_URL_WEB="eve_url_web";
		
		

		public static final String QUERY_CREATE_EVENTO="CREATE TABLE "+T_EVENTO+"("+
		         EVENTO_ID +" integer ,"+
			     EVENTO_TITULO+" text,"+
		         EVENTO_FECHA +" text,"+
				 EVENTO_HORA+" text,"+
		         EVENTO_CUERPO+" text,"+
				 EVENTO_URL_WEB+" text)";
		public static final String QUERY_DROP_EVENTO=
				"DROP TABLE IF EXISTS "+T_EVENTO;
	
	
	
}
