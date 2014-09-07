package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.R.id;
import com.fe.bean.ComedorBean;
import com.fe.bean.adapter.CustomComedorAdapter;
import com.fe.bean.adapter.CustomSecretariaAdapter;
import com.fe.bean.util.UtilList;
import com.fe.database.helper.ComedorDbHelper;
import com.fe.model.Comedor;
import com.fe.model.Constants;
import com.fe.model.Secretaria;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * 
 * @author David Garcia
 * @Dathe  26-08-2014
 *
 */
public class ActivityComedor extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityComedor.class);
	
	 /*private GoogleMap map;
	 */
	
	private ListView listView;
	private CustomComedorAdapter adapter;
	private TextView textViewHeader;
	private ArrayList<Comedor> listComedor;
	private ComedorBean comedorBean=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comedor);
	    
		logger.debug("inicializar pagina comedor");
		//obtenemos parametros
		Intent intent=getIntent();
		String title_header=intent.getStringExtra("title_header");
		logger.debug("title_header : "+title_header);
		textViewHeader=(TextView)findViewById(R.id.text_header);
		textViewHeader.setText(title_header);
		
		//cargo objectos 
		comedorBean=new ComedorBean(getApplicationContext());
		
		logger.debug("insert comedor que onda");
		Comedor comedor=new Comedor();
		comedor.setId_comedor(1);
		comedor.setNombre_comedor("Comedor 1");
		comedor.setDescripcion_comedor("comedor informacion");
		comedorBean.add(comedor);
		
	
	
		
	}
	
	
	
	protected class ComedorAsyncTask extends AsyncTask<Void, Void, Boolean>
   	{

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
		protected Boolean doInBackground(Void... arg0) {
			listComedor=new ArrayList<Comedor>();
			listComedor.add(new Comedor(1, "Bustamante","Comedor Bustamante", "00","00"));
		    listComedor.add(new Comedor(2,"Sociedad Obrera","Sociedad","00","00"));
		    listComedor.add(new Comedor(3, "Balcarce","Balcarce","0","0"));
			
			return true;
		}
		
		@Override
    	protected void onPostExecute(Boolean b) {
	    	
    		//load list view
    		logger.info("onCreate Activity Comedor");
    		listView=(ListView)findViewById(R.id.list_comedor);
    	    adapter=new CustomComedorAdapter(ActivityComedor.this,listComedor);
    	    listView.setAdapter(adapter);
    	
		    listView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					
					TextView text_comedorNombre=(TextView)arg1.findViewById(id.text_comedorNombre);
					TextView text_comedorId=(TextView)arg1.findViewById(R.id.text_comedorId);
					
					Intent intent=new Intent(ActivityComedor.this,ActivityComedorContent.class);
					intent.putExtra(Constants.COMEDOR_TITULO,text_comedorNombre.getText().toString());
					intent.putExtra(Constants.COMEDOR_ID,text_comedorId.getText().toString());
			        startActivity(intent);
				}
			});
		}
   	
   	    
   	
   	}
	
	
	
	
	
}
