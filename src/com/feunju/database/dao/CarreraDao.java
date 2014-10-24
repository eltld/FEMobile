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


/**
 * 
 * @author : David Garcia 
 * @Dathe  : 04-08-2014
 *
 */
public class CarreraDao {
	
private static final Logger logger = (Logger) LoggerFactory.getLogger(CarreraDao.class);
	
	private Carrera carrera;
	String result="";
    Cursor cursor = null;
    String[] columns = new String[] { 
    		            ConstantDatabase.CARR_ID,
    		            ConstantDatabase.CARR_TITULO,
    		            ConstantDatabase.CARR_NIVEL,
    		            ConstantDatabase.CARR_ACREDITACION,
    		            ConstantDatabase.CARR_PERFIL,
    		            ConstantDatabase.CARR_ALCANCE,
    		            ConstantDatabase.CARR_DURACION,
    		            ConstantDatabase.CARR_GRADO,
    		            ConstantDatabase.UNI_ID
    		            };
    
    GenericDAO dao ;
	
	public CarreraDao(Context ctx)
	{
       System.out.println("query_create_carrear : "+ConstantDatabase.QUERY_CREATE_CARRERA);
		dao = GenericDAO.getInstance(
				ctx, ConstantDatabase.DATABASE_NAME, 
				ConstantDatabase.QUERY_CREATE_CARRERA, 
				ConstantDatabase.T_CARRERA,
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
			values.put(ConstantDatabase.CARR_NIVEL,obj.getNivel_carrera());
			values.put(ConstantDatabase.CARR_ACREDITACION,obj.getAcreditacion_carrera());
			values.put(ConstantDatabase.CARR_PERFIL,obj.getPerfil_carrera());
			values.put(ConstantDatabase.CARR_ALCANCE,obj.getAlcance_carrera());
			values.put(ConstantDatabase.CARR_DURACION, obj.getDuracion_carrera());
			values.put(ConstantDatabase.CARR_GRADO, obj.getId_grado());
		    values.put(ConstantDatabase.UNI_ID,obj.getId_university());
			dao.insert(ConstantDatabase.T_CARRERA, values);
			
			
		}
	}
	
	
	
	public Carrera get(Long id_carrera, Long id_university)
	{
		cursor=dao.get(ConstantDatabase.T_CARRERA,this.columns,ConstantDatabase.CARR_ID,ConstantDatabase.UNI_ID,id_carrera,id_university);
		
		
		if(cursor!=null)
		{
	     int carr_id =cursor.getColumnIndex(ConstantDatabase.CARR_ID);
	     int carr_titulo=cursor.getColumnIndex(ConstantDatabase.CARR_TITULO);
	     int carr_nivel=cursor.getColumnIndex(ConstantDatabase.CARR_NIVEL);
	     int carr_acreditacion=cursor.getColumnIndex(ConstantDatabase.CARR_ACREDITACION);
	     int carr_perfil=cursor.getColumnIndex(ConstantDatabase.CARR_PERFIL);
	     int carr_alcance=cursor.getColumnIndex(ConstantDatabase.CARR_ALCANCE);
	     int carr_duracion=cursor.getColumnIndex(ConstantDatabase.CARR_DURACION);
	     int uni_id=cursor.getColumnIndex(ConstantDatabase.UNI_ID);
	     
	    
	     carrera.setId_carrera(Integer.parseInt(cursor.getString(carr_id)));
	     carrera.setTitulo_carrera(cursor.getString(carr_titulo));
	     carrera.setNivel_carrera(cursor.getString(carr_nivel));
	     carrera.setAcreditacion_carrera(cursor.getString(carr_acreditacion));
	     carrera.setPerfil_carrera(cursor.getString(carr_perfil));
	     carrera.setAlcance_carrera(cursor.getString(carr_alcance));
	     carrera.setDuracion_carrera(cursor.getString(carr_duracion));
	     carrera.setId_university(Integer.parseInt(cursor.getString(uni_id)));
	     cursor.close();
	     return carrera;
		}
		return null;
		
	}
	
	public Carrera get(Long id)
	{
		cursor=dao.get(ConstantDatabase.T_CARRERA,this.columns,ConstantDatabase.CARR_ID,id);
		
	
		if(cursor!=null)
		{
	     int carr_id =cursor.getColumnIndex(ConstantDatabase.CARR_ID);
	     int carr_titulo=cursor.getColumnIndex(ConstantDatabase.CARR_TITULO);
	     int carr_nivel=cursor.getColumnIndex(ConstantDatabase.CARR_NIVEL);
	     int carr_acreditacion=cursor.getColumnIndex(ConstantDatabase.CARR_ACREDITACION);
	     int carr_perfil=cursor.getColumnIndex(ConstantDatabase.CARR_PERFIL);
	     int carr_alcance=cursor.getColumnIndex(ConstantDatabase.CARR_ALCANCE);
	     int carr_duracion=cursor.getColumnIndex(ConstantDatabase.CARR_DURACION);
	     int uni_id=cursor.getColumnIndex(ConstantDatabase.UNI_ID);
	     
	    
	     carrera.setId_carrera(Integer.parseInt(cursor.getString(carr_id)));
	     carrera.setTitulo_carrera(cursor.getString(carr_titulo));
	     carrera.setNivel_carrera(cursor.getString(carr_nivel));
	     carrera.setAcreditacion_carrera(cursor.getString(carr_acreditacion));
	     carrera.setPerfil_carrera(cursor.getString(carr_perfil));
	     carrera.setAlcance_carrera(cursor.getString(carr_alcance));
	     carrera.setDuracion_carrera(cursor.getString(carr_duracion));
	     carrera.setId_university(Integer.parseInt(cursor.getString(uni_id)));
	     cursor.close();
	     return carrera;
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
