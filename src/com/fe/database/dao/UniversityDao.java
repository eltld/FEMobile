package com.fe.database.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.fe.database.helper.ConstantDatabase;
import com.fe.model.Carrera;
import com.fe.model.Noticia;
import com.fe.model.Universidad;

public class UniversityDao {

private static final Logger logger = (Logger) LoggerFactory.getLogger(UniversityDao.class);
	
	private Universidad universidad;
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDatabase.UNI_ID,
    		            ConstantDatabase.UNI_NOMBRE,
    		            ConstantDatabase.UNI_DIRECCION,
    		            ConstantDatabase.UNI_CODIGO_POSTAL,
    		            ConstantDatabase.UNI_TELEFONO,
    		            ConstantDatabase.UNI_FAX,
    		            ConstantDatabase.UNI_EMAIL,
    		            ConstantDatabase.UNI_WEB
    };
    
    GenericDAO dao ;
	
	public UniversityDao(Context ctx)
	{
       System.out.println("query_create_universidad : "+ConstantDatabase.QUERY_CREATE_UNIVERSITY);
		dao = GenericDAO.getInstance(
				ctx, ConstantDatabase.DATABASE_NAME, 
				ConstantDatabase.QUERY_CREATE_UNIVERSITY, 
				ConstantDatabase.T_UNIVERSIDAD,
				ConstantDatabase.DATABASE_VERSION);
		universidad=new Universidad();

		
	}
	
	public void add(Universidad obj)
	{
		if(dao!=null)
		{
			logger.debug("Insert Universidad : "+obj.toString());
			ContentValues values=new ContentValues();
			values.put(ConstantDatabase.UNI_ID, obj.getId_universidad());
			values.put(ConstantDatabase.UNI_NOMBRE, obj.getNombre_universidad());
			values.put(ConstantDatabase.UNI_DIRECCION,obj.getDireccion());
			values.put(ConstantDatabase.UNI_CODIGO_POSTAL,obj.getCodigoPostal());
			values.put(ConstantDatabase.UNI_TELEFONO,obj.getTelefono());
			values.put(ConstantDatabase.UNI_FAX,obj.getFax());
			values.put(ConstantDatabase.UNI_EMAIL, obj.getEmail());
			values.put(ConstantDatabase.UNI_WEB, obj.getWeb());
			dao.insert(ConstantDatabase.T_UNIVERSIDAD, values);
			
			
		}
	}
	
	public Universidad get(Long id)
	{
		cursor=dao.get(ConstantDatabase.T_UNIVERSIDAD,this.columns,ConstantDatabase.UNI_ID,id);
		
	
		if(cursor!=null)
		{
	     int uni_id =cursor.getColumnIndex(ConstantDatabase.UNI_ID);
	     int uni_nombre=cursor.getColumnIndex(ConstantDatabase.UNI_NOMBRE);
	     int uni_direccion=cursor.getColumnIndex(ConstantDatabase.UNI_DIRECCION);
	     int uni_codigo=cursor.getColumnIndex(ConstantDatabase.UNI_CODIGO_POSTAL);
	     int uni_telefono=cursor.getColumnIndex(ConstantDatabase.UNI_TELEFONO);
	     int uni_fax=cursor.getColumnIndex(ConstantDatabase.UNI_FAX);
	     int uni_email=cursor.getColumnIndex(ConstantDatabase.UNI_EMAIL);
	     int uni_web=cursor.getColumnIndex(ConstantDatabase.UNI_WEB);  
	     
	    
	     universidad.setId_universidad(Integer.parseInt(cursor.getString(uni_id)));
	     universidad.setNombre_universidad(cursor.getString(uni_nombre));
	     universidad.setDireccion(cursor.getString(uni_direccion));
	     universidad.setCodigoPostal(cursor.getString(uni_codigo));
	     universidad.setTelefono(cursor.getString(uni_telefono));
	     universidad.setFax(cursor.getString(uni_fax));
	     universidad.setEmail(cursor.getString(uni_email));
	     universidad.setWeb(cursor.getString(uni_web));
	     cursor.close();
	     return universidad;
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
