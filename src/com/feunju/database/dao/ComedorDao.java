package com.feunju.database.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.feunju.database.helper.ComedorDbHelper;
import com.feunju.database.helper.ConstantDatabase;
import com.feunju.model.Carrera;
import com.feunju.model.Comedor;
import com.feunju.model.Noticia;

public class ComedorDao {


	private static final Logger logger = (Logger) LoggerFactory.getLogger(ComedorDao.class);
	
	  
	
	
	private GenericDAO genericDao;
	private Comedor comedor;
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDatabase.COM_ID,
    		            ConstantDatabase.COM_NOMBRE,
    		            ConstantDatabase.COM_RESPONSABLE,
    		            ConstantDatabase.COM_CALLE,
    		            ConstantDatabase.COM_BARRIO};
    
 
	
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
			values.put(ConstantDatabase.COM_RESPONSABLE, obj.getResponsable_comedor());
			values.put(ConstantDatabase.COM_CALLE, obj.getCalle_comedor());
			values.put(ConstantDatabase.COM_BARRIO, obj.getBarrio_comedor());
			
			dao.insert(ConstantDatabase.T_COMEDOR, values);
			
		}
	}
	
	
	
	public void del(String id)
	{
		
	}
	
	public ArrayList<Comedor> getAll()
	{
		
		return null;
	}


	public Comedor get(Long id) {
		
	 cursor=dao.get(ConstantDatabase.T_COMEDOR,this.columns);
			
	 
			
		if (cursor != null) {
			System.out.println("Cursor != null Comedor");
			int com_id = cursor.getColumnIndex(ConstantDatabase.COM_ID);
			int com_nombre = cursor.getColumnIndex(ConstantDatabase.COM_NOMBRE);
			int com_responsable = cursor.getColumnIndex(ConstantDatabase.COM_RESPONSABLE);
			
			int com_calle = cursor.getColumnIndex(ConstantDatabase.COM_CALLE);
			int com_barrio = cursor.getColumnIndex(ConstantDatabase.COM_BARRIO);
			

			logger.debug("com_id : "+com_id + " com_nombre :"+com_nombre + " com_responsable : "+com_responsable + 
					    " com_calle  : "+com_calle + " com_barrio : "+com_barrio);
			
			comedor = new Comedor();

			
			//comedor.setId_comedor(Integer.parseInt(cursor.getString(com_id)));
			comedor.setNombre_comedor(cursor.getColumnName(com_nombre));
		 	//comedor.setResponsable_comedor(cursor.getString(com_responsable));
			comedor.setCalle_comedor(cursor.getString(com_calle));
			comedor.setBarrio_comedor(cursor.getString(com_barrio));
			cursor.close();
		
			return comedor;
		}
		return null;

	}	
	
	
	
	
}
