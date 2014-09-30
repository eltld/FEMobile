package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.R.id;
import com.fe.bean.SecretariaBean;
import com.fe.model.Secretaria;

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
		secretariaBean=new SecretariaBean();
		final Secretaria secretaria=secretariaBean.GetBean(id_secretaria);
		logger.debug("secretaria : "+secretaria.toString());
	    
		
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
	    text_header.setText("<u><b>SECRETARIA</b></u>");
		
	    
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
	
	
	
}
