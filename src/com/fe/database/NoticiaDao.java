package com.fe.database;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.activity.ActivityNoticia;
import com.fe.model.ConstantDabase;
import com.fe.model.Noticia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

public class NoticiaDao {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(NoticiaDao.class);
	
	private GenericDAO genericDao;
	private Noticia noticia;
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDabase.NOT_ID,
    		            ConstantDabase.NOT_TITULO,
    		            ConstantDabase.NOT_BAJADA,
    		            ConstantDabase.NOT_FECHA,	
    		            ConstantDabase.NOT_URL,
    		            ConstantDabase.NOT_CUERPO};
    
    GenericDAO dao ;
	
	public NoticiaDao(Context ctx)
	{
       
		dao = GenericDAO.getInstance(
				ctx, ConstantDabase.DATABASE_NAME, 
				ConstantDabase.QUERY_CREATE_NOTICIA, 
				ConstantDabase.T_NOTICIA,
				ConstantDabase.DATABASE_VERSION);
		noticia=new Noticia();

		
	}
	
	public void add(Noticia obj)
	{
		if(dao!=null)
		{
			logger.debug("Insert Noticia : "+obj.toString());
			ContentValues values=new ContentValues();
			values.put(ConstantDabase.NOT_ID, obj.getIdNoticia());
			values.put(ConstantDabase.NOT_TITULO, obj.getTituloNoticia());
			values.put(ConstantDabase.NOT_BAJADA, obj.getBajadaNoticia());
			values.put(ConstantDabase.NOT_FECHA,  obj.getDateNoticia());
			values.put(ConstantDabase.NOT_URL,    obj.getUrlImageNoticia());
			values.put(ConstantDabase.NOT_CUERPO, obj.getCuerpoNoticia());
			dao.insert(ConstantDabase.T_NOTICIA, values);
			
		}
	}
	
	public Noticia get(Long id)
	{
		cursor=dao.get(ConstantDabase.T_NOTICIA,this.columns,ConstantDabase.NOT_ID,id);
	
		if(cursor!=null)
		{
	     int not_id =cursor.getColumnIndex(ConstantDabase.NOT_ID);
	     int not_titulo=cursor.getColumnIndex(ConstantDabase.NOT_TITULO);
	     int not_bajada=cursor.getColumnIndex(ConstantDabase.NOT_BAJADA);
	     int not_fecha=cursor.getColumnIndex(ConstantDabase.NOT_FECHA);
	     int not_url=cursor.getColumnIndex(ConstantDabase.NOT_URL);
	     int not_cuerpo=cursor.getColumnIndex(ConstantDabase.NOT_CUERPO);
	     
	     noticia.setTituloNoticia(cursor.getString(not_id));
	     noticia.setTituloNoticia(cursor.getString(not_titulo));
	     noticia.setBajadaNoticia(cursor.getString(not_bajada));
	     noticia.setDateNoticia(cursor.getString(not_fecha));
	     noticia.setUrlImageNoticia(cursor.getString(not_url));
	     noticia.setCuerpoNoticia(cursor.getString(not_cuerpo));
		
	     cursor.close();
	     return noticia;
		}
		return null;
	}
	
	public void del(String id)
	{
		
	}
	
	public ArrayList<Noticia> getAll()
	{
		
		return null;
	}
	
}
