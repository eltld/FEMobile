package com.feunju.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.facebook.UiLifecycleHelper;
import com.facebook.widget.FacebookDialog;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;

import com.feunju.bean.NoticiaBean;
import com.feunju.bean.util.JustifiedTextView;
import com.feunju.bean.util.TextViewEx;
import com.feunju.model.Noticia;
import com.feunju.model.constant.Constants;
import com.feunju.R;


import com.koushikdutta.ion.Ion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * 
 * @author David Garcia
 * @Dathe  : 26-08-2014
 *
 */

public class ActivityNoticiaContent extends Activity 
 {

	
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
    final String[] choices = { "Android", "iOS", "RIM" };
    private ImageView image_facebook;
    private UiLifecycleHelper uiHelper;
    
   

    
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.noticias_content);
	
	  
	 logger.debug("Noticia Content");
	 

     ArrayAdapter<String> adapter = new ArrayAdapter<String>(
             ActivityNoticiaContent.this, android.R.layout.simple_dropdown_item_1line,
             choices);
	
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
	 text_noticiaFecha=(TextView)findViewById(R.id.text_noticiaContentFecha);
	 text_viewEx=(TextView)findViewById(R.id.text_noticiaContentCuerpo);
	 image_noticia=(ImageView)findViewById(R.id.image_noticiaContentImage);
	 textHeader=(TextView)findViewById(R.id.text_newsHeader);
	 image_facebook=(ImageView)findViewById(R.id.image_facebook);
	 
	 uiHelper = new UiLifecycleHelper(this, null);
	    uiHelper.onCreate(savedInstanceState);
	 
	 
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
	   
		 
		 //facebook image noticia
		 image_facebook.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				FacebookDialog shareDialog = new FacebookDialog.ShareDialogBuilder(ActivityNoticiaContent.this)
		        .setLink("https://developers.facebook.com/android")
		        .build();
		uiHelper.trackPendingDialogCall(shareDialog.present());
			  	
			}
		});
		 
     }
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	   // inflater.inflate(com.fe.R.menu.menu
	   // 		, menu);
	    return super.onCreateOptionsMenu(menu);
	}



	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);

	    uiHelper.onActivityResult(requestCode, resultCode, data, new FacebookDialog.Callback() {
	        @Override
	        public void onError(FacebookDialog.PendingCall pendingCall, Exception error, Bundle data) {
	            logger.debug("Activity", String.format("Error: %s", error.toString()));
	        }

	        @Override
	        public void onComplete(FacebookDialog.PendingCall pendingCall, Bundle data) {
	            logger.debug("Activity", "Success!");
	        }
	    });
	}
	
	@Override
	protected void onResume() {
	    super.onResume();
	    uiHelper.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
	    super.onSaveInstanceState(outState);
	    uiHelper.onSaveInstanceState(outState);
	}

	@Override
	public void onPause() {
	    super.onPause();
	    uiHelper.onPause();
	}

	@Override
	public void onDestroy() {
	    super.onDestroy();
	    uiHelper.onDestroy();
	}
	
}
