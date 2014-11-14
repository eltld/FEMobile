package com.feunju.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feunju.bean.ComedorBean;
import com.feunju.bean.adapter.CustomComedorAdapter;
import com.feunju.bean.adapter.CustomSecretariaAdapter;
import com.feunju.bean.util.UtilList;
import com.feunju.database.helper.ComedorDbHelper;
import com.feunju.edu.R;
import com.feunju.edu.R.id;
import com.feunju.model.Comedor;
import com.feunju.model.Secretaria;
import com.feunju.model.constant.Constants;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
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
		textViewHeader.setText(Html.fromHtml("Comedores"));
		
		listComedor=new ArrayList<Comedor>();
		loadData();
		
		//cargo objectos 
		comedorBean=new ComedorBean(getApplicationContext());
		comedorBean.addList(listComedor);
		
		
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
	
	
	private void loadData()
	{
		
		Comedor comedor=new Comedor();
		comedor.setId_comedor(1);
		comedor.setNombre_comedor("Comedor 1");
		comedor.setResponsable_comedor("Laura Burgos");
		comedor.setDescripcion_comedor("");
		comedor.setCalle_comedor("Alberdi 11");
		comedor.setBarrio_comedor("Los Naranjos");
		comedor.setLat_comedor("0");
		comedor.setLong_comedor("0");
		listComedor.add(comedor);
		
		comedor=new Comedor();
		comedor.setId_comedor(2);
		comedor.setNombre_comedor("Comedor 2");
		comedor.setResponsable_comedor("Celestina Burgos");
		comedor.setDescripcion_comedor("");
		comedor.setCalle_comedor("La ISO Bustament 74");
		comedor.setBarrio_comedor("Barrio Los Naranjos");
		comedor.setLat_comedor("0");
		comedor.setLong_comedor("0");
		listComedor.add(comedor);
		
		comedor=new Comedor();
		comedor.setId_comedor(3);
		comedor.setNombre_comedor("Comedor 3");
		comedor.setResponsable_comedor("Ramon Ruiz");
		comedor.setDescripcion_comedor("");
		comedor.setCalle_comedor("Balcarce 357");
		comedor.setBarrio_comedor("Barrio Centro");
		comedor.setLat_comedor("-24.184930");
		comedor.setLong_comedor("-65.305652");
		listComedor.add(comedor);
		
	    
	}
	
	
	
	
	
	
}
