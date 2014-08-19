package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.MainActivity;
import com.fe.client.NoticiasClient;

import android.app.Activity;
import android.os.Bundle;


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
      
	
}
