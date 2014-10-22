package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import com.fe.R;
import com.fe.R.id;
import com.fe.bean.ComedorBean;
import com.fe.bean.SecretariaBean;
import com.fe.model.Comedor;
import com.fe.model.Secretaria;
import com.fe.model.constant.Constants;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
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
	List<Comedor> listComedor; 
	private TextView textViewHeader;
	
	private ComedorBean comedorBean;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.comedor_content);
	
	
	
	textViewHeader=(TextView)findViewById(R.id.text_header);
	textViewHeader.setText(Html.fromHtml("Comedor"));
	
	loadData();
	//obtenemos la secretaria a cargar
	Intent intent=this.getIntent();
	String idComedor=intent.getStringExtra(Constants.COMEDOR_ID);
	String tituloComedor=intent.getStringExtra(Constants.COMEDOR_TITULO);
	
	//cargo objectos 
	//comedorBean=new ComedorBean(getApplicationContext());
	
	
	
	Comedor comedor=new Comedor();
	comedor=getComedor(Integer.parseInt(idComedor));
	
	System.out.println("Comedor  : "+comedor.toString());
	
	if(comedor!=null)
	{
	text_header=(TextView)findViewById(R.id.text_header);
	text_comedor=(TextView)findViewById(R.id.text_comedorContentNombre);
	text_responsable=(TextView)findViewById(R.id.text_comedorContentResponsable);
	text_calle=(TextView)findViewById(R.id.text_comedorContentCalle);
	text_barrio=(TextView)findViewById(R.id.text_comedorContentBarrio);
	
	text_comedor.setText(comedor.getNombre_comedor());
	text_responsable.setText(comedor.getResponsable_comedor());
	text_calle.setText(comedor.getCalle_comedor());
	text_barrio.setText(comedor.getBarrio_comedor());
	
	final String comedor_lat=comedor.getLat_comedor();
	final String comedor_long=comedor.getLong_comedor();
	final String comedor_nombre=comedor.getNombre_comedor();
	
	ImageView image_ubicacion=(ImageView)findViewById(R.id.image_comedorContentUbicacion);
	image_ubicacion.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(ActivityComedorContent.this,ActivityComedorMap.class);
			intent.putExtra(Constants.COMEDOR_LAT,comedor_lat);
			intent.putExtra(Constants.COMEDOR_LONG,comedor_long);
	        intent.putExtra(Constants.COMEDOR_NOMBRE, comedor_nombre);
			startActivity(intent);
			
		}
	});
	
	
	}
	
	}
	
	

	private void loadData()
	{
		
		 listComedor =new ArrayList<Comedor>();
		Comedor comedor=new Comedor();
		comedor.setId_comedor(1);
		comedor.setNombre_comedor("Comedor 1");
		comedor.setResponsable_comedor("Laura Burgos");
		comedor.setDescripcion_comedor("");
		comedor.setCalle_comedor("Alberdi 11");
		comedor.setBarrio_comedor("Los Naranjos");
		comedor.setLat_comedor("");
		comedor.setLong_comedor("");
		comedor.setLat_comedor("-24.188430");
		comedor.setLong_comedor("-65.293757");
		
		
		listComedor.add(comedor);
		
		comedor=new Comedor();
		comedor.setId_comedor(2);
		comedor.setNombre_comedor("Comedor 2");
		comedor.setResponsable_comedor("Celestina Burgos");
		comedor.setDescripcion_comedor("");
		comedor.setCalle_comedor("Bustamente 74");
		comedor.setBarrio_comedor("Barrio Los Naranjos");
		comedor.setLat_comedor("-24.188102");
		comedor.setLong_comedor("-65.296246");
		listComedor.add(comedor);
		
		comedor=new Comedor();
		comedor.setId_comedor(3);
		comedor.setNombre_comedor("Comedor 3");
		comedor.setResponsable_comedor("Ramon Ruiz");
		comedor.setDescripcion_comedor("");
		comedor.setCalle_comedor("Balcarce 357");
		comedor.setBarrio_comedor("Barrio Centro");
		comedor.setLat_comedor("-24.184621");
		comedor.setLong_comedor("-65.305638");
		listComedor.add(comedor);
		
	    
	}
	
	public Comedor getComedor(int idComedor)
	{
		for(Comedor com:listComedor)
		{
			if(com.getId_comedor()==idComedor)
			    return com;
		}
		
		return null;
	}
	
	
	
	
}
