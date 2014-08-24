package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.Util;

import com.fe.MainActivity;
import com.fe.R;
import com.fe.R.id;
import com.fe.bean.adapter.CustomGridAdapter;
import com.fe.bean.adapter.CustomSecretariaAdapter;
import com.fe.bean.util.UtilList;
import com.fe.model.Secretaria;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Clase Correspondiente
 * @author David Garcia
 * @Dathe  : 1-08-2014
 *
 */
public class ActivitySecretaria extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivitySecretaria.class);
	
	ListView listView;
	CustomSecretariaAdapter adapter;
	TextView textViewHeader;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secretaria);
		
		//obtenemos parametros
		Intent intent=getIntent();
		
		String title_header=intent.getStringExtra("title_header");
		logger.debug("title_header : "+title_header);
		textViewHeader=(TextView)findViewById(R.id.txtView_header);
		textViewHeader.setText(title_header);
		
		//load list view
		logger.info("onCreate ActivityOficina");
		listView=(ListView)findViewById(R.id.list_secretaria);
		
		ArrayList<Secretaria> listSecretaria = new ArrayList<Secretaria>();
		listSecretaria=(ArrayList<Secretaria>) UtilList.loadListSecretaria();
	    adapter=new CustomSecretariaAdapter(this,R.layout.secretaria_single ,listSecretaria);
	    listView.setAdapter(adapter);
	    
		
	    //events
	    listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				TextView text_secretariaTitulo=(TextView)arg1.findViewById(id.text_secretariaTitulo);
				TextView text_secretariaId=(TextView)arg1.findViewById(R.id.text_secretariaId);
				logger.debug("on Item Click secretaria Id : "+text_secretariaId.getText().toString());
				logger.debug("on item clicks secretaria : "+text_secretariaTitulo.getText().toString());
				Intent intent=new Intent(ActivitySecretaria.this,ActivitySecretariaContent.class);
				intent.putExtra("id_secretaria",text_secretariaId.getText().toString());
		        startActivity(intent);
				
			}
		});
	    
	    
	    
	
	}

	 
	
}
