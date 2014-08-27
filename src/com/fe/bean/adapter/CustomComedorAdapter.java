package com.fe.bean.adapter;

import java.util.ArrayList;

import com.fe.R;
import com.fe.bean.adapter.CustomSecretariaAdapter.RecordHolder;
import com.fe.model.Comedor;
import com.fe.model.Secretaria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


/**
 * 
 * @author : David Garcia 
 * @Dathe  : 26-08-2014
 *
 */
public class CustomComedorAdapter extends BaseAdapter {

	Context myContext;
	int resourceId;
	LayoutInflater layoutInflater;
	ArrayList<Comedor> data;	
	
	
	public CustomComedorAdapter(Context context, 
			ArrayList<Comedor> objects)
	{
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
	      View itemView=convertView;
	      RecordHolder holder=null;
	      
	      if(convertView==null)
	      {
	    	  //se obtiene 
	    	 
	    	  itemView= layoutInflater.inflate(R.layout.comedor_single,null);
	    	
	    	  holder=new RecordHolder();
	    	  holder.txtComedor=(TextView)itemView.findViewById(R.id.text_comedorNombre);
	    	  holder.txtIdComedor=(TextView)itemView.findViewById(R.id.text_comedorId);
	    	  itemView.setTag(holder);
	      }
	      else
	      {
	    	  holder=(RecordHolder)itemView.getTag();

	      }
	    
	      Comedor item=data.get(position);
	      System.out.println("getNombreComedor : "+item.getNombre_comedor() +" Id_comedor : "+item.getId_comedor());
	      holder.txtComedor.setText(item.getNombre_comedor());
	      holder.txtIdComedor.setText(String.valueOf(item.getId_comedor()));
	      //visibilidad del identificador de noticia
	      holder.txtIdComedor.setVisibility(View.GONE);
	     
	      return itemView;
	}

	  //representa 
	  static class RecordHolder
	  {
		  TextView txtComedor;
	      TextView txtIdComedor;
	  }
}
