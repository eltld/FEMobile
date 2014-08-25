package com.fe.bean;

import java.util.ArrayList;

import com.fe.bean.util.UtilList;
import com.fe.model.Secretaria;


/**
 * 
 * @author David Garcia
 * @Dathe : 24-08-2014
 *
 */
public class SecretariaBean {

	
	public Secretaria GetBean(String id)
	{
		ArrayList<Secretaria> list = new ArrayList<Secretaria>();
		list=(ArrayList<Secretaria>) UtilList.loadListSecretaria();
		
		for(Secretaria sec: list)
		{
		   if(sec.getId_secretaria().equals(id))	
		     {
			   return sec;
		     }
		}
		return null;
	}
	
}
