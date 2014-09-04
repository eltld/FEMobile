package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.util.UtilList;
import com.fe.model.Carrera;
import com.fe.model.Constants;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 
 * @author : David Garcia 
 * @Dathe  :
 *
 */
public class ActivityCarreraContent extends Activity {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityCarreraContent.class);
  private TextView textHeader;
  private Carrera objCarrera;
  private TextView text_titulo;
  private TextView text_descripcion;
  private TextView text_duracion;
  
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carrera_content);
	 
		Intent intent=getIntent();
		String idCarrera=intent.getStringExtra(Constants.CARRERA_ID);
		textHeader=(TextView)findViewById(R.id.text_header);
		
		logger.debug("Activity Carrera Content : "+idCarrera);
		
	    objCarrera =UtilList.getCarrera(Integer.parseInt(idCarrera));	
	    logger.debug("Carrera : "+objCarrera.toString());
	    
		if(objCarrera!=null)
		{
	      text_titulo=(TextView)findViewById(R.id.text_carreraContentTitulo);
	      text_descripcion=(TextView)findViewById(R.id.text_carreraContentCuerpo);
	      text_duracion=(TextView)findViewById(R.id.text_carreraContentDuracion);
	      
	      if(text_titulo!=null)
			text_titulo.setText(objCarrera.getTitulo_carrera());
		
	        text_duracion.setText(objCarrera.getDuracion_carrera());
			text_descripcion.setText(objCarrera.getDescripcion_carrera());
			
	      
		}
	    
	}
}
