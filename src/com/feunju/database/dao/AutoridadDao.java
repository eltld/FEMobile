package com.feunju.database.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.feunju.database.helper.ConstantDatabase;
import com.feunju.model.Autoridad;
import com.feunju.model.Carrera;
import com.feunju.model.Noticia;

public class AutoridadDao {
	
private static final Logger logger = (Logger) LoggerFactory.getLogger(AutoridadDao.class);
	
	private Autoridad autoridad;
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDatabase.AUTO_ID,
    		            ConstantDatabase.AUTO_TITULO,
    		            ConstantDatabase.AUTO_NOMBRE,
    		            ConstantDatabase.AUTO_EMAIL,
    		            ConstantDatabase.AUTO_TELEFONO,
    		            ConstantDatabase.AUTO_IMAGE_URL
    		            };
    
    GenericDAO dao ;
	
	public AutoridadDao(Context ctx)
	{
       System.out.println("query_create_carrear : "+ConstantDatabase.QUERY_CREATE_AUTORIDAD);
		dao = GenericDAO.getInstance(
				ctx, ConstantDatabase.DATABASE_NAME, 
				ConstantDatabase.QUERY_CREATE_AUTORIDAD, 
				ConstantDatabase.T_AUTORIDAD,
				ConstantDatabase.DATABASE_VERSION);
		autoridad=new Autoridad();

		
	}
	
	public void add(Autoridad obj)
	{
		if(dao!=null)
		{
			logger.debug("Insert Autoridad : "+obj.toString() 
					+ " url : "+obj.getImageUrlAutoridad());
			ContentValues values=new ContentValues();
			values.put(ConstantDatabase.AUTO_ID, obj.getIdAutoridad());
			values.put(ConstantDatabase.AUTO_TITULO, obj.getTituloAutoridad());
			values.put(ConstantDatabase.AUTO_NOMBRE,obj.getNombreAutoridad());
			values.put(ConstantDatabase.AUTO_EMAIL,obj.getEmailAutoridad());
			values.put(ConstantDatabase.AUTO_TELEFONO,obj.getTelefonoAutoridad());
			values.put(ConstantDatabase.AUTO_IMAGE_URL,obj.getImageUrlAutoridad());
			dao.insert(ConstantDatabase.T_AUTORIDAD, values);
			
			
		}
	}
	
	public Autoridad get(Long id)
	{
		cursor=dao.get(ConstantDatabase.T_AUTORIDAD,this.columns,ConstantDatabase.AUTO_ID,id);
		
	
		if(cursor!=null)
		{
	     int auto_id =cursor.getColumnIndex(ConstantDatabase.AUTO_ID);
	     int auto_titulo=cursor.getColumnIndex(ConstantDatabase.AUTO_TITULO);
	     int auto_nombre=cursor.getColumnIndex(ConstantDatabase.AUTO_NOMBRE);
	     int auto_email=cursor.getColumnIndex(ConstantDatabase.AUTO_EMAIL);
	     int auto_telefono=cursor.getColumnIndex(ConstantDatabase.AUTO_TELEFONO);
	     int auto_image_url=cursor.getColumnIndex(ConstantDatabase.AUTO_IMAGE_URL);
	     
	    
	     autoridad.setIdAutoridad(cursor.getString(auto_id));
	     autoridad.setTituloAutoridad(cursor.getString(auto_titulo));
	     autoridad.setNombreAutoridad(cursor.getString(auto_nombre));
	     autoridad.setEmailAutoridad(cursor.getString(auto_email));
	     autoridad.setTelefonoAutoridad(cursor.getString(auto_telefono));
	     autoridad.setImageUrlAutoridad(cursor.getString(auto_image_url));
	     cursor.close();
	     return autoridad;
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
