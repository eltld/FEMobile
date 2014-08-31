package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.NoticiaBean;
import com.fe.model.Constants;
import com.fe.model.Noticia;
import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @author David Garcia
 * @Dathe  : 26-08-2014
 *
 */
public class ActivityNoticiaContent extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityNoticiaContent.class);
	
	private TextView text_noticiaTitulo;
	private TextView text_noticiaBajada;
	private TextView text_noticiaFecha;
	private TextView text_noticiaCuerpo;
	private ImageView image_noticia;
	
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
	 
	 
	 //asigno los valores 
	 if(noticia!=null)
      {
		 text_noticiaTitulo.setText(noticia.getTituloNoticia());
		 text_noticiaBajada.setText(noticia.getBajadaNoticia());
		 text_noticiaFecha.setText(noticia.getDateNoticia());
		 text_noticiaCuerpo.setText(noticia.getCuerpoNoticia());
		 
	   
     }
	}
	
	
}
