package com.fe.activity;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.AutoridadBean;
import com.fe.bean.CarreraBean;
import com.fe.bean.NoticiaBean;
import com.fe.bean.adapter.CustomAutoridadAdapter;
import com.fe.bean.adapter.CustomNewsAdapter;
import com.fe.bean.json.AutoridadTag;
import com.fe.bean.json.NoticiaTag;
import com.fe.model.Autoridades;
import com.fe.model.ConstantRest;
import com.fe.model.Constants;
import com.fe.model.Noticia;
import com.fe.service.ServiceHandler;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityAutoridad extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityAutoridad.class);
	private ListView listViewAutoridad;
	private ArrayList<Autoridades> listData;
    private CustomAutoridadAdapter adapter;
    private TextView textViewHeader;
    ProgressDialog pDialog;
    ProgressBar pB;
    DisplayImageOptions options;
	protected ImageLoader imageLoader;
	AutoridadBean autoridadBean=null;
	 
    private String string_header;
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
      
         super.onCreate(savedInstanceState);
         setContentView(R.layout.autoridad);  
         Intent intent=new Intent();
         string_header=intent.getStringExtra("title_header");
         textViewHeader=(TextView)findViewById(R.id.text_header);
		
         textViewHeader.setText("Autoridades");
			
         logger.debug("Inicio Noticias : "+string_header); 
         
         
         pB=(ProgressBar)findViewById(R.id.marker_progress);
      	
         autoridadBean=new AutoridadBean(getApplicationContext());

         
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
         
     	
     	 
         new AutoridadClient().execute(); 
       
     
         
    }
      
    
    private class AutoridadClient extends AsyncTask<String,Void, String>{

    	
    	
    	private ProgressBar progressBar;
    	
    	protected void onPreExecute() {
            logger.debug("onPreExecute");
           
             pB.setVisibility(View.VISIBLE);
           
       }
    	
    	@Override
    	protected String doInBackground(String... arg0) {
    		logger.debug("doInBackground AutoridadClient");
    		
    		try
    		{
    		
    		// TODO Auto-generated method stub
    		ServiceHandler serviceHandler=new ServiceHandler();
    		String jsonString=serviceHandler.makeServiceCall(ConstantRest.URL_AUTORIDADES,serviceHandler.GET);
    		logger.info("json : "+jsonString);
    		
    		
    		if(jsonString!=null)
    		{
    			try
    			{
    			
    				logger.debug("Recorro el listado de json");
    				listData=new ArrayList<Autoridades>();
    				Gson gson=new Gson();
    				JSONArray jsonArray=new JSONArray(jsonString);
    				for(int i=0; i<jsonArray.length();i++)
    				{
    				   Autoridades autoridad=new Autoridades();
    				   JSONObject jsonObject=jsonArray.getJSONObject(i);
    				   autoridad.setIdAutoridad(jsonObject.getString(AutoridadTag.AUTORIDAD_ID));
    				   autoridad.setTituloAutoridad(jsonObject.getString(AutoridadTag.AUTORIDAD_TITULO));
    				   autoridad.setNombreAutoridad(jsonObject.getString(AutoridadTag.AUTORIDAD_NOMBRE));
    				   autoridad.setEmailAutoridad(jsonObject.getString(AutoridadTag.AUTORIDAD_EMAIL));
    				   autoridad.setTelefonoAutoridad(jsonObject.getString(AutoridadTag.AUTORIDAD_TELEFONO));
    				   autoridad.setImageUrlAutoridad(jsonObject.getString(AutoridadTag.AUTORIDAD_URL));
    				   listData.add(autoridad);
    					
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
    	
    	
    	protected void onProgressUpdate(Integer... progress){
    		pB.setProgress(progress[0]);
    		}
    	
		protected void onPostExecute(String result)
    	{
    		if(listData.size()!=0)
    		{
    			for(Autoridades autoridad : listData)
    			{ autoridadBean.add(autoridad);}
    			
    			System.out.println("informacion de datos");
    			 // HIDE THE SPINNER AFTER LOADING FEEDS
    			  pB.setVisibility(View.GONE);
    			displayContent(result);
    			
    		}
    		else
    		{
    			System.out.println("no contiene datos");
    		}
      			
    	}
		
		public void displayContent(String result)
		{
			System.out.println("Result : "+result);
			adapter=new CustomAutoridadAdapter(ActivityAutoridad.this, listData,imageLoader,
					options);
			listViewAutoridad=(ListView)findViewById(R.id.custom_list_autoridad);
			listViewAutoridad.setAdapter(adapter);
			
			listViewAutoridad.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					logger.debug("click noticia");
					
					
					TextView text_noticiaId=(TextView)arg1.findViewById(R.id.text_noticiaId);
					Intent intent = new Intent(ActivityAutoridad.this, ActivityNoticiaContent.class);
					intent.putExtra(Constants.NOTICIA_ID, text_noticiaId.getText().toString());
		
					startActivity(intent);
				}
			});
		}

    }

    
    
}