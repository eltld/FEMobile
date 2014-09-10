package com.fe.activity;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.R.id;
import com.fe.bean.CarreraBean;
import com.fe.bean.NoticiaBean;
import com.fe.bean.adapter.CustomCarreraAdapter;
import com.fe.bean.adapter.CustomNewsAdapter;
import com.fe.bean.adapter.CustomUniversityAdapter;
import com.fe.bean.json.NoticiaTag;
import com.fe.bean.util.LoadCarreraBean;
import com.fe.bean.util.UtilList;
import com.fe.model.Carrera;
import com.fe.model.ConstantRest;
import com.fe.model.Constants;
import com.fe.model.Noticia;
import com.fe.model.Universidad;
import com.fe.service.ServiceHandler;
import com.google.gson.Gson;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * 
 * @author : David Garcia
 * @Dathe  : 2-09-2014
 *
 */
public class ActivityCarrera extends Activity {


	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityCarrera.class);
	 String id_university;
	TextView textHeader;
	ListView listView;
	ProgressDialog pDialog;
	ProgressBar pB;
	CarreraBean carreraBean=null;
	ArrayList<Carrera> listData;
	CustomCarreraAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carrera);
	 
	
		
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText(Constants.TAG_UNIVERSITY_HEADER_CARRERA);
		pB=(ProgressBar)findViewById(R.id.marker_progress);
	   
		carreraBean=new CarreraBean(getApplicationContext());
		
		
		Intent intent=getIntent();
	    id_university=intent.getStringExtra(Constants.UNIVERSITY_ID);
	   
	     new ActivityCarreraClient().execute();  
      
    }
	
	
	@SuppressWarnings("unused")
	private class ActivityCarreraClient extends AsyncTask<String,Void, String>{

	    	private ProgressBar progressBar;
	    	
	    	protected void onPreExecute() {
	            logger.debug("onPreExecute");
	           
	           
	           
	       }
	    	
	    	@Override
	    	protected String doInBackground(String... arg0) {
	    		logger.debug("doInBackground NoticiasClient");
	    		
	    		try
	    		{
	    		
	    			 int id_uni=Integer.parseInt(id_university);
	    			    
	    			if(id_uni==Constants.FACU_INGENIERIA_ID)
	    		    {
	    				listData=new ArrayList<Carrera>();
	    		    	logger.debug("Seleccionado ingeneria");
	    		    	listData=new ArrayList<Carrera>();
	    		    	LoadCarreraBean loadCarrera= new LoadCarreraBean();
	    		    	
	    		    	listData= (ArrayList<Carrera>) loadCarrera.loadCarreraIngenieria();
	    		    }
	    		    else if(id_uni==Constants.FACU_AGRAGRIA_ID)
	    		    {
	    		    	listData=(ArrayList<Carrera>)UtilList.loadCarreraEconomica();
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
	    	    System.out.println("informacion de datos");
	    	    // HIDE THE SPINNER AFTER LOADING FEEDS
	    	  
	    	    displayContent(result);
	    			
	    		
	    	}
			
			public void displayContent(String result)
			{
				
				  if(listData.size()!=0)
	    		    { 
	    		    	System.out.println("carreraBean ActivityCarrera listSize : "+listData.size());
	    		    	carreraBean.addList(listData) ;
	    		    }		
				//load list view
				logger.info("onCreate Activity Carrera Universidades");
				listView=(ListView)findViewById(R.id.list_carrera);
			    adapter=new CustomCarreraAdapter(ActivityCarrera.this,listData);
			    listView.setAdapter(adapter);
			    
			    listView.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
							long arg3) {

						TextView text_carreraTitulo=(TextView)arg1.findViewById(id.text_carreraTitulo);
						TextView text_carreraId=(TextView)arg1.findViewById(R.id.text_carreraId);
						
						logger.debug("Carrera seleccionada : "+text_carreraId.getText().toString());
						Intent intent=new Intent(ActivityCarrera.this,ActivityCarreraContent.class);
					    intent.putExtra(Constants.CARRERA_ID,text_carreraId.getText().toString());
					    
						startActivity(intent);
						
						
					}
				});
				
				
			}

			
			
			
			
   }
	
}