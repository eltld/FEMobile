package com.fe.bean;

import java.util.ArrayList;

import com.fe.bean.util.UtilList;
import com.fe.model.Comedor;
import com.fe.model.Secretaria;


/**
 * 
 * @author :  David Garcia
 * @Dathe  :  26-08-2014
 *
 */
public class ComedorBean {

	public Comedor GetBean(String id)
	{
		ArrayList<Comedor> list = new ArrayList<Comedor>();
		list=(ArrayList<Comedor>) UtilList.loadListComedor();
		
		for(Comedor com: list)
		{
		   int i=Integer.parseInt(id);
		   if(com.getId_comedor()==i)	
		     {
			   return com;
		     }
		}
		return null;
	}
	
	
}
