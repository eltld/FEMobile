package com.fe.bean.adapter;

import java.util.ArrayList;

import com.fe.R;
import com.fe.model.Secretaria;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * 
 * @author : David Garcia
 * @Dathe  : 27-08-2014 
 *
 */
public class CustomGaleriaAdapter extends BaseAdapter{

	  Context myContext;
	  DisplayImageOptions options;
	  int resourceId;
	  LayoutInflater layoutInflater;
	  ArrayList<String> data;
	  ImageLoader imageLoader;
	  String[] imageUrls;
	  
	  
	  
	
	  public CustomGaleriaAdapter(Context context, 
			ImageLoader imageLoader,DisplayImageOptions options,String[] imageUrls) {
	  
		this.myContext=context;
	    
	    this.imageLoader=imageLoader;
	    this.options=options;
	    this.imageUrls=imageUrls;
	    this.layoutInflater=LayoutInflater.from(this.myContext);
	  }
	  
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imageUrls.length;
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
		
		final ViewHolder holder;
		View view = convertView;
		if (view == null) {
			view =layoutInflater.inflate(R.layout.gallery_image_single, parent, false);
			holder = new ViewHolder();
			assert view != null;
			holder.imageView = (ImageView) view.findViewById(R.id.image);
			holder.progressBar = (ProgressBar) view.findViewById(R.id.progress);
			view.setTag(holder);
		} else {
			holder = (ViewHolder) view.getTag();
		}

		System.out.println("imageUrls[positiont ]: "+imageUrls[position]); 
		imageLoader.displayImage(imageUrls[position], holder.imageView, options, new SimpleImageLoadingListener() {
									 @Override
									 public void onLoadingStarted(String imageUri, View view) {
										 holder.progressBar.setProgress(0);
										 holder.progressBar.setVisibility(View.VISIBLE);
									 }

									 @Override
									 public void onLoadingFailed(String imageUri, View view,
											 FailReason failReason) {
										 holder.progressBar.setVisibility(View.GONE);
									 }

									 @Override
									 public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
										 holder.progressBar.setVisibility(View.GONE);
									 }
								 }, new ImageLoadingProgressListener() {
									 @Override
									 public void onProgressUpdate(String imageUri, View view, int current,
											 int total) {
										 holder.progressBar.setProgress(Math.round(100.0f * current / total));
									 }
								 }
		);

		return view;
		
	}

	static class ViewHolder {
		ImageView imageView;
		ProgressBar progressBar;
	}

}
