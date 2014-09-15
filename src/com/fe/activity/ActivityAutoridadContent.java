package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.AutoridadBean;
import com.fe.bean.NoticiaBean;
import com.fe.model.Autoridad;
import com.fe.model.Constants;
import com.fe.model.Noticia;
import com.koushikdutta.ion.Ion;

public class ActivityAutoridadContent extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityAutoridadContent.class);
	
	private TextView text_autoridadTitulo;
	private TextView text_autoridadNombre;
	private TextView text_autoridadEmail;
	private TextView text_autoridadTelefono;
	private ImageView image_autoridad;
	private TextView textHeader;
	private AutoridadBean autoridadBean;
	
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.autoridad_content);
	
	  
	 logger.debug("Autoridad Content");
	 
	 Intent intent=this.getIntent();
	 String autoridad_id=intent.getStringExtra(Constants.AUTORIDAD_ID);
	 autoridadBean=new AutoridadBean(getApplicationContext());
	 Autoridad autoridad=autoridadBean.get(Long.parseLong(autoridad_id));
	 
	 logger.debug("Autoridada getObject :"+autoridad.toString());
	 
	 text_autoridadTitulo=(TextView)findViewById(R.id.text_autoridadContentTitulo);
	 text_autoridadNombre=(TextView)findViewById(R.id.text_autoridadContentNombre);
	 text_autoridadEmail=(TextView)findViewById(R.id.text_autoridadContentEmail);
	 text_autoridadTelefono=(TextView)findViewById(R.id.text_autoridadContentTelefono);
	 image_autoridad=(ImageView)findViewById(R.id.image_autoridadContentImage);
	 textHeader=(TextView)findViewById(R.id.text_header);
	 textHeader.setText("Autoridad");
	 
	 //asigno los valores 
	 if(autoridad!=null)
      {
		 text_autoridadTitulo.setText(autoridad.getTituloAutoridad());
		 text_autoridadNombre.setText(autoridad.getNombreAutoridad());
		 text_autoridadEmail.setText(autoridad.getEmailAutoridad());
		 text_autoridadTelefono.setText(autoridad.getTelefonoAutoridad());
		
		
		 Ion.with(getApplicationContext())
		 .load(autoridad.getImageUrlAutoridad())
		 .withBitmap()
		 .resizeHeight(100)
		 .resizeWidth(250)
		 .placeholder(R.drawable.ic_launcher)
		 .error(R.drawable.ic_error)
		 .intoImageView(image_autoridad);
	   
     }
	}
	
	
}