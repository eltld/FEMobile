package com.fe.bean;

import java.util.ArrayList;

import android.content.Context;

import com.fe.database.NoticiaDao;
import com.fe.model.Noticia;

/**
 * 
 * @author : David Garcia 
 * @dathe  : 30-08-2014
 *
 */
public class NoticiaBean {

	NoticiaDao noticiaDao;
	
	public NoticiaBean(Context ctx)
	{
		noticiaDao=new NoticiaDao(ctx);
		
	}
	
	public void add(Noticia obj)
	{
		noticiaDao.add(obj);
	}
	
	public Noticia get(Long id)
	{
	  return noticiaDao.get(id);
	}
	
	public void addList(ArrayList<Noticia> list)
	{
		for(int i=0; i<list.size();i++)
		{ add(list.get(i));}
		
	}
}
