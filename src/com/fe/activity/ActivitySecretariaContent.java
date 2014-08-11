package com.fe.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.R.id;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivitySecretariaContent extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySecretariaContent.class);
	
	
	LinearLayout linearCall;
	TextView text_number;
	ImageView image_telefonoCall;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secretaria_content);
		
		logger.debug("debug inicio");
		//obtenemos la secretaria a cargar
		Intent intent=this.getIntent();
		
		image_telefonoCall=(ImageView)findViewById(id.image_secretaria_telefono);
		image_telefonoCall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 logger.debug("Click Telefono :");
			       Intent callIntent = new Intent(Intent.ACTION_CALL);
					callIntent.setData(Uri.parse("tel:0377778888"));
					startActivity(callIntent);
				
			}
		});
		
		
	}
	
	
	
	
}
