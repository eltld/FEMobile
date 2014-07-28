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
		listItemGrid.add(new ItemGrid("Facebook",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Twitter",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Skype",res.getDrawable(R.drawable.ic_launcher)));
		listItemGrid.add(new ItemGrid("Yahoo",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Patch",res.getDrawable(R.drawable.ic_launcher)));
		listItemGrid.add(new ItemGrid("Skype",res.getDrawable(R.drawable.ic_launcher)));
		listItemGrid.add(new ItemGrid("Yahoo",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Patch",res.getDrawable(R.drawable.ic_launcher)));
		listItemGrid.add(new ItemGrid("Yahoo",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Patch",res.getDrawable(R.drawable.ic_launcher)));
		listItemGrid.add(new ItemGrid("Facebook",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Facebook",res.getDrawable((R.drawable.ic_launcher))));
		listItemGrid.add(new ItemGrid("Facebook",res.getDrawable((R.drawable.ic_launcher))));
		
		return listItemGrid;
	}
	
	
	
}
