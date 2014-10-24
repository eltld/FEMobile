package com.feunju.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

import com.feunju.bean.UniversityBean;
import com.feunju.model.Universidad;
import com.feunju.model.constant.Constants;
import com.feunju.R;

public class ActivityUniversityIngreso extends Activity{

	
		private TextView textHeader;
		private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityUniversityIngreso.class);
	    private UniversityBean universidadBean;
		
	    private TextView text_inscripcion;
	    private TextView text_preinscripcion;
	    private TextView text_direccion;
	    private TextView text_requisitos;
	    private TextView text_justified;
	    
	    
	    
	    
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.university_ingreso);
		
			textHeader=(TextView)findViewById(R.id.text_header);
			textHeader.setText(Html.fromHtml("Información Ingreso"));
		 
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
				text_justified=(TextView)findViewById(R.id.text_universityIngreso);
				//text_requisitos=(TextView)findViewById(R.id.text_universityRequisito);
				
			    
				text_inscripcion.setText(Html.fromHtml(obj.getInscripcion()));
				text_preinscripcion.setText(Html.fromHtml(obj.getPreinscripcion()));
				text_direccion.setText(Html.fromHtml(obj.getDireccion()));
				System.out.println("obj.getRequisitos : "+obj.getRequisitos());
				text_justified.setText(Html.fromHtml(obj.getRequisitos()));
				//text_requisitos.setText(obj.getRequisitos());
			  
				String htmlText = " %s ";
			   
			   /* WebView webView = (WebView) findViewById(R.id.webView1);
			    webView.loadData(String.format(htmlText, obj.getRequisitos()), "text/html", "utf-8");
			   */
			}
			
		   logger.debug("informacion :"+ obj.toString());
			
		
		}
	
	
   
}
