package com.fe.bean.adapter;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import com.fe.R;
import com.fe.activity.ActivityNoticia;
import com.fe.model.Noticia;
import com.fe.task.ImageDownloaderTask;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * 
 * @author : David Garcia
 * @Dathe  : 20-08-2014 
 *
 */
public class CustomNewsAdapter extends BaseAdapter {

	private ArrayList<Noticia> listData;
	private LayoutInflater layoutInflater;
	private java.util.logging.Logger logger;
	
	public CustomNewsAdapter(Context context,ArrayList<Noticia> listData)
	{
	
		System.out.println("CustonNewsAdapter count : "+listData.size());
		this.listData=listData;
		
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
			convertView = layoutInflater.inflate(R.layout.noticias_single,null);
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
 
		System.out.println("customlistnoticiaadapter");
		return convertView;
	}
 
	static class ViewHolder {
		TextView noticiaHead;
		TextView noticiaBajada;
		TextView noticiaDateView;
		ImageView noticiaImageView;
	}
}
	
	

