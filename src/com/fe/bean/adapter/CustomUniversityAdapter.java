package com.fe.bean.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.adapter.CustomComedorAdapter.RecordHolder;
import com.fe.model.Comedor;
import com.fe.model.Universidad;



/**
 * University Adapter
 * @author : David Garcia 
 * @Dathe  : 1-09-2014
 *
 */
public class CustomUniversityAdapter extends BaseAdapter {

	
	Context myContext;
	int resourceId;
	LayoutInflater layoutInflater;
	ArrayList<Universidad> data;	
	
	
	public CustomUniversityAdapter(Context context, 
			ArrayList<Universidad> objects)
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
	    	 
	    	  itemView= layoutInflater.inflate(R.layout.university_single,null);
	    	
	    	  holder=new RecordHolder();
	    	  holder.txtUniversidad=(TextView)itemView.findViewById(R.id.text_universityNombre);
	    	  holder.txtIdUniversidad=(TextView)itemView.findViewById(R.id.text_universityId);
	    	  itemView.setTag(holder);
	      }
	      else
	      {
	    	  holder=(RecordHolder)itemView.getTag();

	      }
	      Universidad item=data.get(position);

		    System.out.println("Nombre : "+item.getNombre_universidad() + " id: "+item.getId_universidad());
	       holder.txtUniversidad.setText(item.getNombre_universidad());
	      holder.txtIdUniversidad.setText(String.valueOf( item.getId_universidad()));
	      //visibilidad del identificador de noticia
	      holder.txtIdUniversidad.setVisibility(View.GONE);
	     
	      return itemView;
	}

	  //representa 
	  static class RecordHolder
	  {
		  TextView txtUniversidad;
	      TextView txtIdUniversidad;
	  }
	
}
