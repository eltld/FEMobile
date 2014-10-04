package com.fe.activity;

import java.util.ArrayList;
import java.util.Calendar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.fe.R;
import com.fe.bean.EventoBean;
import com.fe.bean.NoticiaBean;
import com.fe.bean.adapter.CustomEventoAdapter;
import com.fe.bean.adapter.CustomNewsAdapter;
import com.fe.bean.json.EventoTag;
import com.fe.bean.json.NoticiaTag;
import com.fe.model.ConstantRest;
import com.fe.model.Constants;
import com.fe.model.Evento;
import com.fe.model.Noticia;
import com.fe.service.ServiceHandler;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;


/**
 * 
 * @author David Garcia
 *
 */
public class ActivityEvento  extends Activity{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityEvento.class);
	private ListView listViewEventos;
	private ArrayList<Evento> listData;
    private CustomEventoAdapter adapter;
    private TextView textViewHeader;
    ProgressDialog pDialog;
    ProgressBar pB;
    DisplayImageOptions options;
	protected ImageLoader imageLoader;
	EventoBean eventoBean=null;
    private ImageView imageViewCalendar;
    private TextView textConnection;
	private int yr,mon,day;
	
	static final int DATE_DIALOG_ID=0;
	 
    private String string_header;
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
      
         super.onCreate(savedInstanceState);
         setContentView(R.layout.evento);  
         Intent intent=new Intent();
         string_header=intent.getStringExtra("title_header");
         textViewHeader=(TextView)findViewById(R.id.text_eventHeader);
		 textViewHeader.setText("Eventos");
		
         pB=(ProgressBar)findViewById(R.id.marker_progress);
      	 textConnection=(TextView)findViewById(R.id.text_eventoConnection);
         eventoBean=new EventoBean(getApplicationContext());
	 
         loadClient();
        
     
         
    }
      
    
    private void loadClient()
    {
    	listViewEventos=(ListView)findViewById(R.id.custom_list_evento);
    	listViewEventos.invalidate();
    	listViewEventos.invalidateViews();
    	listViewEventos.clearTextFilter();
    	
    	listViewEventos.setAdapter(null);
    	new EventoClient().execute(); 
         
    }
    
    private class EventoClient extends AsyncTask<String,Void, String>{

    	
    	
    	private ProgressBar progressBar;
    	
    	protected void onPreExecute() {
            logger.debug("onPreExecute");
             pB.setVisibility(View.VISIBLE);
             textConnection.setVisibility(View.GONE); 
       }
    	
    	@Override
    	protected String doInBackground(String... arg0) {
    		logger.debug("doInBackground EventoClient");
    		
    		try
    		{
    		
    		// TODO Auto-generated method stub
    		ServiceHandler serviceHandler=new ServiceHandler();
    		String jsonString=serviceHandler.makeServiceCall(ConstantRest.URL_EVENTO,serviceHandler.GET);
    		logger.info("json : "+jsonString);
    		
    		
    		if(jsonString!=null && jsonString.length()!=0)
		    {
    			try
    			{
    			
    				logger.debug("Recorro el listado de json");
    				listData=new ArrayList<Evento>();
    				Gson gson=new Gson();
    				JSONArray jsonArray=new JSONArray(jsonString);
    				for(int i=0; i<jsonArray.length();i++)
    				{
    				   Evento evento=new Evento();
    				   JSONObject jsonObject=jsonArray.getJSONObject(i);
    				   evento.setIdEvento(jsonObject.getString(EventoTag.EVENTO_ID));
    				   evento.setTituloEvento(jsonObject.getString(EventoTag.EVENTO_TITULO));
    				   evento.setFechaEvento(jsonObject.getString(EventoTag.EVENTO_FECHA));
    				   evento.setHorarioEvento(jsonObject.getString(EventoTag.EVENTO_HORARIO));
    				   evento.setCuerpoEvento(jsonObject.getString(EventoTag.EVENTO_CUERPO));
    				   evento.setUrlWebEvento(jsonObject.getString(EventoTag.EVENTO_URL_WEB));
    				   listData.add(evento);
    					
    				}
    			
    				
    			}catch(JSONException e)
    			{
    				logger.error("Error JSONExcetion : "+e.toString());
    			}
    			
    		}
    		
    		}catch(Exception ex)
    		{
    			logger.debug("Error :"+ex.toString());
    			
    			
    		}
    		
    		return null;
    	
    	
    	}
    	
    	
    	protected void onProgressUpdate(Integer... progress){
    		pB.setProgress(progress[0]);
    		}
    	
		protected void onPostExecute(String result)
    	{
    		if(listData!=null)
    		{
    			for(Evento evento : listData)
    			{ eventoBean.add(evento);}
    			
    			System.out.println("informacion de datos");
    			 // HIDE THE SPINNER AFTER LOADING FEEDS
    			  pB.setVisibility(View.GONE);
    			displayContent(result);
    			
    		}
    		else
    		{
    			pB.setVisibility(View.GONE);
    			textConnection.setText(ConstantRest.CONNECTION_ERROR);
    			textConnection.setVisibility(View.VISIBLE);
    			System.out.println("no contiene datos");
    		}
      			
    	}
		
		public void displayContent(String result)
		{
			System.out.println("Result : "+result);
			adapter=new CustomEventoAdapter(ActivityEvento.this, listData,imageLoader,
					options);
			adapter.notifyDataSetChanged();
			 listViewEventos.setAdapter(adapter);
			 imageViewCalendar=(ImageView)findViewById(R.id.image_eventHeaderCalendar);

			
			 imageViewCalendar.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						logger.debug("event Calendar");
						showDatePickerDialog();

					}
				});
			
			listViewEventos.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					logger.debug("click noticia");
					
					
					TextView text_eventoId=(TextView)arg1.findViewById(R.id.text_eventoId);
					Intent intent = new Intent(ActivityEvento.this, ActivityEventoContent.class);
					intent.putExtra(Constants.EVENTO_ID, text_eventoId.getText().toString());
		
					startActivity(intent);
				}
			});
		}

    }


public void showDatePickerDialog()
{

	 Calendar today=Calendar.getInstance();
     yr=today.get(Calendar.YEAR);
     mon=today.get(Calendar.MONTH);
     day=today.get(Calendar.DAY_OF_MONTH);
	showDialog(DATE_DIALOG_ID);
}

protected Dialog onCreateDialog(int id)
{
	switch (id) {
	case DATE_DIALOG_ID:
		return new DatePickerDialog(ActivityEvento.this,dateSetListener,yr,mon,day);
		
	}
	return null;
}
private DatePickerDialog.OnDateSetListener dateSetListener=new DatePickerDialog.OnDateSetListener() {
	
	@Override
	public void onDateSet(DatePicker view, int year, int monthOfYear,
			int dayOfMonth) {
		// TODO Auto-generated method stub
		yr=year;
		mon=monthOfYear;
		day=dayOfMonth;
		loadClient();
		//EditText it=(EditText)findViewById(R.id.editText1);
		//it.setText(day+" - "+mon+" - "+yr);
	}
};



    
}