package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.activity.ActivityComedor.ComedorAsyncTask;
import com.fe.bean.UniversityBean;
import com.fe.model.Constants;
import com.fe.model.Universidad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityUniversityInformacion extends Activity{

	private TextView textHeader;
	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityUniversityInformacion.class);
    private UniversityBean universidadBean;
	
    private TextView text_nombre;
    private TextView text_direccion;
    private TextView text_codigo;
    private TextView text_telefono;
    private TextView text_fax;
    private TextView text_email;
    private TextView text_web;
    
    
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.university_informacion);
	    
		
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText("INFORMACION ADMINISTRATIVA");
		Intent intent=getIntent();
		String id_university=intent.getStringExtra(Constants.UNIVERSITY_ID);
		logger.debug("id_university : "+id_university);
		universidadBean=new UniversityBean(getApplicationContext());
		Universidad obj=new Universidad();
		 
		obj=universidadBean.get(Long.parseLong(id_university));
		
	   logger.debug("informacion :"+ obj.toString());
	  
		
	}
	
}
