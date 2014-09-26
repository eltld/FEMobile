package com.fe.activity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.R;
import com.fe.bean.CarreraBean;
import com.fe.bean.adapter.CustomComedorAdapter;
import com.fe.bean.util.UtilList;
import com.fe.model.Carrera;
import com.fe.model.Constants;

import android.app.Activity;
import android.content.Intent;
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
		textHeader.setText("Carreras");;
		
		carreraBean=new CarreraBean(getApplicationContext());
		Carrera objCarrera=carreraBean.get(Long.parseLong(idCarrera));
		
		switch(Integer.parseInt(idUniversity))
		{
		case Constants.FACU_AGRAGRIA_ID: 
		{
		  materia=loadMateriaAgraria(Integer.parseInt(idCarrera));
		
  	
		}
		case Constants.FACU_HUMANIDADES_ID:
		{
			materia=loadMateriaHumanidades(Integer.parseInt(idCarrera));
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
	      
	      
	      
	      logger.debug("Materia : "+materia);
	      text_titulo.setText(objCarrera.getTitulo_carrera());
	      text_duracion.setText(objCarrera.getDuracion_carrera());
	      text_nivel.setText(objCarrera.getNivel_carrera());
	      text_acreditacion.setText(objCarrera.getAcreditacion_carrera());
	      text_perfil.setText(objCarrera.getPerfil_carrera());
	      text_materia.setText(Html.fromHtml(materia));
	      text_alcance.setText(objCarrera.getAlcance_carrera());
        
        	
	      
		}
	    
	}
	
	
	public String loadMateriaAgraria(int id_carrera)
	{
		List<String> listMateria=new ArrayList<String>();
		 
		String materia="";
		switch (id_carrera)
		{
		 
		case 1:{		
		//Ingeniero Agronomo
		
		  materia+="Primer Año";
		  materia+="<br>Álgebra y Geometría Analítica";
	      materia+=" <br>Análisis Matemático";
          materia+=" <br>Botánica General"; 		
		  materia+=" <br>Botánica Sistemática";
		  materia+=" <br>Química General e Inorgánica";
		  materia+=" <br>Química Orgánica";
		  materia+=" <br>Física";
		  materia+=" <br>Módulo I";
		//2 año
		  materia+="<br>Bioestadística y Diseño Experimental";
		  materia+="<br>Química Biológica";	
        materia+=" <br>Química Agrícola";	
        materia+=" <br>Economía General";	
        materia+=" <br>Microbiología Agrícola";	
        materia+=" <br>Topografía";	
        materia+=" <br>Agroclimatología";
        //3 año
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
        materia+="<br>25 Manejo del Suelo y Riego";	
        materia+="<br>26 Protección Vegetal";	
        materia+="<br>27 Granos y Forrajes";	
        materia+="<br>28 Producción Animal I";	
        materia+="<br>29 Dasonomía";	
        materia+="<br>30 Mejoramiento Genético";
        
        //5to año
        materia+="<br>31 Administración Agraria";	
        materia+="<br>32 Horticultura y Floricultura";	
        materia+="<br>33 Cultivos Industriales";	
        materia+="<br>34 Fruticultura";	
        materia+="<br>35 Producción Animal II";	
        materia+="<br>36 Legislación Agraria";	
        materia+="<br>37 Extensión Rural";	
        materia+="<br>38 Módulo III";	
        materia+="<br>39 Pasantía con Trabajo Final";
        
		}
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
               
			
		   };break;
		case 3: {
			  //LICENCIADO EN BROMATOLOGIA
			materia+="<br><b>PRIMER AÑOz</b>";
			materia+="<br>Matemática I";	
			materia+="<br>Química General";	
			materia+="<br>Botánica Alimentaria";	
			materia+="<br>Matemática II";	
			materia+="<br>Química Inorgánica";	
			materia+="<br>Física";
			
			materia+="<br><b>SEGUNDO AÑOz</b>";
			materia+="<br>Química Orgánica";	
			materia+="<br>Química Analítica General";	
			materia+="<br>Estadística";	
			Zoología Alimentaria	
			Química Biológica	
			Bromatología I
			
			
		};break;
		}
		return materia;
	}
	
	
	//Load Humanidades
	public String loadMateriaHumanidades(int id_carrera) {
		
		List<String> listMateria =null;
		listMateria=new ArrayList<String>();
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
	
	
	
}
