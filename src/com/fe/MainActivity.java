package com.fe;

import java.util.ArrayList;








import com.fe.activity.ActivityAutoridad;
import com.fe.activity.ActivityBase;
import com.fe.activity.ActivityCalendario;
import com.fe.activity.ActivityComedor;
import com.fe.activity.ActivityGaleria;
import com.fe.activity.ActivityMapUnju;
import com.fe.activity.ActivityNoticia;
import com.fe.activity.ActivitySecretaria;
import com.fe.activity.ActivityUniversity;
import com.fe.bean.ActivityDbBean;
import com.fe.bean.adapter.CustomGridAdapter;
import com.fe.bean.util.ScrollableGridView;
import com.fe.bean.util.UtilList;
import com.fe.model.Constants;
import com.fe.model.ItemGrid;

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
	  
	  //GridView gridView;
	  ScrollableGridView gridView;
	   ArrayList<ItemGrid> listItemGridImage=new ArrayList<ItemGrid>();
	  //adapter principal
	  CustomGridAdapter gridAdapterPrincipal;
	  private ActivityDbBean activityBean;
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		logger.info("onCreate MainActivity");
		activityBean= new ActivityDbBean(getApplicationContext());
		
		//load content 
		//comento esto no se la verdad gridView=(GridView)findViewById(R.id.grid_principal);
		 gridView = (ScrollableGridView) findViewById(R.id.grid_principal);
		 gridView.setExpanded(true);
		//load listItemGridImages
		 logger.debug("listItemGridImage");
		listItemGridImage=(ArrayList<ItemGrid>) UtilList.loadItemGridPrincipal(this.getResources());
	    
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
			    case 0:
			       {
			    	 logger.debug("Mapa") ;
			         final Intent intent=new Intent(MainActivity.this,ActivityMapUnju.class);
			         
			         startActivity(intent);
			        };break;
			    case 1:  
			           { 
			        	  logger.debug("Noticias");
			        	  final Intent intent=new Intent(MainActivity.this,ActivityNoticia.class);
			        	  intent.putExtra("title_header","Noticias");
			        	  startActivity(intent);
			    	      
			             };break;
			    case 2:
			           { 
			    	     logger.debug("Comedor");
			             Intent intent=new Intent(MainActivity.this,ActivityComedor.class);
			             intent.putExtra("title_header", "Comedor");
			             startActivity(intent);
			             };break;
			    case 3: { 
			    	
			    	 logger.debug("Secretarias"); 
			         final Intent intent=new Intent(MainActivity.this,ActivitySecretaria.class);
			         intent.putExtra("title_header","Secretarias");
			         startActivity(intent);
			        };break;
			    case 4 :{
			    	 logger.debug("Gallery");
			    	 final Intent intent=new Intent(MainActivity.this,ActivityGaleria.class);
			    	 startActivity(intent);
			    };break;
			    case 6:{
			    	    logger.debug("Calendario");
			    	    final Intent intent=new Intent(MainActivity.this,ActivityCalendario.class);
			    	    startActivity(intent);
			    	   
			             };break;
			    
			    case 7: {
			    	     logger.debug("Autoridades");
			    	     final Intent intent=new Intent(MainActivity.this,ActivityAutoridad.class);
			    	     startActivity(intent);
			    	 
			            };break;
			  
			    case 8: {
			    	     logger.debug("Universidades");
			    	     final Intent intent=new Intent(MainActivity.this,ActivityUniversity.class);
			    	     //intent.putExtra(Constants.PARAMETER, "OFERTA ACADEMICA");
			             startActivity(intent); 	    
			            };break;          
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
