package com.feunju.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feunju.activity.ActivityComedor.ComedorAsyncTask;
import com.feunju.bean.UniversityBean;
import com.feunju.model.Universidad;
import com.feunju.model.constant.Constants;
import com.feunju.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
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
		textHeader.setText(Html.fromHtml("Información"));
		Intent intent=getIntent();
		String id_university=intent.getStringExtra(Constants.UNIVERSITY_ID);
		logger.debug("id_university : "+id_university);
		universidadBean=new UniversityBean(getApplicationContext());
		Universidad obj=new Universidad();
		 
		obj=universidadBean.get(Long.parseLong(id_university));
		
		if(obj!=null)
		{
			text_nombre=(TextView)findViewById(R.id.text_universityInfoTitulo);
			text_direccion=(TextView)findViewById(R.id.text_universityInscripcion);
			text_codigo=(TextView)findViewById(R.id.text_universityInformes);
			text_telefono=(TextView)findViewById(R.id.text_universityRequisito);
			text_fax=(TextView)findViewById(R.id.text_universityInfoFax);
			text_email=(TextView)findViewById(R.id.text_universityInfoEmail);
			text_web=(TextView)findViewById(R.id.text_universityInfoWeb);
			
		    
			text_nombre.setText(obj.getNombre_universidad());
			text_direccion.setText(obj.getDireccion());
			text_codigo.setText(obj.getCodigoPostal());
			text_telefono.setText(obj.getTelefono());
			text_fax.setText(obj.getFax());
			text_email.setText(obj.getEmail());
			text_web.setText(obj.getWeb());
		  
		}
		
	   logger.debug("informacion :"+ obj.toString());
	  
		
	}
	
}
