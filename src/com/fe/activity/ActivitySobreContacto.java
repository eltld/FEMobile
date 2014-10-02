package com.fe.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.fe.R;

public class ActivitySobreContacto extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySobreContacto.class);
	private TextView textViewHeader;
    

	 
    private String string_header;
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.autoridad);  
         Intent intent=new Intent();
         string_header=intent.getStringExtra("title_header");
         textViewHeader=(TextView)findViewById(R.id.text_header);
		
         textViewHeader.setText(Html.fromHtml("<u>CONTACTO</u>"));
			 
          

    }
         
    }