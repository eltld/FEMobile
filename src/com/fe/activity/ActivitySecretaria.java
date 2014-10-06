package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.Util;

import com.fe.MainActivity;
import com.fe.R;
import com.fe.R.id;
import com.fe.bean.adapter.CustomGridAdapter;
import com.fe.bean.adapter.CustomSecretariaAdapter;
import com.fe.bean.util.UtilList;
import com.fe.model.Secretaria;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Clase Correspondiente
 * @author David Garcia
 * @Dathe  : 1-08-2014
 *
 */
public class ActivitySecretaria extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySecretaria.class);
	
	ListView listView;
	TextView textViewHeader;
	ArrayList<Secretaria> listSecretaria;
	CustomSecretariaAdapter adapter;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secretaria);
		
		//obtenemos parametros
		Intent intent=getIntent();
		String title_header=intent.getStringExtra("title_header");
		logger.debug("title_header : "+title_header);
		textViewHeader=(TextView)findViewById(R.id.text_header);
		textViewHeader.setText(title_header);
		
		new SecretariaAsyncTask().execute();
	    
		listView=(ListView)findViewById(R.id.list_secretaria);
		
	    //events
	    listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				
				TextView text_secretariaTitulo=(TextView)arg1.findViewById(id.text_secretariaTitulo);
				TextView text_secretariaId=(TextView)arg1.findViewById(R.id.text_idSecretaria);
				logger.debug("on Item Click secretaria Id : "+text_secretariaId.getText().toString());
				logger.debug("on item clicks secretaria : "+text_secretariaTitulo.getText().toString());
				
				Intent intent=new Intent(ActivitySecretaria.this,ActivitySecretariaContent.class);
				intent.putExtra("titulo_secretaria",text_secretariaTitulo.getText().toString());
				intent.putExtra("id_secretaria",text_secretariaId.getText().toString());
		        startActivity(intent);
				
			}
		});

	}
	
	protected class SecretariaAsyncTask extends AsyncTask<Void, Void, Boolean>
   	{
	    	private ArrayList<String> tempList = new ArrayList<String>();
	
        	@Override
        	protected Boolean doInBackground( Void... params ) 
        	{    
        		listSecretaria=new ArrayList<Secretaria>();
        		//listSecretaria=(ArrayList<Secretaria>) UtilList.loadListSecretaria();
        		listSecretaria.add(
        				new Secretaria("1",
        						      "SECRETARIA GENERAL LEGAL Y TECNICA",
        						      " Dr. César Guillermo Farfán", 
        						      "descripcion",
        						      "Av. Bolivia 1239 S. S. de Jujuy", 
        						      "+54-(388)-4221-517",
        						      "gfarfan@unju.edu.ar "));
        		listSecretaria.add( new Secretaria(
        				                 "2",
        				                 "SECRETARIA DE ADMINISTRACION",
        				                 "CPN Fernanda Colque",
        				                 "",
        				                 "Av. Bolivia 1239 S. S. de Jujuy",
        				                 "+54-(388)-4221-514",
        				                 "secadmin@unju.edu.ar "));
        		
        		listSecretaria.add(new Secretaria(
        				                           "3",
        				                           "SECRETARIA DE CIENCIA Y TECNICA",
        				                           "Dra. María Graciela del Valle Bovi Mitre",
        				                           "",
        				                           "Av. Bolivia 1239 S. S. de Jujuy",
        				                           "+54-(388)-4221-505",
        				                           "secretariasectergb@unju.edu.ar"));
        		listSecretaria.add(new Secretaria(
        				                            "4",
        				                           "SECRETARIA DE EXTENSION UNIVERSITARIA",
        				                            "Dra. Elena Ester Belli",
        				                            "",
        				                            "Av. Bolivia 1239 S. S. de Jujuy",
        				                            "+54-(388)-4244-100 ",
        				                            "seu@unju.edu.ar"));
        		listSecretaria.add(new Secretaria(
        				                           "5",
        				                           "SECRETARIO DE ASUNTOS ACADEMICOS",
        				                           "Dr. Julio César Arrueta",
        				                           "",
        				                           "Av. Bolivia 1239 S. S. de Jujuy",
        				                           "+54-(388)-4221-504",
        				                           "c.arrueta@unju.edu.ar"));
        		listSecretaria.add(new Secretaria(
        				                          "6",
        				                         "SECRETARIO DE BIENESTAR UNIVERSITARIO",
        				                         "Sr. Diego Esteban Gutierrez", 
        				                         ""
        				                         , "Av. Bolivia 1239 S. S. de Jujuy", 
        				                         " +54-(388)-4221-500", 
        				                         "sbu@unju.edu.ar"));
        		
        	
    	    	return true;
        	}
            
        	@Override
        	protected void onPreExecute() 
        	{
    	    	super.onPreExecute();
        	}
            
        	@Override
        	protected void onCancelled()
        	{
    	    	super.onCancelled();
        	}
            
        	@Override
        	protected void onPostExecute(Boolean b) {
    	    	
        		//load list view
        		logger.info("onCreate ActivityOficina");
        		
        	    adapter=new CustomSecretariaAdapter(ActivitySecretaria.this,listSecretaria);
        	  
        	    listView.setAdapter(adapter);
        	}
}

	
	 
	
}
