package com.fe.model;

import android.database.sqlite.SQLiteDatabase.CursorFactory;


public final class ConstantDabase {

	//DATABASE
	public static final int DATABASE_VERSION=1;
	public static final String DATABASE_NAME="UnjuDb";
	public static final CursorFactory dbDefaultCursorFactory = null;

	
	//TABLE 
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
	public static final String QUERY_DROP_NOTICIA=
			"DROP TABLE IF EXISTS "+T_NOTICIA;
	        
			
	
}
