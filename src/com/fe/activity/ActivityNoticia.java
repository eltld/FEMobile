package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.MainActivity;
import com.fe.R;
import com.fe.R.id;
import com.fe.bean.NoticiaBean;
import com.fe.bean.adapter.CustomNewsAdapter;
import com.fe.bean.json.NoticiaTag;
import com.fe.model.ConstantRest;
import com.fe.model.Constants;
import com.fe.model.Noticia;
import com.fe.service.ServiceHandler;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * 
 * @author : David Garcia
 * @Dathe  : 19-08-2014 
 *
 */
public class ActivityNoticia extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityNoticia.class);
	private ListView listViewNoticias;
	private ArrayList<Noticia> listData;
    private CustomNewsAdapter adapter;
    private TextView textViewHeader;
    private TextView textNewsConnection;
    ProgressDialog pDialog;
    ProgressBar pB;
    DisplayImageOptions options;
	protected ImageLoader imageLoader;
	NoticiaBean noticiaBean=null;
	 
    private String string_header;
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
      
         super.onCreate(savedInstanceState);
         setContentView(R.layout.noticias);  
         Intent intent=new Intent();
         string_header=intent.getStringExtra("title_header");
         textViewHeader=(TextView)findViewById(R.id.text_newsHeader);
		
         textViewHeader.setText("Noticias");
			
         logger.debug("Inicio Noticias : "+string_header); 
         
         
         pB=(ProgressBar)findViewById(R.id.marker_progress);
      	 textNewsConnection=(TextView)findViewById(R.id.text_newsConnection);
      	 
         noticiaBean=new NoticiaBean(getApplicationContext());

         
         options = new DisplayImageOptions.Builder()
     	.showImageOnLoading(R.drawable.ic_stub)
     	.showImageForEmptyUri(R.drawable.ic_empty)
     	.showImageOnFail(R.drawable.ic_error)
     	.cacheInMemory(true)
     	.cacheOnDisk(true)
     	.considerExifParams(true)
     	.bitmapConfig(Bitmap.Config.RGB_565)
     	.build();
     	
     	ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
     	.threadPriority(Thread.NORM_PRIORITY - 2)
     	.denyCacheImageMultipleSizesInMemory()
     	.diskCacheFileNameGenerator(new Md5FileNameGenerator())
     	.diskCacheSize(50 * 1024 * 1024) // 50 Mb
     	.tasksProcessingOrder(QueueProcessingType.LIFO)
     	.writeDebugLogs() // Remove for release app
     	.build();
         // Initialize ImageLoader with configuration.
         ImageLoader.getInstance().init(config);
     	imageLoader=ImageLoader.getInstance();
 	 
        loadData();
           
    }
      
    private void loadData()
    {
    	listViewNoticias=(ListView)findViewById(R.id.custom_list_noticia);	
    	listViewNoticias.setAdapter(null);
    	new NoticiasClient().execute(); 
    	
    }
    
	private class NoticiasClient extends AsyncTask<String, Void, String> {

		private ProgressBar progressBar;

		protected void onPreExecute() {
			logger.debug("onPreExecute");
			textNewsConnection.setVisibility(View.GONE);
			pB.setVisibility(View.VISIBLE);

		}

		@Override
		protected String doInBackground(String... arg0) {
			logger.debug("doInBackground NoticiasClient");

			try {

				// TODO Auto-generated method stub
				ServiceHandler serviceHandler = new ServiceHandler();
				String jsonString = serviceHandler.makeServiceCall(
						ConstantRest.URL_NOTICIAS, serviceHandler.GET);
				logger.info("json : " + jsonString);

				if (jsonString != null) {
					try {

						logger.debug("Recorro el listado de json");
						listData = new ArrayList<Noticia>();
						Gson gson = new Gson();
						JSONArray jsonArray = new JSONArray(jsonString);
						for (int i = 0; i < jsonArray.length(); i++) {
							Noticia noticia = new Noticia();
							JSONObject jsonObject = jsonArray.getJSONObject(i);
							noticia.setIdNoticia(jsonObject
									.getString(NoticiaTag.ID));
							noticia.setTituloNoticia(jsonObject
									.getString(NoticiaTag.TITULO));
							noticia.setBajadaNoticia(jsonObject
									.getString(NoticiaTag.BAJADA));
							noticia.setDateNoticia(jsonObject
									.getString(NoticiaTag.FECHA));
							noticia.setUrlImageNoticia(jsonObject
									.getString(NoticiaTag.URL));
							noticia.setCuerpoNoticia(jsonObject
									.getString(NoticiaTag.CUERPO));
							listData.add(noticia);

						}

					} catch (JSONException e) {
						logger.error("Error JSONExcetion : " + e.toString());
					}

				}

			} catch (Exception ex) {
				logger.debug("Error :" + ex.toString());

			}

			return null;

		}

		protected void onProgressUpdate(Integer... progress) {
			pB.setProgress(progress[0]);
		}

		protected void onPostExecute(String result) {
			if (listData.size() != 0) {
				for (Noticia noticia : listData) {
					noticiaBean.add(noticia);
				}

				System.out.println("informacion de datos");
				// HIDE THE SPINNER AFTER LOADING FEEDS
				pB.setVisibility(View.GONE);
				displayContent(result);

			} else {
				pB.setVisibility(View.GONE);
				textNewsConnection.setText(ConstantRest.CONNECTION_ERROR);
				textNewsConnection.setVisibility(View.VISIBLE);
				logger.debug("No contiene datos");
				
			}

		}

		public void displayContent(String result) {
			System.out.println("Result : " + result);
			adapter = new CustomNewsAdapter(ActivityNoticia.this, listData,
					imageLoader, options);
			listViewNoticias.setAdapter(adapter);
			ImageView imageViewNews = (ImageView) findViewById(R.id.image_newsHeaderUpdate);

			imageViewNews.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					logger.debug("event News Update");
					loadData();

				}
			});
			listViewNoticias.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					logger.debug("click noticia");

					TextView text_noticiaId = (TextView) arg1
							.findViewById(R.id.text_noticiaId);
					Intent intent = new Intent(ActivityNoticia.this,
							ActivityNoticiaContent.class);
					intent.putExtra(Constants.NOTICIA_ID, text_noticiaId
							.getText().toString());

					startActivity(intent);
				}
			});
		}

	}
    
    
}
