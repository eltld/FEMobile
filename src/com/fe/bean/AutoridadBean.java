package com.fe.bean;

import java.util.ArrayList;

import android.content.Context;

import com.fe.database.dao.AutoridadDao;
import com.fe.database.dao.ComedorDao;
import com.fe.model.Autoridad;
import com.fe.model.Carrera;
import com.fe.model.Comedor;

public class AutoridadBean 
{
AutoridadDao autoridadDao=null;

public AutoridadBean(Context ctx)
{
	autoridadDao=new AutoridadDao(ctx);
}

public void add(Autoridad obj)
{
	autoridadDao.add(obj);
}

public Autoridad get(Long id)
{
  return autoridadDao.get(id);
}

public void addList(ArrayList<Autoridad> list)
{
	for(int i=0; i<list.size();i++)
	{ 
		add(list.get(i));}
	
}
}