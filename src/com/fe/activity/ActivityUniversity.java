package com.fe.activity;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.SecretariaBean;
import com.fe.bean.UniversityBean;
import com.fe.bean.adapter.CustomComedorAdapter;
import com.fe.bean.adapter.CustomUniversityAdapter;
import com.fe.model.Constants;
import com.fe.model.Universidad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


/**
 * 
 * @author : David Garcia 
 * @dathe  : 2-09-2014
 *
 */
public class ActivityUniversity extends Activity {


	private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityUniversity.class);
	
	private TextView textHeader;
	private ListView listView;
	private ArrayList<Universidad> listData;
	private CustomUniversityAdapter adapter;
	private UniversityBean universidadBean;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.university);
	 
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText(Constants.TAG_UNIVERSITY_HEADER);
	     	
	    universidadBean=new UniversityBean(getApplicationContext());	
		loadData();
		//load list view
		logger.info("onCreate Activity Universidades : listData : "+listData.size());
		listView=(ListView)findViewById(R.id.list_university);
		
	    adapter=new CustomUniversityAdapter(ActivityUniversity.this,listData);
	    listView.setAdapter(null);
	    listView.setAdapter(adapter);
	    
	    listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
	
				final TextView text_id=(TextView)arg1.findViewById(R.id.text_universityId);
				
				final CharSequence items[] = new CharSequence[] {"Informacion Administrativa", 
						                                 "Carreras", "Ingreso", "Localizacion"};

				AlertDialog.Builder builder = new AlertDialog.Builder(ActivityUniversity.this);
				builder.setTitle("Seleccione Opción");
				builder.setItems(items, new DialogInterface.OnClickListener() {
				    @Override
				    public void onClick(DialogInterface dialog, int which) {
				     
				    	logger.debug("seleccionado : "+items[which] + " item :"+which);
				        switch(which)
				        {
				        case 0 : 
				        {
				           //informacion 
				        	logger.debug("Informacion Administrativa");
				        	Intent intent=new Intent(ActivityUniversity.this,ActivityUniversityInformacion.class);
				        	intent.putExtra(Constants.UNIVERSITY_ID,text_id.getText().toString());
				        	startActivity(intent);
				        	
				        };break;
				        case 1 : {
				        	logger.debug("Carreras");
				        	Intent intent=new Intent(ActivityUniversity.this, ActivityCarrera.class);
				        	intent.putExtra(Constants.UNIVERSITY_ID,text_id.getText().toString());
				        	startActivity(intent);
				        	
				        };break;
				        case 2 : {
				        	logger.debug("Ingreso");
				           	Intent intent=new Intent(ActivityUniversity.this, ActivityUniversityIngreso.class);
				        	intent.putExtra(Constants.UNIVERSITY_ID,text_id.getText().toString());
				        	startActivity(intent);
				        	
				 
				        	
				        };break;
				        case 3: {
				        	logger.debug("Localizacion");
				        	Intent intent=new Intent(ActivityUniversity.this,ActivityUniversityMap.class);
				        	intent.putExtra(Constants.UNIVERSITY_ID, text_id.getText().toString());
				        	startActivity(intent);
				        	
				        	
				        };break;
				        
				        
				        }
				    
				    }
				});
				builder.show();
				
			
			}
		});
		
   }
	
	private void loadData()
	{
		listData=null;
		listData=new ArrayList<Universidad>();
		
		//Universidad de Agraria
		Universidad universidad=new Universidad();
		universidad.setId_universidad(Constants.FACU_AGRAGRIA_ID);
		universidad.setNombre_universidad("FACULTAD DE CIENCIAS AGRARIAS");
		universidad.setDireccion("ALBERDI No 47");
		universidad.setCodigoPostal("4600");
		universidad.setTelefono("0388-4221556");
		universidad.setFax("0388-4221556");
		universidad.setEmail("academica@fca.unju.edu.ar");
		universidad.setWeb("www.fca.unju.edu.ar");
		universidad.setInscripcion("Del 01 al 20 de Diciembre de cada año."+
          " Desde 01 al 15 de Febrero de cada año.");
        universidad.setPreinscripcion("De octubre a diciembre, vía internet: http//: www.alumnos.fca.unju.edu.ar");
		universidad.setInforme("Departamento Alumnos.");
		universidad
				.setRequisitos("Fotocopia autenticada de Certificado de estudios de Nivel Medio o Polimodal o constancia original de Certificado de Estudios en trámite. Los estudiantes con materias previas tienen plazo hasta la primera quincena de abril de cada año para acreditar la finalización de Estudios de Nivel Medio, Polimodal o Terciario (si correspondiere), Resolución C. S. Nº 171/03.- "
						+ "Fotocopia autenticada de Carnet sanitario expedido por el Ministerio de Bienestar Social de la Provincia de Jujuy, por la Municipalidad de la Capital (Departamento Dr. M. Belgrano) o por hospitales zonales o municipios del interior de la provincia. (*)"
						+ "Dos (2) fotografías tipo carnet (4x4)."
						+ "Fotocopia autenticada de Documento Nacional de Identidad de las dos primeras hojas, y si correspondiere, de la hoja donde conste cambio de domicilio. (*)"
						+ "Ingreso de Extranjeros: se aplicarán las normas vigentes en la Universidad ."
						+ "Formulario de Preinscripción impreso (debe corresponder a la última actualización realizada en el módulo de Preinscripción)."
						+ "Carpetín colgante."
						+ "(*) Se deberán presentar además los originales a los efectos de constatar la veracidad de los datos ");
		
		universidad.setLat_universidad("-24.188101");
		universidad.setLong_universidad("-65.293551");
		listData.add(universidad);
		//Universidad de Ingenieria
		universidad=new Universidad();
		universidad.setId_universidad(Constants.FACU_INGENIERIA_ID);
		universidad.setNombre_universidad("FACULTAD DE INGENIERIA");
		universidad.setDireccion("AV. ITALIA ESQ. MARTIARENA");
		universidad.setCodigoPostal("4600");
		universidad.setTelefono("0388-4221587");
		universidad.setFax("0388-4221528");
		universidad.setEmail("sacad@fi.unju.edu.ar");
		universidad.setWeb("www.fi.unju.edu.ar");
		universidad.setPreinscripcion("De Noviembre a Diciembre de cada año vía internet:  www.fi.unju.edu.ar");
		universidad.setInscripcion("Del 01 al 20 de Diciembre de cada año."+
                                   "Del 01 al 07 de Febrero de cada año.");
		universidad.setInforme("Departamento Alumnos de lunes a viernes de 09:00 a 12:00 y de 16:00 a 19:00 hs.");
		universidad.setRequisitos("Formulario impreso de preinscripción por Internet"+
                                  "Fotocopia autenticada de las dos primeras hojas del Documento Nacional de Identidad y de las hojas en donde consten cambios de domicilio si los hubiera."+
                                  "Fotocopia autenticada del Título de Nivel Medio (Secundario o Polimodal) o Constancia Original de Título de Nivel Medio en Trámite. Excepcionalmente, los aspirantes que adeuden materias para concluir el Nivel Medio serán preinscriptos provisoriamente presentando un certificado de estudios de Nivel Medio Incompletos, siendo la fecha límite para completar los estudios de Nivel Medio y presentar la documentación hasta el 15 de abril de cada año."+
                                  "Cuatro fotos carnet"+
                                  "Carnet Sanitario expedido por el Ministerio de Bienestar Social de Jujuy u Organismo Sanitario Oficial, o constancia de iniciación del trámite correspondiente para obtenerlo."+   
                                  "Fotocopia autenticada de la Partida de Nacimiento"+
                                  "Asistir al Curso de Nivelación que se inicia en febrero de cada año."  +
                                  "La documentación deberá ser presentada personalmente en una carpeta colgante tamaño oficio.");
		
		
		universidad.setLat_universidad("-24.188887");
		universidad.setLong_universidad("-65.293632");
		listData.add(universidad);
		
		//Universidad de Ciencias Economicas
		universidad=new Universidad();
		universidad.setId_universidad(Constants.FACU_ECONOMICA_ID);
		universidad.setNombre_universidad("FACULTAD DE CIENCIAS ECONOMICAS");
		universidad.setDireccion("ALVEAR Nº 843");
		universidad.setCodigoPostal("4600");
		universidad.setTelefono("0388-4221529");
		universidad.setFax("0388-4221527");
		universidad.setEmail("sacad@fce.unju.edu.ar");
		universidad.setWeb("www.fce.unju.edu.ar");
		universidad.setPreinscripcion("De Octubre a Diciembre, vía internet: http//: www.fce.unju.edu.ar");
		universidad.setInscripcion("Del 01 al 20 de Diciembre de cada año."+
                                   "Desde 01 al 15 de Febrero de cada año.");
		universidad.setInforme("Departamento Alumnos.");
		universidad.setRequisitos("Fotocopia de D.N.I. (1º y 2º hoja)."+
                                  "Fotocopia autenticada del Certificado de Estudios Secundario o constancia provisoria original del certificado de estudios en trámite. Las personas que adeuden materias tienen plazo hasta el 15 de abril de cada año para aprobarlas. No se acepta constancia de alumno regular."+
                                  "Fotocopia de Carnet Sanitario expedido por el Centro Sanitario del Ministerio de Salud."+
                                  "Dos (2) fotos tipo carnet."+
                                  "Un carpetín colgante tamaño oficio con visor y broches nepaco."+
                                  "Formulario impreso de pre-inscripción.");
		universidad.setLat_universidad("-24.184097");
		universidad.setLong_universidad(" -65.304802");
		
		listData.add(universidad);
		logger.debug("Universityt : "+universidad.toString());
		for (Universidad uni : listData) {
			logger.debug("id_university : "+uni.getId_universidad());
		}
		
		
		//humanidads y cs sociales
		universidad=new Universidad();
		universidad.setId_universidad(Constants.FACU_HUMANIDADES_ID);
		universidad.setNombre_universidad("FACULTAD DE HUMANIDADES Y CIENCIAS SOCIALES");
		universidad.setDireccion("OTERO Nº 262");
		universidad.setCodigoPostal("4600");
		universidad.setTelefono("0388-4221604");
		universidad.setFax("0388-4221559");
		universidad.setEmail("secretariaacademica@fhycs.unju.edu.ar");
		universidad.setWeb("www.fhycs.unju.edu.ar");
		universidad.setPreinscripcion("Por internet:  www.fhycs.unju.edu.ar"+
                                      "De 15/11 al 30/12 de cada año. ");
		universidad.setInscripcion("Del 03 al 18 de Febrero de cada año.");
		universidad.setInforme("Dirección alumnos de 08:30 a 12:30 y de 16:30 a 20:30 hs.");
		universidad
				.setRequisitos("Fotocopia autenticada del D.N.I."
						+ "Fotocopia autenticada del título Secundario o constancia del título en trámite (original)."
						+ "Dos (2) fotos tipo carnet 4x4."
						+ "Una carpeta colgante pedaflex o Rehin con broche nepaco y visor para número."
						+ "Ficha individual del alumno."
						+ "Requisitos para alumnos vocacionales"
						+ "Nota solicitando autorización: debe ser presentada en Mesa de Entrada antes de la Inscripción."
						+ "Requisitos Obligatorios de Ingreso"
						+ "Todas las fotocopias de la Documentación deben ser autenticadas por Escribano Público.");
		
		universidad.setLat_universidad("-24.185753");
        universidad.setLong_universidad("-65.301565");
		
        listData.add(universidad);
		
        
		//escuela de minas 

        universidad=new Universidad();
		universidad.setId_universidad(Constants.ESC_MINAS);
		universidad
				.setNombre_universidad("ESCUELA DE MINAS 'Dr. Horacio Carrillo' ");
		universidad.setDireccion("Italia Nro. 47");
		universidad.setCodigoPostal("4600");
		universidad.setTelefono("0388-4221598/9");
		universidad.setFax("");
		universidad.setEmail("");
		universidad.setWeb("http://www.escuelademinas.unju.edu.ar/");
		universidad.setPreinscripcion(" ");
		universidad.setInscripcion("Del 03 al 18 de Febrero de cada año.");
		universidad
				.setInforme("");
		universidad
				.setRequisitos("");

		universidad.setLat_universidad("-24.185753");
		universidad.setLong_universidad("-65.301565");
		
		listData.add(universidad);

	
		System.out.println("listData : "+listData.size());
		universidadBean.addList(listData);
		
	}
	
}