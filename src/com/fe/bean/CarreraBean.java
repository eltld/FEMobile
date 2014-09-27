package com.fe.bean;

import java.util.ArrayList;

import android.content.Context;

import com.fe.database.dao.CarreraDao;
import com.fe.database.dao.NoticiaDao;
import com.fe.model.Carrera;
import com.fe.model.Noticia;


/**
 * 
 * @author : David Garcia
 * @Dathe  : 4-09-2014 
 */
public class CarreraBean {

	 CarreraDao carreraDao;
	

		public CarreraBean(Context ctx)
		{
			System.out.println("CarrearBean ");
			carreraDao=new CarreraDao(ctx);
			
		}
		
		public void add(Carrera obj)
		{
			carreraDao.add(obj);
		}
		
		public Carrera get(Long id)
		{
	      System.out.println("CarreraBean get : "+id);		
		  return carreraDao.get(id);
		}
		
		
		public Carrera get(Long id_carrera,Long id_university)
		{
			
			  System.out.println("CarreraBean get : "+id_carrera + "id_university: "+id_university);		
			  return carreraDao.get(id_carrera,id_university);
		}
		public void addList(ArrayList<Carrera> list)
		{
			for(int i=0; i<list.size();i++)
			{ 
				add(list.get(i));}
			
		}
		
}
