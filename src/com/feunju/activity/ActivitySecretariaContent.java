package com.feunju.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feunju.bean.SecretariaBean;
import com.feunju.model.Secretaria;
import com.feunju.R;
import com.feunju.R.id;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivitySecretariaContent extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySecretariaContent.class);
	
	
	LinearLayout linearCall;
	ImageView image_telefonoCall;
	TextView text_secretario;
	TextView text_direccion;
	TextView text_telefono;
	TextView text_email;
	TextView text_header;
	TextView text_secretaria;
	
	private SecretariaBean secretariaBean;
	private int numSecretaria=0;
	private int currentSecretaria=0;
	private int idSecretaria=0;
	private ImageView image_call_secretaria;
	private List<Secretaria> listSecretaria;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secretaria_content);
		
		logger.debug("Content Secretaria");
		//obtenemos la secretaria a cargar
		Intent intent=this.getIntent();
		String id_secretaria=intent.getStringExtra("id_secretaria");
		String titulo_secretaria=intent.getStringExtra("titulo_secretaria");
		logger.debug("Secretaria Id: "+id_secretaria);
		
		//cargo objectos 
		loadData();
		final Secretaria secretaria=getSecretaria(id_secretaria);
		secretariaBean=new SecretariaBean();
		;
	    
		
		image_telefonoCall=(ImageView)findViewById(id.image_secretariaTelefono);
		text_header=(TextView)findViewById(R.id.text_header);
		text_secretario=(TextView)findViewById(R.id.text_secretariaSecretario);
		text_direccion=(TextView)findViewById(R.id.text_secretariaDireccion);
		text_telefono=(TextView)findViewById(R.id.text_secretariaTelefono);
		text_email=(TextView)findViewById(R.id.text_secretariaEmail);
	    text_secretaria=(TextView)findViewById(R.id.text_secretariaSecretaria);	
		
		text_secretario.setText(secretaria.getSecretario());
		text_direccion.setText(secretaria.getDireccion());
		text_telefono.setText(secretaria.getTelefono());
	    text_email.setText(secretaria.getEmail());
	    text_secretaria.setText(titulo_secretaria);
	    text_header.setText("Secretaria");
		
	    
	    image_telefonoCall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Intent callIntent = new Intent(Intent.ACTION_CALL);
					callIntent.setData(Uri.parse("tel:"+secretaria.getTelefono()));
					startActivity(callIntent);
				
				
			}
		});
	}
	
	/*View.OnClickListener callSecretaria =new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			logger.debug("Click Telefono :");
		       Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:0377778888"));
				startActivity(callIntent);
			
		}
	};
	*/
	
	
	
	private void loadData()
	{
		
		listSecretaria=new ArrayList<Secretaria>();
		//listSecretaria=(ArrayList<Secretaria>) UtilList.loadListSecretaria();
		listSecretaria.add(
				new Secretaria("1",
						      "SECRETARIA GENERAL LEGAL Y TECNICA",
						      " Dr. César Guillermo Farfán", 
						      "descripcion",
						      "Av. Bolivia 1239 S. S. de Jujuy", 
						      "+54-(388)-4221-517",
						      "gfarfan@unju.edu.ar "));
		listSecretaria.add( new Secretaria(
				                 "2",
				                 "SECRETARIA DE ADMINISTRACION",
				                 "CPN Fernanda Colque",
				                 "",
				                 "Av. Bolivia 1239 S. S. de Jujuy",
				                 "+54-(388)-4221-514",
				                 "secadmin@unju.edu.ar "));
		
		listSecretaria.add(new Secretaria(
				                           "3",
				                           "SECRETARIA DE CIENCIA Y TECNICA",
				                           "Dra. María Graciela del Valle Bovi Mitre",
				                           "",
				                           "Av. Bolivia 1239 S. S. de Jujuy",
				                           "+54-(388)-4221-505",
				                           "secretariasectergb@unju.edu.ar"));
		listSecretaria.add(new Secretaria(
				                            "4",
				                           "SECRETARIA DE EXTENSION UNIVERSITARIA",
				                            "Dra. Elena Ester Belli",
				                            "",
				                            "Av. Bolivia 1239 S. S. de Jujuy",
				                            "+54-(388)-4244-100 ",
				                            "seu@unju.edu.ar"));
		listSecretaria.add(new Secretaria(
				                           "5",
				                           "SECRETARIO DE ASUNTOS ACADEMICOS",
				                           "Dr. Julio César Arrueta",
				                           "",
				                           "Av. Bolivia 1239 S. S. de Jujuy",
				                           "+54-(388)-4221-504",
				                           "c.arrueta@unju.edu.ar"));
		listSecretaria.add(new Secretaria(
				                          "6",
				                         "SECRETARIO DE BIENESTAR UNIVERSITARIO",
				                         "Sr. Diego Esteban Gutierrez", 
				                         ""
				                         , "Av. Bolivia 1239 S. S. de Jujuy", 
				                         " +54-(388)-4221-500", 
				                         "sbu@unju.edu.ar"));
		
	}
	
	private Secretaria getSecretaria(String idSecretaria)
	{
		Secretaria secretaria=new Secretaria();
		for(Secretaria sec: listSecretaria)
		{
			  if(idSecretaria.equals(sec.getId_secretaria()))
				  return sec;
			
		}
		return null;
		
	}
	
}
