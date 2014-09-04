package com.fe.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.SecretariaBean;
import com.fe.bean.adapter.CustomComedorAdapter;
import com.fe.bean.adapter.CustomUniversityAdapter;
import com.fe.model.Constants;
import com.fe.model.Universidad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


/**
 * 
 * @author : David Garcia 
 * @dathe  : 2-09-2014
 *
 */
public class ActivityUniversity extends Activity {


	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityUniversity.class);
	
	TextView textHeader;
	ListView listView;
	ArrayList<Universidad> listData;
	CustomUniversityAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.university);
	 
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText(Constants.TAG_UNIVERSITY_HEADER);
	     	
		loadData();
		//load list view
		logger.info("onCreate Activity Universidades");
		listView=(ListView)findViewById(R.id.list_university);
	    adapter=new CustomUniversityAdapter(ActivityUniversity.this,listData);
	    listView.setAdapter(adapter);
	    
	    listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
	
				final TextView text_id=(TextView)arg1.findViewById(R.id.text_universityId);
				
				final CharSequence items[] = new CharSequence[] {"Informacion Administrativa", 
						                                 "Carreras", "Ingreso", "Localizacion"};

				AlertDialog.Builder builder = new AlertDialog.Builder(ActivityUniversity.this);
				builder.setTitle("Seleccione Acci{on");
				builder.setItems(items, new DialogInterface.OnClickListener() {
				    @Override
				    public void onClick(DialogInterface dialog, int which) {
				     
				    	logger.debug("seleccionado : "+items[which] + " item :"+which);
				        switch(which)
				        {
				        case 0 : 
				        {
				           //informacion 
				        	logger.debug("Informacion Administrativa");
				        	Intent intent=new Intent(ActivityUniversity.this,ActivityUniversityInformacion.class);
				        	intent.putExtra(Constants.UNIVERSITY_ID,text_id.getText().toString());
				        	startActivity(intent);
				        	
				        };break;
				        case 1 : {
				        	logger.debug("Carreras");
				        	Intent intent=new Intent(ActivityUniversity.this, ActivityCarrera.class);
				        	intent.putExtra(Constants.UNIVERSITY_ID,text_id.getText().toString());
				        	startActivity(intent);
				        	
				        };break;
				        case 2 : {};break;
				        }
				    
				    }
				});
				builder.show();
				
			
			}
		});
		
   }
	
	private void loadData()
	{
		listData=new ArrayList<Universidad>();
		listData.add(new Universidad(1,"FACULTAD DE INGENIERIA","Descripcion Facultad"));
		listData.add(new Universidad(2, "FACULTAD DE CIENCIAS ECONOMICAS","Facultad ciencias"));
		listData.add(new Universidad(3,"FACULTAD DE HUMANIDADES","humanidades"));
		listData.add(new Universidad(4,"FACULTAD DE AGRARIAS", ""));
		listData.add(new Universidad(5,"ESCUELA DE MINAS",""));
		
		
		
	}
	
}