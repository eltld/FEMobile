package com.fe.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.activity.ActivityNoticia;
import com.fe.bean.adapter.CustomNewsAdapter;
import com.fe.bean.json.NoticiaTag;
import com.fe.model.ConstantRest;
import com.fe.model.Noticia;
import com.fe.service.ServiceHandler;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;



import android.app.IntentService;
import android.app.ListActivity;
import android.os.AsyncTask;
import android.widget.ListAdapter;
import android.widget.ListView;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;


/**
 * Class Noticia Client que invoca al servicio 
 * de Noticas 
 * @author David Garcia
 *
 */
public class NoticiasClient2 extends AsyncTask<String,Void, String>{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(NoticiasClient2.class);
  	private ArrayList<Noticia> listNoticia;
    private ListView listViewNoticias;
	
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
	
	protected void onPostExecute(Void result)
	{
		logger.debug("onPostExecute result");
	    /*listViewNoticias=(ListView)findViewById(R.id.custom_list_noticia);
	    /* Update parsing  json to ListView */ 
	    /*listViewNoticias.setAdapter(new CustomListNoticiaAdapter(this, listData));
		*/
		
	}

}
