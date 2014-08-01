package com.fe.bean.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.fe.R;
import com.fe.bean.ItemGrid;

/**
 * Clase que permite generar la carga de elementos 
 * del grid 
 * @author Administrador
 *
 */
public final class ListItemGrid {
  
	private static final List<ItemGrid> listItemGrid=new ArrayList<ItemGrid>();
	
	
	
	/**
	 * Load Items Grid Principal
	 * Devuelve una lista de elementos de 
	 * ItemGrid : text - image
	 * @param res
	 * @return
	 */
	public static List<ItemGrid> loadItemGridPrincipal(Resources res)
	{
		listItemGrid.add(new ItemGrid("Facultad",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Comedor",res.getDrawable(R.drawable.ic_launcher)));
		listItemGrid.add(new ItemGrid("Calendario",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Secretarias",res.getDrawable(R.drawable.ic_launcher)));
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
  
	
	
	
	
	
	
	
}
