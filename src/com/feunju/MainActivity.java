package com.feunju;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;








import com.feunju.R;
import com.feunju.activity.ActivityAutoridad;
import com.feunju.activity.ActivityBase;
import com.feunju.activity.ActivityCalendario;
import com.feunju.activity.ActivityComedor;
import com.feunju.activity.ActivityEvento;
import com.feunju.activity.ActivityGaleria;
import com.feunju.activity.ActivityMapUnju;
import com.feunju.activity.ActivityNoticia;
import com.feunju.activity.ActivitySecretaria;
import com.feunju.activity.ActivitySobre;
import com.feunju.activity.ActivityUniversity;
import com.feunju.bean.ActivityDbBean;
import com.feunju.bean.adapter.CustomGridAdapter;
import com.feunju.bean.util.ScrollableGridView;
import com.feunju.bean.util.UtilList;
import com.feunju.model.ItemGrid;
import com.feunju.model.constant.ConstantRest;
import com.feunju.model.constant.Constants;
import com.feunju.task.AppVersion;

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
		
		
		
		
		/****************************/
		/* Verificar versionamiento */
		/****************************/
		AppVersion version=new AppVersion();
		int versionCodeApp= version.getVersionCode(getApplicationContext());
	    logger.debug("VersionCode: "+versionCodeApp);
		String versionCodeRemote=version.downloadText();
		logger.debug("VersionCodeRemote : "+versionCodeRemote);
		if(Integer.parseInt(versionCodeRemote)==versionCodeApp)
		{
			Intent updateIntent = new Intent(Intent.ACTION_VIEW,
				       Uri.parse(ConstantRest.URL_APK_FILE));
				startActivity(updateIntent);
		}
		
		
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
					   Uri.parse("http://10.2.2.113")); // reeemplazar el sitio por el contenido de alguna variable de la clase que contenga en URL o agregando un par�metro m�s.
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
		listItemGrid.add(new ItemGrid("Mapa  ",res.getDrawable((R.drawable.mapa_comedor))));
		listItemGrid.add(new ItemGrid("Noticias",res.getDrawable(R.drawable.news)));
		listItemGrid.add(new ItemGrid("Comedor",res.getDrawable((R.drawable.comedor))));
		listItemGrid.add(new ItemGrid("Secretaria",res.getDrawable(R.drawable.secretaria)));
	    listItemGrid.add(new ItemGrid("Fotos",res.getDrawable(R.drawable.photo)));
	    listItemGrid.add(new ItemGrid("Evento",res.getDrawable(R.drawable.evento)));
	   // listItemGrid.add(new ItemGrid("Calendario",res.getDrawable(R.drawable.ic_launcher)));
	    listItemGrid.add(new ItemGrid("Autoridades",res.getDrawable(R.drawable.autoridad))); 	
	    listItemGrid.add(new ItemGrid("Oferta <br> Academica",res.getDrawable(R.drawable.university)));
	    
		return listItemGrid;
	}
	

}
