package com.feunju.activity;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feunju.bean.adapter.CustomGaleriaAdapter;
import com.feunju.bean.json.GaleriaTag;
import com.feunju.bean.json.NoticiaTag;
import com.feunju.edu.R;
import com.feunju.model.Galeria;
import com.feunju.model.Noticia;
import com.feunju.model.constant.ConstantRest;
import com.feunju.model.constant.Constants;
import com.feunju.service.ServiceHandler;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * 
 * @author : David Garcia
 * @dathe  : 27-08-2014
 *
 */
public class ActivityGaleria extends ActivityBase{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityGaleria.class);
		
	DisplayImageOptions options;
	protected ImageLoader imageLoader;
	ArrayList<Galeria> listData;
	ProgressBar pB;
	private TextView textViewHeader;   
	private TextView textNewsConnection;
	private AbsListView gridView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.gallery_image);
	
	textViewHeader=(TextView)findViewById(R.id.text_header);
    textViewHeader.setText("Fotos");
	
    
    pB=(ProgressBar)findViewById(R.id.marker_progress);
 	 textNewsConnection=(TextView)findViewById(R.id.text_galleryConnection);

	options = new DisplayImageOptions.Builder()
	.showImageOnLoading(R.drawable.ic_stub)
	.showImageForEmptyUri(R.drawable.ic_empty)
	.showImageOnFail(R.drawable.ic_error)
	.cacheInMemory(true)
	.cacheOnDisk(true)
	.considerExifParams(true)
	.bitmapConfig(Bitmap.Config.RGB_565)
	.build();
	
	ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
	.threadPriority(Thread.NORM_PRIORITY - 2)
	.denyCacheImageMultipleSizesInMemory()
	.diskCacheFileNameGenerator(new Md5FileNameGenerator())
	.diskCacheSize(50 * 1024 * 1024) // 50 Mb
	.tasksProcessingOrder(QueueProcessingType.LIFO)
	.writeDebugLogs() // Remove for release app
	.build();
    // Initialize ImageLoader with configuration.
    ImageLoader.getInstance().init(config);
	imageLoader=ImageLoader.getInstance();
	
	logger.debug("Execute asyntask");
	new GaleriaAsyncTask().execute();
	
	
	
	
	}
	
 protected class GaleriaAsyncTask extends AsyncTask<String,Void, String>{

     private ProgressBar progressBar;

	 protected void onPreExecute() {
        logger.debug("onPreExecute");
        logger.debug("onPreExecute");
		textNewsConnection.setVisibility(View.GONE);
		pB.setVisibility(View.VISIBLE);

        
    }   
	@Override
	protected String doInBackground(String... arg0) {
	
		try
		{
		
		// TODO Auto-generated method stub
		ServiceHandler serviceHandler=new ServiceHandler();
		String jsonString=serviceHandler.makeServiceCall(ConstantRest.URL_IMAGES,serviceHandler.GET);
		logger.info("json : "+jsonString);
		
		if(jsonString!=null && jsonString.length()!=0)
		{
			try
			{
			
				logger.debug("Recorro el listado de json");
				logger.debug("jsonString : "+jsonString);
				listData=new ArrayList<Galeria>();
				Gson gson=new Gson();
				JSONArray jsonArray=new JSONArray(jsonString);
				for(int i=0; i<jsonArray.length();i++)
				{
				   Galeria galeria=new Galeria();
				   JSONObject jsonObject=jsonArray.getJSONObject(i);
				   galeria.setId_galeria(Integer.parseInt(jsonObject.getString(GaleriaTag.GALERIA_ID)));
				   galeria.setUrl_image(jsonObject.getString(GaleriaTag.GALERIA_URL));
				   listData.add(galeria);
					
				}
			
				
			}catch(JSONException e)
			{
				logger.error("Error JSONExcetion : "+e.toString());
			}
			
		}
		
		}catch(Exception ex)
		{
			logger.debug("Error :"+ex.toString());
			
			
		}
		
		return null;
		
	}
	
	@Override
	protected void onPostExecute(String result)
	{
		if(listData!=null)
		{
			pB.setVisibility(View.GONE);
			logger.debug("listData informacion");
			//((GridView) listView).setAdapter(new ImageAdapter());
			final String[] imageUrls=new String[listData.size()];
			int i=0;
			for(Galeria galeria : listData)
			{
				imageUrls[i]=galeria.getUrl_image();
				i++;
			}
			//se carga la informacion
			logger.debug("mostrar informacion");
			gridView = (GridView) findViewById(R.id.grid_gallery_image);
			((GridView) gridView).setAdapter(new CustomGaleriaAdapter(ActivityGaleria.this, imageLoader, options, imageUrls));
			gridView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					startImagePagerActivity(position,imageUrls);
				}
			});
			
			
		}else
		{
			logger.debug("no contiene datos");
			pB.setVisibility(View.GONE);
			textNewsConnection.setText(ConstantRest.CONNECTION_ERROR);
			textNewsConnection.setVisibility(View.VISIBLE);
			
		}
  			
	}
	
	public void  startImagePagerActivity(int position,String[] imageUrls)
	{
		Intent intent = new Intent(ActivityGaleria.this, ActivityGaleriaImage.class);
		intent.putExtra(Constants.IMAGE, imageUrls);
		intent.putExtra(Constants.IMAGE_POSITION, position);
		startActivity(intent);
		
	}
 
 }
 
 
}
