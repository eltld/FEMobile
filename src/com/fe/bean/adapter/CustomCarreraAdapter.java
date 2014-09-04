package com.fe.bean.adapter;

import java.util.ArrayList;

import com.fe.R;
import com.fe.bean.adapter.CustomUniversityAdapter.RecordHolder;
import com.fe.model.Carrera;
import com.fe.model.Universidad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomCarreraAdapter extends BaseAdapter {
	Context myContext;
	int resourceId;
	LayoutInflater layoutInflater;
	ArrayList<Carrera> data;	
	
	
	public  CustomCarreraAdapter(Context context, 
			ArrayList<Carrera> objects)
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
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	      View itemView=convertView;
	      RecordHolder holder=null;
	      
	      if(convertView==null)
	      {
	    	  //se obtiene 
	    	 
	    	  itemView= layoutInflater.inflate(R.layout.carrera_single,null);
	    	
	    	  holder=new RecordHolder();
	    	  holder.txtCarrera=(TextView)itemView.findViewById(R.id.text_carreraTitulo);
	    	  holder.txtIdCarrera=(TextView)itemView.findViewById(R.id.text_carreraId);
	    	  itemView.setTag(holder);
	      }
	      else
	      {
	    	  holder=(RecordHolder)itemView.getTag();

	      }
	      Carrera item=data.get(position);

		    System.out.println("Nombre : "+item.getTitulo_carrera() + " id: "+item.getId_carrera());
	       holder.txtCarrera.setText(item.getTitulo_carrera());
	       holder.txtIdCarrera.setText(String.valueOf( item.getId_carrera()));
	      //visibilidad del identificador de noticia
	      holder.txtIdCarrera.setVisibility(View.GONE);
	     
	      return itemView;
	}

	  //representa 
	  static class RecordHolder
	  {
		  TextView txtCarrera;
	      TextView txtIdCarrera;
	  }
}
