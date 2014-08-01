package com.fe;

import java.util.ArrayList;




import com.fe.activity.ActivityOficina;
import com.fe.bean.ItemGrid;
import com.fe.bean.adapter.CustomGridAdapter;
import com.fe.bean.util.ListItemGrid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.util.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Clase inicial de la aplicacion 
 * se implementara 
 * @author manuonda
 *
 */
public class MainActivity extends Activity  implements OnItemClickListener {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(MainActivity.class);
	  
	  GridView gridView;
	  ArrayList<ItemGrid> listItemGridImage=new ArrayList<ItemGrid>();
	  //adapter principal
	  CustomGridAdapter gridAdapterPrincipal;
	  
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		logger.info("onCreate MainActivity");
		
		//load content 
		gridView=(GridView)findViewById(R.id.grid_principal);
		//load listItemGridImages
		listItemGridImage=(ArrayList<ItemGrid>) ListItemGrid.loadItemGridPrincipal(this.getResources());
	    
		gridAdapterPrincipal=new CustomGridAdapter(this, R.layout.grid_single, listItemGridImage);
	    gridView.setAdapter(gridAdapterPrincipal);
	    
	    gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
		
				LinearLayout layout = (LinearLayout)arg1;

		        TextView songTitle = (TextView)layout.findViewById(R.id.textItem);

				logger.info("Click item : "+songTitle.getText().toString() + " arg2 : "+arg2);
			    switch(arg2)
			    {
			    case 0: logger.debug("Facultad");break;
			    case 1: logger.debug("Comedor");break;
			    case 2: logger.debug("Calendario");break;
			    case 3: { 
			    	
			    	logger.debug("Oficina"); 
			         final Intent intent=new Intent(MainActivity.this,ActivityOficina.class);
			       
			        startActivity(intent);
			        }
			    }
				
			}
		});
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		Log.d("onItemClick", "informacion");
		
	
		
	}

	

}
