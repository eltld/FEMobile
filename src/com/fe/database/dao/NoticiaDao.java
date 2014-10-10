package com.fe.database.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.activity.ActivityNoticia;
import com.fe.database.helper.ConstantDatabase;
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
    		            ConstantDatabase.NOT_ID,
    		            ConstantDatabase.NOT_TITULO,
    		            ConstantDatabase.NOT_BAJADA,
    		            ConstantDatabase.NOT_FECHA,	
    		            ConstantDatabase.NOT_URL,
    		            ConstantDatabase.NOT_CUERPO};
    
    GenericDAO dao ;
	
	public NoticiaDao(Context ctx)
	{
       
		dao = GenericDAO.getInstance(
				ctx, ConstantDatabase.DATABASE_NAME, 
				ConstantDatabase.QUERY_CREATE_NOTICIA, 
				ConstantDatabase.T_NOTICIA,
				ConstantDatabase.DATABASE_VERSION);
		noticia=new Noticia();

		
	}
	
	public void add(Noticia obj)
	{
		if(dao!=null)
		{
		   //verifico si la noticia existe 
			logger.debug("Id Noticia : "+obj.getIdNoticia());
			cursor=dao.get(ConstantDatabase.T_NOTICIA,this.columns,ConstantDatabase.NOT_ID,Long.parseLong(obj.getIdNoticia()));
			
			if(cursor!=null)
			{
			   logger.debug("existe la noticia");
			   dao.delete(ConstantDatabase.T_NOTICIA,ConstantDatabase.NOT_ID, Long.parseLong(obj.getIdNoticia()));
			   cursor.close();
			}	
				
			
			logger.debug("Insert Noticia : "+obj.toString());
			ContentValues values=new ContentValues();
			values.put(ConstantDatabase.NOT_ID, obj.getIdNoticia());
			values.put(ConstantDatabase.NOT_TITULO, obj.getTituloNoticia());
			values.put(ConstantDatabase.NOT_BAJADA, obj.getBajadaNoticia());
			values.put(ConstantDatabase.NOT_FECHA,  obj.getDateNoticia());
			values.put(ConstantDatabase.NOT_URL,    obj.getUrlImageNoticia());
			values.put(ConstantDatabase.NOT_CUERPO, obj.getCuerpoNoticia());
			dao.insert(ConstantDatabase.T_NOTICIA, values);
			
		}
	}
	
	public Noticia get(Long id)
	{
		cursor=dao.get(ConstantDatabase.T_NOTICIA,this.columns,ConstantDatabase.NOT_ID,id);
	
		if(cursor!=null)
		{
	     int not_id =cursor.getColumnIndex(ConstantDatabase.NOT_ID);
	     int not_titulo=cursor.getColumnIndex(ConstantDatabase.NOT_TITULO);
	     int not_bajada=cursor.getColumnIndex(ConstantDatabase.NOT_BAJADA);
	     int not_fecha=cursor.getColumnIndex(ConstantDatabase.NOT_FECHA);
	     int not_url=cursor.getColumnIndex(ConstantDatabase.NOT_URL);
	     int not_cuerpo=cursor.getColumnIndex(ConstantDatabase.NOT_CUERPO);
	     
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
