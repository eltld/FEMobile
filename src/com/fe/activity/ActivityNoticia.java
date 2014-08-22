package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.MainActivity;
import com.fe.R;
import com.fe.bean.Noticia;
import com.fe.bean.adapter.CustomNewsAdapter;
import com.fe.bean.json.NoticiaTag;
import com.fe.client.NoticiasClient2;
import com.fe.model.ConstantRest;
import com.fe.service.ServiceHandler;
import com.google.gson.Gson;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;


/**
 * 
 * @author : David Garcia
 * @Dathe  : 19-08-2014 
 *
 */
public class ActivityNoticia extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityNoticia.class);
	private ListView listViewNoticias;
	private ArrayList<Noticia> listData;
    private CustomNewsAdapter adapter;
	 
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
      
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticias);  
         
       logger.debug("Inicio Noticias"); 
       new NoticiasClient().execute(); 
       
     
    }
      
    
    private class NoticiasClient extends AsyncTask<String,Void, String>{

    	LinearLayout linHeaderProgress;
    	
    	private ProgressBar progressBar;
    	
    	protected void onPreExecute() {
            logger.debug("onPreExecute");
           linHeaderProgress=(LinearLayout)findViewById(R.id.linlaHeaderProgress);
           linHeaderProgress.setVisibility(View.VISIBLE);
           
       }
    	
    	@Override
    	protected String doInBackground(String... arg0) {
    		logger.debug("doInBackground NoticiasClient");
    		
    		try
    		{
    		
    		// TODO Auto-generated method stub
    		ServiceHandler serviceHandler=new ServiceHandler();
    		String jsonString=serviceHandler.makeServiceCall(ConstantRest.getUrlNoticias(),serviceHandler.GET);
    		logger.info("json : "+jsonString);
    		
    		
    		if(jsonString!=null)
    		{
    			try
    			{
    			
    				logger.debug("Recorro el listado de json");
    				listData=new ArrayList<Noticia>();
    				Gson gson=new Gson();
    				JSONArray jsonArray=new JSONArray(jsonString);
    				for(int i=0; i<jsonArray.length();i++)
    				{
    				   Noticia noticia=new Noticia();
    				   JSONObject jsonObject=jsonArray.getJSONObject(i);
    				   noticia.setIdNoticia(jsonObject.getString(NoticiaTag.getId()));
    				   noticia.setTituloNoticia(jsonObject.getString(NoticiaTag.getTitulo()));
    				   noticia.setBajadaNoticia(jsonObject.getString(NoticiaTag.getBajada()));
    				   noticia.setDateNoticia(jsonObject.getString(NoticiaTag.getFecha()));
    				   noticia.setUrlImageNoticia(jsonObject.getString(NoticiaTag.getUrl()));
    				   listData.add(noticia);
    					
    				}
    				
    			
    				for(Noticia a: listData)
    				{
    					logger.info(a.toString());
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
    	
    	
    
    	
		protected void onPostExecute(String result)
    	{
    		if(listData.size()!=0)
    		{
    			
    			System.out.println("informacion de datos");
    			 // HIDE THE SPINNER AFTER LOADING FEEDS
    		    linHeaderProgress.setVisibility(View.GONE);
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
			adapter=new CustomNewsAdapter(ActivityNoticia.this, listData);
			listViewNoticias=(ListView)findViewById(R.id.custom_list_noticia);
			listViewNoticias.setAdapter(adapter);
			
			
		}

    }

    
    
}
