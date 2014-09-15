package com.fe.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.NoticiaBean;
import com.fe.bean.adapter.CustomNewsAdapter;
import com.fe.model.Noticia;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
public class ActivityCalendario  extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityCalendario.class);
	private ListView listViewNoticias;
	private ArrayList<Noticia> listData;
    private CustomNewsAdapter adapter;
    private TextView textViewHeader;
    ProgressDialog pDialog;
    ProgressBar pB;
    DisplayImageOptions options;
	protected ImageLoader imageLoader;
	NoticiaBean noticiaBean=null;
	 
    private String string_header;
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
      
         super.onCreate(savedInstanceState);
         setContentView(R.layout.calendario);  
        
         
        
    }
}
