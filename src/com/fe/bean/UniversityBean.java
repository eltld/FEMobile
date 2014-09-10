package com.fe.bean;

import java.util.ArrayList;

import android.content.Context;

import com.fe.database.dao.CarreraDao;
import com.fe.database.dao.UniversityDao;
import com.fe.model.Carrera;
import com.fe.model.Universidad;

public class UniversityBean {

	 UniversityDao universityDao;
		

		public UniversityBean(Context ctx)
		{
			System.out.println("CarrearBean ");
			universityDao=new UniversityDao(ctx);
			
		}
		
		public void add(Universidad obj)
		{
			universityDao.add(obj);
		}
		
		public Universidad get(Long id)
		{
	      System.out.println("UniversidadBean get : "+id);		
		  return universityDao.get(id);
		}
		
		public void addList(ArrayList<Universidad> list)
		{
			for(int i=0; i<list.size();i++)
			{ 
				add(list.get(i));}
			
		}
		
	
	
}
