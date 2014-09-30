package com.fe.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.AutoridadBean;
import com.fe.bean.adapter.CustomAutoridadAdapter;
import com.fe.model.Autoridad;
public class ActivitySobre  extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySobre.class);
	private TextView textViewHeader;
	private ListView listView;
    private String string_header;
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.about);  
         Intent intent=new Intent();
         string_header=intent.getStringExtra("title_header");
         textViewHeader=(TextView)findViewById(R.id.text_header);
		
         textViewHeader.setText(Html.fromHtml("<u><b>About</b></u>"));
		 listView=(ListView)findViewById(R.id.list_sobre); 	
        
         String[] array = new String[] {
                 "Informacion"
                ,"Contacto"
           };
         
         ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
         
         logger.debug("arrayAdapter : "+adapter);
         listView.setAdapter(adapter);
         
         
         
         
     
         
    }
}