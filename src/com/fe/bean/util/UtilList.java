package com.fe.bean.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.fe.R;
import com.fe.bean.Comedor;
import com.fe.bean.ItemGrid;
import com.fe.bean.Secretaria;

/**
 * Clase que permite generar la carga de elementos 
 * del grid 
 * @author Administrador
 *
 */
public final class UtilList {
  
	private static final List<ItemGrid> listItemGrid=new ArrayList<ItemGrid>();
	private static final List<Secretaria> listSecretarias=new ArrayList<Secretaria>();
	private static final List<Comedor> listComedor=new ArrayList<Comedor>();
	
	
	/**
	 * Load Items Grid Principal
	 * Devuelve una lista de elementos de 
	 * ItemGrid : text - image
	 * @param res
	 * @return
	 */
	public static List<ItemGrid> loadItemGridPrincipal(Resources res)
	{
		listItemGrid.add(new ItemGrid("Mapa",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Noticias",res.getDrawable(R.drawable.ic_launcher)));
		listItemGrid.add(new ItemGrid("Comedor",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Secretarias",res.getDrawable(R.drawable.ic_launcher)));
	    listItemGrid.add(new ItemGrid("Fotos",res.getDrawable(R.drawable.ic_launcher)));
	    listItemGrid.add(new ItemGrid("Eventos",res.getDrawable(R.drawable.ic_launcher)));
	    listItemGrid.add(new ItemGrid("Calendario",res.getDrawable(R.drawable.ic_launcher)));
	    listItemGrid.add(new ItemGrid("Autoridades",res.getDrawable(R.drawable.ic_launcher))); 		
	    
		return listItemGrid;
	}
	
	
	public static List<String> loadSecretaria()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Secretaria Bienestar");
		list.add("Secretaria Deporte");
		list.add("Secretaria Universitario");
		return list;
	}
	
	public static List<Secretaria> loadListSecretaria()
	{
		listSecretarias.add(
				new Secretaria("Secretaria General Legal y Tecnica",
						      "descripcion",
						      " Dr. César Guillermo FARFÁN", 
						      "", 
						      "+54-(388)-4221-517",
						      "gfarfan@unju.edu.ar "));
		listSecretarias.add( new Secretaria("SECRETARIA DE ADMINISTRACION",
				                 "descripcion",
				                 "CPN Fernanda COLQUE",
				                 "direccion",
				                 "+54-(388)-4221-514",
				                 "secadmin@unju.edu.ar "));
		
		listSecretarias.add(new Secretaria("SECRETARIA DE CIENCIA Y TECNICA",
				                           "descripcion",
				                           "Dra. María Graciela del Valle BOVI MITRE",
				                           "direccion",
				                           "+54-(388)-4221-505",
				                           "secretariasectergb@unju.edu.ar"));
		listSecretarias.add(new Secretaria("SECRETARIA DE EXTENSION UNIVERSITARIA",
				                            "descripcion",
				                            "Dra. Elena Ester BELLI",
				                            "direccion",
				                            "+54-(388)-4244-100 ",
				                            "seu@unju.edu.ar"));
		listSecretarias.add(new Secretaria("SECRETARIO DE ASUNTOS ACADEMICOS",
				                           "descripcion",
				                           "Dr. Julio César ARRUETA",
				                           "direccion",
				                           "+54-(388)-4221-504",
				                           "c.arrueta@unju.edu.ar"));
		listSecretarias.add(new Secretaria("SECRETARIO DE BIENESTAR UNIVERSITARIO",
				                         "Sr. Diego Esteban GUTIERREZ", "descripcion"
				                         , "direccion", 
				                         " +54-(388)-4221-500", 
				                         "sbu@unju.edu.ar"));
		
		
		
		
		//listSecretarias.add(new )
		return listSecretarias;
		
		
	}
	
	public static List<Comedor> loadListComedor()
	{
		listComedor.add(new Comedor(1, "Bustamante","Comedor Bustamante", "00","00"));
	    listComedor.add(new Comedor(2,"Sociedad Obrera","Sociedad","00","00"));
	    listComedor.add(new Comedor(3, "Balcarce","Balcarce","0","0"));
		
	    return listComedor;
	}
  
	
	
	
	
	
	
	
}
