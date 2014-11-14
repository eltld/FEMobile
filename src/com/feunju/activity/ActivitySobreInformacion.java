package com.feunju.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.feunju.edu.R;

public class ActivitySobreInformacion extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySobreInformacion.class);
	private TextView textViewHeader;
    

	 
    private String string_header;
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.about_informacion);  
         Intent intent=new Intent();
         string_header=intent.getStringExtra("title_header");
         textViewHeader=(TextView)findViewById(R.id.text_header);
		
         textViewHeader.setText(Html.fromHtml("Información"));
			 
         
          

    } 

}
