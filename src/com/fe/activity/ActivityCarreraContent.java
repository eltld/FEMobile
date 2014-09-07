package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.CarreraBean;
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
  private TextView text_nivel;
  private TextView text_acreditacion;
  private TextView text_perfil;
  private TextView text_alcance;
  private TextView text_duracion;
  private TextView text_grado;
  
  private CarreraBean carreraBean;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carrera_content);
	 
		Intent intent=getIntent();
		String idCarrera=intent.getStringExtra(Constants.CARRERA_ID);
		
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText("Carreras");
		logger.debug("Activity Carrera Content : "+idCarrera);
		
		carreraBean=new CarreraBean(getApplicationContext());
		Carrera objCarrera=carreraBean.get(Long.parseLong(idCarrera));
		
		if(objCarrera!=null)
		{
	      logger.debug("objCarrera : "+objCarrera.toString());
		  text_titulo=(TextView)findViewById(R.id.text_carreraContentTitulo);
	      text_nivel=(TextView)findViewById(R.id.text_carreraContentNivel);
	      text_acreditacion=(TextView)findViewById(R.id.text_carreraContentAcreditacion);
	      text_perfil=(TextView)findViewById(R.id.text_carreraContentPerfil);
	      text_alcance=(TextView)findViewById(R.id.text_carreraContentAlcance);
	     
	      text_titulo.setText(objCarrera.getTitulo_carrera());
	      text_nivel.setText(objCarrera.getNivel_carrera());
	      text_acreditacion.setText(objCarrera.getAcreditacion_carrera());
	      text_perfil.setText(objCarrera.getPerfil_carrera());
	      text_alcance.setText(objCarrera.getAlcance_carrera());
          
		}
	    
	}
}
