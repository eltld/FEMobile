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
import com.fe.bean.adapter.CustomCarreraAdapter.RecordHolder;
import com.fe.bean.adapter.CustomNewsAdapter.ViewHolder;
import com.fe.model.Autoridad;
import com.fe.model.Carrera;
import com.fe.model.Noticia;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

public class CustomAutoridadAdapter extends BaseAdapter
{
private ArrayList<Autoridad> listData;
private LayoutInflater layoutInflater;
private java.util.logging.Logger logger;
private ImageLoader imageLoader;
private String[] imageUrls;
private Context myContext;
private DisplayImageOptions options;


public CustomAutoridadAdapter(Context context,ArrayList<Autoridad> listData,
		ImageLoader imageLoader,DisplayImageOptions options)
{
   int i=0;  
	imageUrls=new String[listData.size()];
	for(Autoridad autoridades : listData)
	{
		imageUrls[i]=autoridades.getImageUrlAutoridad();
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
	return arg0;
}

 


@Override
public View getView(int position, View convertView, ViewGroup parent) {
	ViewHolder holder;
	System.out.println("getView");

	if (convertView == null) {

		System.out.println("convertview null");
		 //se obtiene 
		convertView = layoutInflater.inflate(R.layout.autoridad_single,null);
		holder = new ViewHolder();
		holder.autoridadId = (TextView) convertView.findViewById(R.id.text_autoridadId);
		holder.autoridadTitulo = (TextView) convertView.findViewById(R.id.text_autoridadTitulo);
		holder.autoridadImage = (ImageView) convertView.findViewById(R.id.image_autoridadImage);
		convertView.setTag(holder);
	} else {
		holder = (ViewHolder) convertView.getTag();
	}

	Autoridad autoridad =  listData.get(position);

	
	holder.autoridadTitulo.setText(autoridad.getTituloAutoridad());
	holder.autoridadId.setText(autoridad.getIdAutoridad());
    holder.autoridadId.setVisibility(View.GONE);
	
	
    
    //envio a cargar asyncTask la image   
	if (holder.autoridadImage != null) {
		imageLoader.displayImage(imageUrls[position], holder.autoridadImage, options);
	}
	return convertView;
}

  static class ViewHolder {
	TextView autoridadTitulo;
	TextView autoridadId;
	ImageView autoridadImage;
 }
  
}