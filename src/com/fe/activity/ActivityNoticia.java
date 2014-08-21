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
import android.widget.ListView;


/**
 * 
 * @author : David Garcia
 * @Dathe  : 19-08-2014 
 *
 */
public class ActivityNoticia extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityNoticia.class);

	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
      
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.rest_ful_webservice);  
         
       logger.debug("Inicio Noticias"); 
       new NoticiasClient().execute();
   
    }
      
	
    
    
    
    
    private class NoticiasClient extends AsyncTask<String,Void, String>{

    	private ArrayList<Noticia> listNoticia;
        private ListView listViewNoticias;
        private CustomNewsAdapter adapter;
    	
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
    				listNoticia=new ArrayList<Noticia>();
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
    				   listNoticia.add(noticia);
    					
    				}
    				
    			
    				for(Noticia a: listNoticia)
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
    	
    	
    	protected void onPreExecute() {
             logger.debug("onPreExecute");
             
        }
    	
		protected void onPostExecute(String result)
    	{
    		
    		
    		logger.debug("onPostExecute result");
    	    listViewNoticias=(ListView)findViewById(R.id.custom_list_noticia);
    	    /* Update parsing  json to ListView */ 
    	    adapter=new CustomNewsAdapter(ActivityNoticia.this, listNoticia);
    	    if(adapter==null)
    	    	logger.debug("adapter is null");
    	    else 
    	    	logger.debug("adapter no es null");
    	    
    	    
    	    //listViewNoticias.setAdapter(adapter);
    		
    		
    	}

    }

    
    
}
