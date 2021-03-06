package com.feunju.database.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.feunju.database.helper.ConstantDatabase;
import com.feunju.model.Carrera;
import com.feunju.model.Noticia;
import com.feunju.model.Universidad;

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
    		            ConstantDatabase.UNI_WEB,
    		            ConstantDatabase.UNI_INS,
    		            ConstantDatabase.UNI_PRE,
    		            ConstantDatabase.UNI_INF,
    		            ConstantDatabase.UNI_REQ,
    		            ConstantDatabase.UNI_LAT,
    		            ConstantDatabase.UNI_LONG
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
			
			//verifico si la universidad existe 
			logger.debug("Id Universidad : "+obj.getId_universidad());
			cursor=dao.get(ConstantDatabase.T_UNIVERSIDAD,this.columns,ConstantDatabase.UNI_ID,obj.getId_universidad());
			
			if(cursor!=null)
			{
			   logger.debug("existe la UNIVERSIDAD");
			   dao.delete(ConstantDatabase.T_UNIVERSIDAD,ConstantDatabase.UNI_ID, (obj.getId_universidad()));
			   cursor.close();
			}	
				
			
			
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
			values.put(ConstantDatabase.UNI_INS,obj.getInscripcion());
			values.put(ConstantDatabase.UNI_PRE, obj.getPreinscripcion());
			values.put(ConstantDatabase.UNI_INF, obj.getInforme());
			values.put(ConstantDatabase.UNI_REQ, obj.getRequisitos());
			values.put(ConstantDatabase.UNI_LAT,obj.getLat_universidad());
			values.put(ConstantDatabase.UNI_LONG, obj.getLong_universidad());
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
	     int uni_ins=cursor.getColumnIndex(ConstantDatabase.UNI_INS);
	     int uni_pre=cursor.getColumnIndex(ConstantDatabase.UNI_PRE);
	     int uni_inf=cursor.getColumnIndex(ConstantDatabase.UNI_INF);
	     int uni_req=cursor.getColumnIndex(ConstantDatabase.UNI_REQ);
	     int uni_lat=cursor.getColumnIndex(ConstantDatabase.UNI_LAT);
	     int uni_long=cursor.getColumnIndex(ConstantDatabase.UNI_LONG);
	     
	     logger.debug("UniversitiyDao : uni_req=> "+uni_req+"  lat => "+uni_lat+ " long => "+uni_long);
	    
	     universidad.setId_universidad(Integer.parseInt(cursor.getString(uni_id)));
	     universidad.setNombre_universidad(cursor.getString(uni_nombre));
	     universidad.setDireccion(cursor.getString(uni_direccion));
	     universidad.setCodigoPostal(cursor.getString(uni_codigo));
	     universidad.setTelefono(cursor.getString(uni_telefono));
	     universidad.setFax(cursor.getString(uni_fax));
	     universidad.setEmail(cursor.getString(uni_email));
	     universidad.setWeb(cursor.getString(uni_web));
	     universidad.setInscripcion(cursor.getString(uni_ins));
	     universidad.setPreinscripcion(cursor.getString(uni_pre));
	     universidad.setInforme(cursor.getString(uni_inf));
	     universidad.setRequisitos(cursor.getString(uni_req));
	     universidad.setLat_universidad(cursor.getString(uni_lat));
	     universidad.setLong_universidad(cursor.getString(uni_long));
	     
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
