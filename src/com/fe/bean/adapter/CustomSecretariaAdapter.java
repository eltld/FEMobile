package com.fe.bean.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.adapter.CustomGridAdapter.RecordHolder;
import com.fe.model.ItemGrid;
import com.fe.model.Secretaria;


/**
 * 
 * @author David Garcia
 * @Dathe : 24-08-2014
 *
 */
public class CustomSecretariaAdapter extends ArrayAdapter<Secretaria>{

	
	Context myContext;
	  int resourceId;
	  ArrayList<Secretaria> data=new ArrayList<Secretaria>();
	
	  public CustomSecretariaAdapter(Context context, int textViewResourceId,
			ArrayList<Secretaria> objects) {
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
	    	  holder.txtSecretaria=(TextView)itemView.findViewById(R.id.text_secretariaTitulo);
	    	  holder.txtIdSecretaria=(TextView)itemView.findViewById(R.id.text_secretariaId);
	    	  itemView.setTag(holder);
	      }
	      else
	      {
	    	  holder=(RecordHolder)convertView.getTag();

	      }
	      
	      Secretaria item=data.get(position);
	      holder.txtSecretaria.setText(item.getTitulo_secretaria());
	      holder.txtIdSecretaria.setText(item.getId_secretaria());
	      //visibilidad del identificador de noticia
	      holder.txtIdSecretaria.setVisibility(View.GONE);
	     
	      return itemView;
		  
	  }
	  
	  //representa al image and text del grid custom
	  static class RecordHolder
	  {
		  TextView txtSecretaria;
	      TextView txtIdSecretaria;
	  }
	  
	  
	
}
