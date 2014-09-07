package com.fe.bean;

import java.util.ArrayList;

import android.content.Context;

import com.fe.bean.util.UtilList;
import com.fe.database.dao.CarreraDao;
import com.fe.database.dao.ComedorDao;
import com.fe.database.helper.ComedorDbHelper;
import com.fe.model.Carrera;
import com.fe.model.Comedor;
import com.fe.model.Secretaria;


/**
 * 
 * @author :  David Garcia
 * @Dathe  :  26-08-2014
 *
 */
public class ComedorBean {

	ComedorDao comedorDao=null;
	
	
	public ComedorBean(Context ctx)
	{
		comedorDao=new ComedorDao(ctx);
	}
	
	public void add(Comedor obj)
	{
		System.out.println("comedorDao add");
		comedorDao.add(obj);
	}
	
	public Carrera get(Long id)
	{
	  return comedorDao.get(id);
	}
	
	public void addList(ArrayList<Comedor> list)
	{
		for(int i=0; i<list.size();i++)
		{ 
			add(list.get(i));}
		
	}
	
}
