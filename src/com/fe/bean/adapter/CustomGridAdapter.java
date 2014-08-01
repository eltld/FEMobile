package com.fe.bean.adapter;

import java.util.ArrayList;
import java.util.List;

import com.fe.R;
import com.fe.bean.ItemGrid;


import android.R.id;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Clase Adapter load image, text
 * @author Administrador
 *
 */
public class CustomGridAdapter extends ArrayAdapter<ItemGrid>{

	  Context myContext;
	  int resourceId;
	  ArrayList<ItemGrid> data=new ArrayList<ItemGrid>();
	
	  public CustomGridAdapter(Context context, int textViewResourceId,
			ArrayList<ItemGrid> objects) {
		super(context, textViewResourceId, objects);
	  
		this.myContext=context;
	    this.resourceId=textViewResourceId;
	    this.data= objects;
	    
	  }
	  
	 
	@Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	      // TODO Auto-generated method stub
	      View itemView=convertView;
	      RecordHolder holder=null;
	      
	      if(convertView==null)
	      {
	    	  //se obtiene 
	    	  final LayoutInflater layoutInflater =
	                  (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    	  itemView= layoutInflater.inflate(this.resourceId, parent, false);
	    	  holder=new RecordHolder();
	    	  holder.imgItem=(ImageView)itemView.findViewById(R.id.imageItem);
	    	  holder.txtItem=(TextView)itemView.findViewById(R.id.textItem);
	    	  itemView.setTag(holder);
	      }
	      else
	      {
	    	  holder=(RecordHolder)convertView.getTag();

	      }
	      
	      ItemGrid item=data.get(position);
	      holder.txtItem.setText(item.getText());
	      holder.imgItem.setImageDrawable(item.getImage());
	     
	      return itemView;
		  
	  }
	  
	  //representa al image and text del grid custom
	  static class RecordHolder
	  {
		  ImageView imgItem;
	      TextView txtItem;
	  }
	  
	  
	
	 
	  
	  

}
