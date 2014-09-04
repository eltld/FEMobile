package com.fe.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.R.id;
import com.fe.bean.adapter.CustomCarreraAdapter;
import com.fe.bean.adapter.CustomUniversityAdapter;
import com.fe.bean.util.UtilList;
import com.fe.model.Carrera;
import com.fe.model.Constants;
import com.fe.model.Universidad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

/**
 * 
 * @author : David Garcia
 * @Dathe  : 2-09-2014
 *
 */
public class ActivityCarrera extends Activity {


	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityCarrera.class);
	
	TextView textHeader;
	ListView listView;
	ArrayList<Carrera> listData;
	CustomCarreraAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carrera);
	 
	
		
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText(Constants.TAG_UNIVERSITY_HEADER_CARRERA);
	  
	    Intent intent=getIntent();
	    String id_university=intent.getStringExtra(Constants.UNIVERSITY_ID);
	    
	     listData=new ArrayList<Carrera>();
	     UtilList.loadListCarrera();
	     listData=(ArrayList<Carrera>) UtilList.getListCarrera(Integer.parseInt(id_university));
	    
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
	
	
	private void loadData(String id)  
	{
		
		switch(Integer.parseInt(id))
		{
		case 1 : { 
			       logger.debug("FACULTAD DE INGENIERIA");
			       listData.add( new Carrera(1, "LICENCIATURA EN SISTEMAS","Descripcion de Licenciatura en sistemas",
			    		   "5 años",1));
			       listData.add(new Carrera(
			    		     2, 
			    		    "ANALISTA PROGRAMDOR UNIVERSITARIO",
			    		    "Descripcion de Carrera en analista",
			    		    "3 años",
			    		    1));
			     
			       
		         };break;
		  
	    }
		
	}
	
	
	
	
}