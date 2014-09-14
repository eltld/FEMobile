package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.NoticiaBean;
import com.fe.model.Constants;
import com.fe.model.Noticia;
import com.koushikdutta.ion.Ion;

public class ActivityAutoridadContent extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityAutoridadContent.class);
	
	private TextView text_noticiaTitulo;
	private TextView text_noticiaBajada;
	private TextView text_noticiaFecha;
	private TextView text_noticiaCuerpo;
	private ImageView image_noticia;
	private TextView textHeader;
	private NoticiaBean noticiaBean;
	
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.noticias_content);
	
	  
	 logger.debug("Noticia Content");
	 
	 Intent intent=this.getIntent();
	 String noticia_id=intent.getStringExtra(Constants.NOTICIA_ID);
	 noticiaBean=new NoticiaBean(getApplicationContext());
	 Noticia noticia=noticiaBean.get(Long.parseLong(noticia_id));
	 
	 logger.debug("Notica getObject :"+noticia.toString());
	 
	 text_noticiaTitulo=(TextView)findViewById(R.id.text_noticiaContentTitulo);
	 text_noticiaBajada=(TextView)findViewById(R.id.text_noticiaContentBajada);
	 text_noticiaCuerpo=(TextView)findViewById(R.id.text_noticiaContentCuerpo);
	 text_noticiaFecha=(TextView)findViewById(R.id.text_noticiaContentFecha);
	 image_noticia=(ImageView)findViewById(R.id.image_noticiaContentImage);
	 textHeader=(TextView)findViewById(R.id.text_header);
	 textHeader.setText("Noticias");
	 
	 //asigno los valores 
	 if(noticia!=null)
      {
		 text_noticiaTitulo.setText(noticia.getTituloNoticia());
		 text_noticiaBajada.setText(noticia.getBajadaNoticia());
		 text_noticiaFecha.setText(noticia.getDateNoticia());
		 text_noticiaCuerpo.setText(noticia.getCuerpoNoticia());
		
		
		 Ion.with(getApplicationContext())
		 .load(noticia.getUrlImageNoticia())
		 .withBitmap()
		 .resizeHeight(100)
		 .resizeWidth(250)
		 .placeholder(R.drawable.ic_launcher)
		 .error(R.drawable.ic_error)
		 .intoImageView(image_noticia);
	   
     }
	}
	
	
}