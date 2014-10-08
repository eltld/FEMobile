package com.fe.activity;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.ListView;
import android.widget.TextView;

import com.fe.R;
import com.fe.bean.CarreraBean;
import com.fe.bean.util.JustifyTextView;
import com.fe.model.Carrera;
import com.fe.model.Constants;

public class ActivityCarreraMinas  extends Activity {

	  private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityCarreraContent.class);
	  private TextView textHeader;
	  private TextView textTitulo;
	  private JustifyTextView textContenido;
	  
	  private TextView text_materia;
	  private List<String> listMateria;
	  private ListView listViewMateria;
	  private String materia;
	  
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.carrera_minas);
		 
			Intent intent=getIntent();
			String idCarrera=intent.getStringExtra(Constants.CARRERA_ID);
			String idUniversity=intent.getStringExtra(Constants.UNIVERSITY_ID);
			
			logger.debug("Activity Carrera Content Seleccionada : "+idCarrera);
			
			textHeader=(TextView)findViewById(R.id.text_header);
		 	textTitulo=(TextView)findViewById(R.id.text_carreraContentMinaTitulo);
			textContenido=(JustifyTextView)findViewById(R.id.text_carreraContentMinaContent);
			
		 	textHeader.setText(Html.fromHtml("Carrera"));
		    
		 	textTitulo.setText("Escuela de Minas “Dr. Horacio Carrillo");
		    textContenido.setText(Html.fromHtml("Años de cursado: 6 (seis) divididos en dos Ciclos: Ciclo Básico: 1ro., 2do. y 3er. año Ciclo Superior: 4to., 5to. y 6to. año ."+
		 	"<br>Al finalizar el 3er. Año del Ciclo Básico los alumnos deben optar por una de las tres tecnicaturas que ofrece la Escuela:"+
"<br>Técnico Minero."+
"<br>Técnico Químico."+
"<br>Técnico en Informática: esta especialidad está articulada con la carrera de Analista Programador Universitario de la Facultad de Ingeniería de la UNJu."+
"<br>En ambos Ciclos los alumnos deben realizar actividades extracurriculares por las cuales se le otorgan créditos, en el marco de proyectos que presentan los docentes en sus horas institucionales. "+
"<br>Algunos de estos proyectos son:"+
"<br>Participación en Olimpíadas de: Matemática, Química, Dibujo Técnico, Geografía, Medio Ambiente, Contenidos Educativos en Internet, entre otras."+
"<br>Viajes integradores de Estudio."+
"<br>Proyectos solidarios."));
		 	
		 	
			
			
        }
}
			