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
		
		  listMateria.add("Primer A�o");
		listMateria.add("�lgebra y Geometr�a Anal�tica");
	    listMateria.add( "An�lisis Matem�tico");
        listMateria.add("Bot�nica General"); 		
		listMateria.add("Bot�nica Sistem�tica");
		listMateria.add("Qu�mica General e Inorg�nica");
		listMateria.add("Qu�mica Org�nica");
		listMateria.add("F�sica");
		listMateria.add("M�dulo I");
		//2 a�o
		listMateria.add("Bioestad�stica y Dise�o Experimental");
		listMateria.add("Qu�mica Biol�gica");	
        listMateria.add("Qu�mica Agr�cola");	
        listMateria.add("Econom�a General");	
        listMateria.add("Microbiolog�a Agr�cola");	
        listMateria.add("Topograf�a");	
        listMateria.add("Agroclimatolog�a");
        //3 a�o
        listMateria.add("Fisiolog�a Vegetal");	
        listMateria.add("Zoolog�a Agr�cola");	
        listMateria.add("Fitopatolog�a");	
        listMateria.add("Edafolog�a");	
        listMateria.add("Gen�tica");	
        listMateria.add("Mecanizaci�n Agr�cola");	
        listMateria.add("Ecolog�a Agr�cola");	
        listMateria.add("Econom�a Agraria");	
        listMateria.add("M�dulo II");	
        //4 a�o
        listMateria.add(25,"Manejo del Suelo y Riego");	
        listMateria.add(26,"Protecci�n Vegetal");	
        listMateria.add(27,"Granos y Forrajes");	
        listMateria.add(28,"Producci�n Animal I");	
        listMateria.add(29,"Dasonom�a");	
        listMateria.add(30,"Mejoramiento Gen�tico");
        
        //5to a�o
        listMateria.add(31,"Administraci�n Agraria");	
        listMateria.add(32,"Horticultura y Floricultura");	
        listMateria.add(33,"Cultivos Industriales");	
        listMateria.add(34,"Fruticultura");	
        listMateria.add(35,"Producci�n Animal II");	
        listMateria.add(36,"Legislaci�n Agraria");	
        listMateria.add(37,"Extensi�n Rural");	
        listMateria.add(38,"M�dulo III");	
        listMateria.add(39,"Pasant�a con Trabajo Final");
        
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
			listMateria.add("PRIMER A�O");
			listMateria.add(
					"1. Teor�a y Problem�tica de la Comunicaci�n Social");
			listMateria.add("2. Historia Social de la Cultura");
			listMateria.add("3. Filosof�a y su problem�tica");
			listMateria
					.add(
							"4. Taller de Comprensi�n y Producci�n del Texto Period�stico");
			listMateria.add("5. Psicolog�a Social");
			listMateria.add(
					"6. Fuentes de Informaci�n y Documentaci�n (seminario)");
			listMateria.add(
					"7. Introducci�n a la Problem�tica Period�stica");
			listMateria.add("8. Taller de Producci�n Gr�fica");

			listMateria.add("SEGUNDO A�O");
			listMateria.add(
					"9. Tecnolog�a de la Comunicaci�n Social (seminario)");
			listMateria.add(
					"10. Ling��stica y principios de Semiolog�a");
			listMateria.add(
					"11. Taller de Redacci�n Period�stica");
			listMateria
					.add(
							"12. Taller optativo: Producci�n Televisiva 1, Tecnolog�a y Producci�n Radiof�nica 1, Taller de Fotograf�a 1.");
			listMateria.add(
					"13. Sociolog�a de la Comunicaci�n Social");
			listMateria
					.add(
							"14. Geograf�a Econ�mica y Pol�tica Americana y Argentina");
			listMateria.add(
					"15. Taller de Publicidad y Propaganda");
			listMateria
					.add(
							"16. Taller optativo: Producci�n Televisiva 2, Tecnolog�a y Producci�n Radiof�nica 2, Taller de Fotograf�a 2");

			listMateria.add("TERCER A�O");
			listMateria
					.add(
							"17. Econom�a Pol�tica y Problem�tica Econ�mica Argentina");
			listMateria
					.add("18. Antropolog�a Social y Cultural");
			listMateria.add("19. Taller de Semi�tica");
			listMateria
					.add(
							"20. Historia Pol�tica, Econ�mica y Social de Am�rica y Argentina");
			listMateria.add("21. Estad�stica");
			listMateria.add("22. An�lisis del Discurso");
			listMateria.add("23. Epistemolog�a");
			listMateria.add("Ingles 1");
			listMateria.add("Ingles 2");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 1");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 2");
			listMateria.add(
					"TITULO INTERMEDIO: T�CNICO EN COMUNICACI�N SOCIAL");
			listMateria.add("CUARTO A�O");
			listMateria.add(
					"24. Teor�a y Problem�tica de la Comunicaci�n Social II");
			listMateria.add(
					"25. Planificaci�n en Comunicaci�n Social ");
			listMateria.add(
					"26. Metodolog�a de la Investigaci�n ");
			listMateria
					.add(
							"27. An�lisis de la Realidad Contempor�nea Comunicacional (Seminario)");
			listMateria.add(
					"28. Comunicaci�n y Educaci�n (Seminario) ");
			listMateria.add(
					"29. Comunicaci�n Alternativa (Seminario) ");
			listMateria.add(
					"30. �tica y Legislaci�n de la Informaci�n ");
			listMateria.add(
					"31. Seminarios de Formaci�n Espec�fica ");
			listMateria.add("32. RESIDENCIA PROFESIONAL");
			listMateria
					.add(
							"El licenciado deber� elaborar un Trabajo de Tesis Final con el fin de acreditar la eficiencia de su formaci�n para el desempe�o profesional.");
			listMateria.add(
					"TITULO DE GRADO: LICENCIADO EN COMUNICACI�N SOCIAL");

		}
			;
			break;

		case 2: { // TECNICO EN COMUNICACION SOCIAL
			// licenciado en comunicacion social
			listMateria.add("PRIMER A�O");
			listMateria.add("1. Teor�a y Problem�tica de la Comunicaci�n Social");
			listMateria.add("2. Historia Social de la Cultura");
			listMateria.add("3. Filosof�a y su problem�tica");
			listMateria.add(
							"4. Taller de Comprensi�n y Producci�n del Texto Period�stico");
			listMateria.add("5. Psicolog�a Social");
			listMateria.add(
					"6. Fuentes de Informaci�n y Documentaci�n (seminario)");
			listMateria.add(
					"7. Introducci�n a la Problem�tica Period�stica");
			listMateria.add("8. Taller de Producci�n Gr�fica");

			listMateria.add("SEGUNDO A�O");
			listMateria.add(
					"9. Tecnolog�a de la Comunicaci�n Social (seminario)");
			listMateria.add(
					"10. Ling��stica y principios de Semiolog�a");
			listMateria.add(
					"11. Taller de Redacci�n Period�stica");
			listMateria
					.add(
							"12. Taller optativo: Producci�n Televisiva 1, Tecnolog�a y Producci�n Radiof�nica 1, Taller de Fotograf�a 1.");
			listMateria.add(
					"13. Sociolog�a de la Comunicaci�n Social");
			listMateria
					.add(
							"14. Geograf�a Econ�mica y Pol�tica Americana y Argentina");
			listMateria.add(
					"15. Taller de Publicidad y Propaganda");
			listMateria
					.add(
							"16. Taller optativo: Producci�n Televisiva 2, Tecnolog�a y Producci�n Radiof�nica 2, Taller de Fotograf�a 2");

			listMateria.add("TERCER A�O");
			listMateria
					.add(
							"17. Econom�a Pol�tica y Problem�tica Econ�mica Argentina");
			listMateria
					.add("18. Antropolog�a Social y Cultural");
			listMateria.add("19. Taller de Semi�tica");
			listMateria
					.add(
							"20. Historia Pol�tica, Econ�mica y Social de Am�rica y Argentina");
			listMateria.add("21. Estad�stica");
			listMateria.add("22. An�lisis del Discurso");
			listMateria.add("23. Epistemolog�a");
			listMateria.add("Ingles 1");
			listMateria.add("Ingles 2");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 1");
			listMateria.add(
					"Otro Idioma extranjero moderno. Nivel 2");
			listMateria.add(
					"TITULO INTERMEDIO: T�CNICO EN COMUNICACI�N SOCIAL");
		}
			;
			break;

		case 3: {
			// Prof. y Lic. en Ciencias de la Educaci�n

			listMateria.add("PRIMER A�O");
			listMateria.add("1. Pensamiento Cient�fico");
			listMateria.add("2. Problem�tica Educativa");
			listMateria.add("3. Problem�tica Filos�fica");
			listMateria.add("4. Sociolog�a General");
			listMateria.add(
					"5. M�dulo Optativo del �rea Socio Cultural ");
			listMateria.add("6. Psicolog�a General");
			listMateria.add("SEGUNDO A�O");
			listMateria.add("7. Econom�a");
			listMateria.add("8. Biolog�a del Aprendizaje");
			listMateria.add("9. Historia Social de la Educaci�n");
			listMateria.add("10. Epistemolog�a");
			listMateria.add("11. Sociolog�a de la Educaci�n");
			listMateria.add("12. Psicolog�a Evolutiva l");
			listMateria.add("TERCER A�O");
			listMateria.add("13. Psicolog�a Evolutiva II");
			listMateria.add("14. Psicolog�a Educacional");
			listMateria
					.add(
							"15. Historia de la Educaci�n Argentina y Latinoamericana");
			listMateria.add(
					"16. Pol�tica Educacional y Legislaci�n");
			listMateria.add("17. Filosof�a de la Educaci�n");
			listMateria.add("18. Did�ctica General");
			listMateria.add("19. Psicolog�a Social");
			listMateria.add("CUARTO A�O");
			listMateria.add(
					"20. Teor�a y Metodolog�a de la Investigaci�n Educativa");
			listMateria.add("21. Planeamiento de la Educaci�n");
			listMateria.add(
					"22. Did�ctica de las �reas Disciplinares");
			listMateria.add(
					"23. Teor�as y Desarrollo del Curriculum");
			listMateria.add(
					"24. Organizaci�n y Administraci�n Educacional");
			listMateria.add(
					"25. M�dulo Optativo del �rea Comunicacional ");
			listMateria.add("26. An�lisis Institucional");
			listMateria.add("QUINTO A�O");
			listMateria.add("27. Dificultades del Aprendizaje");
			listMateria.add("28. Educaci�n Especial");
			listMateria.add(
					"29. Orientaci�n e Intervenci�n pedag�gica Institucional");
			listMateria.add("30. Educaci�n No Formal");
			listMateria
					.add("31. Universidad y Formaci�n Docente");
			listMateria.add(
					"32. PR�CTICA Y RESIDENCIA (PARA EL T�TULO DE PROFESOR)");

		}
			;
			break;

		case 4: {
			// Licenciatura en Antropolog�a

			listMateria.add(
					"01. Introducci�n a las Ciencias Antropol�gicas.");
			listMateria.add("02. Antropolog�a Biol�gica I");
			listMateria.add("03. Geolog�a del Cuaternario.");
			listMateria
					.add("04. Antropolog�a Social y Cultural.");
			listMateria.add("05. Prehistoria General.");
			listMateria.add("06. Etnograf�a Americana.");
			listMateria.add(
					"07. Teor�a e Historia de la Antropolog�a");
			listMateria.add("08. Arqueolog�a Americana.");
			listMateria.add("09. Sociedades Campesinas");
			listMateria
					.add("10. Organizaci�n Social y Parentesco");
			listMateria.add("11. Antropolog�a Biol�gica II");
			listMateria
					.add(
							"12. Metodolog�a y T�cnicas de la Investigaci�n Arqueol�gica");
			listMateria.add("13. Arqueolog�a Argentina");
			listMateria.add(
					"14. Fundamentos de An�lisis Matem�tico");
			listMateria.add(
					"15. Teor�a e Investigaci�n en Antropolog�a Social.");
			listMateria.add("16. Etnohistoria.");
			listMateria.add("17. Ling��stica General.");
			listMateria.add(
					"18. Antropolog�a de las Sociedades Complejas.");
			listMateria.add("19. Estad�stica.");
			listMateria.add("20. Optativa");
			listMateria.add("21. Optativa");
			listMateria.add("22. Optativa");
			listMateria.add("Filosof�a y su problem�tica");
			listMateria.add("Sociolog�a General");
			listMateria.add("Psicolog�a Social");
			listMateria.add("Fundamentos de Matem�tica");
			listMateria.add("Biolog�a del Aprendizaje");
			listMateria.add("Sociolog�a de la educaci�n");
			listMateria.add("Psicolog�a General");
			listMateria.add("Historia Social");
			listMateria.add("Antropolog�a Filos�fica");
			listMateria.add("Epistemolog�a");
			listMateria.add("Econom�a");
			listMateria.add("Primer Nivel de Ingl�s T�cnico");
			listMateria.add("Segundo Nivel de Ingl�s T�cnico");
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
			// Auxiliar t�cnico en antropolog�

			listMateria.add(
					"01. Introducci�n a las Ciencias Antropol�gicas.");
			listMateria.add("02. Antropolog�a Biol�gica I");
			listMateria.add("03. Geolog�a del Cuaternario.");
			listMateria
					.add("04. Antropolog�a Social y Cultural.");
			listMateria.add("05. Prehistoria General.");
			listMateria.add("06. Etnograf�a Americana.");
			listMateria.add(
					"07. Teor�a e Historia de la Antropolog�a");
			listMateria.add("08. Arqueolog�a Americana.");
			listMateria.add("09. Sociedades Campesinas");
			listMateria
					.add("10. Organizaci�n Social y Parentesco");
			listMateria.add("11. Antropolog�a Biol�gica II");
			listMateria
					.add(
							"12. Metodolog�a y T�cnicas de la Investigaci�n Arqueol�gica");
			listMateria.add("13. Arqueolog�a Argentina");
			listMateria.add(
					"14. Fundamentos de An�lisis Matem�tico");
			listMateria.add(
					"15. Teor�a e Investigaci�n en Antropolog�a Social.");
			listMateria.add("16. Etnohistoria.");
			listMateria.add("17. Ling��stica General.");
			listMateria.add(
					"18. Antropolog�a de las Sociedades Complejas.");
			listMateria.add("19. Estad�stica.");
			listMateria.add("20. Optativa");
			listMateria.add("21. Optativa");
			listMateria.add("22. Optativa");
			listMateria.add("Filosof�a y su problem�tica");
			listMateria.add("Sociolog�a General");
			listMateria.add("Psicolog�a Social");
			listMateria.add("Fundamentos de Matem�tica");
			listMateria.add("Biolog�a del Aprendizaje");
			listMateria.add("Sociolog�a de la educaci�n");
			listMateria.add("Psicolog�a General");
			listMateria.add("Historia Social");
			listMateria.add("Antropolog�a Filos�fica");
			listMateria.add("Epistemolog�a");
			listMateria.add("Econom�a");
			listMateria.add("Primer Nivel de Ingl�s T�cnico");
			listMateria.add("Segundo Nivel de Ingl�s T�cnico");
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
			listMateria.add("PRIMER A�O");
			listMateria.add("B01. Introducci�n a la Literatura.");
			listMateria
					.add(
							"B02. Introducci�n a la Historia: Historia Social y del Arte.");
			listMateria.add("B03. Filosof�a.");
			listMateria.add("B04. Gram�tica I.");
			listMateria.add("B05. Lat�n I.");
			listMateria.add("B06. Gram�tica II.");
			listMateria.add("B07. Lat�n II.");
			listMateria.add("B08. Literaturas Cl�sicas.");
			listMateria.add("SEGUNDO A�O");
			listMateria.add("B09. Ling��stica.");
			listMateria.add("B10. Literatura Espa�ola I.");
			listMateria.add("B11. Teor�a y Cr�tica Literaria.");
			listMateria.add("P02. Psicolog�a.");
			listMateria.add(
					"P01. Pedagog�a, Organizaci�n y Administraci�n Escolar.");
			listMateria.add("B12. Literatura Espa�ola II.");
			listMateria.add("B13. Literatura Europea I.");
			listMateria.add("B14. Literatura Latinoamericana I.");
			listMateria.add("P04. Psicolog�a Evolutiva.");
			listMateria.add("TERCER A�O");
			listMateria
					.add("B15. Literatura Latinoamericana II.");
			listMateria.add("B16. Literatura Argentina I.");
			listMateria.add("B17. Historia de la Lengua.");
			listMateria.add("B18. Griego I.");
			listMateria.add("P03. Did�ctica.");
			listMateria.add("B19. Literatura Argentina II.");
			listMateria.add("B20. Literatura Europea II.");
			listMateria.add("B21. Griego II.");
			listMateria.add("CUARTO A�O");
			listMateria.add("B22. L�gica.");
			listMateria.add("B23. Antropolog�a Filos�fica.");
			listMateria
					.add(
							"B23. Lengua Extranjera Moderna Nivel I: Ingl�s I - Franc�s I.");
			listMateria
					.add(
							"B23. Lengua Extranjera Moderna Nivel II: Ingl�s II - Franc�s II.");
			listMateria.add("P05. Pr�ctica y Residencia.");
			listMateria.add("ASIGNATURAS DE LA LICENCIATURA");
			listMateria.add("PRIMER A�O");
			listMateria.add("B01. Introducci�n a la Literatura.");
			listMateria
					.add(
							"B02. Introducci�n a la Historia: Historia Social y del Arte.");
			listMateria.add("B03. Filosof�a.");
			listMateria.add("B04. Gram�tica I.");
			listMateria.add("B05. Lat�n I.");
			listMateria.add("B06. Gram�tica II.");
			listMateria.add("B07. Lat�n II.");
			listMateria.add("B08. Literaturas Cl�sicas.");
			listMateria.add("SEGUNDO A�O");
			listMateria.add("B09. Ling��stica.");
			listMateria.add("B10. Literatura Espa�ola I.");
			listMateria.add("B11. Teor�a y Cr�tica Literaria.");
			listMateria.add("B12. Literatura Espa�ola II.");
			listMateria.add("B13. Literatura Europea I.");
			listMateria.add("B14. Literatura Latinoamericana I.");
			listMateria.add("TERCER A�O");
			listMateria
					.add("B15. Literatura Latinoamericana II.");
			listMateria.add("B16. Literatura Argentina I.");
			listMateria.add("B17. Historia de la Lengua.");
			listMateria.add("B18. Griego I.");
			listMateria.add("B19. Literatura Argentina II.");
			listMateria.add("B20. Literatura Europea II.");
			listMateria.add("B21. Griego II.");
			listMateria.add("CUARTO A�O");
			listMateria.add("B22. L�gica.");
			listMateria.add("B23. Antropolog�a Filos�fica.");
			listMateria.add("L02. Taller Literario.");
			listMateria.add("L05. Literatura del NOA.");
			listMateria
					.add(
							"L05. Lengua Extranjera Moderna Nivel I: Ingl�s I - Franc�s I.");
			listMateria
					.add(
							"L05. Lengua Extranjera Moderna Nivel II: Ingl�s II - Franc�s II.");
			listMateria.add("QUINTO A�O");
			listMateria.add(
					"L01. Metodolog�a de la Investigaci�n.");
			listMateria.add("L03. Filosof�a del Lenguaje.");
			listMateria
					.add("L04. Teor�a y Cr�tica Literaria II.");
			listMateria.add(
					"L06. Seminario Vinculado a Tem�ticas Literarias:");
			listMateria.add("L07. Narrativa Contempor�nea.");
			listMateria.add("L07. Literatura Norteamericana.");
			listMateria.add("L07. Literatura del NOA.");
			listMateria.add("L07. Literatura Folcl�rica.");
			listMateria
					.add("L07. Teatro Contempor�neo Argentino.");
			listMateria
					.add(
							"L07. Seminario Vinculado a Tem�ticas Ling��sticas, Sem�nticas o Gramaticales.");
			listMateria.add("L07. Nuevos Temas de la Gram�tica.");
			listMateria.add("L07. Semi�tica.");
			listMateria.add("L07. TESINA FINAL.");

		}
			;
			break;
		case 7: {
			// LICENCIADO EN TRABAJO SOCIAL
			listMateria.add("ASIGNATURAS");
			listMateria.add("Trabajo Social V");
			listMateria
					.add("Planeamiento y Planificaci�n Social");
			listMateria.add("Historia Social");
			listMateria.add("Antropolog�a Social y Cultural");
			listMateria.add(
					"Organizaci�n y Administraci�n del Bienestar Social");
			listMateria.add("Psicolog�a Social");
			listMateria.add("Supervisi�n y �tica Profesional");
			listMateria
					.add(
							"Optativa: Sociedades Campesinas o Antropolog�a de las Sociedades Complejas");
			listMateria
					.add(
							"Optativa: Metodolog�as de la Investigaci�n o Teor�a e Investigaci�n en Antropolog�a Social");
			listMateria.add("Seminario de orientaci�n");
			listMateria.add("Seminario de orientaci�n");
			listMateria.add("Seminario de orientaci�n");
			listMateria.add("Seminario de orientaci�n");
			listMateria.add("Tesis de Licenciatura");
		}
			;
			break;
		case 8: {
			// Licenciatura en Educaci�n para la Salud
			listMateria.add("PRIMER A�O ");
			listMateria.add(
					"1. Introducci�n a la educaci�n para la salud");
			listMateria.add("2. Psicolog�a evolutiva");
			listMateria.add("3. Antropolog�a filos�fica");
			listMateria.add("4. Ecolog�a humana");
			listMateria.add("5. Psicolog�a social");
			listMateria.add("6. Pedagog�a");
			listMateria.add("7. Antropolog�a social y cultura.");
			listMateria.add("SEGUNDO A�O ");
			listMateria.add("8. Problem�tica sanitaria");
			listMateria.add("9. Comunicaci�n");
			listMateria.add("10. Did�ctica");
			listMateria.add("11. Salud y salud publica");
			listMateria.add("12. Tecnolog�a educativa");
			listMateria.add("13. Epidemiolog�a y estad�stica");
			listMateria.add("TERCER A�O ");
			listMateria.add("14. Problem�tica sanitaria II");
			listMateria.add("15. Investigaci�n social");
			listMateria.add(
					"16. Planeamiento de la educaci�n para la salud");
			listMateria.add("17. Inform�tica");
			listMateria.add(
					"18. Organizaci�n y des. De la comunidad");
			listMateria.add("19. Legislaci�n aplicada");
			listMateria.add("20. Salud ocupacional");
			listMateria.add("CUARTO A�O");
			listMateria.add("Trabajo de Campo y Residencia");
			listMateria.add(
					"Obtenci�n del t�tulo de EDUCADOR SANITARIO");
			listMateria.add("QUINTO A�O");
			listMateria.add(
					"Seminario de Integraci�n Metodol�gica");
			listMateria
					.add("Trabajo de Campo con Proyecto Final");
			listMateria
					.add(
							"Obtenci�n del t�tulo de LICENCIADO EN EDUCACION PARA LA SALUD");

		}
			;
			break;
		case 9: {
			// Educador Sanitario
			listMateria.add("PRIMER A�O ");
			listMateria.add(
					"1. Introducci�n a la educaci�n para la salud");
			listMateria.add("2. Psicolog�a evolutiva");
			listMateria.add("3. Antropolog�a filos�fica");
			listMateria.add("4. Ecolog�a humana");
			listMateria.add("5. Psicolog�a social");
			listMateria.add("6. Pedagog�a");
			listMateria.add("7. Antropolog�a social y cultura.");
			listMateria.add("SEGUNDO A�O ");
			listMateria.add("8. Problem�tica sanitaria");
			listMateria.add("9. Comunicaci�n");
			listMateria.add("10. Did�ctica");
			listMateria.add("11. Salud y salud publica");
			listMateria.add("12. Tecnolog�a educativa");
			listMateria.add("13. Epidemiolog�a y estad�stica");
			listMateria.add("TERCER A�O ");
			listMateria.add("14. Problem�tica sanitaria II");
			listMateria.add("15. Investigaci�n social");
			listMateria.add(
					"16. Planeamiento de la educaci�n para la salud");
			listMateria.add("17. Inform�tica");
			listMateria.add(
					"18. Organizaci�n y des. De la comunidad");
			listMateria.add("19. Legislaci�n aplicada");
			listMateria.add("20. Salud ocupacional");
			listMateria.add("CUARTO A�O");
			listMateria.add("Trabajo de Campo y Residencia");
			listMateria.add(
					"Obtenci�n del t�tulo de EDUCADOR SANITARIO");

		}
			;
			break;

		case 10: {

			// Ciclo Superior de Licenciatura en Filosof�a
			listMateria.add("ASIGNATURAS");
			listMateria.add("Lat�n I o Griego I");
			listMateria.add("Lat�n II o Griego II");
			listMateria.add("Epistemolog�a");
			listMateria.add(
					"Metodolog�a de la investigaci�n filos�fica");
			listMateria.add("Filosof�a del lenguaje");
			listMateria.add("Problemas especiales de �tica");
			listMateria.add("L�gica superior");
			listMateria.add("Antropolog�a filos�fica");
			listMateria.add("Teor�a social y pol�tica");
			listMateria.add("Filosof�a de la historia");
			listMateria.add(
					"Seminario: pensamiento argentino y latinoamericano");
			listMateria.add("Econom�a pol�tica");
			listMateria.add("Sociolog�a de la educaci�n");
			listMateria
					.add(
							"Optativa I: �rea de formaci�n hist�rico-social (a elegir entre)");
			listMateria.add(
					"-Antropolog�a de las sociedades complejas");
			listMateria.add("-Historia social");
			listMateria.add("-Historia social de la cultura");
			listMateria.add("-Antropolog�a social y cultural");
			listMateria.add(
					"-Historia de la educaci�n argentina y latinoamericana");
			listMateria.add(
					"-Organizaci�n y desarrollo de la comunidad");
			listMateria
					.add(
							"-Indicadores econ�micos y sociales nacionales y de la provincia de Jujuy");
			listMateria
					.add(
							"-Historia pol�tica social y econ�mica de Am�rica y argentina");
			listMateria.add(
					"Optativa II: �rea de formaci�n metodol�gica.");
			listMateria.add("-Investigaci�n social");
			listMateria.add(
					"-Fuentes de informaci�n y documentaci�n");
			listMateria.add("-An�lisis institucional");
			listMateria.add("-Semi�tica");
			listMateria.add(
					"-Teor�a e investigaci�n en antropolog�a social");
			listMateria.add(
					"Proyecto Final (Trabajo de Campo e Investigaci�n)");

		}
			;
			break;
		}
		
		logger.debug("listMateria load size : "+listMateria.size());

		return listMateria;
	}
	
	
	
}
