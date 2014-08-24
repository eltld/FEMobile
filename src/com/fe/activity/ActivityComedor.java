package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.util.UtilList;
import com.fe.model.Comedor;
import com.fe.model.Secretaria;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityComedor extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityComedor.class);
	
	 /*private GoogleMap map;
	 */
	
	ListView listView;
	ArrayAdapter<String> listAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comedor);
	    
		logger.debug("inicializar pagina comedor");
		listView=(ListView)findViewById(R.id.list_comedor);
		
	    

		List<String> listComedor = new ArrayList<String>();
		for (Comedor obj : UtilList.loadListComedor()) {
		  listComedor.add(obj.getNombre_comedor());
		}
	    listAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listComedor);
	    logger.debug("load despues listAdapter"+listAdapter);
	    listView.setAdapter(listAdapter);
	
	}
	
	
}
