package com.fe.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.activity.ActivityNoticia;
import com.fe.model.ConstantRest;
import com.fe.service.ServiceHandler;

import android.app.IntentService;
import android.os.AsyncTask;


/**
 * Class Noticia Client que invoca al servicio 
 * de Noticas 
 * @author David Garcia
 *
 */
public class NoticiasClient extends AsyncTask<String,Void, String>{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(NoticiasClient.class);

	

	
	@Override
	protected String doInBackground(String... arg0) {
		logger.debug("doInBackground NoticiasClient");
		
		try
		{
		
		// TODO Auto-generated method stub
		ServiceHandler serviceHandler=new ServiceHandler();
		String json=serviceHandler.makeServiceCall(ConstantRest.getUrlNoticias(),serviceHandler.GET);
		logger.info("json : "+json);
		
		}catch(Exception ex)
		{
			logger.debug("Error :"+ex.toString());
			
			
		}
		
		return null;
	
	
	}
	
	
	protected void onPreExecute() {
         logger.debug("onPreExecute");
         
    }
 
	
}
