package com.fe.activity;

import com.fe.R;
import com.fe.activity.ActivityComedor.ComedorAsyncTask;
import com.fe.model.Constants;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityUniversityInformacion extends Activity{

	private TextView textHeader;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.university_informacion);
	    
		
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText("INFORMACION ADMINISTRATIVA");
		Intent intent=getIntent();
		String id_university=intent.getStringExtra(Constants.UNIVERSITY_ID);
		
	  
		
	}
	
}
