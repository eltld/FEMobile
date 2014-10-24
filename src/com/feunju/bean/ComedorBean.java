package com.feunju.bean;

import java.util.ArrayList;

import android.content.Context;

import com.feunju.bean.util.UtilList;
import com.feunju.database.dao.CarreraDao;
import com.feunju.database.dao.ComedorDao;
import com.feunju.database.helper.ComedorDbHelper;
import com.feunju.model.Carrera;
import com.feunju.model.Comedor;
import com.feunju.model.Secretaria;


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
	
	public Comedor get(Long id)
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
