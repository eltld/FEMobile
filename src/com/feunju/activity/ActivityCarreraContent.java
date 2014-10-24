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
		
		  materia+="<br><b>PRIMER AÑO</b>";
		  materia+="<br>Álgebra y Geometría Analítica";
	      materia+=" <br>Análisis Matemático";
          materia+=" <br>Botánica General"; 		
		  materia+=" <br>Botánica Sistemática";
		  materia+=" <br>Química General e Inorgánica";
		  materia+=" <br>Química Orgánica";
		  materia+=" <br>Física";
		  materia+=" <br>Módulo I";
		//2 año
		  materia+="<br><b>SEGUNDO AÑO</b>";
		  materia+="<br>Bioestadística y Diseño Experimental";
		  materia+="<br>Química Biológica";	
        materia+=" <br>Química Agrícola";	
        materia+=" <br>Economía General";	
        materia+=" <br>Microbiología Agrícola";	
        materia+=" <br>Topografía";	
        materia+=" <br>Agroclimatología";
        //3 año
        materia+="<br><b>TERCER AÑO</b>";
        materia+=" <br>Fisiología Vegetal";	
        materia+=" <br>Zoología Agrícola";	
        materia+=" <br>Fitopatología";	
        materia+=" <br>Edafología";	
        materia+=" <br>Genética";	
        materia+=" <br>Mecanización Agrícola";	
        materia+=" <br>Ecología Agrícola";	
        materia+=" <br>Economía Agraria";	
        materia+=" <br>Módulo II";	
        //4 año
        materia+="<br><b>CUARTO AÑO</b>";
        materia+="<br>25 Manejo del Suelo y Riego";	
        materia+="<br>26 Protección Vegetal";	
        materia+="<br>27 Granos y Forrajes";	
        materia+="<br>28 Producción Animal I";	
        materia+="<br>29 Dasonomía";	
        materia+="<br>30 Mejoramiento Genético";
        
        //5to año
        materia+="<br><b>QUINTO AÑO</b>";
        materia+="<br>31 Administración Agraria";	
        materia+="<br>32 Horticultura y Floricultura";	
        materia+="<br>33 Cultivos Industriales";	
        materia+="<br>34 Fruticultura";	
        materia+="<br>35 Producción Animal II";	
        materia+="<br>36 Legislación Agraria";	
        materia+="<br>37 Extensión Rural";	
        materia+="<br>38 Módulo III";	
        materia+="<br>39 Pasantía con Trabajo Final";
        
		};break;
		case 2 :// LIC. EN CIENCIAS BIOLOGICAS
		   {
			   materia+="<br><b>PRIMER AÑO</b>";
			   materia+="<br>Biología Celular</b>";	
			   materia+="<br>Matemática</b>";	
			   materia+="<br>Qca General e Inorgánica</b>";	
			   materia+="<br>Bioestadística</b>";	
			   materia+="<br>Física de los Proc. Biológicos</b>";	
			   materia+="<br>Química Orgánica</b>";
			   
			   materia+="<br><b>SEGUNDO AÑO</b>";
			   materia+="<br>Química Biológica</b>";	
			   materia+="<br>Botánica General</b>";	
			   materia+="<br>Ecología General</b>";	
			   materia+="<br>Genética</b>";	
			   materia+="<br>Zoología General</b>";	
			   materia+="<br>Evolución</br>";
			   
			   materia+="<br><b>TERCERA AÑO </b>";
			   materia+="<br>Comportamiento Animal";	
			   materia+="<br>Taxonomía Animal";	
			   materia+="<br>Bioética";	
			   materia+="<br>Fisiología Vegetal";	
			   materia+="<br>Taxonomía Fanerógamas";
			   
			   materia+="<br><b>TALLERES</b>";
			   materia+="<br>Inglés I</br>";	
			   materia+="<br>Metod. de la Invest. Cientifica</br>";	
			   materia+="<br>Informática";	
			   materia+="<br>Epistemología de la Ciencia";	
			   materia+="<br>Política Regional y Gobierno Universitario";	
			   materia+="<br>Curr. Y evaluación de la Educación Superior";	
			   materia+="<br>Practicas de Campo y/o Laboratorio";
			   
			   materia+="<br><b>CICLO SUPERIOR</b>";
               materia+="<br><b>OBLIGATORIAS</b>";
               materia+="<br>Diseño Experimental";	
               materia+="<br>Análisis Instrumental";
               
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
			materia+="<br><b>PRIMER AÑO</b>";
			materia+="<br>Matemática I";	
			materia+="<br>Química General";	
			materia+="<br>Botánica Alimentaria";	
			materia+="<br>Matemática II";	
			materia+="<br>Química Inorgánica";	
			materia+="<br>Física";
			
			materia+="<br><b>SEGUNDO AÑO</b>";
			materia+="<br>Química Orgánica";	
			materia+="<br>Química Analítica General";	
			materia+="<br>Estadística";	
			materia+="<br>Zoología Alimentaria";	
			materia+="<br>Química Biológica	";
			materia+="<br>Bromatología I";
			
			materia+="<br><b>TERCER AÑO</b>";
			materia+="<br>Química Analítica Instrumental";
			materia+="<br>Microbiología General";
			materia+="<br>Bromatología II";
			materia+="<br>Microbiología de Alimentos";
			materia+="<br>Bromatología III";
			materia+="<br>Higiene y Saneamiento";
			materia+="<br>Toxicología de Alimentos";
			
			materia+="<br><b>CUARTO AÑO</b>";
			materia+="<br>Fisiología de la Nutrición";
			materia+="<br>Tecnología de los Alimentos";
			materia+="<br>Organización y Gestión de Calidad";
			materia+="<br>Optativa *";
			materia+="<br>Legislación y Educación Alimentaria";
			materia+="<br>Taller de Calidad y Seguridad";
			materia+="<br>Diseño Expermiental";
			materia+="<br>Optativa**";
			
			materia+="<br><br><b>MATERIAS OPTATIVAS</b>";
			materia+="<br>Epistemología";
            materia+="<br>Economía de la Producción Alimentaria";
            materia+="<br>Tratamiento de Residuos y Efluentes";
            materia+="<br>Productos Agrícolas Alimentarios";
            materia+="<br>Biotecnología Alimentaria";
            materia+="<br>Micrografía de los Alimentos de Origen vegetal";
            materia+="<br>Calidad de productos Fruti-Hortícola";
			
			materia+="<br><b>LICENCIADO EN BROMATOLOGIA</b>";
			
		};break;
		case 4:{
			
			//BROMATOLOGO
			materia+="<br><b>BROMATOLOGO</b>";
			materia+="<br><b>PRIMER AÑO</b>";
			materia+="<br>Matemática I";	
			materia+="<br>Química General";	
			materia+="<br>Botánica Alimentaria";	
			materia+="<br>Matemática II";	
			materia+="<br>Química Inorgánica";	
			materia+="<br>Física";
			
			materia+="<br><b>SEGUNDO AÑO</b>";
			materia+="<br>Química Orgánica";	
			materia+="<br>Química Analítica General";	
			materia+="<br>Estadística";	
			materia+="<br>Zoología Alimentaria";	
			materia+="<br>Química Biológica	";
			materia+="<br>Bromatología I";
			
			materia+="<br><b>TERCER AÑO</b>";
			materia+="<br>Química Analítica Instrumental";
			materia+="<br>Microbiología General";
			materia+="<br>Bromatología II";
			materia+="<br>Microbiología de Alimentos";
			materia+="<br>Bromatología III";
			materia+="<br>Higiene y Saneamiento";
			materia+="<br>Toxicología de Alimentos";
			
			
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
			materia+=" <b>PRIMER AÑO</b>";
			materia+="<br>1. Teoría y Problemática de la Comunicación Social";
			materia+="<br>2. Historia Social de la Cultura";
			materia+="<br>3. Filosofía y su problemática";
			materia+="<br>4. Taller de Comprensión y Producción del Texto Periodístico";
			materia+="<br>5. Psicología Social";
			materia+="<br>6. Fuentes de Información y Documentación (seminario)";
			materia+="<br>7. Introducción a la Problemática Periodística";
			materia+=" <br>8. Taller de Producción Gráfica";

			materia+=" <br><b>SEGUNDO AÑO</b>";
			materia+="<br>9. Tecnología de la Comunicación Social (seminario)";
			materia+="<br>10. Lingüística y principios de Semiología";
			materia+="<br>11. Taller de Redacción Periodística";
			materia+="<br>12. Taller optativo: Producción Televisiva 1, Tecnología y Producción Radiofónica 1, Taller de Fotografía 1.";
			materia+="<br>13. Sociología de la Comunicación Social";
			materia+="<br>14. Geografía Económica y Política Americana y Argentina";
			materia+="<br>15. Taller de Publicidad y Propaganda";
			materia+="<br>16. Taller optativo: Producción Televisiva 2, Tecnología y Producción Radiofónica 2, Taller de Fotografía 2";

			materia+="<br><b>TERCER AÑO</b>";
			materia+="<br>17. Economía Política y Problemática Económica Argentina";
			materia+="<br>18. Antropología Social y Cultural";
			materia+="<br>19. Taller de Semiótica";
			materia+="<br>20. Historia Política, Económica y Social de América y Argentina";
			materia+=" <br>21. Estadística";
			materia+=" <br>22. Análisis del Discurso";
			materia+=" <br>23. Epistemología";
			materia+=" <br>Ingles 1";
			materia+=" <br>Ingles 2";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 1";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 2";
			materia+="<br>TITULO INTERMEDIO: TÉCNICO EN COMUNICACIÓN SOCIAL";
			materia+="<br><b>CUARTO AÑO</b>";
			materia+="<br>24. Teoría y Problemática de la Comunicación Social II";
			materia+="<br>25. Planificación en Comunicación Social ";
			materia+="<br>26. Metodología de la Investigación ";
			materia+="<br>27. Análisis de la Realidad Contemporánea Comunicacional (Seminario)";
			materia+="<br>28. Comunicación y Educación (Seminario) ";
			materia+="<br>29. Comunicación Alternativa (Seminario) ";
			materia+="<br>30. Ética y Legislación de la Información ";
			materia+="<br>31. Seminarios de Formación Específica ";
			materia+="<br>32. RESIDENCIA PROFESIONAL";
			materia+="<br>El licenciado deberá elaborar un Trabajo de Tesis Final con el fin de acreditar la eficiencia de su formación para el desempeño profesional.";
			materia+="<br><b>TITULO DE GRADO: LICENCIADO EN COMUNICACIÓN SOCIAL</b>";

		}
			;
			break;

		case 2: { // TECNICO EN COMUNICACION SOCIAL
			// licenciado en comunicacion social
			materia+="<br><b>PRIMER AÑO</b>";
			materia+="<br>1. Teoría y Problemática de la Comunicación Social";
			materia+="<br>2. Historia Social de la Cultura";
			materia+="<br>3. Filosofía y su problemática";
			materia+="<br>4. Taller de Comprensión y Producción del Texto Periodístico";
			materia+="<br>5. Psicología Social";
			materia+="<br>6. Fuentes de Información y Documentación (seminario)";
			materia+="<br>7. Introducción a la Problemática Periodística";
			materia+="<br>8. Taller de Producción Gráfica";

			materia+="<br><b>SEGUNDO AÑO</b>";
			materia+="<br>9. Tecnología de la Comunicación Social (seminario)";
			materia+="<br>10. Lingüística y principios de Semiología";
			materia+="<br>11. Taller de Redacción Periodística";
			materia+="<br>12. Taller optativo: Producción Televisiva 1, Tecnología y Producción Radiofónica 1, Taller de Fotografía 1.";
			materia+="<br>13. Sociología de la Comunicación Social";
			materia+="<br>14. Geografía Económica y Política Americana y Argentina";
			materia+="<br>15. Taller de Publicidad y Propaganda";
			materia+="<br>16. Taller optativo: Producción Televisiva 2, Tecnología y Producción Radiofónica 2, Taller de Fotografía 2";
			materia+="<br><b>TERCER AÑO</b>";
			materia+="<br>17. Economía Política y Problemática Económica Argentina";
			materia+="<br>18. Antropología Social y Cultural";
			materia+="<br>19. Taller de Semiótica";
			materia+="<br>20. Historia Política, Económica y Social de América y Argentina";
			materia+="<br>21. Estadística";
			materia+="<br>22. Análisis del Discurso";
			materia+="<br>23. Epistemología";
			materia+="<br>Ingles 1";
			materia+="<br>Ingles 2";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 1";
			materia+="<br>Otro Idioma extranjero moderno. Nivel 2";
			materia+="<br><b>TITULO INTERMEDIO: TÉCNICO EN COMUNICACIÓN SOCIAL</b>";
		}
			;
			break;

		case 3: {
			// Prof. y Lic. en Ciencias de la Educación

			materia+="<br><b>PRIMER AÑO</b>";
			materia+="<br>1. Pensamiento Científico";
			materia+="<br>2. Problemática Educativa";
			materia+="<br>3. Problemática Filosófica";
			materia+="<br>4. Sociología General";
			materia+="<br>5. Módulo Optativo del Área Socio Cultural ";
			materia+=" <br>6. Psicología General";
			materia+=" <br><b>SEGUNDO AÑO</b>";
			materia+=" <br>7. Economía";
			materia+=" <br>8. Biología del Aprendizaje";
			materia+=" <br>9. Historia Social de la Educación";
			materia+=" <br>10. Epistemología";
			materia+=" <br>11. Sociología de la Educación";
			materia+=" <br>12. Psicología Evolutiva l";
			materia+=" <br><b>TERCER AÑO</b>";
			materia+=" <br>13. Psicología Evolutiva II";
			materia+=" <br>14. Psicología Educacional";
			materia+=" <br>15. Historia de la Educación Argentina y Latinoamericana";
			materia+="<br>16. Política Educacional y Legislación";
			materia+="<br>17. Filosofía de la Educación";
			materia+="<br>18. Didáctica General";
			materia+="<br>19. Psicología Social";
			materia+="<br><b>CUARTO AÑO</b>";
			materia+="<br>20. Teoría y Metodología de la Investigación Educativa";
			materia+="<br>21. Planeamiento de la Educación";
			materia+="<br>22. Didáctica de las Áreas Disciplinares";
			materia+="<br>23. Teorías y Desarrollo del Curriculum";
			materia+="<br>24. Organización y Administración Educacional";
			materia+="<br>25. Módulo Optativo del Área Comunicacional ";
			materia+="<br>26. Análisis Institucional";
			materia+="<br><b>QUINTO AÑO</b>";
			materia+="<br>27. Dificultades del Aprendizaje";
			materia+="<br>28. Educación Especial";
			materia+="<br>29. Orientación e Intervención pedagógica Institucional";
			materia+="<br>30. Educación No Formal";
			materia+="<br>31. Universidad y Formación Docente";
			materia+="<br>32. PRÁCTICA Y RESIDENCIA (PARA EL TÍTULO DE PROFESOR)";
			materia+="<br>TRABAJO DE CAMPO E INVESTIGACIÓN (TRABAJO FINAL) (PARA EL TÍTULO DE LICENCIADO)";

		}
			;
			break;

		case 4: {
			// Licenciatura en Antropología

			materia+="<br>01. Introducción a las Ciencias Antropológicas.";
			materia+="<br>02. Antropología Biológica I";
			materia+="<br>03. Geología del Cuaternario.";
			materia+="<br>04. Antropología Social y Cultural.";
			materia+="<br>05. Prehistoria General.";
			materia+="<br>06. Etnografía Americana.";
			materia+="<br>07. Teoría e Historia de la Antropología";
			materia+="<br>08. Arqueología Americana.";
			materia+="<br>09. Sociedades Campesinas";
			materia+="<br>10. Organización Social y Parentesco";
			materia+="<br>11. Antropología Biológica II";
			materia+="<br>12. Metodología y Técnicas de la Investigación Arqueológica";
			materia+="<br>13. Arqueología Argentina";
			materia+="<br>14. Fundamentos de Análisis Matemático";
			materia+="<br>15. Teoría e Investigación en Antropología Social.";
			materia+="<br>16. Etnohistoria.";
			materia+="<br>17. Lingüística General.";
			materia+="<br>18. Antropología de las Sociedades Complejas.";
			materia+="<br>19. Estadística.";
			materia+="<br>20. Optativa";
			materia+="<br>21. Optativa";
			materia+="<br>22. Optativa";
			materia+="<br>Filosofía y su problemática";
			materia+="<br>Sociología General";
			materia+="<br>Psicología Social";
			materia+="<br>Fundamentos de Matemática";
			materia+="<br>Biología del Aprendizaje";
			materia+="<br>Sociología de la educación";
			materia+="<br>Psicología General";
			materia+="<br>Historia Social";
			materia+="<br>Antropología Filosófica";
			materia+="<br>Epistemología";
			materia+="<br>Economía";
			materia+="<br>Primer Nivel de Inglés Técnico";
			materia+="<br>Segundo Nivel de Inglés Técnico";
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
			// Auxiliar técnico en antropologí

			materia+="<br>01. Introducción a las Ciencias Antropológicas.";
			materia+=" <br>02. Antropología Biológica I";
			materia+=" <br>03. Geología del Cuaternario.";
			materia+=" <br>04. Antropología Social y Cultural.";
			materia+=" <br>05. Prehistoria General.";
			materia+=" <br>06. Etnografía Americana.";
			materia+="<br>07. Teoría e Historia de la Antropología";
			materia+=" <br>08. Arqueología Americana.";
			materia+="<br>09. Sociedades Campesinas";
			materia+="<br>10. Organización Social y Parentesco";
			materia+="<br>11. Antropología Biológica II";
			materia+="<br>12. Metodología y Técnicas de la Investigación Arqueológica";
			materia+="<br>13. Arqueología Argentina";
			materia+="<br>14. Fundamentos de Análisis Matemático";
			materia+="<br>15. Teoría e Investigación en Antropología Social.";
			materia+="<br>16. Etnohistoria.";
			materia+="<br>17. Lingüística General.";
			materia+="<br>18. Antropología de las Sociedades Complejas.";
			materia+="<br>19. Estadística.";
			materia+="<br>20. Optativa";
			materia+="<br>21. Optativa";
			materia+="<br>22. Optativa";
			materia+="<br>Filosofía y su problemática";
			materia+="<br>Sociología General";
			materia+="<br>Psicología Social";
			materia+="<br>Fundamentos de Matemática";
			materia+="<br>Biología del Aprendizaje";
			materia+="<br>Sociología de la educación";
			materia+="<br>Psicología General";
			materia+="<br>Historia Social";
			materia+="<br>Antropología Filosófica";
			materia+="<br>Epistemología";
			materia+="<br>Economía";
			materia+="<br>Primer Nivel de Inglés Técnico";
			materia+=" <br>Segundo Nivel de Inglés Técnico";
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
			materia+="<br><b>PRIMER AÑO</b>";
			materia+="<br>B01. Introducción a la Literatura.";
			materia+="<br>B02. Introducción a la Historia: Historia Social y del Arte.";
			materia+="<br>B03. Filosofía.";
			materia+="<br>B04. Gramática I.";
			materia+="<br>B05. Latín I.";
			materia+="<br>B06. Gramática II.";
			materia+="<br>B07. Latín II.";
			materia+="<br>B08. Literaturas Clásicas.";
			materia+="<br><b>SEGUNDO AÑO</b>";
			materia+="<br>B09. Lingüística.";
			materia+="<br>B10. Literatura Española I.";
			materia+="<br>B11. Teoría y Crítica Literaria.";
			materia+="<br>P02. Psicología.";
			materia+="<br>P01. Pedagogía, Organización y Administración Escolar.";
			materia+="<br>B12. Literatura Española II.";
			materia+="<br>B13. Literatura Europea I.";
			materia+="<br>B14. Literatura Latinoamericana I.";
			materia+="<br>P04. Psicología Evolutiva.";
			materia+="<br><b>TERCER AÑO</b>";
			materia+="<br>B15. Literatura Latinoamericana II.";
			materia+="<br>B16. Literatura Argentina I.";
			materia+="<br>B17. Historia de la Lengua.";
			materia+="<br>B18. Griego I.";
			materia+="<br>P03. Didáctica.";
			materia+="<br>B19. Literatura Argentina II.";
			materia+="<br>B20. Literatura Europea II.";
			materia+="<br>B21. Griego II.";
			materia+="<br><b>CUARTO AÑO</b>";
			materia+="<br>B22. Lógica.";
			materia+="<br>B23. Antropología Filosófica.";
			materia+="<br>B23. Lengua Extranjera Moderna Nivel I: Inglés I - Francés I.";
			materia+="<br>B23. Lengua Extranjera Moderna Nivel II: Inglés II - Francés II.";
			materia+="<br>P05. Práctica y Residencia.";
			materia+="<br><b>ASIGNATURAS DE LA LICENCIATURA</b>";
			materia+="<br><b>PRIMER AÑO</b>";
			materia+="<br>B01. Introducción a la Literatura.";
			materia+="<br>B02. Introducción a la Historia: Historia Social y del Arte.";
			materia+=" <br>B03. Filosofía.";
			materia+=" <br>B04. Gramática I.";
			materia+=" <br>B05. Latín I.";
			materia+=" <br>B06. Gramática II.";
			materia+=" <br>B07. Latín II.";
			materia+=" <br>B08. Literaturas Clásicas.";
			materia+=" <br><b>SEGUNDO AÑO</b>";
			materia+=" <br>B09. Lingüística.";
			materia+=" <br>B10. Literatura Española I.";
			materia+=" <br>B11. Teoría y Crítica Literaria.";
			materia+=" <br>B12. Literatura Española II.";
			materia+=" <br>B13. Literatura Europea I.";
			materia+=" <br>B14. Literatura Latinoamericana I.";
			materia+=" <br><b>TERCER AÑO</b>";
			materia+=" <br>B15. Literatura Latinoamericana II.";
			materia+=" <br>B16. Literatura Argentina I.";
			materia+=" <br>B17. Historia de la Lengua.";
			materia+=" <br>B18. Griego I.";
			materia+=" <br>B19. Literatura Argentina II.";
			materia+=" <br>B20. Literatura Europea II.";
			materia+=" <br>B21. Griego II.";
			materia+=" <br><b>CUARTO AÑO</b>";
			materia+=" <br>B22. Lógica.";
			materia+=" <br>B23. Antropología Filosófica.";
			materia+=" <br>L02. Taller Literario.";
			materia+=" <br>L05. Literatura del NOA.";
			materia+="<br>L05. Lengua Extranjera Moderna Nivel I: Inglés I - Francés I.";
			materia+="<br>L05. Lengua Extranjera Moderna Nivel II: Inglés II - Francés II.";
			materia+="<br><b>QUINTO AÑO</b>";
			materia+="<br>L01. Metodología de la Investigación.";
			materia+=" <br>L03. Filosofía del Lenguaje.";
			materia+="L04. Teoría y Crítica Literaria II.";
			materia+="<br>L06. Seminario Vinculado a Temáticas Literarias:";
			materia+=" <br>L07. Narrativa Contemporánea.";
			materia+=" <br>L07. Literatura Norteamericana.";
			materia+=" <br>L07. Literatura del NOA.";
			materia+=" <br>L07. Literatura Folclórica.";
			materia+="L07. Teatro Contemporáneo Argentino.";
			materia+="L07. Seminario Vinculado a Temáticas Lingüísticas, Semánticas o Gramaticales.";
			materia+=" <br>L07. Nuevos Temas de la Gramática.";
			materia+=" <br>L07. Semiótica.";
			materia+=" <br>L07. TESINA FINAL.";

		}
			;
			break;
		case 7: {
			// LICENCIADO EN TRABAJO SOCIAL
			materia+=" <br><b>ASIGNATURAS</b>";
			materia+=" <br>Trabajo Social V";
			materia+="<br>Planeamiento y Planificación Social";
			materia+=" <br>Historia Social";
			materia+=" <br>Antropología Social y Cultural";
			materia+="<br>Organización y Administración del Bienestar Social";
			materia+="<br>Psicología Social";
			materia+="<br>Supervisión y Ética Profesional";
			materia+="Optativa: Sociedades Campesinas o Antropología de las Sociedades Complejas";
			materia+="Optativa: Metodologías de la Investigación o Teoría e Investigación en Antropología Social";
			materia+=" <br>Seminario de orientación";
			materia+=" <br>Seminario de orientación";
			materia+=" <br>Seminario de orientación";
			materia+=" <br>Seminario de orientación";
			materia+=" <br>Tesis de Licenciatura";
		}
			;
			break;
		case 8: {
			// Licenciatura en Educación para la Salud
			materia+=" <br><b>PRIMER AÑO</b> ";
			materia+="<br>1. Introducción a la educación para la salud";
			materia+=" <br>2. Psicología evolutiva";
			materia+=" <br>3. Antropología filosófica";
			materia+=" <br>4. Ecología humana";
			materia+=" <br>5. Psicología social";
			materia+=" <br>6. Pedagogía";
			materia+=" <br>7. Antropología social y cultura.";
			materia+=" <br><b>SEGUNDO AÑO</b>";
			materia+=" <br>8. Problemática sanitaria";
			materia+=" <br>9. Comunicación";
			materia+=" <br>10. Didáctica";
			materia+=" <br>11. Salud y salud publica";
			materia+=" <br>12. Tecnología educativa";
			materia+=" <br>13. Epidemiología y estadística";
			materia+=" <br><b>TERCER AÑO</b>";
			materia+=" <br>14. Problemática sanitaria II";
			materia+=" <br>15. Investigación social";
			materia+="<br>16. Planeamiento de la educación para la salud";
			materia+=" <br>17. Informática";
			materia+="<br>18. Organización y des. De la comunidad";
			materia+=" <br>19. Legislación aplicada";
			materia+=" <br>20. Salud ocupacional";
			materia+=" <br><b>CUARTO AÑO</b>";
			materia+=" <br>Trabajo de Campo y Residencia";
			materia+="<br>Obtención del título de EDUCADOR SANITARIO";
			materia+="<br><b>QUINTO AÑO</b>";
			materia+="<br>Seminario de Integración Metodológica";
			materia+="Trabajo de Campo con Proyecto Final";
			materia+="<br>Obtención del título de LICENCIADO EN EDUCACION PARA LA SALUD";

		}
			;
			break;
		case 9: {
			// Educador Sanitario
			materia+=" <br><b>PRIMER AÑO</b> ";
			materia+="<br>1. Introducción a la educación para la salud";
			materia+=" <br>2. Psicología evolutiva";
			materia+=" <br>3. Antropología filosófica";
			materia+=" <br>4. Ecología humana";
			materia+=" <br>5. Psicología social";
			materia+=" <br>6. Pedagogía";
			materia+=" <br>7. Antropología social y cultura.";
			materia+=" <br><b>SEGUNDO AÑO</b> ";
			materia+=" <br>8. Problemática sanitaria";
			materia+=" <br>9. Comunicación";
			materia+=" <br>10. Didáctica";
			materia+=" <br>11. Salud y salud publica";
			materia+=" <br>12. Tecnología educativa";
			materia+="<br>13. Epidemiología y estadística";
			materia+="<br><b>TERCER AÑO</b>";
			materia+="<br>14. Problemática sanitaria II";
			materia+="<br>15. Investigación social";
			materia+="<br>16. Planeamiento de la educación para la salud";
			materia+="<br>17. Informática";
			materia+="<br>18. Organización y des. De la comunidad";
			materia+="<br>19. Legislación aplicada";
			materia+="<br>20. Salud ocupacional";
			materia+="<br><b>CUARTO AÑO</b>";
			materia+="<br>Trabajo de Campo y Residencia";
			materia+="<br>Obtención del título de EDUCADOR SANITARIO";

		}
			;
			break;

		case 10: {

			// Ciclo Superior de Licenciatura en Filosofía
			materia+=" <br><b>ASIGNATURAS</b>";
			materia+=" <br>Latín I o Griego I";
			materia+=" <br>Latín II o Griego II";
			materia+=" <br>Epistemología";
			materia+="<br>Metodología de la investigación filosófica";
			materia+="<br>Filosofía del lenguaje";
			materia+="<br>Problemas especiales de ética";
			materia+="<br>Lógica superior";
			materia+="<br>Antropología filosófica";
			materia+="<br>Teoría social y política";
			materia+="<br>Filosofía de la historia";
			materia+="<br>Seminario: pensamiento argentino y latinoamericano";
			materia+="<br>Economía política";
			materia+="<br>Sociología de la educación";
			materia+="<br>Optativa I: Área de formación histórico-social (a elegir entre)";
			materia+="<br>-Antropología de las sociedades complejas";
			materia+="<br>-Historia social";
			materia+="<br>-Historia social de la cultura";
			materia+="<br>-Antropología social y cultural";
			materia+="<br>-Historia de la educación argentina y latinoamericana";
			materia+="<br>-Organización y desarrollo de la comunidad";
			materia+="<br>-Indicadores económicos y sociales nacionales y de la provincia de Jujuy";
			materia+="<br>-Historia política social y económica de América y argentina";
			materia+="<br>Optativa II: Área de formación metodológica.";
			materia+=" <br>-Investigación social";
			materia+="<br>-Fuentes de información y documentación";
			materia+="<br>-Análisis institucional";
			materia+="<br>-Semiótica";
			materia+="<br>-Teoría e investigación en antropología social";
			materia+="<br>Proyecto Final (Trabajo de Campo e Investigación)";

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
			      materia+="<br>PRIMER AÑO";
			      materia+="<br>Introducción a la Contabilidad ";
			      materia+="<br>Algebra y Geometría Analítica ";
			      materia+="<br>Teoría General de la Administración";
			      materia+="<br>Contabilidad Básica ";
			      materia+="<br>Introducción a la Economía";
			      materia+="<br>Análisis Matemático ";
			      materia+="<br>Introducción a las Ciencias Sociales ";
			      materia+="<br><b>SEGUNDO AÑO</b>";
			      materia+="<br>Contabilidad Superior I ";
			      materia+="<br>Estadística ";
			      materia+="<br>Estructuras y Procesos";
			      materia+="<br>Derecho Privado ";
			      materia+="<br>Contabilidad Superior II ";
			      materia+="<br>Informática";
			      materia+="<br>Microeconomía ";
			      materia+="<br><b>TERCER AÑO</b>";
			      materia+="<br>Derecho Constitucional y Administrativo ";
			      materia+="<br>Contabilidad Superior III ";
			      materia+="<br>Sistemas de Información ";
			      materia+="<br>Macroeconomía";
			      materia+="<br>Costos I ";
			      materia+="<br>Derecho Laboral ";
			      materia+="<br>Historia Económica y Social ";
			      materia+="<br>Cálculo Financiero ";
			      materia+="<br><b>CUARTO AÑO</b>";
			      materia+="<br>Administración Financiera ";
			      materia+="<br>Costos II ";
			      materia+="<br>Finanzas Públicas ";
			      materia+="<br>Metodología de Investigación ";
			      materia+="<br>Análisis e Interpretación de Estados Contables ";
			      materia+="<br>Impuestos I ";
			      materia+="<br>Derecho Societario ";
			      materia+="<br>Contabilidad Pública ";
			      materia+="<br><b>QUINTO AÑO</b>";
			      materia+="<br>Auditoría I ";
			      materia+="<br>Impuestos II ";
			      materia+="<br>Derecho Concursal ";
			      materia+="<br>Electiva I";
			      materia+="<br>Auditoría II ";
			      materia+="<br>Electiva II";
			      materia+="<br>Práctica Profesional ";
			      materia+="<br>Seminario Final ";
			      
		        };break; 
		case 2:{
	          //LICENCIATURA EN ADMINISTRACION
			 materia+="<br><b>LICENCIATURA EN ADMINISTRACION</b>";
		      materia+="<br>PRIMER AÑO";
		      materia+="<br>Introducción a la Contabilidad ";
		      materia+="<br>Algebra y Geometría Analítica ";
		      materia+="<br>Teoría General de la Administración";
		      materia+="<br>Contabilidad Básica ";
		      materia+="<br>Introducción a la Economía";
		      materia+="<br>Análisis Matemático ";
		      materia+="<br>Introducción a las Ciencias Sociales ";
			  materia+="<br><b>SEGUNDO AÑO</b>";
			  materia+="<br>Análisis Sico Social de las Organizaciones";
			  materia+="<br>Estadística ";
			  materia+="<br>Estructuras y Procesos" ;
			  materia+="<br>Derecho Privado ";
			  materia+="<br>Elementos y Sistemas de Costos"; 
			  materia+="<br>Informática"; 
			  materia+="<br>Microeconomía ";
			  materia+="<br><b>TERCER AÑO</b>";
			  materia+="<br>Derecho Constitucional y Administrativo ";
			  materia+="<br>Análisis de Estados Contables ";
			  materia+="<br>Sistemas de Información ";
			  materia+="<br>Macroeconomía";
			  materia+="<br>Administración de Recursos Humanos"; 
			  materia+="<br>Derecho Laboral ";
			  materia+="<br>Historia Económica y Social"; 
			  materia+="<br>Cálculo Financiero ";
			  materia+="<br><b>CUARTO AÑO</b>";
			  materia+="<br>Administración Financiera ";
			  materia+="<br>Sist. de Adm. Financ. y Control del Sector Público ";
			  materia+="<br>Marketing ";
			  materia+="<br>Metodología de Investigación ";
			  materia+="<br>Régimen Tributario ";
			  materia+="<br>Derecho Societario ";
			  materia+="<br>Formulación y Evaluación de Proyectos";
			  materia+="<br><b>QUINTO AÑO</b>";
			  materia+="<br>Electiva I";	
			  materia+="<br>Electiva II";	
			  materia+="<br>Práctica Profesional"; 
			  materia+="Seminario Final";
			  
		};break;
		case 3:{
			
			//LICENCIADO EN ECONOMIA
			materia+="<br><b>PRIMERA AÑO</b>";
			materia+="<br>Introducción a la Contabilidad ";
			materia+="<br>Algebra y Geometría Analítica ";
			materia+="<br>Teoría General de la Administración"; 
			materia+="<br>Contabilidad Básica ";
			materia+="<br>Análisis Matemático ";
			materia+="<br>Introducción a las Ciencias Sociales";
			materia+="<br>Microeconomía ";
			materia+="<br><b>SEGUNDO AÑO</b>";
			materia+="<br>Estadística ";
			materia+="<br>Derecho Privado"; 
			materia+="<br>Macroeconomía ";
			materia+="<br>Historia Económica y Social"; 
			materia+="<br>Cálculo Financiero ";
			
			
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
		     materia+="<br><b>PRIMERA AÑO</b>";
		     materia+="<br>Álgebra y Geometría Analítica";
		     materia+="<br>Análisis Matemático I ";
		     materia+="<br>Física I ";
		     materia+="<br>Introducción a la Informática ";
		     materia+="<br>Química I  ";
		     materia+="<br>Sistemas de Representación ";
		     materia+="<br><b>SEGUNDO AÑO</b>";
		     materia+="<br>Física II ";
		     materia+="<br>Química Orgánica";  
		     materia+="<br>Análisis Matemático II"; 
		     materia+="<br>Química II ";
		     materia+="<br>Matemática para Ingenieros";
		     materia+="<br>Termodinámica ";
		     materia+="<br><b>TERCER AÑO</b>";
		     materia+="<br>Química Analítica ";
		     materia+="<br>Electricidad y Electrónica";
		     materia+="<br>Fenómenos de Transporte ";
		     materia+="<br>Fisicoquímica ";
		     materia+="<br>Economía, Organización y Dirección de Empresas"; 
		     materia+="<br>Estática y Resistencia de Materiales ";
		     materia+="<br>Operaciones Unitarias I ";
		     materia+="<br>Programación Aplicada";
		     materia+="<br><b>CUARTO AÑO</b>";
		     materia+="<br>Ingeniería de las Reacciones Químicas";
		     materia+="<br>Instrumentación y Control de Procesos ";
		     materia+="<br>Operaciones Unitarias II"; 
		     materia+="<br>Ingeniería de los Servicios"; 
		     materia+="<br>Materiales para Ingeniería";
		     materia+="<br>Tecnología Mecánica ";
		     materia+="<br>Bioingeniería ";
		     materia+="<br>Procesos Electroquímicos";
		     materia+="<br><b>QUINTO AÑO</b>";
		     materia+="<br>Formulación y Evaluación de Proyectos";
		     materia+="<br>Ingeniería de Procesos";
		     materia+="<br>Simulación y Optimización";
		    		 
	        };break;	
	case 2:{
		     //INGENIERO EN MINAS
		      materia+="INGENIERO EN MINAS";
		      materia+="<br><b>PRIMER AÑO</b>";
		      materia+="<br>Álgebra y Geometría Analítica";
		      materia+="<br>Análisis Matemático I ";
		      materia+="<br>Física I ";
		      materia+="<br>Introducción a la Informática"; 
		      materia+="<br>Química I ";
		      materia+="<br>Sistemas de Representación";
		      materia+="<br>T1 Taller: Introducción a la Ingeniería de Minas";
		      materia+="<br><b>SEGUNDO AÑO</b>";
		      materia+="<br>Física II ";
		      materia+="<br>Análisis Matemático II"; 
		      materia+="<br>Geología ";
		      materia+="<br>Química II ";
		      materia+="<br>Cálculo Numérico ";
		      materia+="<br>Matemática para Ingenieros "; 
		      materia+="<br>Mecánica Aplicada a la Minería "; 
		      materia+="<br>Termodinámica ";
		      materia+="<br><b>TERCER AÑO</b>";
		      materia+="<br>Química Analítica y Análisis de Menas";
		      materia+="<br>Topografía ";
		      materia+="<br>Electricidad y Electrónica ";
		      materia+="<br>Fisicoquímica ";
		      materia+="<br>Seminario: Ingeniería de la Calidad y del Medio Ambiente";
		      materia+="<br>Estática y Resistencia de Materiales ";
		      materia+="<br>Mecánica de Rocas y Suelos ";
		      materia+="<br>Mineralogía ";
		      materia+="<br>Seminario: Higiene y Seguridad Ambiental y del Trabajo";
		      materia+="<br><b>CUARTO AÑO</b>";
		      materia+="<br>Economía Minera y Dirección y Organización de Empresas";
		      materia+="<br>Máquinas Mineras y Servicios ";
		      materia+="<br>Metalurgia Extractiva I ";
		      materia+="<br>Procesamiento de Minerales I"; 
		      materia+="<br>Yacimientos de Minerales ";
		      materia+="<br>Construcciones Mineras ";
		      materia+="<br>Explotación de Minas I ";
		      materia+="<br>Metalurgia Extractiva II ";
		      materia+="<br>Petrografía y Petrología ";
		      materia+="<br>Procesamiento de Minerales II"; 
		      materia+="<br>Prospección y Exploración";
		      materia+="<br><b> QUINTO AÑO</b>";
		      materia+="<br>Explotación de Minas II ";
		      materia+="<br>Formulación y Evaluación de Proyectos"; 
		      materia+="<br>Procesamiento de Minerales III ";
		      materia+="<br>Seminario: Ingeniería de la Producción y de la Empresa";
		      materia+="<br>Seminario: Legislación Minera y Ética Profesional";
		      materia+="<br>Proyecto Final";
	};break;
	case 3:{
		 //INGENIERO EN INDUSTRIAL
		materia+="<br><b>PRIMER AÑO</b>";
		materia+="Álgebra y Geometría Analítica"; 
		materia+="<br>Análisis Matemático I ";
		materia+="<br>Física I ";
		materia+="<br>Introducción a la Informática"; 
		materia+="<br>Química I ";
		materia+="<br>Sistemas de Representación";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Estática y Resistencia de Materiales ";
		materia+="<br>Física II ";
		materia+="<br>Probabilidad y Estadística"; 
		materia+="<br>Análisis Matemático II ";
		materia+="<br>Química II ";
		materia+="<br>Programación Aplicada"; 
		materia+="<br>Termodinámica y Máquinas Térmicas";
		materia+="<br>TERCER AÑO</b>";
		materia+="<br>Investigación Operativa ";
		materia+="<br>Costos Industriales ";
		materia+="<br>Economía y Dirección de Empresas";
		materia+="<br>Electrotecnia";
		materia+="<br>Organización de la Producción";
		materia+="<br>Ingeniería de Materiales ";
		materia+="<br>Organización de Empresas ";
		materia+="<br>Planeamiento y Control de la Producción";
		materia+="<br><b>CUARTO AÑO</b>";
		materia+="<br>Sistemas de Información ";
		materia+="<br>Formulación y Evaluación de Proyectos";
		materia+="<br>Instalaciones y Control ";
		materia+="<br>Mecánica de los Fluidos C";
		materia+="<br>Higiene y Seguridad Ambiental y del Trabajo";
		materia+="<br>Ingeniería Legal ";
		materia+="<br>Mecánica y Mecanismos";
		materia+="<br><b>QUINTO AÑO</b>";
		materia+="<br>Edificios Industriales"; 
		materia+="<br>Optativa I ";
		materia+="<br>Optativa II ";
		materia+="<br>Gestión Empresaria de la Calidad"; 
		materia+="<br>Operaciones Industriales ";
		materia+="<br>Optativa III ";
				
		
	};break;
	 
	case 4:{
		//INGENIERIA EN INFORMATICA.
		materia+="<br><b>PRIMER AÑO</b>";
		materia+="<br>Álgebra y Geometría Analítica"; 
		materia+="<br>Análisis Matemático I ";
		materia+="<br>Física I ";
		materia+="<br>Introducción a la Informática"; 
		materia+="<br>Química I ";
		materia+="<br>Sistemas de Representación";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Física II ";
		materia+="<br>Probabilidades y Estadística"; 
		materia+="<br>Análisis Matemático II ";
		materia+="<br>Matemática Discreta ";
		materia+="<br>Técnicas Digitales ";
		materia+="<br>Estructura de Datos ";
		materia+="<br>Estructura y Tecnología de Computadoras"; 
		materia+="<br>Metodología de la Programación";
		materia+="<br><b>TERCER AÑO</b>";
		materia+="<br>Investigación Operativa"; 
		materia+="<br>Modelos de Desarrollo de Programas y  Programación Concurrente";
		materia+="<br>Desarrollo Sistemático de Programas ";
		materia+="<br>Lógica Computacional ";
		materia+="<br>Sistemas Operativos";
		materia+="<br>Bases de Datos";
		materia+="<br>Cálculo Numérico"; 
		materia+="<br>Lenguajes Formales"; 
		materia+="<br>Redes de Computadoras";
		materia+="<br><b>CUARTO AÑO</b>";
		materia+="<br>Economía, Organización y Administración de Empresas";
		materia+="<br>Arquitectura de Redes ";
		materia+="<br>Compiladores";
		materia+="<br>Inteligencia Artificial"; 
		materia+="<br>Laboratorio de Computadoras";
		materia+="<br>Arquitectura de Computadoras ";
		materia+="<br>Ingeniería de Software I";
		materia+="<br><b>QUINTO AÑO</b>";
		materia+="<br>Diseño de Sistemas Operativos";
		materia+="<br>Ingeniería de Software II ";
		materia+="<br>Gestión Ambiental ";
		materia+="<br>Ingeniería del Conocimiento"; 
		materia+="<br>Legislación";
		materia+="<br>Práctica Profesional Supervisada";
		materia+="<br>Proyecto Final";
	};break;
	case 5:{
		
		//LICENCIATURA EN SISTEMAS 
		materia+="<br><b>PRIMER AÑO</b>";
		materia+="<br>Álgebra y Geometría Analítica"; 
		materia+="<br>Análisis Matemático ";
		materia+="<br>Introducción a la Informática"; 
		materia+="<br>Técnicas Digitales";
		materia+="<br>Estructura de Datos ";
		materia+="<br>Estructura y Tecnología de Computadoras"; 
		materia+="<br>Metodología de la Programación ";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Probabilidades y Estadística ";
		materia+="<br>Análisis Matemático II ";
		materia+="<br>Lógica Computacional ";
		materia+="<br>Matemática Discreta"; 
		materia+="<br>Sistemas Operativos";
		materia+="<br>Bases de Datos";
		materia+="<br>Lenguajes Formales";
		materia+="<br>Redes de Computadoras";
		materia+="<br><b>TERCER AÑO</b>";
		materia+="<br>Economía, Organización y Administración de Empresas";
		materia+="<br>Investigación Operativa";
		materia+="<br>Modelos de Desarrollo de Programas y Programación Concurrente";
		materia+="<br>Sistemas de Información I";
		materia+="<br>Desarrollo Sistemático de Programas"; 
		materia+="<br>Taller de Epistemología de las Ciencias";
		materia+="<br>Taller de Formación Profesional ";
		materia+="<br>Cálculo Numérico ";
		materia+="<br>Seguridad en Sistemas"; 
		materia+="<br>Taller de Metodología de la Investigación Científica";
		materia+="<br><b>CUARTO AÑO</b>";
		materia+="<br>Sistemas de Información II ";
		materia+="<br>Compiladores ";
		materia+="<br>Diseño de Sistemas Operativos"; 
		materia+="<br>Inteligencia Artificial ";
		materia+="<br>Laboratorio de Computadoras"; 
		materia+="<br>Arquitectura de Computadoras";
		materia+="<br>Gestión Ambiental ";
		materia+="<br>Ingeniería del Conocimiento";
		materia+="<br>Legislación ";
		materia+="<br>Trabajo Final de Sistemas"; 
	};break;
	case 6:{
		///LICENCIATURA EN TECNLOOGIA DE LOS ALIMENTOS
		materia+="<br><b>PRIMER AÑO</b>";
		materia+="<br>Álgebra y Geometría Analítica";
		materia+="<br>Análisis Matemático ";
		materia+="<br>Física I ";
		materia+="<br>Química I";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Estadística ";
		materia+="<br>Química Orgánica"; 
		materia+="<br>Biología General y Celular"; 
		materia+="<br>Química II ";
		materia+="<br>Física II ";
		materia+="<br>Matemática y Computación";
		materia+="<br><b>TERCER AÑO</b>";
		materia+="<br>Bioquímica de los Alimentos ";
		materia+="<br>Fisicoquímica ";
		materia+="<br>Microbiología General y de los Alimentos";
		materia+="<br>Química Analítica y Análisis de los Alimentos";
		materia+="<br>Fenómenos de Transporte";
		materia+="<br><b>CUARTO AÑO</b>";
		materia+="<br>Operaciones Básicas de los Alimentos";
		materia+="<br>Materiales y Equipos ";
		materia+="<br>Tecnología de los Alimentos I"; 
		materia+="<br>Calidad de los Alimentos ";
		materia+="<br>Higiene y Seguridad Ambiental";
		materia+="<br>Tecnología de los Alimentos II";
		
		
	};break;
	case 7:{
		//LICENCIADO EN CIENCIAS GEOLOGICAS
		materia+="<br><b>PRIMER AÑO</b>";
        materia+="<br>Álgebra y Geometría Analítica";
        materia+="<br>Análisis Matemático I";
        materia+="<br>Física I";
        materia+="<br>Introducción a la Informática";
        materia+="<br>Química I";
        materia+="<br>Sistemas de Representación";
        materia+="<br>Taller: Introducción a la Ingeniería de Minas";
        materia+="<br><b>SEGUNDO AÑO</b>";
        materia+="<br>Física II";
        materia+="<br>Análisis Matemático II";
        materia+="<br>Geología";
        materia+="<br>Química II";
        materia+="<br>Cálculo Numérico";
        materia+="<br>Matemática para Ingenieros";
        materia+="<br>Mecánica Aplicada a la Minería";
        materia+="<br>Termodinámica";
        materia+="<br><b>TERCER AÑO</b>";
        materia+="<br>Química Analítica y Análisis de Menas";
        materia+="<br>Topografía";
        materia+="<br>Electricidad y Electrónica";
        materia+="<br>Fisicoquímica";
        materia+="<br>Seminario: Ingeniería de la Calidad y del Medio Ambiente";
        materia+="<br>Estática y Resistencia de Materiales";
        materia+="<br>Mecánica de Rocas y Suelos";
        materia+="<br>Mineralogía";
        materia+="<br>Seminario: Higiene y Seguridad Ambiental y del Trabajo";
        materia+="<br><b>CUARTO AÑO</b>";
        materia+="<br>Economía Minera y Dirección y Organización de Empresas";
        materia+="<br>Máquinas Mineras y Servicios";
        materia+="<br>Metalurgia Extractiva I";
        materia+="<br>Procesamiento de Minerales I";
        materia+="<br>Yacimientos de Minerales";
        materia+="<br>Construcciones Mineras";
        materia+="<br>Explotación de Minas I";
        materia+="<br>Metalurgia Extractiva II";
        materia+="<br>Petrografía y Petrología";
        materia+="<br>Procesamiento de Minerales II";
        materia+="<br>Prospección y Exploración";
        materia+="<br><b>QUINTO AÑO</b>";
         materia+="<br>Explotación de Minas II";
         materia+="<br>Formulación y Evaluación de Proyectos";
         materia+="<br>Procesamiento de Minerales III";
         materia+="<br>Seminario: Ingeniería de la Producción y de la Empresa";
         materia+="<br>Seminario: Legislación Minera y Ética Profesional";
         materia+="<br>Proyecto Final";
		
	};break;
	case 8:{
		//TECNICO UNIVERSITARIO EN EXPLOTACION DE MINAS 2007 PERFIL Y ALCANCES
		materia+="";
	};break;
	case 9:{
		// TÉCNICO UNIVERSITARIO EN PROCESAMIENTO DE MINERALES
	    materia+="<br><b>PRIMER AÑO</b>";
	    materia+="<br>Álgebra y Geometría Analítica ";
	    materia+="<br>Análisis Matemático I";
	    materia+="<br>Física I ";
	    materia+="<br>Introducción a la Informática"; 
	    materia+="<br>Química I ";
	    materia+="<br>Sistemas de Representación"; 
	    materia+="<br>Taller: Introducción a la Minería";
	    materia+="<br><b>SEGUNDO AÑO</b>";
	    materia+="<br>Física II ";
	    materia+="<br>Química Analítica y Análisis de Menas";
	    materia+="<br>Seminario: Ingeniería de la Calidad y del Medio Ambiente";
	    materia+="<br>Procesamiento de Minerales I ";
	    materia+="<br>Química II ";
	    materia+="<br>Mineralogía ";
	    materia+="<br>Procesamiento de Minerales II"; 
	    materia+="<br>Termodinámica";
	    materia+="<br><b>TERCER AÑO</b>";
	    materia+="<br>Electricidad y Electrónica ";
	    materia+="<br>Fisicoquímica ";
	    materia+="<br>Metalurgia Extractiva I"; 
	    materia+="<br>Procesamiento de Minerales III";
	    materia+="<br>Seminario: Higiene y Seguridad Ambiental y del Trabajo";
	    materia+="<br>Metalurgia Extractiva II ";
	    materia+="<br>Taller: Beneficio de los Minerales"; 
	    materia+="<br>Taller: Procesos de Metalurgia Extractiva";
	};break;
	case 10:{
		//ANALISTA PROGRAMADDOR UNIVERSITARIO
		materia+="<br><b>PRIMIER AÑO</b>";
		materia+="<br>Inglés I ";
		materia+="<br>Herramientas Informáticas I"; 
		materia+="<br>Programación Estructurada ";
		materia+="<br>Inglés II ";
		materia+="<br>Herramientas Informáticas II";
		materia+="<br>Estructura de Datos ";
		materia+="<br>Laboratorio de Sistemas Operativos I"; 
		materia+="<br>Base de Datos I";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Inglés III ";
		materia+="<br>Álgebra I ";
		materia+="<br>Programación Visual"; 
		materia+="<br>Laboratorio de Sistemas Operativos II"; 
		materia+="<br>Base de Datos II";
		materia+="<br>Inglés IV ";
		materia+="<br>Álgebra II ";
		materia+="<br>Programación Concurrente y Paralela"; 
		materia+="<br>Programación Orientada a Objetos ";
		materia+="<br>Análisis y Diseño de Sistemas I ";
		materia+="<br><b>TERCER AÑO</b>";
		materia+="<br>Inglés V";
		materia+="<br>Redes I ";
		materia+="<br>Programación y Servicios Web"; 
		materia+="<br>Laboratorio de Programación Orientado a Objetos I"; 
		materia+="<br>Análisis y Diseño de Sistemas II";
		materia+="<br>Inglés VI ";
		materia+="<br>Redes II ";
		materia+="<br>Laboratorio de Programación Orientado a Objetos II"; 
		materia+="<br>Herramientas informáticas avanzadas";
		materia+="<br>Legislación y Ejercicio Profesional ";
		
	};break;
	case 11:{
		materia+="<br><b>PRIMER AÑO</b>";
		materia+="<br>Álgebra y Geometría Analítica ";
		materia+="<br>Análisis Matemático ";
		materia+="<br>Física I ";
		materia+="<br>Introducción a la Geología"; 
		materia+="<br>Química I ";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Química Analítica ";
		materia+="<br>Geología Estructural"; 
		materia+="<br>Paleontología ";
		materia+="<br>Química II ";
		materia+="<br>Física II ";
		materia+="<br>Levantamiento Geológico"; 
		materia+="<br>Mineralogía";
		materia+="<br><b>TERCER AÑO</b>";
		materia+="<br>Estadística Descriptiva y Probabilidades ";
		materia+="<br>Geofísica General y Aplicada ";
		materia+="<br>Geomorfología ";
		materia+="<br>Sedimentología";
		materia+="<br>Estratigrafía ";
		materia+="<br>Fotogeología e Imágenes Satelitales"; 
		materia+="<br>Hidrogeología";
		materia+="<br>Petrografía y Petrología"; 
		materia+="<br>Práctica Profesional Asistida";
		
	};break;
	case 12:{
		//TECNICATURA UNIVERSITARIA EN PERFORACIONES
		materia="<br><b>PRIMER AÑO</b>";
		materia+="<br>Álgebra y Geometría Analítica";
		materia+="<br>Física General";
		materia+="<br>Análisis Matemático";
		materia+="<br>Introducción a la Geología";
		materia+="<br>Química I";
		materia+="<br>Práctica Geológica I";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Mineralogía";
		materia+="<br>Geología Estructural";
		materia+="<br>Química II";
		materia+="<br>Perforaciones I";
		materia+="<br>Carteo Geológico";
		materia+="<br>Petrografía Sedimentaria";
		materia+="<br><b>TERCER AÑO</b>";
		materia+="<br>Recursos Energéticos";
		materia+="<br>Yacimientos Minerales";
		materia+="<br>Perforaciones II";
		materia+="<br>Máquinas de Exploración";
		materia+="<br>Geofísica";
		materia+="<br>Legislación Minera y Laboral";
		materia+="<br>Recursos Hídricos";
		materia+="<br>Práctica Profesional Asistida";
		
	};break;
	case 13:
	{ 
		//TECNICATURA UNIVERSITARIA EN CIENCIAS 
		//DE LA TIERRA ORIENTADA A PETROLEO
		materia="<br><b>PRIMER AÑO</b>";
		materia+="<br>Álgebra y Geometría Analítica";
		materia+="<br>Física General";
		materia+="<br>Análisis Matemático";
		materia+="<br>Introducción a la Geología";
		materia+="<br>Química I";
		materia+="<br>Práctica Geológica I";
		materia+="<br><b>SEGUNDO AÑO</b>";
		materia+="<br>Geología Estructural";
		materia+="<br>Química II";
		materia+="<br>Práctica Geológica II";
		materia+="<br>Mineralogía";
		materia+="<br>Carteo Geológico";
		materia+="<br>Sedimentología";
		materia+="<br>Estratigrafía y Geología Histórica";
		materia+="<br>Geofísica";
		materia+="<br><b>TERCER AÑO</b>";
		materia+="<br>Reservorios";
		materia+="<br>Geología del Petróleo";
		materia+="<br>Prospección y Perforación Petrolera";
		materia+="<br>Teledetección y Sensores Remotos";
		materia+="<br>Geomorfología";
		materia+="<br>Petrografía Ígnea y Metamórfica";
		materia+="<br>Práctica Profesional Asistida";
		
		
	
	};break;
}
  	   return materia;
	}
}
