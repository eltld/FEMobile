package com.fe.activity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fe.R;
import com.fe.model.constant.ConstantRest;

public class ActivitySobreContacto extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySobreContacto.class);
	private TextView textViewHeader;
    private String string_header;
	
    private EditText text_nombre;
    private EditText text_apellido;
    private EditText text_message;
    private EditText text_facultad;
    private EditText text_email;
    private Button btn_enviar;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.about_contacto);  
         Intent intent=new Intent();
         string_header=intent.getStringExtra("title_header");
         textViewHeader=(TextView)findViewById(R.id.text_header);
		
         textViewHeader.setText(Html.fromHtml("Contacto"));
			 
         text_nombre=(EditText)findViewById(R.id.text_aboutContentNombre);
         text_apellido=(EditText)findViewById(R.id.text_aboutContentApellido);
         text_email=(EditText)findViewById(R.id.text_aboutContentEmail);
         text_facultad=(EditText)findViewById(R.id.text_aboutContentFacultad);
         text_message=(EditText)findViewById(R.id.text_aboutContentMessage);
         btn_enviar=(Button)findViewById(R.id.btn_aboutContentEnviar); 

         System.out.println("mensagge : "+text_message.getText().toString());
         logger.debug("text_message : "+text_message.getText().toString());
     
         btn_enviar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				postData();
			}
		});
         
    }
     
    
    public void postData() {
        // Create a new HttpClient and Post Header
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(ConstantRest.URL_CONTACTO);

        try {
            // Add your data
        	
        	   System.out.println("mensagge : "+text_message.getText().toString());
               logger.debug("text_message : "+text_message.getText().toString());
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add(new BasicNameValuePair("nombre", text_nombre.getText().toString()));
            nameValuePairs.add(new BasicNameValuePair("apellido",text_apellido.getText().toString()));
            nameValuePairs.add(new BasicNameValuePair("facultad",text_facultad.getText().toString()));
            nameValuePairs.add(new BasicNameValuePair("email",text_email.getText().toString()));
            nameValuePairs.add(new BasicNameValuePair("message",text_message.getText().toString()));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            // Execute HTTP Post Request
            HttpResponse response = httpclient.execute(httppost);

            String responseStr = EntityUtils.toString(response.getEntity());
            
            int code_recive=response.getStatusLine().getStatusCode();
            logger.debug("Code : "+code_recive+"Response Code : "+response.getStatusLine().toString() + " response  :"+responseStr);
            
            String code_message="";
            switch(code_recive)
            {
            case 200:
            {
            	code_message="Informacion Enviada";
              
            };break;
            case 500 :{
            	
              code_message="Informacion no Enviada ";
            
            };break;
            }
            
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(
        	        ActivitySobreContacto.this);
             
        	alertDialog.setMessage(code_message);
        	
        	alertDialog.setNegativeButton("Aceptar", new DialogInterface.OnClickListener() 
            {   
                @Override
                public void onClick(DialogInterface dialog, int which) 
                {
                    dialog.dismiss();
                }
            });
            alertDialog.show();
            
        } catch (ClientProtocolException e) {
        	
        	
        	logger.debug("ClienteProtocol exception : "+e.toString());
        	AlertDialog.Builder alertDialog = new AlertDialog.Builder(
        	        ActivitySobreContacto.this);
             
        	alertDialog.setMessage("Verifique Conexion Internet ");
        	
        	alertDialog.setNegativeButton("Aceptar", new DialogInterface.OnClickListener() 
            {   
                @Override
                public void onClick(DialogInterface dialog, int which) 
                {
                    dialog.dismiss();
                }
            });
            alertDialog.show();
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        	logger.debug("ClienteProtocol exception : "+e.toString());
        	AlertDialog.Builder alertDialog = new AlertDialog.Builder(
        	        ActivitySobreContacto.this);
             
        	alertDialog.setMessage("Verifique Conexion Internet ");
        	
        	alertDialog.setNegativeButton("Aceptar", new DialogInterface.OnClickListener() 
            {   
                @Override
                public void onClick(DialogInterface dialog, int which) 
                {
                    dialog.dismiss();
                }
            });
            alertDialog.show();
          	logger.debug("IO exception : "+e.toString());
            
        }
    } 
    
    
    }