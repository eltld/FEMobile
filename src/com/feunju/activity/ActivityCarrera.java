package com.feunju.activity;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feunju.bean.CarreraBean;
import com.feunju.bean.NoticiaBean;
import com.feunju.bean.adapter.CustomCarreraAdapter;
import com.feunju.bean.adapter.CustomNewsAdapter;
import com.feunju.bean.adapter.CustomUniversityAdapter;
import com.feunju.bean.json.NoticiaTag;
import com.feunju.bean.util.LoadCarreraBean;
import com.feunju.bean.util.UtilList;
import com.feunju.edu.R;
import com.feunju.edu.R.id;
import com.feunju.model.Carrera;
import com.feunju.model.Noticia;
import com.feunju.model.Universidad;
import com.feunju.model.constant.ConstantRest;
import com.feunju.model.constant.Constants;
import com.feunju.service.ServiceHandler;
import com.google.gson.Gson;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
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
	ImageView imageViewFiltroCarrera;
	private int id_uni=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carrera);
	 
	   imageViewFiltroCarrera=(ImageView)findViewById(R.id.image_carreraFiltro);
		 
	
		textHeader=(TextView)findViewById(R.id.text_carreraHeader);
		textHeader.setText(Constants.TAG_UNIVERSITY_HEADER_CARRERA);
		pB=(ProgressBar)findViewById(R.id.marker_progress);
	   
		carreraBean=new CarreraBean(getApplicationContext());
		
		
		Intent intent=getIntent();
	    id_university=intent.getStringExtra(Constants.UNIVERSITY_ID);
	   
	    logger.debug("Activity Carrera : "+id_university);
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
	    		logger.debug("doInBackground CarreraClient ");
	    	 	LoadCarreraBean loadCarrera= new LoadCarreraBean();
	    		 
	    		
	    		try
	    		{
	    		
	    			  id_uni=Integer.parseInt(id_university);
	    			 logger.debug("Id University selected : "+id_uni);
	    			 switch(id_uni)
	    			 {
	    			 case Constants.FACU_INGENIERIA_ID:{
	    				listData=new ArrayList<Carrera>();
	    		    	listData= (ArrayList<Carrera>) loadCarrera.loadCarreraIngenieria();
	    		    	};break;
	    			
	    			 case Constants.FACU_HUMANIDADES_ID:
	    			 {
	    				 listData=new ArrayList<Carrera>();
		    		     listData= (ArrayList<Carrera>) loadCarrera.loadCarreraCienciasSociales();
		    		     
	    			 };break;
	    			 case Constants.FACU_AGRAGRIA_ID:{
	    				 listData=new ArrayList<Carrera>();
		    		     listData= (ArrayList<Carrera>) loadCarrera.loadCarreraAgraria();
	    			 };break;
	    			 case Constants.FACU_ECONOMICA_ID:
	    			 {
	    				 listData=new ArrayList<Carrera>();
	    				 listData=(ArrayList<Carrera>)loadCarrera.loadCarreraEconomica();
	    				 
	    			 };break;
	    		
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

			logger.debug("result content");

			if (listData.size() != 0) 
			{
				System.out.println("carreraBean ActivityCarrera listSize : "
						+ listData.size());
				carreraBean.addList(listData);

				logger.debug("actionImageView");
				actionImageView();
				
				logger.debug("action listdata");
				loadListView(listData);
				
				
				logger.debug("actionListView");
				actionListView();

				
			

			
			}
			
           }
	
	/**
	 * Action Image View
	 */
	private void actionImageView()
	{
		

		imageViewFiltroCarrera
				.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						logger.debug("Filtro Carrera");
                         

						final CharSequence items[] = new CharSequence[] {"PreGrado", 
								                                 "Grado"};

						AlertDialog.Builder builder = new AlertDialog.Builder(ActivityCarrera.this);
						builder.setTitle("Seleccione Opción");
						builder.setItems(items, new DialogInterface.OnClickListener() {
						    @Override
						    public void onClick(DialogInterface dialog, int which) {
						     
						    	logger.debug("seleccionado : "+items[which] + " item :"+which);
						        switch(which)
						        {
						        case 0 : 
						        {
						           loadCarreraGrado(Constants.CARRERA_PREGADO);
						        };break;
						        case 1:
						        {
						        	loadCarreraGrado(Constants.CARRERA_GRADO);
						        	
						        };break;
						       }
					}
				});
						builder.show();

		
	         }
	      });
				
  }
	
	/**
	 * Load Carrera de Grado
	 * @param grado
	 */
	private void loadCarreraGrado(int carreraGrado)
	{
		ArrayList<Carrera> list=new ArrayList<Carrera>();
		
		
		for(Carrera carrera:listData)
		{
			if(carrera.getId_grado()==carreraGrado)
				list.add(carrera);
		}
		
		loadListView(listData);
	}
	
	private void actionListView()
	{
		logger.debug("actionListView");
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {

				TextView text_carreraTitulo = (TextView) arg1
						.findViewById(id.text_carreraTitulo);
				TextView text_carreraId = (TextView) arg1
						.findViewById(R.id.text_carreraId);

				logger.debug("Carrera seleccionada : "
						+ text_carreraId.getText().toString());
				Intent intent = new Intent(ActivityCarrera.this,
						ActivityCarreraContent.class);
				intent.putExtra(Constants.CARRERA_ID, text_carreraId.getText().toString());
				intent.putExtra(Constants.UNIVERSITY_ID, id_university);

				startActivity(intent);

			}
		});

	}
	
	private void loadListView(ArrayList<Carrera> listDataVar)
	{
		// load list view
		
		logger.info("onCreate Activity Carrera Universidades");
		listView = (ListView) findViewById(R.id.list_carrera);
		adapter = new CustomCarreraAdapter(ActivityCarrera.this,
				listDataVar);
		listView.setAdapter(adapter);
	}
	
	
	}
	
}