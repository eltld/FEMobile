package com.feunju.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feunju.bean.CarreraBean;
import com.feunju.bean.adapter.CustomComedorAdapter;
import com.feunju.bean.util.UtilList;
import com.feunju.model.Carrera;
import com.feunju.model.constant.Constants;
import com.feunju.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class ActivityCarreraContent extends Activity {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(ActivityCarreraContent.class);
  private TextView textHeader;
  private Carrera objCarrera;
  private TextView text_titulo;
  private TextView text_nivel;
  private TextView text_acreditacion;
  private TextView text_perfil;
  private TextView text_alcance;
  private TextView text_duracion;
  private TextView text_grado;
  private TextView text_materia;
  private List<String> listMateria;
  private ListView listViewMateria;
  private String materia;
  
  private CarreraBean carreraBean;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carrera_content);
	 
		Intent intent=getIntent();
		String idCarrera=intent.getStringExtra(Constants.CARRERA_ID);
		String idUniversity=intent.getStringExtra(Constants.UNIVERSITY_ID);
		
		logger.debug("Activity Carrera Content Seleccionada : "+idCarrera);
		
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText(Html.fromHtml("Carrera"));
		
		carreraBean=new CarreraBean(getApplicationContext());
		Carrera objCarrera=carreraBean.get(Long.parseLong(idCarrera),Long.parseLong(idUniversity));
		
		switch(Integer.parseInt(idUniversity))
		{
		case Constants.FACU_AGRAGRIA_ID: 
		{
			logger.debug("load materia agrarias");
		  materia=loadMateriaAgraria(Integer.parseInt(idCarrera));
        };break;
		case Constants.FACU_HUMANIDADES_ID:
		
		{   logger.debug("load materia humanidades");
			materia=loadMateriaHumanidades(Integer.parseInt(idCarrera));
		};break;
		case Constants.FACU_ECONOMICA_ID:{
			logger.debug("load materia economica");
			materia=loadMateriaContador(Integer.parseInt(idCarrera));
		};break;
		case Constants.FACU_INGENIERIA_ID : {
			logger.debug("load materia ingenieria");
			materia=loadMateriaIngenieria(Integer.parseInt(idCarrera));
		};break;
		
		
		}
		
		
		
		if(objCarrera!=null)
		{
	      logger.debug("objCarrera : "+objCarrera.toString());
		  text_titulo=(TextView)findViewById(R.id.text_carreraContentTitulo);
	      text_nivel=(TextView)findViewById(R.id.text_carreraContentNivel);
	      text_acreditacion=(TextView)findViewById(R.id.text_carreraContentAcreditacion);
	      text_perfil=(TextView)findViewById(R.id.text_carreraContentPerfil);
	      text_alcance=(TextView)findViewById(R.id.text_carreraContentAlcance);
	      text_materia=(TextView)findViewById(R.id.text_carreraContentMateria);
	      text_duracion=(TextView)findViewById(R.id.text_carreraContentDuracion);
	      
	      
	      
	      logger.debug("Materia : "+materia.toString());
	      text_titulo.setText(objCarrera.getTitulo_carrera());
	      text_duracion.setText(Html.fromHtml(objCarrera.getDuracion_carrera()));
	      text_nivel.setText(Html.fromHtml(objCarrera.getNivel_carrera()));
	      text_acreditacion.setText(Html.fromHtml(objCarrera.getAcreditacion_carrera()));
	      text_perfil.setText(Html.fromHtml(objCarrera.getPerfil_carrera()));
	      text_materia.setText(Html.fromHtml(materia));
	      text_alcance.setText(Html.fromHtml( objCarrera.getAlcance_carrera()));
        
        	
	      
		}
	    
	}
	
	
	public String loadMateriaAgraria(int id_carrera)
	{
		
		logger.debug("loadMateriaAgraria id_carrera : "+id_carrera);
		List<String> listMateria=new ArrayList<String>();
		 
		String materia="";
		switch (id_carrera)
		{
		 
		case 1:{		
		//Ingeniero Agronomo
		
		  materia+="<br><b>PRIMER A�O</b>";
		  materia+="<br>�lgebra y Geometr�a Anal�tica";
	      materia+=" <br>An�lisis Matem�tico";
          materia+=" <br>Bot�nica General"; 		
		  materia+=" <br>Bot�nica Sistem�tica";
		  materia+=" <br>Qu�mica General e Inorg�nica";
		  materia+=" <br>Qu�mica Org�nica";
		  materia+=" <br>F�sica";
		  materia+=" <br>M�dulo I";
		//2 a�o
		  materia+="<br><b>SEGUNDO A�O</b>";
		  materia+="<br>Bioestad�stica y Dise�o Experimental";
		  materia+="<br>Qu�mica Biol�gica";	
        materia+=" <br>Qu�mica Agr�cola";	
        materia+=" <br>Econom�a General";	
        materia+=" <br>Microbiolog�a Agr�cola";	
        materia+=" <br>Topograf�a";	
        materia+=" <br>Agroclimatolog�a";
        //3 a�o
        materia+="<br><b>TERCER A�O</b>";
        materia+=" <br>Fisiolog�a Vegetal";	
        materia+=" <br>Zoolog�a Agr�cola";	
        materia+=" <br>Fitopatolog�a";	
        materia+=" <br>Edafolog�a";	
        materia+=" <br>Gen�tica";	
        materia+=" <br>Mecanizaci�n Agr�cola";	
        materia+=" <br>Ecolog�a Agr�cola";	
        materia+=" <br>Econom�a Agraria";	
        materia+=" <br>M�dulo II";	
        //4 a�o
        materia+="<br><b>CUARTO A�O</b>";
        materia+="<br>25 Manejo del Suelo y Riego";	
        materia+="<br>26 Protecci�n Vegetal";	
        materia+="<br>27 Granos y Forrajes";	
        materia+="<br>28 Producci�n Animal I";	
        materia+="<br>29 Dasonom�a";	
        materia+="<br>30 Mejoramiento Gen�tico";
        
        //5to a�o
        materia+="<br><b>QUINTO A�O</b>";
        materia+="<br>31 Administraci�n Agraria";	
        materia+="<br>32 Horticultura y Floricultura";	
        materia+="<br>33 Cultivos Industriales";	
        materia+="<br>34 Fruticultura";	
        materia+="<br>35 Producci�n Animal II";	
        materia+="<br>36 Legislaci�n Agraria";	
        materia+="<br>37 Extensi�n Rural";	
        materia+="<br>38 M�dulo III";	
        materia+="<br>39 Pasant�a con Trabajo Final";
        
		};break;
		case 2 :// LIC. EN CIENCIAS BIOLOGICAS
		   {
			   materia+="<br><b>PRIMER A�O</b>";
			   materia+="<br>Biolog�a Celular</b>";	
			   materia+="<br>Matem�tica</b>";	
			   materia+="<br>Qca General e Inorg�nica</b>";	
			   materia+="<br>Bioestad�stica</b>";	
			   materia+="<br>F�sica de los Proc. Biol�gicos</b>";	
			   materia+="<br>Qu�mica Org�nica</b>";
			   
			   materia+="<br><b>SEGUNDO A�O</b>";
			   materia+="<br>Qu�mica Biol�gica</b>";	
			   materia+="<br>Bot�nica General</b>";	
			   materia+="<br>Ecolog�a General</b>";	
			   materia+="<br>Gen�tica</b>";	
			   materia+="<br>Zoolog�a General</b>";	
			   materia+="<br>Evoluci�n</br>";
			   
			   materia+="<br><b>TERCERA A�O </b>";
			   materia+="<br>Comportamiento Animal";	
			   materia+="<br>Taxonom�a Animal";	
			   materia+="<br>Bio�tica";	
			   materia+="<br>Fisiolog�a Vegetal";	
			   materia+="<br>Taxonom�a Faner�gamas";
			   
			   materia+="<br><b>TALLERES</b>";
			   materia+="<br>Ingl�s I</br>";	
			   materia+="<br>Metod. de la Invest. Cientifica</br>";	
			   materia+="<br>Inform�tica";	
			   materia+="<br>Epistemolog�a de la Ciencia";	
			   materia+="<br>Pol�tica Regional y Gobierno Universitario";	
			   materia+="<br>Curr. Y evaluaci�n de la Educaci�n Superior";	
			   materia+="<br>Practicas de Campo y/o Laboratorio";
			   
			   materia+="<br><b>CICLO SUPERIOR</b>";
               materia+="<br><b>OBLIGATORIAS</b>";
               materia+="<br>Dise�o Experimental";	
               materia+="<br>An�lisis Instrumental";
               
               //Optativas 
               materia+="<br><b>Optativas</b>";
               materia+="<br>Optativa I";
               materia+="<br>Optativa II";
               materia+="<br>Optativa III";
               materia+="<br>Optativa IV";
               materia+="<br>Optativa V";
               materia+="<br>Optativa VI";
               materia+="<br>Practicas de Campo y/o Laboratorio";
               materia+="<br>TESINA";
               
			
		   };break;
		case 3: {
			  //LICENCIADO EN BROMATOLOGIA
			materia+="<br><b>PRIMER A�O</b>";
			materia+="<br>Matem�tica I";	
			materia+="<br>Qu�mica General";	
			materia+="<br>Bot�nica Alimentaria";	
			materia+="<br>Matem�tica II";	
			materia+="<br>Qu�mica Inorg�nica";	
			materia+="<br>F�sica";
			
			materia+="<br><b>SEGUNDO A�O</b>";
			materia+="<br>Qu�mica Org�nica";	
			materia+="<br>Qu�mica Anal�tica General";	
			materia+="<br>Estad�stica";	
			materia+="<br>Zoolog�a Alimentaria";	
			materia+="<br>Qu�mica Biol�gica	";
			materia+="<br>Bromatolog�a I";
			
			materia+="<br><b>TERCER A�O</b>";
			materia+="<br>Qu�mica Anal�tica Instrumental";
			materia+="<br>Microbiolog�a General";
			materia+="<br>Bromatolog�a II";
			materia+="<br>Microbiolog�a de Alimentos";
			materia+="<br>Bromatolog�a III";
			materia+="<br>Higiene y Saneamiento";
			materia+="<br>Toxicolog�a de Alimentos";
			
			materia+="<br><b>CUARTO A�O</b>";
			materia+="<br>Fisiolog�a de la Nutrici�n";
			materia+="<br>Tecnolog�a de los Alimentos";
			materia+="<br>Organizaci�n y Gesti�n de Calidad";
			materia+="<br>Optativa *";
			materia+="<br>Legislaci�n y Educaci�n Alimentaria";
			materia+="<br>Taller de Calidad y Seguridad";
			materia+="<br>Dise�o Expermiental";
			materia+="<br>Optativa**";
			
			materia+="<br><br><b>MATERIAS OPTATIVAS</b>";
			materia+="<br>Epistemolog�a";
            materia+="<br>Econom�a de la Producci�n Alimentaria";
            materia+="<br>Tratamiento de Residuos y Efluentes";
            materia+="<br>Productos Agr�colas Alimentarios";
            materia+="<br>Biotecnolog�a Alimentaria";
            materia+="<br>Micrograf�a de los Alimentos de Origen vegetal";
            materia+="<br>Calidad de productos Fruti-Hort�cola";
			
			materia+="<br><b>LICENCIADO EN BROMATOLOGIA</b>";
			
		};break;
		case 4:{
			
			//BROMATOLOGO
			materia+="<br><b>BROMATOLOGO</b>";
			materia+="<br><b>PRIMER A�O</b>";
			materia+="<br>Matem�tica I";	
			materia+="<br>Qu�mica General";	
			materia+="<br>Bot�nica Alimentaria";	
			materia+="<br>Matem�tica II";	
			materia+="<br>Qu�mica Inorg�nica";	
			materia+="<br>F�sica";
			
			materia+="<br><b>SEGUNDO A�O</b>";
			materia+="<br>Qu�mica Org�nica";	
			materia+="<br>Qu�mica Anal�tica General";	
			materia+="<br>Estad�stica";	
			materia+="<br>Zoolog�a Alimentaria";	
			materia+="<br>Qu�mica Biol�gica	";
			materia+="<br>Bromatolog�a I";
			
			materia+="<br><b>TERCER A�O</b>";
			materia+="<br>Qu�mica Anal�tica Instrumental";
			materia+="<br>Microbiolog�a General";
			materia+="<br>Bromatolog�a II";
			materia+="<br>Microbiolog�a de Alimentos";
			materia+="<br>Bromatolog�a III";
			materia+="<br>Higiene y Saneamiento";
			materia+="<br>Toxicolog�a de Alimentos";
			
			
		};break;
		
		}
		return materia;
	}
	
	
	//Load Humanidades
	public String loadMateriaHumanidades(int id_carrera) {
		

		logger.debug("loadMateriaHumanidades id_Carrera: "+id_carrera);
		
		String materia="";
		switch (id_carrera) {
		case 1: { // LICENCIADO EN COMUNICACION SOCIAL

			// licenciado en comunicacion social
			materia+=" <b>PRIMER A�O</b>";
			materia+="<br>1. Teor�a y Problem�tica de la Comunicaci�n Social";
			materia+="<br>2. Historia Social de la Cultura";
			materia+="<br>3. Filosof�a y su problem�tica";
			materia+="<br>4. Taller de Comprensi�n y Producci�n del Texto Period�stico";
			materia+="<br>5. Psicolog�a Social";
			materia+="<br>6. Fuentes de Informaci�n y Documentaci�n (seminario)";
			materia+="<br>7. Introducci�n a la Problem�tica Period�stica";
			materia+=" <br>8. Taller de Producci�n Gr�fica";

			materia+=" <br><b>SEGUNDO A�O</b>";
			materia+="<br>9. Tecnolog�a de la Comunicaci�n Social (seminario)";
			materia+="<br>10. Ling��stica y principios de Semiolog�a";
			materia+="<br>11. Taller de Redacci�n Period�stica";
			materia+="<br>12. Taller optativo: Producci�n Televisiva 1, Tecnolog�a y Producci�n Radiof�nica 1, Taller de Fotograf�a 1.";
			materia+="<br>13. Sociolog�a de la Comunicaci�n Social";
			materia+="<br>14. Geograf�a Econ�mica y Pol�tica Americana y Argentina";
			materia+="<br>15. Taller de Publicidad y Propaganda";
			materia+="<br>16. Taller optativo: Producci�n Televisiva 2, Tecnolog�a y Producci�n Radiof�nica 2, Taller de Fotograf�a 2";

			materia+="<br><b>TERCER A�O</b>";
			materia+="<br>17. Econom�a Pol�tica y Problem�tica Econ�mica Argentina";
			materia+="<br>18. Antropolog�a Social y Cultural";
			materia+="<br>19. Taller de Semi�tica";
			materia+="<br>20. Historia Pol�tica, Econ�mica y Social de Am�rica y Argentina";
			materia+=" <br>21. Estad�stica";
			materia+=" <br>22. An�lisis del Discurso";
			materia+=" <br>23. Epistemolog�a";
			materia+=" <br>Ingles 1";
			materia+=" <br>Ingles 2";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 1";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 2";
			materia+="<br>TITULO INTERMEDIO: T�CNICO EN COMUNICACI�N SOCIAL";
			materia+="<br><b>CUARTO A�O</b>";
			materia+="<br>24. Teor�a y Problem�tica de la Comunicaci�n Social II";
			materia+="<br>25. Planificaci�n en Comunicaci�n Social ";
			materia+="<br>26. Metodolog�a de la Investigaci�n ";
			materia+="<br>27. An�lisis de la Realidad Contempor�nea Comunicacional (Seminario)";
			materia+="<br>28. Comunicaci�n y Educaci�n (Seminario) ";
			materia+="<br>29. Comunicaci�n Alternativa (Seminario) ";
			materia+="<br>30. �tica y Legislaci�n de la Informaci�n ";
			materia+="<br>31. Seminarios de Formaci�n Espec�fica ";
			materia+="<br>32. RESIDENCIA PROFESIONAL";
			materia+="<br>El licenciado deber� elaborar un Trabajo de Tesis Final con el fin de acreditar la eficiencia de su formaci�n para el desempe�o profesional.";
			materia+="<br><b>TITULO DE GRADO: LICENCIADO EN COMUNICACI�N SOCIAL</b>";

		}
			;
			break;

		case 2: { // TECNICO EN COMUNICACION SOCIAL
			// licenciado en comunicacion social
			materia+="<br><b>PRIMER A�O</b>";
			materia+="<br>1. Teor�a y Problem�tica de la Comunicaci�n Social";
			materia+="<br>2. Historia Social de la Cultura";
			materia+="<br>3. Filosof�a y su problem�tica";
			materia+="<br>4. Taller de Comprensi�n y Producci�n del Texto Period�stico";
			materia+="<br>5. Psicolog�a Social";
			materia+="<br>6. Fuentes de Informaci�n y Documentaci�n (seminario)";
			materia+="<br>7. Introducci�n a la Problem�tica Period�stica";
			materia+="<br>8. Taller de Producci�n Gr�fica";

			materia+="<br><b>SEGUNDO A�O</b>";
			materia+="<br>9. Tecnolog�a de la Comunicaci�n Social (seminario)";
			materia+="<br>10. Ling��stica y principios de Semiolog�a";
			materia+="<br>11. Taller de Redacci�n Period�stica";
			materia+="<br>12. Taller optativo: Producci�n Televisiva 1, Tecnolog�a y Producci�n Radiof�nica 1, Taller de Fotograf�a 1.";
			materia+="<br>13. Sociolog�a de la Comunicaci�n Social";
			materia+="<br>14. Geograf�a Econ�mica y Pol�tica Americana y Argentina";
			materia+="<br>15. Taller de Publicidad y Propaganda";
			materia+="<br>16. Taller optativo: Producci�n Televisiva 2, Tecnolog�a y Producci�n Radiof�nica 2, Taller de Fotograf�a 2";
			materia+="<br><b>TERCER A�O</b>";
			materia+="<br>17. Econom�a Pol�tica y Problem�tica Econ�mica Argentina";
			materia+="<br>18. Antropolog�a Social y Cultural";
			materia+="<br>19. Taller de Semi�tica";
			materia+="<br>20. Historia Pol�tica, Econ�mica y Social de Am�rica y Argentina";
			materia+="<br>21. Estad�stica";
			materia+="<br>22. An�lisis del Discurso";
			materia+="<br>23. Epistemolog�a";
			materia+="<br>Ingles 1";
			materia+="<br>Ingles 2";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 1";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 2";
			materia+="<br><b>TITULO INTERMEDIO: T�CNICO EN COMUNICACI�N SOCIAL</b>";
		}
			;
			break;

		case 3: {
			// Prof. y Lic. en Ciencias de la Educaci�n

			materia+="<br><b>PRIMER A�O</b>";
			materia+="<br>1. Pensamiento Cient�fico";
			materia+="<br>2. Problem�tica Educativa";
			materia+="<br>3. Problem�tica Filos�fica";
			materia+="<br>4. Sociolog�a General";
			materia+="<br>5. M�dulo Optativo del �rea Socio Cultural ";
			materia+=" <br>6. Psicolog�a General";
			materia+=" <br><b>SEGUNDO A�O</b>";
			materia+=" <br>7. Econom�a";
			materia+=" <br>8. Biolog�a del Aprendizaje";
			materia+=" <br>9. Historia Social de la Educaci�n";
			materia+=" <br>10. Epistemolog�a";
			materia+=" <br>11. Sociolog�a de la Educaci�n";
			materia+=" <br>12. Psicolog�a Evolutiva l";
			materia+=" <br><b>TERCER A�O</b>";
			materia+=" <br>13. Psicolog�a Evolutiva II";
			materia+=" <br>14. Psicolog�a Educacional";
			materia+=" <br>15. Historia de la Educaci�n Argentina y Latinoamericana";
			materia+="<br>16. Pol�tica Educacional y Legislaci�n";
			materia+="<br>17. Filosof�a de la Educaci�n";
			materia+="<br>18. Did�ctica General";
			materia+="<br>19. Psicolog�a Social";
			materia+="<br><b>CUARTO A�O</b>";
			materia+="<br>20. Teor�a y Metodolog�a de la Investigaci�n Educativa";
			materia+="<br>21. Planeamiento de la Educaci�n";
			materia+="<br>22. Did�ctica de las �reas Disciplinares";
			materia+="<br>23. Teor�as y Desarrollo del Curriculum";
			materia+="<br>24. Organizaci�n y Administraci�n Educacional";
			materia+="<br>25. M�dulo Optativo del �rea Comunicacional ";
			materia+="<br>26. An�lisis Institucional";
			materia+="<br><b>QUINTO A�O</b>";
			materia+="<br>27. Dificultades del Aprendizaje";
			materia+="<br>28. Educaci�n Especial";
			materia+="<br>29. Orientaci�n e Intervenci�n pedag�gica Institucional";
			materia+="<br>30. Educaci�n No Formal";
			materia+="<br>31. Universidad y Formaci�n Docente";
			materia+="<br>32. PR�CTICA Y RESIDENCIA (PARA EL T�TULO DE PROFESOR)";
			materia+="<br>TRABAJO DE CAMPO E INVESTIGACI�N (TRABAJO FINAL) (PARA EL T�TULO DE LICENCIADO)";

		}
			;
			break;

		case 4: {
			// Licenciatura en Antropolog�a

			materia+="<br>01. Introducci�n a las Ciencias Antropol�gicas.";
			materia+="<br>02. Antropolog�a Biol�gica I";
			materia+="<br>03. Geolog�a del Cuaternario.";
			materia+="<br>04. Antropolog�a Social y Cultural.";
			materia+="<br>05. Prehistoria General.";
			materia+="<br>06. Etnograf�a Americana.";
			materia+="<br>07. Teor�a e Historia de la Antropolog�a";
			materia+="<br>08. Arqueolog�a Americana.";
			materia+="<br>09. Sociedades Campesinas";
			materia+="<br>10. Organizaci�n Social y Parentesco";
			materia+="<br>11. Antropolog�a Biol�gica II";
			materia+="<br>12. Metodolog�a y T�cnicas de la Investigaci�n Arqueol�gica";
			materia+="<br>13. Arqueolog�a Argentina";
			materia+="<br>14. Fundamentos de An�lisis Matem�tico";
			materia+="<br>15. Teor�a e Investigaci�n en Antropolog�a Social.";
			materia+="<br>16. Etnohistoria.";
			materia+="<br>17. Ling��stica General.";
			materia+="<br>18. Antropolog�a de las Sociedades Complejas.";
			materia+="<br>19. Estad�stica.";
			materia+="<br>20. Optativa";
			materia+="<br>21. Optativa";
			materia+="<br>22. Optativa";
			materia+="<br>Filosof�a y su problem�tica";
			materia+="<br>Sociolog�a General";
			materia+="<br>Psicolog�a Social";
			materia+="<br>Fundamentos de Matem�tica";
			materia+="<br>Biolog�a del Aprendizaje";
			materia+="<br>Sociolog�a de la educaci�n";
			materia+="<br>Psicolog�a General";
			materia+="<br>Historia Social";
			materia+="<br>Antropolog�a Filos�fica";
			materia+="<br>Epistemolog�a";
			materia+="<br>Econom�a";
			materia+="<br>Primer Nivel de Ingl�s T�cnico";
			materia+="<br>Segundo Nivel de Ingl�s T�cnico";
			materia+="<br>23. Seminario";
			materia+=" <br>24. Seminario";
			materia+=" <br>25. Seminario";
			materia+=" <br>26. Seminario";
			materia+=" <br>27. Seminario";
			materia+=" <br>28. Seminario";

		}
			;
			break;
		case 5: {
			// Auxiliar t�cnico en antropolog�

			materia+="<br>01. Introducci�n a las Ciencias Antropol�gicas.";
			materia+=" <br>02. Antropolog�a Biol�gica I";
			materia+=" <br>03. Geolog�a del Cuaternario.";
			materia+=" <br>04. Antropolog�a Social y Cultural.";
			materia+=" <br>05. Prehistoria General.";
			materia+=" <br>06. Etnograf�a Americana.";
			materia+="<br>07. Teor�a e Historia de la Antropolog�a";
			materia+=" <br>08. Arqueolog�a Americana.";
			materia+="<br>09. Sociedades Campesinas";
			materia+="<br>10. Organizaci�n Social y Parentesco";
			materia+="<br>11. Antropolog�a Biol�gica II";
			materia+="<br>12. Metodolog�a y T�cnicas de la Investigaci�n Arqueol�gica";
			materia+="<br>13. Arqueolog�a Argentina";
			materia+="<br>14. Fundamentos de An�lisis Matem�tico";
			materia+="<br>15. Teor�a e Investigaci�n en Antropolog�a Social.";
			materia+="<br>16. Etnohistoria.";
			materia+="<br>17. Ling��stica General.";
			materia+="<br>18. Antropolog�a de las Sociedades Complejas.";
			materia+="<br>19. Estad�stica.";
			materia+="<br>20. Optativa";
			materia+="<br>21. Optativa";
			materia+="<br>22. Optativa";
			materia+="<br>Filosof�a y su problem�tica";
			materia+="<br>Sociolog�a General";
			materia+="<br>Psicolog�a Social";
			materia+="<br>Fundamentos de Matem�tica";
			materia+="<br>Biolog�a del Aprendizaje";
			materia+="<br>Sociolog�a de la educaci�n";
			materia+="<br>Psicolog�a General";
			materia+="<br>Historia Social";
			materia+="<br>Antropolog�a Filos�fica";
			materia+="<br>Epistemolog�a";
			materia+="<br>Econom�a";
			materia+="<br>Primer Nivel de Ingl�s T�cnico";
			materia+=" <br>Segundo Nivel de Ingl�s T�cnico";
			materia+="<br>23. Seminario";
			materia+="<br>24. Seminario";
			materia+="<br>25. Seminario";
			materia+="<br>26. Seminario";
			materia+="<br>27. Seminario";
			materia+="<br>28. Seminario";

		}
			;
			break;
		case 6: {
			// /PROFESORADO Y LICENCIATURA EN LETRAS

			materia+="<br><b>ASIGNATURAS DEL PROFESORADO</b>";
			materia+="<br><b>PRIMER A�O</b>";
			materia+="<br>B01. Introducci�n a la Literatura.";
			materia+="<br>B02. Introducci�n a la Historia: Historia Social y del Arte.";
			materia+="<br>B03. Filosof�a.";
			materia+="<br>B04. Gram�tica I.";
			materia+="<br>B05. Lat�n I.";
			materia+="<br>B06. Gram�tica II.";
			materia+="<br>B07. Lat�n II.";
			materia+="<br>B08. Literaturas Cl�sicas.";
			materia+="<br><b>SEGUNDO A�O</b>";
			materia+="<br>B09. Ling��stica.";
			materia+="<br>B10. Literatura Espa�ola I.";
			materia+="<br>B11. Teor�a y Cr�tica Literaria.";
			materia+="<br>P02. Psicolog�a.";
			materia+="<br>P01. Pedagog�a, Organizaci�n y Administraci�n Escolar.";
			materia+="<br>B12. Literatura Espa�ola II.";
			materia+="<br>B13. Literatura Europea I.";
			materia+="<br>B14. Literatura Latinoamericana I.";
			materia+="<br>P04. Psicolog�a Evolutiva.";
			materia+="<br><b>TERCER A�O</b>";
			materia+="<br>B15. Literatura Latinoamericana II.";
			materia+="<br>B16. Literatura Argentina I.";
			materia+="<br>B17. Historia de la Lengua.";
			materia+="<br>B18. Griego I.";
			materia+="<br>P03. Did�ctica.";
			materia+="<br>B19. Literatura Argentina II.";
			materia+="<br>B20. Literatura Europea II.";
			materia+="<br>B21. Griego II.";
			materia+="<br><b>CUARTO A�O</b>";
			materia+="<br>B22. L�gica.";
			materia+="<br>B23. Antropolog�a Filos�fica.";
			materia+="<br>B23. Lengua Extranjera Moderna Nivel I: Ingl�s I - Franc�s I.";
			materia+="<br>B23. Lengua Extranjera Moderna Nivel II: Ingl�s II - Franc�s II.";
			materia+="<br>P05. Pr�ctica y Residencia.";
			materia+="<br><b>ASIGNATURAS DE LA LICENCIATURA</b>";
			materia+="<br><b>PRIMER A�O</b>";
			materia+="<br>B01. Introducci�n a la Literatura.";
			materia+="<br>B02. Introducci�n a la Historia: Historia Social y del Arte.";
			materia+=" <br>B03. Filosof�a.";
			materia+=" <br>B04. Gram�tica I.";
			materia+=" <br>B05. Lat�n I.";
			materia+=" <br>B06. Gram�tica II.";
			materia+=" <br>B07. Lat�n II.";
			materia+=" <br>B08. Literaturas Cl�sicas.";
			materia+=" <br><b>SEGUNDO A�O</b>";
			materia+=" <br>B09. Ling��stica.";
			materia+=" <br>B10. Literatura Espa�ola I.";
			materia+=" <br>B11. Teor�a y Cr�tica Literaria.";
			materia+=" <br>B12. Literatura Espa�ola II.";
			materia+=" <br>B13. Literatura Europea I.";
			materia+=" <br>B14. Literatura Latinoamericana I.";
			materia+=" <br><b>TERCER A�O</b>";
			materia+=" <br>B15. Literatura Latinoamericana II.";
			materia+=" <br>B16. Literatura Argentina I.";
			materia+=" <br>B17. Historia de la Lengua.";
			materia+=" <br>B18. Griego I.";
			materia+=" <br>B19. Literatura Argentina II.";
			materia+=" <br>B20. Literatura Europea II.";
			materia+=" <br>B21. Griego II.";
			materia+=" <br><b>CUARTO A�O</b>";
			materia+=" <br>B22. L�gica.";
			materia+=" <br>B23. Antropolog�a Filos�fica.";
			materia+=" <br>L02. Taller Literario.";
			materia+=" <br>L05. Literatura del NOA.";
			materia+="<br>L05. Lengua Extranjera Moderna Nivel I: Ingl�s I - Franc�s I.";
			materia+="<br>L05. Lengua Extranjera Moderna Nivel II: Ingl�s II - Franc�s II.";
			materia+="<br><b>QUINTO A�O</b>";
			materia+="<br>L01. Metodolog�a de la Investigaci�n.";
			materia+=" <br>L03. Filosof�a del Lenguaje.";
			materia+="L04. Teor�a y Cr�tica Literaria II.";
			materia+="<br>L06. Seminario Vinculado a Tem�ticas Literarias:";
			materia+=" <br>L07. Narrativa Contempor�nea.";
			materia+=" <br>L07. Literatura Norteamericana.";
			materia+=" <br>L07. Literatura del NOA.";
			materia+=" <br>L07. Literatura Folcl�rica.";
			materia+="L07. Teatro Contempor�neo Argentino.";
			materia+="L07. Seminario Vinculado a Tem�ticas Ling��sticas, Sem�nticas o Gramaticales.";
			materia+=" <br>L07. Nuevos Temas de la Gram�tica.";
			materia+=" <br>L07. Semi�tica.";
			materia+=" <br>L07. TESINA FINAL.";

		}
			;
			break;
		case 7: {
			// LICENCIADO EN TRABAJO SOCIAL
			materia+=" <br><b>ASIGNATURAS</b>";
			materia+=" <br>Trabajo Social V";
			materia+="<br>Planeamiento y Planificaci�n Social";
			materia+=" <br>Historia Social";
			materia+=" <br>Antropolog�a Social y Cultural";
			materia+="<br>Organizaci�n y Administraci�n del Bienestar Social";
			materia+="<br>Psicolog�a Social";
			materia+="<br>Supervisi�n y �tica Profesional";
			materia+="Optativa: Sociedades Campesinas o Antropolog�a de las Sociedades Complejas";
			materia+="Optativa: Metodolog�as de la Investigaci�n o Teor�a e Investigaci�n en Antropolog�a Social";
			materia+=" <br>Seminario de orientaci�n";
			materia+=" <br>Seminario de orientaci�n";
			materia+=" <br>Seminario de orientaci�n";
			materia+=" <br>Seminario de orientaci�n";
			materia+=" <br>Tesis de Licenciatura";
		}
			;
			break;
		case 8: {
			// Licenciatura en Educaci�n para la Salud
			materia+=" <br><b>PRIMER A�O</b> ";
			materia+="<br>1. Introducci�n a la educaci�n para la salud";
			materia+=" <br>2. Psicolog�a evolutiva";
			materia+=" <br>3. Antropolog�a filos�fica";
			materia+=" <br>4. Ecolog�a humana";
			materia+=" <br>5. Psicolog�a social";
			materia+=" <br>6. Pedagog�a";
			materia+=" <br>7. Antropolog�a social y cultura.";
			materia+=" <br><b>SEGUNDO A�O</b>";
			materia+=" <br>8. Problem�tica sanitaria";
			materia+=" <br>9. Comunicaci�n";
			materia+=" <br>10. Did�ctica";
			materia+=" <br>11. Salud y salud publica";
			materia+=" <br>12. Tecnolog�a educativa";
			materia+=" <br>13. Epidemiolog�a y estad�stica";
			materia+=" <br><b>TERCER A�O</b>";
			materia+=" <br>14. Problem�tica sanitaria II";
			materia+=" <br>15. Investigaci�n social";
			materia+="<br>16. Planeamiento de la educaci�n para la salud";
			materia+=" <br>17. Inform�tica";
			materia+="<br>18. Organizaci�n y des. De la comunidad";
			materia+=" <br>19. Legislaci�n aplicada";
			materia+=" <br>20. Salud ocupacional";
			materia+=" <br><b>CUARTO A�O</b>";
			materia+=" <br>Trabajo de Campo y Residencia";
			materia+="<br>Obtenci�n del t�tulo de EDUCADOR SANITARIO";
			materia+="<br><b>QUINTO A�O</b>";
			materia+="<br>Seminario de Integraci�n Metodol�gica";
			materia+="Trabajo de Campo con Proyecto Final";
			materia+="<br>Obtenci�n del t�tulo de LICENCIADO EN EDUCACION PARA LA SALUD";

		}
			;
			break;
		case 9: {
			// Educador Sanitario
			materia+=" <br><b>PRIMER A�O</b> ";
			materia+="<br>1. Introducci�n a la educaci�n para la salud";
			materia+=" <br>2. Psicolog�a evolutiva";
			materia+=" <br>3. Antropolog�a filos�fica";
			materia+=" <br>4. Ecolog�a humana";
			materia+=" <br>5. Psicolog�a social";
			materia+=" <br>6. Pedagog�a";
			materia+=" <br>7. Antropolog�a social y cultura.";
			materia+=" <br><b>SEGUNDO A�O</b> ";
			materia+=" <br>8. Problem�tica sanitaria";
			materia+=" <br>9. Comunicaci�n";
			materia+=" <br>10. Did�ctica";
			materia+=" <br>11. Salud y salud publica";
			materia+=" <br>12. Tecnolog�a educativa";
			materia+="<br>13. Epidemiolog�a y estad�stica";
			materia+="<br><b>TERCER A�O</b>";
			materia+="<br>14. Problem�tica sanitaria II";
			materia+="<br>15. Investigaci�n social";
			materia+="<br>16. Planeamiento de la educaci�n para la salud";
			materia+="<br>17. Inform�tica";
			materia+="<br>18. Organizaci�n y des. De la comunidad";
			materia+="<br>19. Legislaci�n aplicada";
			materia+="<br>20. Salud ocupacional";
			materia+="<br><b>CUARTO A�O</b>";
			materia+="<br>Trabajo de Campo y Residencia";
			materia+="<br>Obtenci�n del t�tulo de EDUCADOR SANITARIO";

		}
			;
			break;

		case 10: {

			// Ciclo Superior de Licenciatura en Filosof�a
			materia+=" <br><b>ASIGNATURAS</b>";
			materia+=" <br>Lat�n I o Griego I";
			materia+=" <br>Lat�n II o Griego II";
			materia+=" <br>Epistemolog�a";
			materia+="<br>Metodolog�a de la investigaci�n filos�fica";
			materia+="<br>Filosof�a del lenguaje";
			materia+="<br>Problemas especiales de �tica";
			materia+="<br>L�gica superior";
			materia+="<br>Antropolog�a filos�fica";
			materia+="<br>Teor�a social y pol�tica";
			materia+="<br>Filosof�a de la historia";
			materia+="<br>Seminario: pensamiento argentino y latinoamericano";
			materia+="<br>Econom�a pol�tica";
			materia+="<br>Sociolog�a de la educaci�n";
			materia+="<br>Optativa I: �rea de formaci�n hist�rico-social (a elegir entre)";
			materia+="<br>-Antropolog�a de las sociedades complejas";
			materia+="<br>-Historia social";
			materia+="<br>-Historia social de la cultura";
			materia+="<br>-Antropolog�a social y cultural";
			materia+="<br>-Historia de la educaci�n argentina y latinoamericana";
			materia+="<br>-Organizaci�n y desarrollo de la comunidad";
			materia+="<br>-Indicadores econ�micos y sociales nacionales y de la provincia de Jujuy";
			materia+="<br>-Historia pol�tica social y econ�mica de Am�rica y argentina";
			materia+="<br>Optativa II: �rea de formaci�n metodol�gica.";
			materia+=" <br>-Investigaci�n social";
			materia+="<br>-Fuentes de informaci�n y documentaci�n";
			materia+="<br>-An�lisis institucional";
			materia+="<br>-Semi�tica";
			materia+="<br>-Teor�a e investigaci�n en antropolog�a social";
			materia+="<br>Proyecto Final (Trabajo de Campo e Investigaci�n)";

		}
			;
			break;
		}

		return materia;
	}
	
    //Load Contador 
	public String loadMateriaContador(int id_carrera)
	{
         logger.debug("loadMateriaContador id_Carrera: "+id_carrera);
		
		String materia="";
		switch (id_carrera) {
		case 1 :{
			      //CONTADOR PUBLICO
			      materia+="<br><b>CONTADOR PUBLICO</b>";
			      materia+="<br>PRIMER A�O";
			      materia+="<br>Introducci�n a la Contabilidad ";
			      materia+="<br>Algebra y Geometr�a Anal�tica ";
			      materia+="<br>Teor�a General de la Administraci�n";
			      materia+="<br>Contabilidad B�sica ";
			      materia+="<br>Introducci�n a la Econom�a";
			      materia+="<br>An�lisis Matem�tico ";
			      materia+="<br>Introducci�n a las Ciencias Sociales ";
			      materia+="<br><b>SEGUNDO A�O</b>";
			      materia+="<br>Contabilidad Superior I ";
			      materia+="<br>Estad�stica ";
			      materia+="<br>Estructuras y Procesos";
			      materia+="<br>Derecho Privado ";
			      materia+="<br>Contabilidad Superior II ";
			      materia+="<br>Inform�tica";
			      materia+="<br>Microeconom�a ";
			      materia+="<br><b>TERCER A�O</b>";
			      materia+="<br>Derecho Constitucional y Administrativo ";
			      materia+="<br>Contabilidad Superior III ";
			      materia+="<br>Sistemas de Informaci�n ";
			      materia+="<br>Macroeconom�a";
			      materia+="<br>Costos I ";
			      materia+="<br>Derecho Laboral ";
			      materia+="<br>Historia Econ�mica y Social ";
			      materia+="<br>C�lculo Financiero ";
			      materia+="<br><b>CUARTO A�O</b>";
			      materia+="<br>Administraci�n Financiera ";
			      materia+="<br>Costos II ";
			      materia+="<br>Finanzas P�blicas ";
			      materia+="<br>Metodolog�a de Investigaci�n ";
			      materia+="<br>An�lisis e Interpretaci�n de Estados Contables ";
			      materia+="<br>Impuestos I ";
			      materia+="<br>Derecho Societario ";
			      materia+="<br>Contabilidad P�blica ";
			      materia+="<br><b>QUINTO A�O</b>";
			      materia+="<br>Auditor�a I ";
			      materia+="<br>Impuestos II ";
			      materia+="<br>Derecho Concursal ";
			      materia+="<br>Electiva I";
			      materia+="<br>Auditor�a II ";
			      materia+="<br>Electiva II";
			      materia+="<br>Pr�ctica Profesional ";
			      materia+="<br>Seminario Final ";
			      
		        };break; 
		case 2:{
	          //LICENCIATURA EN ADMINISTRACION
			 materia+="<br><b>LICENCIATURA EN ADMINISTRACION</b>";
		      materia+="<br>PRIMER A�O";
		      materia+="<br>Introducci�n a la Contabilidad ";
		      materia+="<br>Algebra y Geometr�a Anal�tica ";
		      materia+="<br>Teor�a General de la Administraci�n";
		      materia+="<br>Contabilidad B�sica ";
		      materia+="<br>Introducci�n a la Econom�a";
		      materia+="<br>An�lisis Matem�tico ";
		      materia+="<br>Introducci�n a las Ciencias Sociales ";
			  materia+="<br><b>SEGUNDO A�O</b>";
			  materia+="<br>An�lisis Sico Social de las Organizaciones";
			  materia+="<br>Estad�stica ";
			  materia+="<br>Estructuras y Procesos" ;
			  materia+="<br>Derecho Privado ";
			  materia+="<br>Elementos y Sistemas de Costos"; 
			  materia+="<br>Inform�tica"; 
			  materia+="<br>Microeconom�a ";
			  materia+="<br><b>TERCER A�O</b>";
			  materia+="<br>Derecho Constitucional y Administrativo ";
			  materia+="<br>An�lisis de Estados Contables ";
			  materia+="<br>Sistemas de Informaci�n ";
			  materia+="<br>Macroeconom�a";
			  materia+="<br>Administraci�n de Recursos Humanos"; 
			  materia+="<br>Derecho Laboral ";
			  materia+="<br>Historia Econ�mica y Social"; 
			  materia+="<br>C�lculo Financiero ";
			  materia+="<br><b>CUARTO A�O</b>";
			  materia+="<br>Administraci�n Financiera ";
			  materia+="<br>Sist. de Adm. Financ. y Control del Sector P�blico ";
			  materia+="<br>Marketing ";
			  materia+="<br>Metodolog�a de Investigaci�n ";
			  materia+="<br>R�gimen Tributario ";
			  materia+="<br>Derecho Societario ";
			  materia+="<br>Formulaci�n y Evaluaci�n de Proyectos";
			  materia+="<br><b>QUINTO A�O</b>";
			  materia+="<br>Electiva I";	
			  materia+="<br>Electiva II";	
			  materia+="<br>Pr�ctica Profesional"; 
			  materia+="Seminario Final";
			  
		};break;
		case 3:{
			
			//LICENCIADO EN ECONOMIA
			materia+="<br><b>PRIMERA A�O</b>";
			materia+="<br>Introducci�n a la Contabilidad ";
			materia+="<br>Algebra y Geometr�a Anal�tica ";
			materia+="<br>Teor�a General de la Administraci�n"; 
			materia+="<br>Contabilidad B�sica ";
			materia+="<br>An�lisis Matem�tico ";
			materia+="<br>Introducci�n a las Ciencias Sociales";
			materia+="<br>Microeconom�a ";
			materia+="<br><b>SEGUNDO A�O</b>";
			materia+="<br>Estad�stica ";
			materia+="<br>Derecho Privado"; 
			materia+="<br>Macroeconom�a ";
			materia+="<br>Historia Econ�mica y Social"; 
			materia+="<br>C�lculo Financiero ";
			
			
		};break;
		}
		return materia;
		
		}
	
	
	//Load Ingenieria
	public String loadMateriaIngenieria(int id_carrera)
	{ 
		logger.debug("loadMateriaIngenieria id_Carrera: "+id_carrera);
	
	
	String materia="";
	switch (id_carrera) {
	case 1 :{
		    //INGENIERO QUIMICO
		     materia+="INGENIERIA QUIMICA";
		     materia+="<br><b>PRIMERA A�O</b>";
		     materia+="<br>�lgebra y Geometr�a Anal�tica";
		     materia+="<br>An�lisis Matem�tico I ";
		     materia+="<br>F�sica I ";
		     materia+="<br>Introducci�n a la Inform�tica ";
		     materia+="<br>Qu�mica I  ";
		     materia+="<br>Sistemas de Representaci�n ";
		     materia+="<br><b>SEGUNDO A�O</b>";
		     materia+="<br>F�sica II ";
		     materia+="<br>Qu�mica Org�nica";  
		     materia+="<br>An�lisis Matem�tico II"; 
		     materia+="<br>Qu�mica II ";
		     materia+="<br>Matem�tica para Ingenieros";
		     materia+="<br>Termodin�mica ";
		     materia+="<br><b>TERCER A�O</b>";
		     materia+="<br>Qu�mica Anal�tica ";
		     materia+="<br>Electricidad y Electr�nica";
		     materia+="<br>Fen�menos de Transporte ";
		     materia+="<br>Fisicoqu�mica ";
		     materia+="<br>Econom�a, Organizaci�n y Direcci�n de Empresas"; 
		     materia+="<br>Est�tica y Resistencia de Materiales ";
		     materia+="<br>Operaciones Unitarias I ";
		     materia+="<br>Programaci�n Aplicada";
		     materia+="<br><b>CUARTO A�O</b>";
		     materia+="<br>Ingenier�a de las Reacciones Qu�micas";
		     materia+="<br>Instrumentaci�n y Control de Procesos ";
		     materia+="<br>Operaciones Unitarias II"; 
		     materia+="<br>Ingenier�a de los Servicios"; 
		     materia+="<br>Materiales para Ingenier�a";
		     materia+="<br>Tecnolog�a Mec�nica ";
		     materia+="<br>Bioingenier�a ";
		     materia+="<br>Procesos Electroqu�micos";
		     materia+="<br><b>QUINTO A�O</b>";
		     materia+="<br>Formulaci�n y Evaluaci�n de Proyectos";
		     materia+="<br>Ingenier�a de Procesos";
		     materia+="<br>Simulaci�n y Optimizaci�n";
		    		 
	        };break;	
	case 2:{
		     //INGENIERO EN MINAS
		      materia+="INGENIERO EN MINAS";
		      materia+="<br><b>PRIMER A�O</b>";
		      materia+="<br>�lgebra y Geometr�a Anal�tica";
		      materia+="<br>An�lisis Matem�tico I ";
		      materia+="<br>F�sica I ";
		      materia+="<br>Introducci�n a la Inform�tica"; 
		      materia+="<br>Qu�mica I ";
		      materia+="<br>Sistemas de Representaci�n";
		      materia+="<br>T1 Taller: Introducci�n a la Ingenier�a de Minas";
		      materia+="<br><b>SEGUNDO A�O</b>";
		      materia+="<br>F�sica II ";
		      materia+="<br>An�lisis Matem�tico II"; 
		      materia+="<br>Geolog�a ";
		      materia+="<br>Qu�mica II ";
		      materia+="<br>C�lculo Num�rico ";
		      materia+="<br>Matem�tica para Ingenieros "; 
		      materia+="<br>Mec�nica Aplicada a la Miner�a "; 
		      materia+="<br>Termodin�mica ";
		      materia+="<br><b>TERCER A�O</b>";
		      materia+="<br>Qu�mica Anal�tica y An�lisis de Menas";
		      materia+="<br>Topograf�a ";
		      materia+="<br>Electricidad y Electr�nica ";
		      materia+="<br>Fisicoqu�mica ";
		      materia+="<br>Seminario: Ingenier�a de la Calidad y del Medio Ambiente";
		      materia+="<br>Est�tica y Resistencia de Materiales ";
		      materia+="<br>Mec�nica de Rocas y Suelos ";
		      materia+="<br>Mineralog�a ";
		      materia+="<br>Seminario: Higiene y Seguridad Ambiental y del Trabajo";
		      materia+="<br><b>CUARTO A�O</b>";
		      materia+="<br>Econom�a Minera y Direcci�n y Organizaci�n de Empresas";
		      materia+="<br>M�quinas Mineras y Servicios ";
		      materia+="<br>Metalurgia Extractiva I ";
		      materia+="<br>Procesamiento de Minerales I"; 
		      materia+="<br>Yacimientos de Minerales ";
		      materia+="<br>Construcciones Mineras ";
		      materia+="<br>Explotaci�n de Minas I ";
		      materia+="<br>Metalurgia Extractiva II ";
		      materia+="<br>Petrograf�a y Petrolog�a ";
		      materia+="<br>Procesamiento de Minerales II"; 
		      materia+="<br>Prospecci�n y Exploraci�n";
		      materia+="<br><b> QUINTO A�O</b>";
		      materia+="<br>Explotaci�n de Minas II ";
		      materia+="<br>Formulaci�n y Evaluaci�n de Proyectos"; 
		      materia+="<br>Procesamiento de Minerales III ";
		      materia+="<br>Seminario: Ingenier�a de la Producci�n y de la Empresa";
		      materia+="<br>Seminario: Legislaci�n Minera y �tica Profesional";
		      materia+="<br>Proyecto Final";
	};break;
	case 3:{
		 //INGENIERO EN INDUSTRIAL
		materia+="<br><b>PRIMER A�O</b>";
		materia+="�lgebra y Geometr�a Anal�tica"; 
		materia+="<br>An�lisis Matem�tico I ";
		materia+="<br>F�sica I ";
		materia+="<br>Introducci�n a la Inform�tica"; 
		materia+="<br>Qu�mica I ";
		materia+="<br>Sistemas de Representaci�n";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>Est�tica y Resistencia de Materiales ";
		materia+="<br>F�sica II ";
		materia+="<br>Probabilidad y Estad�stica"; 
		materia+="<br>An�lisis Matem�tico II ";
		materia+="<br>Qu�mica II ";
		materia+="<br>Programaci�n Aplicada"; 
		materia+="<br>Termodin�mica y M�quinas T�rmicas";
		materia+="<br>TERCER A�O</b>";
		materia+="<br>Investigaci�n Operativa ";
		materia+="<br>Costos Industriales ";
		materia+="<br>Econom�a y Direcci�n de Empresas";
		materia+="<br>Electrotecnia";
		materia+="<br>Organizaci�n de la Producci�n";
		materia+="<br>Ingenier�a de Materiales ";
		materia+="<br>Organizaci�n de Empresas ";
		materia+="<br>Planeamiento y Control de la Producci�n";
		materia+="<br><b>CUARTO A�O</b>";
		materia+="<br>Sistemas de Informaci�n ";
		materia+="<br>Formulaci�n y Evaluaci�n de Proyectos";
		materia+="<br>Instalaciones y Control ";
		materia+="<br>Mec�nica de los Fluidos C";
		materia+="<br>Higiene y Seguridad Ambiental y del Trabajo";
		materia+="<br>Ingenier�a Legal ";
		materia+="<br>Mec�nica y Mecanismos";
		materia+="<br><b>QUINTO A�O</b>";
		materia+="<br>Edificios Industriales"; 
		materia+="<br>Optativa I ";
		materia+="<br>Optativa II ";
		materia+="<br>Gesti�n Empresaria de la Calidad"; 
		materia+="<br>Operaciones Industriales ";
		materia+="<br>Optativa III ";
				
		
	};break;
	 
	case 4:{
		//INGENIERIA EN INFORMATICA.
		materia+="<br><b>PRIMER A�O</b>";
		materia+="<br>�lgebra y Geometr�a Anal�tica"; 
		materia+="<br>An�lisis Matem�tico I ";
		materia+="<br>F�sica I ";
		materia+="<br>Introducci�n a la Inform�tica"; 
		materia+="<br>Qu�mica I ";
		materia+="<br>Sistemas de Representaci�n";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>F�sica II ";
		materia+="<br>Probabilidades y Estad�stica"; 
		materia+="<br>An�lisis Matem�tico II ";
		materia+="<br>Matem�tica Discreta ";
		materia+="<br>T�cnicas Digitales ";
		materia+="<br>Estructura de Datos ";
		materia+="<br>Estructura y Tecnolog�a de Computadoras"; 
		materia+="<br>Metodolog�a de la Programaci�n";
		materia+="<br><b>TERCER A�O</b>";
		materia+="<br>Investigaci�n Operativa"; 
		materia+="<br>Modelos de Desarrollo de Programas y  Programaci�n Concurrente";
		materia+="<br>Desarrollo Sistem�tico de Programas ";
		materia+="<br>L�gica Computacional ";
		materia+="<br>Sistemas Operativos";
		materia+="<br>Bases de Datos";
		materia+="<br>C�lculo Num�rico"; 
		materia+="<br>Lenguajes Formales"; 
		materia+="<br>Redes de Computadoras";
		materia+="<br><b>CUARTO A�O</b>";
		materia+="<br>Econom�a, Organizaci�n y Administraci�n de Empresas";
		materia+="<br>Arquitectura de Redes ";
		materia+="<br>Compiladores";
		materia+="<br>Inteligencia Artificial"; 
		materia+="<br>Laboratorio de Computadoras";
		materia+="<br>Arquitectura de Computadoras ";
		materia+="<br>Ingenier�a de Software I";
		materia+="<br><b>QUINTO A�O</b>";
		materia+="<br>Dise�o de Sistemas Operativos";
		materia+="<br>Ingenier�a de Software II ";
		materia+="<br>Gesti�n Ambiental ";
		materia+="<br>Ingenier�a del Conocimiento"; 
		materia+="<br>Legislaci�n";
		materia+="<br>Pr�ctica Profesional Supervisada";
		materia+="<br>Proyecto Final";
	};break;
	case 5:{
		
		//LICENCIATURA EN SISTEMAS 
		materia+="<br><b>PRIMER A�O</b>";
		materia+="<br>�lgebra y Geometr�a Anal�tica"; 
		materia+="<br>An�lisis Matem�tico ";
		materia+="<br>Introducci�n a la Inform�tica"; 
		materia+="<br>T�cnicas Digitales";
		materia+="<br>Estructura de Datos ";
		materia+="<br>Estructura y Tecnolog�a de Computadoras"; 
		materia+="<br>Metodolog�a de la Programaci�n ";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>Probabilidades y Estad�stica ";
		materia+="<br>An�lisis Matem�tico II ";
		materia+="<br>L�gica Computacional ";
		materia+="<br>Matem�tica Discreta"; 
		materia+="<br>Sistemas Operativos";
		materia+="<br>Bases de Datos";
		materia+="<br>Lenguajes Formales";
		materia+="<br>Redes de Computadoras";
		materia+="<br><b>TERCER A�O</b>";
		materia+="<br>Econom�a, Organizaci�n y Administraci�n de Empresas";
		materia+="<br>Investigaci�n Operativa";
		materia+="<br>Modelos de Desarrollo de Programas y Programaci�n Concurrente";
		materia+="<br>Sistemas de Informaci�n I";
		materia+="<br>Desarrollo Sistem�tico de Programas"; 
		materia+="<br>Taller de Epistemolog�a de las Ciencias";
		materia+="<br>Taller de Formaci�n Profesional ";
		materia+="<br>C�lculo Num�rico ";
		materia+="<br>Seguridad en Sistemas"; 
		materia+="<br>Taller de Metodolog�a de la Investigaci�n Cient�fica";
		materia+="<br><b>CUARTO A�O</b>";
		materia+="<br>Sistemas de Informaci�n II ";
		materia+="<br>Compiladores ";
		materia+="<br>Dise�o de Sistemas Operativos"; 
		materia+="<br>Inteligencia Artificial ";
		materia+="<br>Laboratorio de Computadoras"; 
		materia+="<br>Arquitectura de Computadoras";
		materia+="<br>Gesti�n Ambiental ";
		materia+="<br>Ingenier�a del Conocimiento";
		materia+="<br>Legislaci�n ";
		materia+="<br>Trabajo Final de Sistemas"; 
	};break;
	case 6:{
		///LICENCIATURA EN TECNLOOGIA DE LOS ALIMENTOS
		materia+="<br><b>PRIMER A�O</b>";
		materia+="<br>�lgebra y Geometr�a Anal�tica";
		materia+="<br>An�lisis Matem�tico ";
		materia+="<br>F�sica I ";
		materia+="<br>Qu�mica I";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>Estad�stica ";
		materia+="<br>Qu�mica Org�nica"; 
		materia+="<br>Biolog�a General y Celular"; 
		materia+="<br>Qu�mica II ";
		materia+="<br>F�sica II ";
		materia+="<br>Matem�tica y Computaci�n";
		materia+="<br><b>TERCER A�O</b>";
		materia+="<br>Bioqu�mica de los Alimentos ";
		materia+="<br>Fisicoqu�mica ";
		materia+="<br>Microbiolog�a General y de los Alimentos";
		materia+="<br>Qu�mica Anal�tica y An�lisis de los Alimentos";
		materia+="<br>Fen�menos de Transporte";
		materia+="<br><b>CUARTO A�O</b>";
		materia+="<br>Operaciones B�sicas de los Alimentos";
		materia+="<br>Materiales y Equipos ";
		materia+="<br>Tecnolog�a de los Alimentos I"; 
		materia+="<br>Calidad de los Alimentos ";
		materia+="<br>Higiene y Seguridad Ambiental";
		materia+="<br>Tecnolog�a de los Alimentos II";
		
		
	};break;
	case 7:{
		//LICENCIADO EN CIENCIAS GEOLOGICAS
		materia+="<br><b>PRIMER A�O</b>";
        materia+="<br>�lgebra y Geometr�a Anal�tica";
        materia+="<br>An�lisis Matem�tico I";
        materia+="<br>F�sica I";
        materia+="<br>Introducci�n a la Inform�tica";
        materia+="<br>Qu�mica I";
        materia+="<br>Sistemas de Representaci�n";
        materia+="<br>Taller: Introducci�n a la Ingenier�a de Minas";
        materia+="<br><b>SEGUNDO A�O</b>";
        materia+="<br>F�sica II";
        materia+="<br>An�lisis Matem�tico II";
        materia+="<br>Geolog�a";
        materia+="<br>Qu�mica II";
        materia+="<br>C�lculo Num�rico";
        materia+="<br>Matem�tica para Ingenieros";
        materia+="<br>Mec�nica Aplicada a la Miner�a";
        materia+="<br>Termodin�mica";
        materia+="<br><b>TERCER A�O</b>";
        materia+="<br>Qu�mica Anal�tica y An�lisis de Menas";
        materia+="<br>Topograf�a";
        materia+="<br>Electricidad y Electr�nica";
        materia+="<br>Fisicoqu�mica";
        materia+="<br>Seminario: Ingenier�a de la Calidad y del Medio Ambiente";
        materia+="<br>Est�tica y Resistencia de Materiales";
        materia+="<br>Mec�nica de Rocas y Suelos";
        materia+="<br>Mineralog�a";
        materia+="<br>Seminario: Higiene y Seguridad Ambiental y del Trabajo";
        materia+="<br><b>CUARTO A�O</b>";
        materia+="<br>Econom�a Minera y Direcci�n y Organizaci�n de Empresas";
        materia+="<br>M�quinas Mineras y Servicios";
        materia+="<br>Metalurgia Extractiva I";
        materia+="<br>Procesamiento de Minerales I";
        materia+="<br>Yacimientos de Minerales";
        materia+="<br>Construcciones Mineras";
        materia+="<br>Explotaci�n de Minas I";
        materia+="<br>Metalurgia Extractiva II";
        materia+="<br>Petrograf�a y Petrolog�a";
        materia+="<br>Procesamiento de Minerales II";
        materia+="<br>Prospecci�n y Exploraci�n";
        materia+="<br><b>QUINTO A�O</b>";
         materia+="<br>Explotaci�n de Minas II";
         materia+="<br>Formulaci�n y Evaluaci�n de Proyectos";
         materia+="<br>Procesamiento de Minerales III";
         materia+="<br>Seminario: Ingenier�a de la Producci�n y de la Empresa";
         materia+="<br>Seminario: Legislaci�n Minera y �tica Profesional";
         materia+="<br>Proyecto Final";
		
	};break;
	case 8:{
		//TECNICO UNIVERSITARIO EN EXPLOTACION DE MINAS 2007 PERFIL Y ALCANCES
		materia+="";
	};break;
	case 9:{
		// T�CNICO UNIVERSITARIO EN PROCESAMIENTO DE MINERALES
	    materia+="<br><b>PRIMER A�O</b>";
	    materia+="<br>�lgebra y Geometr�a Anal�tica ";
	    materia+="<br>An�lisis Matem�tico I";
	    materia+="<br>F�sica I ";
	    materia+="<br>Introducci�n a la Inform�tica"; 
	    materia+="<br>Qu�mica I ";
	    materia+="<br>Sistemas de Representaci�n"; 
	    materia+="<br>Taller: Introducci�n a la Miner�a";
	    materia+="<br><b>SEGUNDO A�O</b>";
	    materia+="<br>F�sica II ";
	    materia+="<br>Qu�mica Anal�tica y An�lisis de Menas";
	    materia+="<br>Seminario: Ingenier�a de la Calidad y del Medio Ambiente";
	    materia+="<br>Procesamiento de Minerales I ";
	    materia+="<br>Qu�mica II ";
	    materia+="<br>Mineralog�a ";
	    materia+="<br>Procesamiento de Minerales II"; 
	    materia+="<br>Termodin�mica";
	    materia+="<br><b>TERCER A�O</b>";
	    materia+="<br>Electricidad y Electr�nica ";
	    materia+="<br>Fisicoqu�mica ";
	    materia+="<br>Metalurgia Extractiva I"; 
	    materia+="<br>Procesamiento de Minerales III";
	    materia+="<br>Seminario: Higiene y Seguridad Ambiental y del Trabajo";
	    materia+="<br>Metalurgia Extractiva II ";
	    materia+="<br>Taller: Beneficio de los Minerales"; 
	    materia+="<br>Taller: Procesos de Metalurgia Extractiva";
	};break;
	case 10:{
		//ANALISTA PROGRAMADDOR UNIVERSITARIO
		materia+="<br><b>PRIMIER A�O</b>";
		materia+="<br>Ingl�s I ";
		materia+="<br>Herramientas Inform�ticas I"; 
		materia+="<br>Programaci�n Estructurada ";
		materia+="<br>Ingl�s II ";
		materia+="<br>Herramientas Inform�ticas II";
		materia+="<br>Estructura de Datos ";
		materia+="<br>Laboratorio de Sistemas Operativos I"; 
		materia+="<br>Base de Datos I";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>Ingl�s III ";
		materia+="<br>�lgebra I ";
		materia+="<br>Programaci�n Visual"; 
		materia+="<br>Laboratorio de Sistemas Operativos II"; 
		materia+="<br>Base de Datos II";
		materia+="<br>Ingl�s IV ";
		materia+="<br>�lgebra II ";
		materia+="<br>Programaci�n Concurrente y Paralela"; 
		materia+="<br>Programaci�n Orientada a Objetos ";
		materia+="<br>An�lisis y Dise�o de Sistemas I ";
		materia+="<br><b>TERCER A�O</b>";
		materia+="<br>Ingl�s V";
		materia+="<br>Redes I ";
		materia+="<br>Programaci�n y Servicios Web"; 
		materia+="<br>Laboratorio de Programaci�n Orientado a Objetos I"; 
		materia+="<br>An�lisis y Dise�o de Sistemas II";
		materia+="<br>Ingl�s VI ";
		materia+="<br>Redes II ";
		materia+="<br>Laboratorio de Programaci�n Orientado a Objetos II"; 
		materia+="<br>Herramientas inform�ticas avanzadas";
		materia+="<br>Legislaci�n y Ejercicio Profesional ";
		
	};break;
	case 11:{
		materia+="<br><b>PRIMER A�O</b>";
		materia+="<br>�lgebra y Geometr�a Anal�tica ";
		materia+="<br>An�lisis Matem�tico ";
		materia+="<br>F�sica I ";
		materia+="<br>Introducci�n a la Geolog�a"; 
		materia+="<br>Qu�mica I ";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>Qu�mica Anal�tica ";
		materia+="<br>Geolog�a Estructural"; 
		materia+="<br>Paleontolog�a ";
		materia+="<br>Qu�mica II ";
		materia+="<br>F�sica II ";
		materia+="<br>Levantamiento Geol�gico"; 
		materia+="<br>Mineralog�a";
		materia+="<br><b>TERCER A�O</b>";
		materia+="<br>Estad�stica Descriptiva y Probabilidades ";
		materia+="<br>Geof�sica General y Aplicada ";
		materia+="<br>Geomorfolog�a ";
		materia+="<br>Sedimentolog�a";
		materia+="<br>Estratigraf�a ";
		materia+="<br>Fotogeolog�a e Im�genes Satelitales"; 
		materia+="<br>Hidrogeolog�a";
		materia+="<br>Petrograf�a y Petrolog�a"; 
		materia+="<br>Pr�ctica Profesional Asistida";
		
	};break;
	case 12:{
		//TECNICATURA UNIVERSITARIA EN PERFORACIONES
		materia="<br><b>PRIMER A�O</b>";
		materia+="<br>�lgebra y Geometr�a Anal�tica";
		materia+="<br>F�sica General";
		materia+="<br>An�lisis Matem�tico";
		materia+="<br>Introducci�n a la Geolog�a";
		materia+="<br>Qu�mica I";
		materia+="<br>Pr�ctica Geol�gica I";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>Mineralog�a";
		materia+="<br>Geolog�a Estructural";
		materia+="<br>Qu�mica II";
		materia+="<br>Perforaciones I";
		materia+="<br>Carteo Geol�gico";
		materia+="<br>Petrograf�a Sedimentaria";
		materia+="<br><b>TERCER A�O</b>";
		materia+="<br>Recursos Energ�ticos";
		materia+="<br>Yacimientos Minerales";
		materia+="<br>Perforaciones II";
		materia+="<br>M�quinas de Exploraci�n";
		materia+="<br>Geof�sica";
		materia+="<br>Legislaci�n Minera y Laboral";
		materia+="<br>Recursos H�dricos";
		materia+="<br>Pr�ctica Profesional Asistida";
		
	};break;
	case 13:
	{ 
		//TECNICATURA UNIVERSITARIA EN CIENCIAS 
		//DE LA TIERRA ORIENTADA A PETROLEO
		materia="<br><b>PRIMER A�O</b>";
		materia+="<br>�lgebra y Geometr�a Anal�tica";
		materia+="<br>F�sica General";
		materia+="<br>An�lisis Matem�tico";
		materia+="<br>Introducci�n a la Geolog�a";
		materia+="<br>Qu�mica I";
		materia+="<br>Pr�ctica Geol�gica I";
		materia+="<br><b>SEGUNDO A�O</b>";
		materia+="<br>Geolog�a Estructural";
		materia+="<br>Qu�mica II";
		materia+="<br>Pr�ctica Geol�gica II";
		materia+="<br>Mineralog�a";
		materia+="<br>Carteo Geol�gico";
		materia+="<br>Sedimentolog�a";
		materia+="<br>Estratigraf�a y Geolog�a Hist�rica";
		materia+="<br>Geof�sica";
		materia+="<br><b>TERCER A�O</b>";
		materia+="<br>Reservorios";
		materia+="<br>Geolog�a del Petr�leo";
		materia+="<br>Prospecci�n y Perforaci�n Petrolera";
		materia+="<br>Teledetecci�n y Sensores Remotos";
		materia+="<br>Geomorfolog�a";
		materia+="<br>Petrograf�a �gnea y Metam�rfica";
		materia+="<br>Pr�ctica Profesional Asistida";
		
		
	
	};break;
}
  	   return materia;
	}
}
