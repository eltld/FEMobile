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
import com.fe.model.Materias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
  private List<String> listMateria;
  private ListView listViewMateria;
  
  private CarreraBean carreraBean;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carrera_content);
	 
		Intent intent=getIntent();
		String idCarrera=intent.getStringExtra(Constants.CARRERA_ID);
		String idUniversity=intent.getStringExtra(Constants.UNIVERSITY_ID);
		
		textHeader=(TextView)findViewById(R.id.text_header);
		textHeader.setText("Carreras");
		logger.debug("Activity Carrera Content : "+idCarrera);
		
		carreraBean=new CarreraBean(getApplicationContext());
		Carrera objCarrera=carreraBean.get(Long.parseLong(idCarrera));
		
		switch(Integer.parseInt(idUniversity))
		{
		case Constants.FACU_AGRAGRIA_ID: 
		{
		  listMateria=new ArrayList<String>();
		  listMateria=loadMateriaAgraria(Integer.parseInt(idCarrera));
		
  	
		}
		case Constants.FACU_HUMANIDADES_ID:
		{
			listMateria=new ArrayList<String>();
			listMateria=loadMateriaHumanidades(Integer.parseInt(idCarrera));
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
	     
	      text_titulo.setText(objCarrera.getTitulo_carrera());
	      text_nivel.setText(objCarrera.getNivel_carrera());
	      text_acreditacion.setText(objCarrera.getAcreditacion_carrera());
	      text_perfil.setText(objCarrera.getPerfil_carrera());
	     // text_alcance.setText(objCarrera.getAlcance_carrera().toString());
        
	      listViewMateria=(ListView)findViewById(R.id.list_carreraMaeriaContent);
	      
	      logger.debug("listMateria size : "+listMateria.size());
	      ArrayAdapter<String> arrayAdapter =      
	                 new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listMateria);
	                 // Set The Adapter
	       listViewMateria.setAdapter(arrayAdapter); 
        	
	      
		}
	    
	}
	
	
	public List<String>loadMateriaAgraria(int id_carrera)
	{
		List<String> listMateria=new ArrayList<String>();
		  
		switch (id_carrera)
		{
		 
		case 1:{		
		//Ingeniero Agronomo
		
		  listMateria.add("Primer Año");
		listMateria.add("Álgebra y Geometría Analítica");
	    listMateria.add( "Análisis Matemático");
        listMateria.add("Botánica General"); 		
		listMateria.add("Botánica Sistemática");
		listMateria.add("Química General e Inorgánica");
		listMateria.add("Química Orgánica");
		listMateria.add("Física");
		listMateria.add("Módulo I");
		//2 año
		listMateria.add("Bioestadística y Diseño Experimental");
		listMateria.add("Química Biológica");	
        listMateria.add("Química Agrícola");	
        listMateria.add("Economía General");	
        listMateria.add("Microbiología Agrícola");	
        listMateria.add("Topografía");	
        listMateria.add("Agroclimatología");
        //3 año
        listMateria.add("Fisiología Vegetal");	
        listMateria.add("Zoología Agrícola");	
        listMateria.add("Fitopatología");	
        listMateria.add("Edafología");	
        listMateria.add("Genética");	
        listMateria.add("Mecanización Agrícola");	
        listMateria.add("Ecología Agrícola");	
        listMateria.add("Economía Agraria");	
        listMateria.add("Módulo II");	
        //4 año
        listMateria.add(25,"Manejo del Suelo y Riego");	
        listMateria.add(26,"Protección Vegetal");	
        listMateria.add(27,"Granos y Forrajes");	
        listMateria.add(28,"Producción Animal I");	
        listMateria.add(29,"Dasonomía");	
        listMateria.add(30,"Mejoramiento Genético");
        
        //5to año
        listMateria.add(31,"Administración Agraria");	
        listMateria.add(32,"Horticultura y Floricultura");	
        listMateria.add(33,"Cultivos Industriales");	
        listMateria.add(34,"Fruticultura");	
        listMateria.add(35,"Producción Animal II");	
        listMateria.add(36,"Legislación Agraria");	
        listMateria.add(37,"Extensión Rural");	
        listMateria.add(38,"Módulo III");	
        listMateria.add(39,"Pasantía con Trabajo Final");
        
		}
		case 2 :// LIC. EN CIENCIAS BIOLOGICAS
		   {
			
		   };break;
		}
		return listMateria;
	}
	
	
	
	public List<String> loadMateriaHumanidades(int id_carrera) {
		List<String> listMateria = new ArrayList<String>();
		logger.debug("loadMateriaHumanidades : "+id_carrera);
		
		switch (id_carrera) {
		case 1: { // LICENCIADO EN COMUNICACION SOCIAL

			// licenciado en comunicacion social
			listMateria.add("PRIMER AÑO");
			listMateria.add(
					"1. Teoría y Problemática de la Comunicación Social");
			listMateria.add("2. Historia Social de la Cultura");
			listMateria.add("3. Filosofía y su problemática");
			listMateria
					.add(
							"4. Taller de Comprensión y Producción del Texto Periodístico");
			listMateria.add("5. Psicología Social");
			listMateria.add(
					"6. Fuentes de Información y Documentación (seminario)");
			listMateria.add(
					"7. Introducción a la Problemática Periodística");
			listMateria.add("8. Taller de Producción Gráfica");

			listMateria.add("SEGUNDO AÑO");
			listMateria.add(
					"9. Tecnología de la Comunicación Social (seminario)");
			listMateria.add(
					"10. Lingüística y principios de Semiología");
			listMateria.add(
					"11. Taller de Redacción Periodística");
			listMateria
					.add(
							"12. Taller optativo: Producción Televisiva 1, Tecnología y Producción Radiofónica 1, Taller de Fotografía 1.");
			listMateria.add(
					"13. Sociología de la Comunicación Social");
			listMateria
					.add(
							"14. Geografía Económica y Política Americana y Argentina");
			listMateria.add(
					"15. Taller de Publicidad y Propaganda");
			listMateria
					.add(
							"16. Taller optativo: Producción Televisiva 2, Tecnología y Producción Radiofónica 2, Taller de Fotografía 2");

			listMateria.add("TERCER AÑO");
			listMateria
					.add(
							"17. Economía Política y Problemática Económica Argentina");
			listMateria
					.add("18. Antropología Social y Cultural");
			listMateria.add("19. Taller de Semiótica");
			listMateria
					.add(
							"20. Historia Política, Económica y Social de América y Argentina");
			listMateria.add("21. Estadística");
			listMateria.add("22. Análisis del Discurso");
			listMateria.add("23. Epistemología");
			listMateria.add("Ingles 1");
			listMateria.add("Ingles 2");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 1");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 2");
			listMateria.add(
					"TITULO INTERMEDIO: TÉCNICO EN COMUNICACIÓN SOCIAL");
			listMateria.add("CUARTO AÑO");
			listMateria.add(
					"24. Teoría y Problemática de la Comunicación Social II");
			listMateria.add(
					"25. Planificación en Comunicación Social ");
			listMateria.add(
					"26. Metodología de la Investigación ");
			listMateria
					.add(
							"27. Análisis de la Realidad Contemporánea Comunicacional (Seminario)");
			listMateria.add(
					"28. Comunicación y Educación (Seminario) ");
			listMateria.add(
					"29. Comunicación Alternativa (Seminario) ");
			listMateria.add(
					"30. Ética y Legislación de la Información ");
			listMateria.add(
					"31. Seminarios de Formación Específica ");
			listMateria.add("32. RESIDENCIA PROFESIONAL");
			listMateria
					.add(
							"El licenciado deberá elaborar un Trabajo de Tesis Final con el fin de acreditar la eficiencia de su formación para el desempeño profesional.");
			listMateria.add(
					"TITULO DE GRADO: LICENCIADO EN COMUNICACIÓN SOCIAL");

		}
			;
			break;

		case 2: { // TECNICO EN COMUNICACION SOCIAL
			// licenciado en comunicacion social
			listMateria.add("PRIMER AÑO");
			listMateria.add("1. Teoría y Problemática de la Comunicación Social");
			listMateria.add("2. Historia Social de la Cultura");
			listMateria.add("3. Filosofía y su problemática");
			listMateria.add(
							"4. Taller de Comprensión y Producción del Texto Periodístico");
			listMateria.add("5. Psicología Social");
			listMateria.add(
					"6. Fuentes de Información y Documentación (seminario)");
			listMateria.add(
					"7. Introducción a la Problemática Periodística");
			listMateria.add("8. Taller de Producción Gráfica");

			listMateria.add("SEGUNDO AÑO");
			listMateria.add(
					"9. Tecnología de la Comunicación Social (seminario)");
			listMateria.add(
					"10. Lingüística y principios de Semiología");
			listMateria.add(
					"11. Taller de Redacción Periodística");
			listMateria
					.add(
							"12. Taller optativo: Producción Televisiva 1, Tecnología y Producción Radiofónica 1, Taller de Fotografía 1.");
			listMateria.add(
					"13. Sociología de la Comunicación Social");
			listMateria
					.add(
							"14. Geografía Económica y Política Americana y Argentina");
			listMateria.add(
					"15. Taller de Publicidad y Propaganda");
			listMateria
					.add(
							"16. Taller optativo: Producción Televisiva 2, Tecnología y Producción Radiofónica 2, Taller de Fotografía 2");

			listMateria.add("TERCER AÑO");
			listMateria
					.add(
							"17. Economía Política y Problemática Económica Argentina");
			listMateria
					.add("18. Antropología Social y Cultural");
			listMateria.add("19. Taller de Semiótica");
			listMateria
					.add(
							"20. Historia Política, Económica y Social de América y Argentina");
			listMateria.add("21. Estadística");
			listMateria.add("22. Análisis del Discurso");
			listMateria.add("23. Epistemología");
			listMateria.add("Ingles 1");
			listMateria.add("Ingles 2");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 1");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 2");
			listMateria.add(
					"TITULO INTERMEDIO: TÉCNICO EN COMUNICACIÓN SOCIAL");
		}
			;
			break;

		case 3: {
			// Prof. y Lic. en Ciencias de la Educación

			listMateria.add("PRIMER AÑO");
			listMateria.add("1. Pensamiento Científico");
			listMateria.add("2. Problemática Educativa");
			listMateria.add("3. Problemática Filosófica");
			listMateria.add("4. Sociología General");
			listMateria.add(
					"5. Módulo Optativo del Área Socio Cultural ");
			listMateria.add("6. Psicología General");
			listMateria.add("SEGUNDO AÑO");
			listMateria.add("7. Economía");
			listMateria.add("8. Biología del Aprendizaje");
			listMateria.add("9. Historia Social de la Educación");
			listMateria.add("10. Epistemología");
			listMateria.add("11. Sociología de la Educación");
			listMateria.add("12. Psicología Evolutiva l");
			listMateria.add("TERCER AÑO");
			listMateria.add("13. Psicología Evolutiva II");
			listMateria.add("14. Psicología Educacional");
			listMateria
					.add(
							"15. Historia de la Educación Argentina y Latinoamericana");
			listMateria.add(
					"16. Política Educacional y Legislación");
			listMateria.add("17. Filosofía de la Educación");
			listMateria.add("18. Didáctica General");
			listMateria.add("19. Psicología Social");
			listMateria.add("CUARTO AÑO");
			listMateria.add(
					"20. Teoría y Metodología de la Investigación Educativa");
			listMateria.add("21. Planeamiento de la Educación");
			listMateria.add(
					"22. Didáctica de las Áreas Disciplinares");
			listMateria.add(
					"23. Teorías y Desarrollo del Curriculum");
			listMateria.add(
					"24. Organización y Administración Educacional");
			listMateria.add(
					"25. Módulo Optativo del Área Comunicacional ");
			listMateria.add("26. Análisis Institucional");
			listMateria.add("QUINTO AÑO");
			listMateria.add("27. Dificultades del Aprendizaje");
			listMateria.add("28. Educación Especial");
			listMateria.add(
					"29. Orientación e Intervención pedagógica Institucional");
			listMateria.add("30. Educación No Formal");
			listMateria
					.add("31. Universidad y Formación Docente");
			listMateria.add(
					"32. PRÁCTICA Y RESIDENCIA (PARA EL TÍTULO DE PROFESOR)");

		}
			;
			break;

		case 4: {
			// Licenciatura en Antropología

			listMateria.add(
					"01. Introducción a las Ciencias Antropológicas.");
			listMateria.add("02. Antropología Biológica I");
			listMateria.add("03. Geología del Cuaternario.");
			listMateria
					.add("04. Antropología Social y Cultural.");
			listMateria.add("05. Prehistoria General.");
			listMateria.add("06. Etnografía Americana.");
			listMateria.add(
					"07. Teoría e Historia de la Antropología");
			listMateria.add("08. Arqueología Americana.");
			listMateria.add("09. Sociedades Campesinas");
			listMateria
					.add("10. Organización Social y Parentesco");
			listMateria.add("11. Antropología Biológica II");
			listMateria
					.add(
							"12. Metodología y Técnicas de la Investigación Arqueológica");
			listMateria.add("13. Arqueología Argentina");
			listMateria.add(
					"14. Fundamentos de Análisis Matemático");
			listMateria.add(
					"15. Teoría e Investigación en Antropología Social.");
			listMateria.add("16. Etnohistoria.");
			listMateria.add("17. Lingüística General.");
			listMateria.add(
					"18. Antropología de las Sociedades Complejas.");
			listMateria.add("19. Estadística.");
			listMateria.add("20. Optativa");
			listMateria.add("21. Optativa");
			listMateria.add("22. Optativa");
			listMateria.add("Filosofía y su problemática");
			listMateria.add("Sociología General");
			listMateria.add("Psicología Social");
			listMateria.add("Fundamentos de Matemática");
			listMateria.add("Biología del Aprendizaje");
			listMateria.add("Sociología de la educación");
			listMateria.add("Psicología General");
			listMateria.add("Historia Social");
			listMateria.add("Antropología Filosófica");
			listMateria.add("Epistemología");
			listMateria.add("Economía");
			listMateria.add("Primer Nivel de Inglés Técnico");
			listMateria.add("Segundo Nivel de Inglés Técnico");
			listMateria.add("23. Seminario");
			listMateria.add("24. Seminario");
			listMateria.add("25. Seminario");
			listMateria.add("26. Seminario");
			listMateria.add("27. Seminario");
			listMateria.add("28. Seminario");

		}
			;
			break;
		case 5: {
			// Auxiliar técnico en antropologí

			listMateria.add(
					"01. Introducción a las Ciencias Antropológicas.");
			listMateria.add("02. Antropología Biológica I");
			listMateria.add("03. Geología del Cuaternario.");
			listMateria
					.add("04. Antropología Social y Cultural.");
			listMateria.add("05. Prehistoria General.");
			listMateria.add("06. Etnografía Americana.");
			listMateria.add(
					"07. Teoría e Historia de la Antropología");
			listMateria.add("08. Arqueología Americana.");
			listMateria.add("09. Sociedades Campesinas");
			listMateria
					.add("10. Organización Social y Parentesco");
			listMateria.add("11. Antropología Biológica II");
			listMateria
					.add(
							"12. Metodología y Técnicas de la Investigación Arqueológica");
			listMateria.add("13. Arqueología Argentina");
			listMateria.add(
					"14. Fundamentos de Análisis Matemático");
			listMateria.add(
					"15. Teoría e Investigación en Antropología Social.");
			listMateria.add("16. Etnohistoria.");
			listMateria.add("17. Lingüística General.");
			listMateria.add(
					"18. Antropología de las Sociedades Complejas.");
			listMateria.add("19. Estadística.");
			listMateria.add("20. Optativa");
			listMateria.add("21. Optativa");
			listMateria.add("22. Optativa");
			listMateria.add("Filosofía y su problemática");
			listMateria.add("Sociología General");
			listMateria.add("Psicología Social");
			listMateria.add("Fundamentos de Matemática");
			listMateria.add("Biología del Aprendizaje");
			listMateria.add("Sociología de la educación");
			listMateria.add("Psicología General");
			listMateria.add("Historia Social");
			listMateria.add("Antropología Filosófica");
			listMateria.add("Epistemología");
			listMateria.add("Economía");
			listMateria.add("Primer Nivel de Inglés Técnico");
			listMateria.add("Segundo Nivel de Inglés Técnico");
			listMateria.add("23. Seminario");
			listMateria.add("24. Seminario");
			listMateria.add("25. Seminario");
			listMateria.add("26. Seminario");
			listMateria.add("27. Seminario");
			listMateria.add("28. Seminario");

		}
			;
			break;
		case 6: {
			// /PROFESORADO Y LICENCIATURA EN LETRAS

			listMateria.add("ASIGNATURAS DEL PROFESORADO");
			listMateria.add("PRIMER AÑO");
			listMateria.add("B01. Introducción a la Literatura.");
			listMateria
					.add(
							"B02. Introducción a la Historia: Historia Social y del Arte.");
			listMateria.add("B03. Filosofía.");
			listMateria.add("B04. Gramática I.");
			listMateria.add("B05. Latín I.");
			listMateria.add("B06. Gramática II.");
			listMateria.add("B07. Latín II.");
			listMateria.add("B08. Literaturas Clásicas.");
			listMateria.add("SEGUNDO AÑO");
			listMateria.add("B09. Lingüística.");
			listMateria.add("B10. Literatura Española I.");
			listMateria.add("B11. Teoría y Crítica Literaria.");
			listMateria.add("P02. Psicología.");
			listMateria.add(
					"P01. Pedagogía, Organización y Administración Escolar.");
			listMateria.add("B12. Literatura Española II.");
			listMateria.add("B13. Literatura Europea I.");
			listMateria.add("B14. Literatura Latinoamericana I.");
			listMateria.add("P04. Psicología Evolutiva.");
			listMateria.add("TERCER AÑO");
			listMateria
					.add("B15. Literatura Latinoamericana II.");
			listMateria.add("B16. Literatura Argentina I.");
			listMateria.add("B17. Historia de la Lengua.");
			listMateria.add("B18. Griego I.");
			listMateria.add("P03. Didáctica.");
			listMateria.add("B19. Literatura Argentina II.");
			listMateria.add("B20. Literatura Europea II.");
			listMateria.add("B21. Griego II.");
			listMateria.add("CUARTO AÑO");
			listMateria.add("B22. Lógica.");
			listMateria.add("B23. Antropología Filosófica.");
			listMateria
					.add(
							"B23. Lengua Extranjera Moderna Nivel I: Inglés I - Francés I.");
			listMateria
					.add(
							"B23. Lengua Extranjera Moderna Nivel II: Inglés II - Francés II.");
			listMateria.add("P05. Práctica y Residencia.");
			listMateria.add("ASIGNATURAS DE LA LICENCIATURA");
			listMateria.add("PRIMER AÑO");
			listMateria.add("B01. Introducción a la Literatura.");
			listMateria
					.add(
							"B02. Introducción a la Historia: Historia Social y del Arte.");
			listMateria.add("B03. Filosofía.");
			listMateria.add("B04. Gramática I.");
			listMateria.add("B05. Latín I.");
			listMateria.add("B06. Gramática II.");
			listMateria.add("B07. Latín II.");
			listMateria.add("B08. Literaturas Clásicas.");
			listMateria.add("SEGUNDO AÑO");
			listMateria.add("B09. Lingüística.");
			listMateria.add("B10. Literatura Española I.");
			listMateria.add("B11. Teoría y Crítica Literaria.");
			listMateria.add("B12. Literatura Española II.");
			listMateria.add("B13. Literatura Europea I.");
			listMateria.add("B14. Literatura Latinoamericana I.");
			listMateria.add("TERCER AÑO");
			listMateria
					.add("B15. Literatura Latinoamericana II.");
			listMateria.add("B16. Literatura Argentina I.");
			listMateria.add("B17. Historia de la Lengua.");
			listMateria.add("B18. Griego I.");
			listMateria.add("B19. Literatura Argentina II.");
			listMateria.add("B20. Literatura Europea II.");
			listMateria.add("B21. Griego II.");
			listMateria.add("CUARTO AÑO");
			listMateria.add("B22. Lógica.");
			listMateria.add("B23. Antropología Filosófica.");
			listMateria.add("L02. Taller Literario.");
			listMateria.add("L05. Literatura del NOA.");
			listMateria
					.add(
							"L05. Lengua Extranjera Moderna Nivel I: Inglés I - Francés I.");
			listMateria
					.add(
							"L05. Lengua Extranjera Moderna Nivel II: Inglés II - Francés II.");
			listMateria.add("QUINTO AÑO");
			listMateria.add(
					"L01. Metodología de la Investigación.");
			listMateria.add("L03. Filosofía del Lenguaje.");
			listMateria
					.add("L04. Teoría y Crítica Literaria II.");
			listMateria.add(
					"L06. Seminario Vinculado a Temáticas Literarias:");
			listMateria.add("L07. Narrativa Contemporánea.");
			listMateria.add("L07. Literatura Norteamericana.");
			listMateria.add("L07. Literatura del NOA.");
			listMateria.add("L07. Literatura Folclórica.");
			listMateria
					.add("L07. Teatro Contemporáneo Argentino.");
			listMateria
					.add(
							"L07. Seminario Vinculado a Temáticas Lingüísticas, Semánticas o Gramaticales.");
			listMateria.add("L07. Nuevos Temas de la Gramática.");
			listMateria.add("L07. Semiótica.");
			listMateria.add("L07. TESINA FINAL.");

		}
			;
			break;
		case 7: {
			// LICENCIADO EN TRABAJO SOCIAL
			listMateria.add("ASIGNATURAS");
			listMateria.add("Trabajo Social V");
			listMateria
					.add("Planeamiento y Planificación Social");
			listMateria.add("Historia Social");
			listMateria.add("Antropología Social y Cultural");
			listMateria.add(
					"Organización y Administración del Bienestar Social");
			listMateria.add("Psicología Social");
			listMateria.add("Supervisión y Ética Profesional");
			listMateria
					.add(
							"Optativa: Sociedades Campesinas o Antropología de las Sociedades Complejas");
			listMateria
					.add(
							"Optativa: Metodologías de la Investigación o Teoría e Investigación en Antropología Social");
			listMateria.add("Seminario de orientación");
			listMateria.add("Seminario de orientación");
			listMateria.add("Seminario de orientación");
			listMateria.add("Seminario de orientación");
			listMateria.add("Tesis de Licenciatura");
		}
			;
			break;
		case 8: {
			// Licenciatura en Educación para la Salud
			listMateria.add("PRIMER AÑO ");
			listMateria.add(
					"1. Introducción a la educación para la salud");
			listMateria.add("2. Psicología evolutiva");
			listMateria.add("3. Antropología filosófica");
			listMateria.add("4. Ecología humana");
			listMateria.add("5. Psicología social");
			listMateria.add("6. Pedagogía");
			listMateria.add("7. Antropología social y cultura.");
			listMateria.add("SEGUNDO AÑO ");
			listMateria.add("8. Problemática sanitaria");
			listMateria.add("9. Comunicación");
			listMateria.add("10. Didáctica");
			listMateria.add("11. Salud y salud publica");
			listMateria.add("12. Tecnología educativa");
			listMateria.add("13. Epidemiología y estadística");
			listMateria.add("TERCER AÑO ");
			listMateria.add("14. Problemática sanitaria II");
			listMateria.add("15. Investigación social");
			listMateria.add(
					"16. Planeamiento de la educación para la salud");
			listMateria.add("17. Informática");
			listMateria.add(
					"18. Organización y des. De la comunidad");
			listMateria.add("19. Legislación aplicada");
			listMateria.add("20. Salud ocupacional");
			listMateria.add("CUARTO AÑO");
			listMateria.add("Trabajo de Campo y Residencia");
			listMateria.add(
					"Obtención del título de EDUCADOR SANITARIO");
			listMateria.add("QUINTO AÑO");
			listMateria.add(
					"Seminario de Integración Metodológica");
			listMateria
					.add("Trabajo de Campo con Proyecto Final");
			listMateria
					.add(
							"Obtención del título de LICENCIADO EN EDUCACION PARA LA SALUD");

		}
			;
			break;
		case 9: {
			// Educador Sanitario
			listMateria.add("PRIMER AÑO ");
			listMateria.add(
					"1. Introducción a la educación para la salud");
			listMateria.add("2. Psicología evolutiva");
			listMateria.add("3. Antropología filosófica");
			listMateria.add("4. Ecología humana");
			listMateria.add("5. Psicología social");
			listMateria.add("6. Pedagogía");
			listMateria.add("7. Antropología social y cultura.");
			listMateria.add("SEGUNDO AÑO ");
			listMateria.add("8. Problemática sanitaria");
			listMateria.add("9. Comunicación");
			listMateria.add("10. Didáctica");
			listMateria.add("11. Salud y salud publica");
			listMateria.add("12. Tecnología educativa");
			listMateria.add("13. Epidemiología y estadística");
			listMateria.add("TERCER AÑO ");
			listMateria.add("14. Problemática sanitaria II");
			listMateria.add("15. Investigación social");
			listMateria.add(
					"16. Planeamiento de la educación para la salud");
			listMateria.add("17. Informática");
			listMateria.add(
					"18. Organización y des. De la comunidad");
			listMateria.add("19. Legislación aplicada");
			listMateria.add("20. Salud ocupacional");
			listMateria.add("CUARTO AÑO");
			listMateria.add("Trabajo de Campo y Residencia");
			listMateria.add(
					"Obtención del título de EDUCADOR SANITARIO");

		}
			;
			break;

		case 10: {

			// Ciclo Superior de Licenciatura en Filosofía
			listMateria.add("ASIGNATURAS");
			listMateria.add("Latín I o Griego I");
			listMateria.add("Latín II o Griego II");
			listMateria.add("Epistemología");
			listMateria.add(
					"Metodología de la investigación filosófica");
			listMateria.add("Filosofía del lenguaje");
			listMateria.add("Problemas especiales de ética");
			listMateria.add("Lógica superior");
			listMateria.add("Antropología filosófica");
			listMateria.add("Teoría social y política");
			listMateria.add("Filosofía de la historia");
			listMateria.add(
					"Seminario: pensamiento argentino y latinoamericano");
			listMateria.add("Economía política");
			listMateria.add("Sociología de la educación");
			listMateria
					.add(
							"Optativa I: Área de formación histórico-social (a elegir entre)");
			listMateria.add(
					"-Antropología de las sociedades complejas");
			listMateria.add("-Historia social");
			listMateria.add("-Historia social de la cultura");
			listMateria.add("-Antropología social y cultural");
			listMateria.add(
					"-Historia de la educación argentina y latinoamericana");
			listMateria.add(
					"-Organización y desarrollo de la comunidad");
			listMateria
					.add(
							"-Indicadores económicos y sociales nacionales y de la provincia de Jujuy");
			listMateria
					.add(
							"-Historia política social y económica de América y argentina");
			listMateria.add(
					"Optativa II: Área de formación metodológica.");
			listMateria.add("-Investigación social");
			listMateria.add(
					"-Fuentes de información y documentación");
			listMateria.add("-Análisis institucional");
			listMateria.add("-Semiótica");
			listMateria.add(
					"-Teoría e investigación en antropología social");
			listMateria.add(
					"Proyecto Final (Trabajo de Campo e Investigación)");

		}
			;
			break;
		}
		
		logger.debug("listMateria load size : "+listMateria.size());

		return listMateria;
	}
	
	
	
}
