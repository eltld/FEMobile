package com.feunju.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;








import com.feunju.activity.ActivityAutoridad;
import com.feunju.activity.ActivityBase;
import com.feunju.activity.ActivityCalendario;
import com.feunju.activity.ActivityComedor;
import com.feunju.activity.ActivityEvento;
import com.feunju.activity.ActivityGaleria;
import com.feunju.activity.ActivityMapUnju;
import com.feunju.activity.ActivityNoticia;
import com.feunju.activity.ActivityNoticiaContent;
import com.feunju.activity.ActivitySecretaria;
import com.feunju.activity.ActivitySobre;
import com.feunju.activity.ActivityUniversity;
import com.feunju.bean.ActivityDbBean;
import com.feunju.bean.adapter.CustomGridAdapter;
import com.feunju.bean.adapter.CustomNewsAdapter;
import com.feunju.bean.json.NoticiaTag;
import com.feunju.bean.util.ScrollableGridView;
import com.feunju.bean.util.UtilList;
import com.feunju.database.dao.VersionDao;
import com.feunju.edu.R;
import com.feunju.model.ItemGrid;
import com.feunju.model.Noticia;
import com.feunju.model.VersionApp;
import com.feunju.model.constant.ConstantRest;
import com.feunju.model.constant.Constants;
import com.feunju.service.ServiceHandler;
import com.feunju.task.AppVersion;
import com.google.gson.Gson;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.util.Log;

import android.content.res.Resources;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
	  private String versionRemote="";
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Display display = getWindowManager().getDefaultDisplay(); 
		int width = display.getWidth();
		int height = display.getHeight();
		
		
		setContentView(R.layout.activity_main);
		
		logger.info("onCreate MainActivity");
		activityBean= new ActivityDbBean(getApplicationContext());

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
					   Uri.parse(ConstantRest.URL_WEB)); // reeemplazar el sitio por el contenido de alguna variable de la clase que contenga en URL o agregando un parámetro más.
					   startActivity(browserIntent);
				
			}
		});
	    
	   new MainActivityCliente().execute();
	
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
	    listItemGrid.add(new ItemGrid("Oferta Académica",res.getDrawable(R.drawable.university)));
	    
		return listItemGrid;
	}

	
	
	private class MainActivityCliente extends AsyncTask<String, Void, String> {

		private ProgressBar progressBar;

		protected void onPreExecute() {
			

		}

		@Override
		protected String doInBackground(String... arg0) {
			logger.debug("doInBackground MainActivityClient");

			try {

				// TODO Auto-generated method stub
				ServiceHandler serviceHandler = new ServiceHandler();
				String jsonString = serviceHandler.makeServiceCall(
						ConstantRest.URL_VERSION_FILE, serviceHandler.GET);
				logger.info("json : " + jsonString);

				if(jsonString!=null && jsonString.length()!=0)
				{	
				    System.out.println("version Remote length : "+jsonString.length());
					if(jsonString.length()<=2)	
					versionRemote=jsonString;
					else 
				    versionRemote="";
                    
				}

			} catch (Exception ex) {
				logger.debug("Error :" + ex.toString());

			}

			return null;

		}

		protected void onProgressUpdate(Integer... progress) {
			
			
		}
		
		protected void onPostExecute(String result) {

			if(versionRemote!=null && versionRemote!="")
			{
				/****************************/
				/* Verificar versionamiento */
				/****************************/
				logger.debug("version name");
				AppVersion version=new AppVersion();
				String versionCodeApp=String.valueOf(version.getVersionCode(getApplicationContext()));
			    String versionNameApp=String.valueOf(version.getVersionName(getApplicationContext()));
			    logger.debug("VersionCodeRemote : "+versionRemote);
			    logger.debug("VersionApp : "+versionNameApp);
				if(Long.parseLong(versionRemote)>Long.parseLong(versionCodeApp))
				{
					
				
				  //Verify file read
				   	if(verifyFileIgnore(versionCodeApp,versionRemote))
				    { 	 
				     showDialog();
			 	    }
		       }		
							
		}
				
	}
		
		
		

		/**
		 * Funcion que permite verificar si la
		 * aplicacion esta ignorada
		 * @throws IOException
		 */
		private boolean verifyFileIgnore(String versionCodeApp,String versionCodeAppRemote)
		{
				
			VersionDao versionDao=new VersionDao(getApplicationContext());
			VersionApp versionApp=versionDao.get(new Long(1));
			if(versionApp==null)
			{
			  //No hay ningun registro en la base de la aplicacion	
			  //Se crea el registro en la base de datos.
			   System.out.println("No existe ningun registro en la base de datos");
			   
			   versionApp=new VersionApp();
			   versionApp.setVersionId(new Long(1));
			   versionApp.setVersionApp(new Long(versionCodeApp));
			   versionDao.add(versionApp);
               return true;	//mostrar el dialog				
			}else
			{
				System.out.println("Contiene informacion : "+versionApp.toString());
				if(versionApp.getVersionApp()==Long.parseLong(versionCodeAppRemote))
				{
					//se ignora y no muestra el msje
					System.out.println("La version de la base es igual a la version Remote");
					return false;
				}
				else
				{  System.out.println("La version no son iguales se puede actualizar");
				  return true;
			    }
			}
				
		}
		
		
		
	
	/**
	 * Metodo que actualiza con la ultima version 
	 * de la aplicacion	
	 * @param codeVersionRemote
	 */
	private void writeDatabaseVerifyIgnore(String codeVersionRemote)
	{
		
		//actualizo la base con la ultima version 
	    VersionDao versionDao=new VersionDao(getApplicationContext());
	    VersionApp versionApp=new VersionApp();
	    versionApp.setVersionId(new Long(1));
	    versionApp.setVersionApp(new Long(codeVersionRemote));
	    versionDao.update(versionApp);
	   
	}
	
	 private void showDialog()
	 {
		  //No Acepta la Aplicacion	
         DialogInterface.OnClickListener listenerDoesNotAccept = new DialogInterface.OnClickListener() {
				
				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();
				}
			};
			
		 //Acepta la Aplicacion 	
       DialogInterface.OnClickListener listenerAccept = new DialogInterface.OnClickListener() {
				
				public void onClick(DialogInterface dialog, int which) {
					Intent updateIntent = new Intent(Intent.ACTION_VIEW,
						       Uri.parse(ConstantRest.URL_APK_FILE));
						startActivity(updateIntent);
				}
			};
			
	    //Ignora la aplicacion 
	    //Creacion de database
	    DialogInterface.OnClickListener listenerIgnorar = new DialogInterface.OnClickListener() {
					 public void onClick(DialogInterface dialog, int which) {
					 writeDatabaseVerifyIgnore(versionRemote);
					 }
		 };
		 // TODO Auto-generated method stub
			new AlertDialog.Builder(MainActivity.this)
			.setTitle("Android Version.")
			.setMessage("Existe una nueva version de Unju Mobile. Desea descargarla?.")
			.setPositiveButton("Yes",listenerAccept)
			.setNeutralButton("Ignorar",listenerIgnorar )
			.setNegativeButton("No",listenerDoesNotAccept )
			.show();

	 }
	}

}
