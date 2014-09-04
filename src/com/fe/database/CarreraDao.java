package com.fe.database;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.fe.model.Carrera;
import com.fe.model.ConstantDatabase;
import com.fe.model.Noticia;


/**
 * 
 * @author : David Garcia 
 * @Dathe  : 04-08-2014
 *
 */
public class CarreraDao {
	
private static final Logger logger = (Logger) LoggerFactory.getLogger(CarreraDao.class);
	
	private GenericDAO genericDao;
	private Carrera carrera;
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDatabase.CARR_ID,
    		            ConstantDatabase.CARR_TITULO,
    		            ConstantDatabase.CARR_DESCRIPCION,
    		            ConstantDatabase.CARR_DURACION,
    		            ConstantDatabase.UNI_ID
    		            };
    
    GenericDAO dao ;
	
	public CarreraDao(Context ctx)
	{
       
		dao = GenericDAO.getInstance(
				ctx, ConstantDatabase.DATABASE_NAME, 
				ConstantDatabase.QUERY_CREATE_NOTICIA, 
				ConstantDatabase.T_NOTICIA,
				ConstantDatabase.DATABASE_VERSION);
		carrera=new Carrera();

		
	}
	
	public void add(Carrera obj)
	{
		if(dao!=null)
		{
			logger.debug("Insert Carrera : "+obj.toString());
			ContentValues values=new ContentValues();
			values.put(ConstantDatabase.CARR_ID, obj.getId_carrera());
			values.put(ConstantDatabase.CARR_TITULO, obj.getTitulo_carrera());
			values.put(ConstantDatabase.CARR_DESCRIPCION, obj.getDescripcion_carrera());
		    values.put(ConstantDatabase.UNI_ID,obj.getId_university());
			dao.insert(ConstantDatabase.T_CARRERA, values);
			
		}
	}
	
	public Carrera get(Long id)
	{
		cursor=dao.get(ConstantDatabase.T_CARRERA,this.columns,ConstantDatabase.CARR_ID,id);
	
		if(cursor!=null)
		{
	     int carr_id =cursor.getColumnIndex(ConstantDatabase.CARR_ID);
	     int carr_titulo=cursor.getColumnIndex(ConstantDatabase.CARR_TITULO);
	     int carr_descripcion=cursor.getColumnIndex(ConstantDatabase.CARR_DESCRIPCION);
	     int uni_id=cursor.getColumnIndex(ConstantDatabase.UNI_ID);
	    
	     carrera.setId_carrera(Integer.parseInt(cursor.getString(carr_id)));
	     
	    
	     cursor.close();
	     return null;
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
