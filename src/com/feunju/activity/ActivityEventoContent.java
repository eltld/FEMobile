package com.feunju.activity;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.feunju.bean.AutoridadBean;
import com.feunju.bean.EventoBean;
import com.feunju.edu.R;
import com.feunju.model.Autoridad;
import com.feunju.model.Evento;
import com.feunju.model.constant.Constants;
import com.koushikdutta.ion.Ion;

public class ActivityEventoContent extends Activity {

private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityEventoContent.class);

private TextView text_eventoTitulo;
private TextView text_eventoBajada;
private TextView text_eventoFecha;

private TextView text_eventoCuerpo;
private TextView textHeader;
private EventoBean eventoBean;



@Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.evento_content);

  
 logger.debug("Evento Content");
 
 Intent intent=this.getIntent();
 String autoridad_id=intent.getStringExtra(Constants.EVENTO_ID);
 eventoBean=new EventoBean(getApplicationContext());
 Evento evento=eventoBean.get(Long.parseLong(autoridad_id));
 
 logger.debug("Evento getObject :"+evento.toString());
 
 text_eventoTitulo=(TextView)findViewById(R.id.text_eventoContentTitulo);
 text_eventoBajada=(TextView)findViewById(R.id.text_eventoContentBajada);
 text_eventoFecha=(TextView)findViewById(R.id.text_eventoContentFecha);
 text_eventoCuerpo=(TextView)findViewById(R.id.text_eventoContentCuerpo);
 //text_eventoUrlWeb=(TextView)findViewById(R.id.text_eventoContentUrlWeb);
 textHeader=(TextView)findViewById(R.id.text_header);
 textHeader.setText("Evento");
 
 
 
 //asigno los valores 
 if(evento!=null)
  {
	 text_eventoTitulo.setText(Html.fromHtml(evento.getTituloEvento()));
	 text_eventoBajada.setText(Html.fromHtml(evento.getBajadaEvento()));
	 text_eventoFecha.setText(Html.fromHtml(evento.getFechaEvento()));
	
	 text_eventoCuerpo.setText(Html.fromHtml(evento.getCuerpoEvento()));
	 //text_eventoUrlWeb.setText(evento.getUrlWebEvento()); 
  }

}

}
