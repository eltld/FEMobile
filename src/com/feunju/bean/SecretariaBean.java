package com.feunju.bean;

import java.util.ArrayList;

import com.feunju.bean.util.UtilList;
import com.feunju.model.Secretaria;


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
