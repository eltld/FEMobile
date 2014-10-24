package com.feunju.activity;

import com.feunju.model.constant.Constants;
import com.feunju.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 
 * @author : David Garcia
 * @Dathe  : 1-09-2014
 *
 */
public class ActivityUniversityContent extends Activity {

	private TextView textHeader;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.university);
	 
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText(Constants.TAG_UNIVERSITY_HEADER);
	  
		Intent intent=getIntent();
		String idUniversity=intent.getStringExtra(Constants.UNIVERSITY_ID);
		System.out.println("University Id : "+idUniversity);

		
	}
	
	
}
