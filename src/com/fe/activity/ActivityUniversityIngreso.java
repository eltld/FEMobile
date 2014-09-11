package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.UniversityBean;
import com.fe.model.Constants;
import com.fe.model.Universidad;

public class ActivityUniversityIngreso extends Activity{

	
		private TextView textHeader;
		private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityUniversityIngreso.class);
	    private UniversityBean universidadBean;
		
	    private TextView text_inscripcion;
	    private TextView text_preinscripcion;
	    private TextView text_direccion;
	    private TextView text_requisitos;
	    
	    
	    
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.university_ingreso);
		
			textHeader=(TextView)findViewById(R.id.text_header);
			textHeader.setText("INFORMACION INGRESO");
		 
			Intent intent=getIntent();
			String id_university=intent.getStringExtra(Constants.UNIVERSITY_ID);
			logger.debug("id_university : "+id_university);
			universidadBean=new UniversityBean(getApplicationContext());
			Universidad obj=new Universidad();
			 
			obj=universidadBean.get(Long.parseLong(id_university));
			
			if(obj!=null)
			{
				text_inscripcion=(TextView)findViewById(R.id.text_universityInscripcion);
				text_preinscripcion=(TextView)findViewById(R.id.text_universityPreinscripcion);
				text_direccion=(TextView)findViewById(R.id.text_universityInformes);
				text_requisitos=(TextView)findViewById(R.id.text_universityRequisito);
				
			    
				text_inscripcion.setText(obj.getInscripcion());
				text_preinscripcion.setText(obj.getPreinscripcion());
				text_direccion.setText(obj.getDireccion());
				text_requisitos.setText(obj.getRequisitos());
			  
			}
			
		   logger.debug("informacion :"+ obj.toString());
			
		
		}
	
	
   
}