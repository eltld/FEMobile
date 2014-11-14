package com.feunju.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.feunju.bean.AutoridadBean;
import com.feunju.bean.adapter.CustomAutoridadAdapter;
import com.feunju.edu.R;
import com.feunju.edu.R.id;
import com.feunju.model.Autoridad;
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
		
         textViewHeader.setText(Html.fromHtml("Información"));
		 listView=(ListView)findViewById(R.id.list_sobre); 	
        
         String[] array = new String[] {
                 "Informacion"
                ,"Contacto"
           };
         
         ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
         
         logger.debug("arrayAdapter : "+adapter);
         listView.setAdapter(adapter);
         
     	listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			    // When clicked, show a toast with the TextView text
			 String item=	((TextView)view).getText().toString();
			
			 if(item.equals("Informacion"))
			 {
				 Intent intent=new Intent(ActivitySobre.this,ActivitySobreInformacion.class);
				 startActivity(intent);
			 }
			 else
			 {
				 if(item.equals("Contacto"))
				 {
					 Intent intent=new Intent(ActivitySobre.this,ActivitySobreContacto.class);
					 startActivity(intent);
				 		 
				 }
			 }
			 
			}
		});
         
 				
 			}

     
     
}