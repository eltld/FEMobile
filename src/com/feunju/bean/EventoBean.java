package com.feunju.bean;

import java.util.ArrayList;

import android.content.Context;

import com.feunju.database.dao.AutoridadDao;
import com.feunju.database.dao.EventoDao;
import com.feunju.model.Evento;

public class EventoBean 
{
EventoDao eventoDao=null;

public EventoBean(Context ctx)
{
	eventoDao=new EventoDao(ctx);
}

public void add(Evento obj)
{
	eventoDao.add(obj);
}

public Evento get(Long id)
{
  return eventoDao.get(id);
}

public void addList(ArrayList<Evento> list)
{
	for(int i=0; i<list.size();i++)
	{ 
		add(list.get(i));}
	
}
}