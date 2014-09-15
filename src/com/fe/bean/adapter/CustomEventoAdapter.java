package com.fe.bean.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.adapter.CustomNewsAdapter.ViewHolder;
import com.fe.model.Evento;
import com.fe.model.Noticia;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

public class CustomEventoAdapter extends BaseAdapter {

	private ArrayList<Evento> listData;
	private LayoutInflater layoutInflater;
	private java.util.logging.Logger logger;
	private ImageLoader imageLoader;
	private String[] imageUrls;
	private Context myContext;
	private DisplayImageOptions options;
	
	
	public CustomEventoAdapter(Context context,ArrayList<Evento> listData,
			ImageLoader imageLoader,DisplayImageOptions options)
	{
	 
		System.out.println("CustonEventoAdapter count : "+listData.size());
		this.listData=listData;
		this.imageLoader=imageLoader;
		this.options=options;
		
		layoutInflater=LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.listData.size();
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
		ViewHolder holder;
		System.out.println("getView");
	
		if (convertView == null) {
	
			System.out.println("convertview null");
			 //se obtiene 
			convertView = layoutInflater.inflate(R.layout.evento_single,null);
			holder = new ViewHolder();
			holder.eventoTitulo = (TextView) convertView.findViewById(R.id.text_eventoTitulo);
			holder.eventoDetalle= (TextView) convertView.findViewById(R.id.text_eventoDetalle);
			holder.eventoId = (TextView) convertView.findViewById(R.id.text_eventoId);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
 
		Evento evento = (Evento) listData.get(position);
 
	
		holder.eventoTitulo.setText(evento.getTituloEvento());
		holder.eventoDetalle.setText(evento.getFechaEvento()+ " - "+ evento.getHorarioEvento());
		holder.eventoId.setText(evento.getIdEvento());
		holder.eventoId.setVisibility(View.GONE);
		
    	

 
		return convertView;
	}
 
	static class ViewHolder {
		TextView eventoTitulo;
		TextView eventoId;
		TextView eventoDetalle;
	}
}
	
	