package com.fe.activity;

import com.fe.R;
import com.fe.R.id;
import com.fe.bean.ComedorBean;
import com.fe.bean.SecretariaBean;
import com.fe.model.Comedor;
import com.fe.model.Constants;
import com.fe.model.Secretaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


/**
 * 
 * @author David Garcia
 * @Dathe : 26-08-2014
 *
 */
public class ActivityComedorContent extends Activity {

	
	LinearLayout linearCall;
	ImageView image_telefonoCall;
	TextView text_comedor;
	TextView text_direccion;
	TextView text_telefono;
	TextView text_email;
	TextView text_header;
	private ComedorBean comedorBean;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.comedor_content);
	
	//obtenemos la secretaria a cargar
	Intent intent=this.getIntent();
	String idComedor=intent.getStringExtra(Constants.getPutId());
	String tituloComedor=intent.getStringExtra(Constants.getPutTitulo());
	
	//cargo objectos 
	comedorBean=new ComedorBean();
	Comedor comedor=comedorBean.GetBean(idComedor);
    
	
	text_header=(TextView)findViewById(R.id.text_header);
	text_comedor=(TextView)findViewById(R.id.text_comedorNombre);
	text_direccion=(TextView)findViewById(R.id.text_comedorDireccion);
	
	text_comedor.setText(comedor.getNombre_comedor());
	text_direccion.setText(comedor.getDescripcion_comedor());
	
	}
	
	
	
	
	
}
