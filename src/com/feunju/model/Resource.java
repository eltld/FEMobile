package com.feunju.model;

import java.util.HashMap;

import com.feunju.R;

/**
 * Clase que contiene elementos definidos
 * @author Administrador
 *
 */
public class Resource {

	private static final HashMap<String,String> resImageHashPrincipal=new HashMap<String, String>();
	
	
	public HashMap<String, String> getHashPrincipal()
	{
		resImageHashPrincipal.put("Facebook","R.drawable.facebook");
		resImageHashPrincipal.put("Twitter","R.drawable.twitter");
		resImageHashPrincipal.put("Skype", "R.drawable.png");
		return resImageHashPrincipal;
		
	}
}
