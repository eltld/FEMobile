package com.fe.bean.adapter;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






import com.fe.R;
import com.fe.activity.ActivityNoticia;
import com.fe.model.Galeria;
import com.fe.model.Noticia;
import com.fe.task.ImageDownloaderTask;



import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

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
	private ImageLoader imageLoader;
	private String[] imageUrls;
	private Context myContext;
	private DisplayImageOptions options;
	
	
	public CustomNewsAdapter(Context context,ArrayList<Noticia> listData,
			ImageLoader imageLoader,DisplayImageOptions options)
	{
	   int i=0;  
		imageUrls=new String[listData.size()];
		for(Noticia noticia : listData)
		{
			imageUrls[i]=noticia.getUrlImageNoticia();
			i++;
		}
		System.out.println("CustonNewsAdapter count : "+listData.size());
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
			convertView = layoutInflater.inflate(R.layout.noticias_single,null);
			holder = new ViewHolder();
			holder.noticiaHead = (TextView) convertView.findViewById(R.id.text_noticiaTitulo);
			holder.noticiaBajada = (TextView) convertView.findViewById(R.id.text_noticiaBajada);
			holder.noticiaImageView = (ImageView) convertView.findViewById(R.id.image_noticiaImage);
			holder.noticiaId=(TextView)convertView.findViewById(R.id.text_noticiaId);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
 
		Noticia noticias = (Noticia) listData.get(position);
 
		String titulo="";
		String bajada="";
		if(noticias.getTituloNoticia().length()<=60)
			titulo=noticias.getTituloNoticia();
		else 
			titulo=noticias.getTituloNoticia().substring(0, 60)+"...";
		
		if(noticias.getBajadaNoticia().length()<=60)
			bajada=noticias.getBajadaNoticia();
		else 
			bajada=noticias.getBajadaNoticia().substring(0,60)+"...";
		
		
		holder.noticiaHead.setText(titulo);
		holder.noticiaBajada.setText(bajada);
		holder.noticiaId.setText(noticias.getIdNoticia());
        holder.noticiaId.setVisibility(View.GONE);
		
    	
        
        //envio a cargar asyncTask la image   
		if (holder.noticiaImageView != null) {
			 
			imageLoader.displayImage(imageUrls[position], holder.noticiaImageView, options);

			//new ImageDownloaderTask(holder.noticiaImageView).execute(noticias.getUrlImageNoticia());
		}
 
		System.out.println("customlistnoticiaadapter");
		return convertView;
	}
 
	static class ViewHolder {
		TextView noticiaHead;
		TextView noticiaBajada;
		TextView noticiaId;
		ImageView noticiaImageView;
	}
}
	
	

