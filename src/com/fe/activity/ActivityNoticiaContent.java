package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.NoticiaBean;
import com.fe.bean.util.JustifiedTextView;
import com.fe.bean.util.TextViewEx;
import com.fe.model.Constants;
import com.fe.model.Noticia;


import com.koushikdutta.ion.Ion;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import android.webkit.WebView;
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
	private TextView textHeader;
	private WebView webView;
	private TextView text_cuerpo;
	private NoticiaBean noticiaBean;
	private JustifiedTextView text_view;
	private TextView text_viewEx;
	static Point size;
    static float density;
    public static final int FinallwidthDp  = 320 ;
    public static final int widthJustify  = 223 ;

	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.noticias_content);
	
	  
	 logger.debug("Noticia Content");
	 
	 
	
     DisplayMetrics metrics = new DisplayMetrics();
     getWindowManager().getDefaultDisplay().getMetrics(metrics);
     int widthPixels = metrics.widthPixels;

     float scaleFactor = metrics.density;
     float widthDp = widthPixels / scaleFactor;

     
   
	 Intent intent=this.getIntent();
	 String noticia_id=intent.getStringExtra(Constants.NOTICIA_ID);
	 noticiaBean=new NoticiaBean(getApplicationContext());
	 Noticia noticia=noticiaBean.get(Long.parseLong(noticia_id));
	 
	 logger.debug("Notica getObject :"+noticia.toString());
	 
	 text_noticiaTitulo=(TextView)findViewById(R.id.text_noticiaContentTitulo);
	 text_noticiaBajada=(TextView)findViewById(R.id.text_noticiaContentBajada);
	 //webView=(WebView)findViewById(R.id.text_noticiaContentCuerpo);
	 //text_view=(JustifiedTextView)findViewById(R.id.text_noticiaContentCuerpo);
	 //text_cuerpo=(TextView)findViewById(R.id.text_noticiaContentCuerpo);
	 //text_justy=(JustifiedWeb)findViewById(R.id.text_noticiaContentCuerpo);
	 text_noticiaFecha=(TextView)findViewById(R.id.text_noticiaContentFecha);
	 text_viewEx=(TextView)findViewById(R.id.text_noticiaContentCuerpo);
	 image_noticia=(ImageView)findViewById(R.id.image_noticiaContentImage);
	 textHeader=(TextView)findViewById(R.id.text_header);
	 textHeader.setText("Noticias");
	 
	 //asigno los valores 
	 if(noticia!=null)
      {
		 text_noticiaTitulo.setText(Html.fromHtml(noticia.getTituloNoticia()));
		 text_noticiaBajada.setText(Html.fromHtml(noticia.getBajadaNoticia()));
		 text_noticiaFecha.setText(Html.fromHtml(noticia.getDateNoticia()));
		 

		 String text_content=
                "<html><head></head><body style='text-align:justify;'>"+
				 noticia.getCuerpoNoticia()+
				 " </body></html>";
		 
			
			  //text_cuerpo.setText(text);
	     text_viewEx.setText(Html.fromHtml(text_content));
				
		 logger.debug("noticia url : "+noticia.getUrlImageNoticia());
		
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
