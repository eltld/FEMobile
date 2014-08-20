package com.fe.bean.adapter;

import java.util.ArrayList;


import com.fe.R;
import com.fe.bean.Noticia;
import com.fe.client.ImageDownloaderTask;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * 
 * @author : David Garcia
 * @Dathe  : 20-08-2014 
 *
 */
public class CustomListNoticiaAdapter extends BaseAdapter {

	private ArrayList listData;
	
	private LayoutInflater layoutInflater;
	
	public CustomListNoticiaAdapter(Context context,ArrayList listData)
	{
		this.listData=listData;
		layoutInflater=LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
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

	 


	
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.grid_single_news,null);
			holder = new ViewHolder();
			holder.noticiaHead = (TextView) convertView.findViewById(R.id.text_noticiaTitulo);
			holder.noticiaBajada = (TextView) convertView.findViewById(R.id.text_noticiaBajada);
			holder.noticiaDateView = (TextView) convertView.findViewById(R.id.text_noticiaFecha);
			holder.noticiaImageView = (ImageView) convertView.findViewById(R.id.image_noticiaImage);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
 
		Noticia noticias = (Noticia) listData.get(position);
 
		holder.noticiaHead.setText(noticias.getTituloNoticia());
		holder.noticiaBajada.setText(noticias.getBajadaNoticia());
		holder.noticiaDateView.setText(noticias.getDateNoticia());
 
		//envio a cargar asyncTask la image   
		if (holder.noticiaImageView != null) {
			new ImageDownloaderTask(holder.noticiaImageView).execute(noticias.getUrlImageNoticia());
		}
 
		return convertView;
	}
 
	static class ViewHolder {
		TextView noticiaHead;
		TextView noticiaBajada;
		TextView noticiaDateView;
		ImageView noticiaImageView;
	}
}
	
	

