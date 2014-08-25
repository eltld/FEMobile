package com.fe.bean.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.fe.R;
import com.fe.model.Comedor;
import com.fe.model.ItemGrid;
import com.fe.model.Secretaria;

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
				new Secretaria("1",
						      "SECRETARIA GENERAL LEGAL Y TECNICA",
						      " Dr. César Guillermo FARFÁN", 
						      "descripcion",
						      "", 
						      "+54-(388)-4221-517",
						      "gfarfan@unju.edu.ar "));
		listSecretarias.add( new Secretaria(
				                 "2",
				                 "SECRETARIA DE ADMINISTRACION",
				                 "descripcion",
				                 "CPN Fernanda COLQUE",
				                 "direccion",
				                 "+54-(388)-4221-514",
				                 "secadmin@unju.edu.ar "));
		
		listSecretarias.add(new Secretaria(
				                           "3",
				                           "SECRETARIA DE CIENCIA Y TECNICA",
				                           "Dra. María Graciela del Valle BOVI MITRE",
				                           "descripcion",
				                           "direccion",
				                           "+54-(388)-4221-505",
				                           "secretariasectergb@unju.edu.ar"));
		listSecretarias.add(new Secretaria(
				                            "4",
				                           "SECRETARIA DE EXTENSION UNIVERSITARIA",
				                            "Dra. Elena Ester BELLI",
				                            "descripcion",
				                            "direccion",
				                            "+54-(388)-4244-100 ",
				                            "seu@unju.edu.ar"));
		listSecretarias.add(new Secretaria(
				                           "5",
				                           "SECRETARIO DE ASUNTOS ACADEMICOS",
				                          
				                           "Dr. Julio César ARRUETA",
				                           "direccion",
				                           "descripcion",
				                           "+54-(388)-4221-504",
				                           "c.arrueta@unju.edu.ar"));
		listSecretarias.add(new Secretaria(
				                          "6",
				                         "SECRETARIO DE BIENESTAR UNIVERSITARIO",
				                         "Sr. Diego Esteban GUTIERREZ", 
				                         "descripcion"
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
