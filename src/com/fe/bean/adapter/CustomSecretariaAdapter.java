package com.fe.bean.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
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
public class CustomSecretariaAdapter extends BaseAdapter{

	
	Context myContext;
	  int resourceId;
	  LayoutInflater layoutInflater;
	  ArrayList<Secretaria> data;
	  
	  
	  
	
	  public CustomSecretariaAdapter(Context context, 
			ArrayList<Secretaria> objects) {
	  
		this.myContext=context;
	    this.data= objects;
	    this.layoutInflater=LayoutInflater.from(this.myContext);
	    
	  }
	  
	  

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
		  return this.data.size();
		}


		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		  
	 
	@Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	      // TODO Auto-generated method stub
	      View itemView=convertView;
	      RecordHolder holder=null;
	      
	      if(convertView==null)
	      {
	    	  //se obtiene 
	    	 
	    	  itemView= layoutInflater.inflate(R.layout.secretaria_single,null);
	    	
	    	  holder=new RecordHolder();
	    	  holder.txtSecretaria=(TextView)itemView.findViewById(R.id.text_secretariaTitulo);
	    	  holder.txtIdSecretaria=(TextView)itemView.findViewById(R.id.text_idSecretaria);
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
