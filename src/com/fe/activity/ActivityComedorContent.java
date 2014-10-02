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
	TextView text_responsable;
	TextView text_calle;
	TextView text_barrio;
	private ComedorBean comedorBean;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.comedor_content);
	
	//obtenemos la secretaria a cargar
	Intent intent=this.getIntent();
	String idComedor=intent.getStringExtra(Constants.COMEDOR_ID);
	String tituloComedor=intent.getStringExtra(Constants.COMEDOR_TITULO);
	
	//cargo objectos 
	comedorBean=new ComedorBean(getApplicationContext());
	
	Comedor comedor=new Comedor();
	comedor=comedorBean.get(Long.parseLong(idComedor));
	
	System.out.println("Comedor  : "+comedor.toString());
	
	if(comedor!=null)
	{
	text_header=(TextView)findViewById(R.id.text_header);
	text_comedor=(TextView)findViewById(R.id.text_comedorNombre);
	text_responsable=(TextView)findViewById(R.id.text_comedorContentResponsable);
	text_calle=(TextView)findViewById(R.id.text_comedorContentCalle);
	text_barrio=(TextView)findViewById(R.id.text_comedorContentBarrio);
	
	text_comedor.setText(comedor.getNombre_comedor());
	text_responsable.setText(comedor.getResponsable_comedor());
	text_calle.setText(comedor.getCalle_comedor());
	text_barrio.setText(comedor.getBarrio_comedor());
	
	}
	
	}
	
	
	
}
