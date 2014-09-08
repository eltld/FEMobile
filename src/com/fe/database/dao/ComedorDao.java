package com.fe.database.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.fe.database.helper.ComedorDbHelper;
import com.fe.database.helper.ConstantDatabase;
import com.fe.model.Carrera;
import com.fe.model.Comedor;
import com.fe.model.Noticia;

public class ComedorDao {


	private static final Logger logger = (Logger) LoggerFactory.getLogger(ComedorDao.class);
	
	  
	
	
	private GenericDAO genericDao;
	private Comedor comedor;
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDatabase.COM_ID,
    		            ConstantDatabase.COM_NOMBRE,
    		            ConstantDatabase.COM_DIRECCION};
    
 
	
    ComedorDbHelper dao;
	public ComedorDao(Context ctx)
	{
		
        dao=new ComedorDbHelper(ctx);
		comedor=new Comedor();

		
	}
	
	
	public void add(Comedor obj)
	{
		System.out.println("Comedor dao add obj");
		if(dao!=null)
		{
			logger.debug("Insert Noticia : "+obj.toString());
			ContentValues values=new ContentValues();
			values.put(ConstantDatabase.COM_ID, obj.getId_comedor());
			values.put(ConstantDatabase.COM_NOMBRE, obj.getNombre_comedor());
			values.put(ConstantDatabase.COM_DIRECCION, obj.getDescripcion_comedor());
			dao.insert(ConstantDatabase.T_COMEDOR, values);
			
		}
	}
	
	
	
	public void del(String id)
	{
		
	}
	
	public ArrayList<Noticia> getAll()
	{
		
		return null;
	}


	public Carrera get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
