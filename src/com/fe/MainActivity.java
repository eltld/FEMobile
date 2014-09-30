package com.fe;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;








import com.fe.activity.ActivityAutoridad;
import com.fe.activity.ActivityBase;
import com.fe.activity.ActivityCalendario;
import com.fe.activity.ActivityComedor;
import com.fe.activity.ActivityEvento;
import com.fe.activity.ActivityGaleria;
import com.fe.activity.ActivityMapUnju;
import com.fe.activity.ActivityNoticia;
import com.fe.activity.ActivitySecretaria;
import com.fe.activity.ActivitySobre;
import com.fe.activity.ActivityUniversity;
import com.fe.bean.ActivityDbBean;
import com.fe.bean.adapter.CustomGridAdapter;
import com.fe.bean.util.ScrollableGridView;
import com.fe.bean.util.UtilList;
import com.fe.model.Constants;
import com.fe.model.ItemGrid;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.util.Log;

import android.content.res.Resources;

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
	  private ImageView image_sobre;
	  private ImageView image_navigator;
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		logger.info("onCreate MainActivity");
		activityBean= new ActivityDbBean(getApplicationContext());
		
		//
		image_sobre=(ImageView)findViewById(R.id.image_about);
		image_navigator=(ImageView)findViewById(R.id.image_navigator);
		//load content 
		//comento esto no se la verdad gridView=(GridView)findViewById(R.id.grid_principal);
		 gridView = (ScrollableGridView) findViewById(R.id.grid_principal);
		 gridView.setExpanded(true);
		 gridView.setAdapter(null);
		 //load listItemGridImages
		 logger.debug("listItemGridImage");
		listItemGridImage=null;
		listItemGridImage=(ArrayList<ItemGrid>) loadItemGridPrincipal(this.getResources());
	    
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
			    case 5:{
			    	    logger.debug("Eventos");
			    	    final Intent intent=new Intent(MainActivity.this, ActivityEvento.class);
			    	    startActivity(intent);
			    };break;
			   
			    
			    case 6: {
			    	     logger.debug("Autoridades");
			    	     final Intent intent=new Intent(MainActivity.this,ActivityAutoridad.class);
			    	     startActivity(intent);
			    	 
			            };break;
			  
			    case 7: {
			    	     logger.debug("Universidades");
			    	     final Intent intent=new Intent(MainActivity.this,ActivityUniversity.class);
			    	     //intent.putExtra(Constants.PARAMETER, "OFERTA ACADEMICA");
			             startActivity(intent); 	    
			            };break;          
			    }
				
			}
		});
	
	    
	    //Image Sobre click
	    image_sobre.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this, ActivitySobre.class);
				startActivity(intent);
			}
		});
	    
	    //Abrir navegador
	    image_navigator.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
					   Intent browserIntent = new Intent("android.intent.action.VIEW",
					   Uri.parse("http://10.2.2.113")); // reeemplazar el sitio por el contenido de alguna variable de la clase que contenga en URL o agregando un parámetro más.
					   startActivity(browserIntent);
				
			}
		});
	
	}



	
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		Log.d("onItemClick", "informacion");
		
	
		
	}

	
	private List<ItemGrid> loadItemGridPrincipal(Resources res)
	{
		ArrayList<ItemGrid> listItemGrid=new ArrayList<ItemGrid>();
		listItemGrid.add(new ItemGrid("Mapa",res.getDrawable((R.drawable.location))));
		listItemGrid.add(new ItemGrid("Noticias",res.getDrawable(R.drawable.news)));
		listItemGrid.add(new ItemGrid("Comedor",res.getDrawable((R.drawable.tenedores))));
		listItemGrid.add(new ItemGrid("Secretarias",res.getDrawable(R.drawable.telephone_office)));
	    listItemGrid.add(new ItemGrid("Fotos",res.getDrawable(R.drawable.photo)));
	    listItemGrid.add(new ItemGrid("Eventos",res.getDrawable(R.drawable.calendar)));
	   // listItemGrid.add(new ItemGrid("Calendario",res.getDrawable(R.drawable.ic_launcher)));
	    listItemGrid.add(new ItemGrid("Autoridades",res.getDrawable(R.drawable.account))); 	
	    listItemGrid.add(new ItemGrid("Oferta Academica",res.getDrawable(R.drawable.university)));
	    
		return listItemGrid;
	}
	

}
