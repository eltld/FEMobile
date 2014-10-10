package com.fe.database.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.fe.database.helper.ConstantDatabase;
import com.fe.model.Autoridad;
import com.fe.model.Evento;
import com.fe.model.Noticia;

public class EventoDao 
{
	
private static final Logger logger = (Logger) LoggerFactory.getLogger(AutoridadDao.class);
	
	private Evento evento;
	String result="";
   Cursor cursor = null;
   String[] columns = new String[] { 
   		            ConstantDatabase.EVENTO_ID,
   		            ConstantDatabase.EVENTO_TITULO,
   		            ConstantDatabase.EVENTO_BAJADA,
   		            ConstantDatabase.EVENTO_FECHA,
   		            ConstantDatabase.EVENTO_HORA,
   		            ConstantDatabase.EVENTO_CUERPO,
   		            ConstantDatabase.EVENTO_URL_WEB
   		            };
   
   GenericDAO dao ;
	
	public EventoDao(Context ctx)
	{
      System.out.println("query_create_evento : "+ConstantDatabase.QUERY_CREATE_EVENTO);
		dao = GenericDAO.getInstance(
				ctx, ConstantDatabase.DATABASE_NAME, 
				ConstantDatabase.QUERY_CREATE_EVENTO, 
				ConstantDatabase.T_EVENTO,
				ConstantDatabase.DATABASE_VERSION);
	   evento=new Evento();

		
	}
	
	public void add(Evento obj)
	{
		if(dao!=null)
		{
			
			//verifico si la noticia existe 
			logger.debug("Id Evento : "+obj.getIdEvento());
			cursor=dao.get(ConstantDatabase.T_EVENTO,this.columns,ConstantDatabase.EVENTO_ID,Long.parseLong(obj.getIdEvento()));
			
			if(cursor!=null)
			{
			   logger.debug("existe el evento");
			   dao.delete(ConstantDatabase.T_EVENTO,ConstantDatabase.EVENTO_ID, Long.parseLong(obj.getIdEvento()));
			   cursor.close();
			}	
			
			
			logger.debug("Insert Evento : "+obj.toString());
			ContentValues values=new ContentValues();
			values.put(ConstantDatabase.EVENTO_ID, obj.getIdEvento());
			values.put(ConstantDatabase.EVENTO_TITULO, obj.getTituloEvento());
			values.put(ConstantDatabase.EVENTO_BAJADA, obj.getBajadaEvento());
			values.put(ConstantDatabase.EVENTO_FECHA,obj.getFechaEvento());
			values.put(ConstantDatabase.EVENTO_HORA,obj.getHorarioEvento());
			values.put(ConstantDatabase.EVENTO_CUERPO,obj.getCuerpoEvento());
			values.put(ConstantDatabase.EVENTO_URL_WEB,obj.getUrlWebEvento());
			dao.insert(ConstantDatabase.T_EVENTO, values);
			
			
		}
	}
	
	public Evento get(Long id)
	{
		cursor=dao.get(ConstantDatabase.T_EVENTO,this.columns,ConstantDatabase.EVENTO_ID,id);
		
	
		if(cursor!=null)
		{
	     int evento_id =cursor.getColumnIndex(ConstantDatabase.EVENTO_ID);
	     int evento_titulo=cursor.getColumnIndex(ConstantDatabase.EVENTO_TITULO);
	     int evento_bajada=cursor.getColumnIndex(ConstantDatabase.EVENTO_BAJADA);
	     int evento_fecha=cursor.getColumnIndex(ConstantDatabase.EVENTO_FECHA);
	     int evento_hora=cursor.getColumnIndex(ConstantDatabase.EVENTO_HORA);
	     int evento_cuerpo=cursor.getColumnIndex(ConstantDatabase.EVENTO_CUERPO);
	     int evento_web_url=cursor.getColumnIndex(ConstantDatabase.EVENTO_URL_WEB);
	     
	    
	     evento.setIdEvento(cursor.getString(evento_id));
	     evento.setTituloEvento(cursor.getString(evento_titulo));
	     logger.debug("evento bajada en Get : "+cursor.getString(evento_bajada)+ " evento_bajada :"+evento_bajada);
	     evento.setBajadaEvento(cursor.getString(evento_bajada));
	     evento.setFechaEvento(cursor.getString(evento_fecha));
	     evento.setHorarioEvento(cursor.getString(evento_hora));
	     evento.setCuerpoEvento(cursor.getString(evento_cuerpo));
	     evento.setUrlWebEvento(cursor.getString(evento_web_url));
	     cursor.close();
	     return evento;
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
