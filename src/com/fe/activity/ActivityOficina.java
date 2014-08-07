package com.fe.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.Util;

import com.fe.MainActivity;
import com.fe.R;
import com.fe.bean.util.ListItemGrid;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


/**
 * Clase Correspondiente
 * @author David Garcia
 * @Dathe  : 1-08-2014
 *
 */
public class ActivityOficina extends Activity {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityOficina.class);
	
	ListView listView;
	ArrayAdapter<String> listAdapter;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_secretaria);
		
		logger.info("onCreate ActivityOficina");
	    
		
		listView=(ListView)findViewById(R.id.list_secretaria);
	    logger.debug("Antes de load Secretaria");
	   // listAdapter=new ArrayAdapter<String>(this,, ListItemGrid.loadSecretaria());
	    logger.debug("load despues listAdapter"+listAdapter);
	    listView.setAdapter(listAdapter);
	    
		
	
	
	}
}
