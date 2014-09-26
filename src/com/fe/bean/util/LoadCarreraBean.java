package com.fe.bean.util;

import java.util.ArrayList;
import java.util.List;

import com.fe.model.Carrera;
import com.fe.model.Constants;

public class LoadCarreraBean {

	private List<Carrera> listCarrera;
	
	public LoadCarreraBean()
	{
		listCarrera=new ArrayList<Carrera>();
		
	}
	
	public List<Carrera>loadCarreraIngenieria()
	{
		//carrera de grado
		Carrera carrera=new Carrera();
		carrera.setId_carrera(2);
		carrera.setTitulo_carrera("INGENIER�A QU�MICA");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera(" Ingeniero Qu�mico");
		carrera.setPerfil_carrera("1. Desempe�arse eficaz y eficientemente en un �mbito tecnol�gico de"
				+ "complejidad creciente de permanente cambio."
				+ "2. Asumir responsablemente la preservaci�n del medio ambiente."
				+ "3. Desenvolverse en equipos multidisciplinarios."
				+ "4. Buscar, seleccionar, aprender y aplicar conocimientos nuevos y a�n"
				+ "abordar algunos no referidos espec�ficamente con su profesi�n. "
				+ "5. Prever, detectar y comprender los cambios de las condiciones externas,"
				+ "tanto tecnol�gicas como econ�micas, sociales y culturales, y producir"
				+ "respuestas apropiadas a ellos r�pidamente."
				+ "6. Encarar la b�squeda de las soluciones a los problemas tecnol�gicos "
				+ "sustent�ndose en las ciencias matem�ticas, f�sicas y qu�micas, y"
				+ "acompa��ndolas con criterio econ�mico, ambientalista y social. "
				+ "7. Ejercer su profesi�n con sentido �tico y responsabilidad social en la"
				+ "b�squeda del bienestar com�n.");
		carrera.setAlcance_carrera("1. Estudio, factibilidad, proyecto, direcci�n, construcci�n, instalaci�n,"+
 "inspecci�n, operaci�n y mantenimiento (excepto de obras civiles e"
				+ "industriales) de:"
				+ "2. Industrias que involucren procesos qu�micos, fisicoqu�micos, de"
				+ "bioingenier�a y sus instalaciones complementarias."
				+ "3. Instalaciones donde intervengan operaciones unitarias y/o procesos"
				+ "unitarios."
				+ "4. Instalaciones destinadas a evitar la contaminaci�n ambiental por"
				+ "efluentes de todo tipo originados por la industria y/o sus servicios."
				+ "5. Equipos, maquinarias, aparatos e instrumentos para las industrias"
				+ "indicadas en los incisos anteriores."
				+ "6. Estudios, tareas y asesoramientos relacionados con:"
				+ "7. Aspecto funcional de las construcciones industriales y de servicios"
				+ "indicados en el p�rrafo i) y sus obras e instalaciones complementarias."
				+ "8. Factibilidad del aprovechamiento e industrializaci�n de los recursos"
				+ "naturales y materias primas que sufran transformaci�n y elaboraci�n"
				+ "de nuevos productos."
				+ "9. Planificaci�n, programaci�n, direcci�n, organizaci�n, racionalizaci�n,"
				+ "control y optimizaci�n de los procesos industriales de las industrias"
				+ "citadas en el p�rrafo"
				+ "10. Asuntos de Ingenier�a Legal, Econ�mica y Financiera relacionados con"
				+ "los incisos anteriores.");
		
		carrera.setDuracion_carrera("5 a�os");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_INGENIERIA_ID);
	    
		listCarrera.add(carrera);
	   return listCarrera;
	}
	
	
	public List<Carrera>loadCarreraAgraria()
	{
		 
		//Carreras de Grado 
		Carrera carrera = new Carrera();
		carrera.setId_carrera(1);
		carrera.setTitulo_carrera("INGENIERIA AGRONOMICA");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera(" Ingeniero Agr�nomo");
		carrera.setPerfil_carrera("El Ingeniero Agr�nomo podr� desempe�arse a trav�s de sus conocimientos tecnol�gicos y cient�ficos en:"
				+ "Producci�n, conservaci�n, transformaci�n primaria, comercializaci�n y certificaci�n de productos agropecuarios."
				+ "Conservaci�n, recuperaci�n y aprovechamiento del ambiente natural."
				+ "Identificaci�n de problemas y evaluaci�n de soluciones alternativas a partir de un enfoque integral del sistema agrario y agroindustrial."
				+ "Participaci�n en la formulaci�n de pol�ticas para el sector agropecuario."
				+ "Generaci�n, adaptaci�n y/o modificaci�n de tecnolog�as compatibles con la disponibilidad de los recursos productivos."
				+ "Docencia e Investigaci�n Cient�fica en Instituciones P�blicas o Privadas."
				+ "Asesoramiento al sector agroalimentario en cuanto a administraci�n, cr�dito y desarrollo tecnol�gico.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera("5 a�os");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		
	
		
		listCarrera.add(carrera);
		////////////////////
		carrera =new Carrera();
		carrera.setId_carrera(2);
		carrera.setTitulo_carrera("LIC. EN CIENCIAS BIOLOGICAS");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera("Licenciado en Ciencias Biol�gicas ");
		carrera.setPerfil_carrera(
				"El profesional podr� desempe�arse en:"+
                "Trabajos de Investigaci�n b�sica aplicada en las distintas �reas de las Ciencias Biol�gicas."+
                "Planificaci�n y conducci�n de proyectos de investigaci�n biol�gica."+
                "Participaci�n en el estudio y desarrollo de procesos biotecnol�gicos."+
                "Realizaci�n de investigaci�n aplicada, dise�o y ejecuci�n de estrategias de aprovechamiento de los Recursos Naturales Renovables."+
                "Desarrollo de Proyectos tendientes a la conservaci�n del equilibrio ecol�gico."+
                "Intervenci�n en el dise�o y manejo de �reas protegidas."+
                "Investigaci�n sobre la incidencia de efluentes industriales en la contaminaci�n ambiental."+
                "Elaboraci�n, desarrollo, control y seguimiento de emprendimientos destinados al tratamiento de residuos o provenientes de cualquier tipo de actividad humana."+
                "Realiza actividades de peritaje en el �rea de las Ciencias Biol�gicas.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera("5 a�os");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		listCarrera.add(carrera);
		
		///////////////////////////
		carrera =new Carrera();
		carrera.setId_carrera(3);
		carrera.setTitulo_carrera("LIC. EN BROMATOLOGIA");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera("Licenciado en Bromatolog�a  ");
		carrera.setPerfil_carrera("A trav�s de su conocimiento el Licenciado en Bromatolog�a podr� desempe�arse en:"+
"Planificaci�n y supervisi�n de la sanidad e higiene de establecimientos y equipos relacionados a la producci�n y comercializaci�n de productos alimenticios."+
"Interpretaci�n de resultados de an�lisis y determinaci�n de calidad y aptitud para el consumo y la comercializaci�n de alimentos, en cuanto a origen, elaboraci�n y conservaci�n."+
"Docencia e investigaci�n cient�fica en Instituciones privadas u oficiales."+
"Trabajos en laboratorios para el an�lisis f�sico, qu�mico y biol�gico a los efectos de determinar el grado de contaminaci�n de las materias primas y los productos alimenticios.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera("4 1/2 A�os (Incluye Trabajo Final y Pr�ctica Profesional)     ");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		listCarrera.add(carrera);
		
		//////////////////////////////////
		carrera =new Carrera();
		carrera.setId_carrera(4);
		carrera.setTitulo_carrera("Bromat�logo");
		carrera.setNivel_carrera("T�tulo de PreGrado");
		carrera.setAcreditacion_carrera("Bromat�logo");
		carrera.setPerfil_carrera("A trav�s de su conocimiento el Licenciado en Bromatolog�a podr� desempe�arse en:"+
"Planificaci�n y supervisi�n de la sanidad e higiene de establecimientos y equipos relacionados a la producci�n y comercializaci�n de productos alimenticios."+
"Interpretaci�n de resultados de an�lisis y determinaci�n de calidad y aptitud para el consumo y la comercializaci�n de alimentos, en cuanto a origen, elaboraci�n y conservaci�n."+
"Docencia e investigaci�n cient�fica en Instituciones privadas u oficiales."+
"Trabajos en laboratorios para el an�lisis f�sico, qu�mico y biol�gico a los efectos de determinar el grado de contaminaci�n de las materias primas y los productos alimenticios.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera(" 3 1/2 A�os   ");
		carrera.setId_grado(Constants.CARRERA_PREGADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		listCarrera.add(carrera);
		
		return listCarrera;
	}
	
	
	public List<Carrera>loadCarreraCienciasSociales()
	{
		//Carreras de Grado 
		Carrera carrera=new Carrera();
		carrera.setId_carrera(1);
		carrera.setTitulo_carrera(" LICENCIADO EN COMUNICACION SOCIAL");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera(" Licenciado en Comunicaci�n Social (R.M. 1121/94)");
		carrera.setPerfil_carrera("Un Licenciado en Comunicaci�n Social estar� capacitado para:"+
"Dise�ar o implementar actividades de Comunicaci�n Social orientadas a la Comunidad para promover el desarrollo humano, social, educativo, preventivo, en �reas rurales y urbanas."+
"Organizar y coordinar campa�as de salud, proyectos de viviendas; pol�ticas, econ�micas y sociales en sindicatos y organizaciones intermedias."+
"Dise�ar campa�as publicitarias en empresas privadas y agencias de publicidad."+
"Realizar tareas de Docencia e Investigaci�n en Centros de investigaci�n y Formaci�n de Profesionales de los distintos niveles del Sistema Educativo."+
"Realizar, coordinar y dirigir actividades period�sticas en medios gr�ficos, audiovisuales y agencias noticiosas, tanto en la producci�n period�stica como en la evaluaci�n, selecci�n e interpretaci�n de la informaci�n."+
"Comprender acciones tendientes al diagn�stico, planificaci�n y dise�o de pol�ticas y estrategias de Comunicaci�n Social a nivel nacional, regional y zonal en organizaciones gubernamentales, privadas y no gubernamentales.");
	 carrera.setAlcance_carrera(null);
	 carrera.setDuracion_carrera("5 a�os");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
	 listCarrera.add(carrera);
	 //////////////////////////////////////
		carrera = new Carrera();
		carrera.setId_carrera(2);
		carrera.setTitulo_carrera("TECNICO EN COMUNICACION SOCIAL");
		carrera.setNivel_carrera("T�tulo de PreGrado");
		carrera.setAcreditacion_carrera("T�cnico en Comunicaci�n Social (R.M. 1121/94)");
		carrera.setPerfil_carrera("Un T�cnico en Comunicaci�n Social estar� capacitado para:"
				+ "Desempe�arse en Peri�dicos y Revistas, en cargos como los de Corrector de Pruebas, Diagramador, Cronista Gr�fico, Cronista Redactor, Corresponsal, Jefe de Noticias, Jefe de Redacci�n, Secretario de Redacci�n, Editorialista, Colaborador."
				+ "Trabajar en Radio y Televisi�n en car�cter de: Reportero, Redactor-locutor, Corresponsal, Jefe de Noticias, Jefe de Redacci�n, Editorialista. "
				+ "Ejercer tareas en el �mbito de la Administraci�n P�blica como: Redactor, Jefe o Encargado de prensa a nivel de Gobierno Nacional, Gobierno Provincial, Municipalidades y Universidades: asimismo Agregado de Prensa en Embajadas y Legaciones."
				+ "Desempe�ar tareas en la actividad privada, es el campo de la Comunicaci�n Intermedia y en el de la Comunicaci�n Social en: empresas, gremios, bancos, centros vecinales, instituciones de bien p�blico y deportivo."
				+ "Ejercer tareas en las Agencias Noticiosas locales, Nacionales e Internacionales, desempe��ndose como Reportero, Corresponsal, Redactor, Cronista Gr�fico o colaborador."
				+ "Desempe�ar tareas en corresponsal�as de Agencias Noticiosas, Diarios, Peri�dicos, Radios y Televisi�n.");
		carrera.setAlcance_carrera("");
		carrera.setDuracion_carrera("3 a�os");
		carrera.setId_grado(Constants.CARRERA_PREGADO);
		carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
		listCarrera.add(carrera);
    
		
	
    carrera=new Carrera();
    carrera.setId_carrera(3);
    carrera.setTitulo_carrera("PROF . Y LIC. EN CIENCIAS DE LA EDUCACION");
    carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera("Profesor en Ciencias de la Educaci�n (R.M. 2032/84 y R.M. 1076/98 - se accede cursando el m�dulo de Residencia)"
				+ "Licenciado en Ciencias de la Educaci�n (R.M. R.M.2032/84, R.M. 1076/98, R.M. 0521/99, R.M.0552/05 - se accede cursando el m�dulo de trabajo de campo e investigaci�n).");
		carrera.setPerfil_carrera("");
		carrera.setAlcance_carrera("Planificar, conducir y evaluar procesos de ense�anza-aprendizaje para la educaci�n formal, no formal e informal; presencial y a distancia."
				+ "Elaborar y evaluar modelos y propuestas curriculares, a nivel macro y micro educativo, para la educaci�n formal, no formal e informal; presencial y a distancia."
				+ "Dise�ar, dirigir, ejecutar y evaluar planes, programas y proyectos y culturales."
				+ "Elaborar, ejecutar y evaluar modelos y dise�os de administraci�n educacional."
				+ "Dise�ar, dirigir, ejecutar y evaluar proyectos de investigaci�n educativa."
				+ "Dise�ar, producir y evaluar materiales educativos de distinta tecnol�gica."
				+ "Planificar, conducir y evaluar programas de formaci�n, perfeccionamiento y actualizaci�n, para el desempe�o de los distintos roles educativos."
				+ "Dise�ar, dirigir, ejecutar y evaluar programas y proyectos destinados a la capacitaci�n de recursos humanos."
				+ "Planificar, conducir y evaluar procesos de ense�anza-aprendizaje destinados a personas con necesidades especiales."
				+ "Elaborar, ejecutar y evaluar planes, programas y proyectos y acciones de prevenci�n y asistencia psicopedag�gica, destinados a personas con dificultades de aprendizaje."
				+ "Elaborar, ejecutar y evaluar planes, programas y proyectos de informaci�n y orientaci�n educacional, vocacional y ocupacional."
				+ "Administrar y organizar unidades y servicios educativos y pedag�gicos."
				+ "Asesorar en la formulaci�n de pol�ticas educativas y culturales."
				+ "Asesorar en la elaboraci�n de normas jur�dicas en materia educativa y las inherentes a la actividad profesional."
				+ "Brindar asesoramiento pedag�gico a instituciones educativas y comunitarias."
				+ "Participar, desde la perspectiva educativa, en la elaboraci�n, ejecuci�n y evaluaci�n de planes, programas y proyectos de acci�n sociocultural en comunidades."
				+ "Asesorar en la formulaci�n de criterios y normas destinadas a promover la dimensi�n educativa de los medios de comunicaci�n social."
				+ "Asesorar para el dise�o y planeamiento de los espacios y de la infraestructura  destinados a actividades educativas, recreativas y culturales.");
		carrera.setDuracion_carrera("");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
		listCarrera.add(carrera);

     carrera=new Carrera();
     carrera.setId_carrera(4);
     carrera.setTitulo_carrera("LICENCIADO EN ANTROPOLOGIA");
     carrera.setNivel_carrera("T�tulo de Grado");
     carrera.setAcreditacion_carrera("Licenciado en Antropolog�a (R.M. 2034/84 - R.M. 2269/98). 10 cuatrimestres");
     carrera.setPerfil_carrera("");
     carrera.setAlcance_carrera("El licenciado tiene puede realizar estudios, dirigir investigaciones y asesorar sobre"+
"Los modos de vida como expresi�n del comportamiento cultural, resultado de los cambios producidos a trav�s del tiempo."+
"Las configuraciones culturales en su unidad y diversidad, consideradas como sistemas sociales, productivos, tecnol�gicos e ideol�gicos que integran al individuo a su medio socio-cultural."+
"La unidad y variaci�n del comportamiento humano sobre la base del an�lisis, descripci�n, comparaci�n y explicaci�n de los comportamientos culturales."+
"La reconstrucci�n de formas de vida o comportamientos, vigentes en el pasado a trav�s del estudio d restos y vestigios materiales."+
"Los m�todos y t�cnicas apropiados para la indagaci�n cient�fica en su campo espec�fico."+
"Participar en equipos interdisciplinarios responsables de la elaboraci�n y evaluaci�n de planes, programas y proyectos relacionados con la problem�tica socio-cultural."+
"Intervenir en arbitrajes, peritajes y todas aquellas actividades que requieran del �mbito de su especialidad."+
"Elaborar proyectos de protecci�n de yacimientos y riquezas arqueol�gicas");
    carrera.setId_grado(Constants.CARRERA_GRADO);
	carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
	listCarrera.add(carrera);
	///////////////
	carrera=new Carrera();
	carrera.setId_carrera(5);
	carrera.setTitulo_carrera(" AUXILIAR TECNICO EN ANTROPOLOGIA");
	carrera.setNivel_carrera("T�tulo de PreGrado");
	carrera.setAcreditacion_carrera("(R.M. 2269/98). Requisitos aprobar las primeras 18 materias incluyendo el 1� nivel de ingl�s.");
	carrera.setPerfil_carrera("");
	carrera.setAlcance_carrera("El licenciado tiene puede realizar estudios, dirigir investigaciones y asesorar sobre"+
			"Los modos de vida como expresi�n del comportamiento cultural, resultado de los cambios producidos a trav�s del tiempo."+
			"Las configuraciones culturales en su unidad y diversidad, consideradas como sistemas sociales, productivos, tecnol�gicos e ideol�gicos que integran al individuo a su medio socio-cultural."+
			"La unidad y variaci�n del comportamiento humano sobre la base del an�lisis, descripci�n, comparaci�n y explicaci�n de los comportamientos culturales."+
			"La reconstrucci�n de formas de vida o comportamientos, vigentes en el pasado a trav�s del estudio d restos y vestigios materiales."+
			"Los m�todos y t�cnicas apropiados para la indagaci�n cient�fica en su campo espec�fico."+
			"Participar en equipos interdisciplinarios responsables de la elaboraci�n y evaluaci�n de planes, programas y proyectos relacionados con la problem�tica socio-cultural."+
			"Intervenir en arbitrajes, peritajes y todas aquellas actividades que requieran del �mbito de su especialidad."+
			"Elaborar proyectos de protecci�n de yacimientos y riquezas arqueol�gicas");
			    carrera.setId_grado(Constants.CARRERA_PREGADO);
				carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
				
   listCarrera.add(carrera);
   
   //////////////////////////////////////////////
   carrera=new Carrera();
   carrera.setId_carrera(6);
   carrera.setTitulo_carrera("PROFESOR EN LETRAS "+
                             "LICENCIATURA EN LETRAS ");
   carrera.setNivel_carrera("T�tulo de Grado");
   carrera.setDuracion_carrera("Profesor en Letras C.S. 280/06. 4 a�os"+
"Licenciado en Letras C.S. 280/06. 5 a�os y Tesina Final");
   carrera.setAcreditacion_carrera("Profesor en Letras C.S. 280/06. 4 a�os"
                                   +"Licenciado en Letras C.S. 280/06. 5 a�os y Tesina Final");
   carrera.setPerfil_carrera("PERFIL DEL PROFESOR"+
"Planificar, conducir y evaluar el proceso ense�anza-aprendizaje de la lengua y la literatura en los establecimientos educacionales de nivel medio y superior."+
"Integrar equipos de trabajo para el estudio y revisi�n de la metodolog�a para la ense�anza de la lengua y la literatura en el nivel medio y superior."+
"Actualizar, adecuar y medir las t�cnicas de lecto-escritura."+
"Asesorar en su �rea a organismos cient�ficos, t�cnicos y culturales oficiales o privados"+
"Integrar equipos de trabajo en los medios masivos de comunicaci�n"+
"Asesorar y/o integrar equipos de trabajo para programas de alfabetizaci�n en el �rea de la lengua y la literatura"+
"Trabajar en el �mbito editorial"+
"Trabajar en el periodismo como cr�tico literario, corrector de estilo y de prueba."+
"Integrar equipos de investigaci�n disciplinaria e interdisciplinaria."+
"PERFIL DEL LICENCIADO"+
"Investigar, en forma individual o como integrante de grupos disciplinarios o interdisciplinarios, en centros universitarios de investigaci�n u otros estatales o privados destinados a la investigaci�n en el �rea de la ling��stica, de la literatura o las lenguas y literatura cl�sicas."+
"Asesorar en su �rea a organismos, municipios, direcciones de cultura, etc."+
"Integrar equipos de trabajo en los medios de comunicaci�n."+
"Asesorar y/o integrar equipos de trabajos para programas de alfabetizaci�n en el �rea de lengua y literatura."+
"Trabajar en el �mbito editorial."+
"Trabajar en el periodismo especializado o general."+
"Ejercer la docencia universitaria y en otros niveles de educaci�n.");
 carrera.setAlcance_carrera("");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
 
  //////////////////////////////
   carrera=new Carrera();
   carrera.setId_carrera(7);
   carrera.setTitulo_carrera("LICENCIADO EN TRABAJO SOCIAL");
   carrera.setNivel_carrera("T�tulo de Grado");
   carrera.setAcreditacion_carrera("Licenciado en Trabajo Social (R.M. N� 110/95)  -  4 semestres");
   carrera.setAlcance_carrera(
"Intervenir, a trav�s de la investigaci�n diagn�stico y/o tratamiento, en las relaciones entre individuos, grupos, instituciones y comunidades a nivel preventivo, asistencial, promocional y/o de rehabilitaci�n por la aplicaci�n de t�cnicas y m�todos espec�ficos."+
"Formular, dirigir, ejecutar y evaluar planes, programas y proyectos destinados a actuar sobre las causas que originan situaciones sociales problem�ticas, interviniendo profesionalmente para lograr la participaci6n responsable y activa de los sujetos de dichas acciones."+
"Participar en la elaboraci�n de pol�tica de acci�n social contribuyendo a su coherencia con la realidad y equilibrio en la relaci�n recurso-necesidad."+
"Dirigir organismos e instituciones p�blicas o privadas de Bienestar Social, as� como organizar, administrar, conducir y supervisar loe mismos."+
"Dirigir organismos de formaci�n profesional en Trabajo Social y dictar c�tedras de las materias especificas."+
"Intervenir en arbitrajes, asesoramientos, peritajes y todos aquellas actividades Ilegales o vinculadas al �mbito del Trabajo Social."+
"Dise�ar, ejecutar y evaluar Proyectos de Investigaci�n en temas espec�ficos dentro del contexto socio-econ�mico y cultural."+
"Participar en investigaci�n, dise�o, ejecuci�n y evaluaci�n de Programas de Desarrollo como parte integrante de equipos interdisciplinarios."+
"Cualquier, otra actividad que importe participaci�n de un profesional del Trabajo Social y tienda al logro del Bienestar Social.");  
 carrera.setPerfil_carrera("Lo que caracteriza al Trabajo Social es la praxis social, es el contacto directo, cotidiano y continuado con la realidad social, su actuaci�n con el hombre en su realidad hist�rica presente y la planificaci�n de cara al futuro. Por ende, el Licenciado en Trabajo Social es un graduado universitario con adecuada formaci�n en las l�neas curriculares sociol�gica, psicol�gica, pedag�gica, antropol�gica, filos�fica y de investigaci6n que le permiten el conocimiento, comprensi�n y operacionalizaci�n de los principios y t�cnicas propios de la indagaci�n de la realidad social. ");
 
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
  
 ////////////////////////////////////
 carrera=new Carrera();
 carrera.setId_carrera(8);
 carrera.setTitulo_carrera("LICENCIADO EN EDUCACION PARA LA SALUD");
 carrera.setNivel_carrera("T�tulo de Grado");
 carrera.setDuracion_carrera("5 a�os");
 carrera.setAcreditacion_carrera("Licenciado en Educaci�n para la Salud (R.M. 0297/00).  2.838.horas");
 carrera.setPerfil_carrera("");
 carrera.setAlcance_carrera("Participar en equipos interdisciplinarios responsables de planificar, ejecutar, evaluar programas de Educaci�n para la Salud, tendientes a promover acciones que mejoren la calidad de las prestaciones y servicios brindados en el medio."+
"Participar en la organizaci�n y supervisi�n de las prestaciones de servicios de salud en los sectores p�blicos, privados y comunitarios."+
"Desarrollar programas de higiene y seguridad de trabajo tendientes a un mayor margen de seguridad de trabajo tendientes a un mayor margen de seguridad y cobertura sanitaria para los trabajadores."+
"Integrar equipos responsables de los planes de desarrollo comunitario, promoviendo la participaci�n autogestionaria de los diferentes grupos en el planeamiento, ejecuci�n y evaluaci�n de su atenci�n en salud."+
"Prestar servicios en unidades t�cnicas tales como: Departamento de Educaci�n para la Salud, Hospitales, cabeceras de �reas program�ticas, puestos de salud."+
"Departamentos Pedag�gicos de Servicios Centrales y Descentralizados del �rea de Educaci�n, unidades educativas o equivalentes del �mbito nacional, provincial y municipal, as� como en gremios, obras sociales y otras instituciones que contemplen la problem�tica de la salud."+
"Asesorar a grupos comunitarios formales e informales en cuanto a cuidados de salud promoviendo acciones tendientes a preservar la salud de �la poblaci�n."+
"Participar en la elaboraci�n y ejecuci�n de proyectos preventivos sobre la base de un conocimiento integral de la problem�tica de la regi�n, que ponga de relieve las atenciones priorizadas."+
"Adecuar con creatividad y juicio cr�tico las estrategias b�sicas en su accionar e la ejecuci�n de proyectos y de acuerdo a las caracter�sticas de los destinatarios de los mismos."+
"Planificar y ejecutar programas de Educaci�n para la Salud en medios de comunicaci�n social utilizando �ptimamente el grado de cobertura de los mismos."+
"Cubrir tareas docente sobre problem�ticas espec�ficas �mbito de educaci�n formal y no formal."+
"Dise�ar y estructurar recursos did�cticos de diferente complejidad orientados a la Educaci�n para la Salud.");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
 ///////////////////////////////////////////
 carrera=new Carrera();
 carrera.setId_carrera(9);
 carrera.setTitulo_carrera("EDUCADOR SANITARIO");
 carrera.setNivel_carrera("T�tulo de Grado");
 carrera.setDuracion_carrera("4 a�os");
 carrera.setAcreditacion_carrera("Educador Sanitario R.M. (2614/94).4 a�os.");
 carrera.setPerfil_carrera("");
 carrera.setAlcance_carrera("Participar en equipos interdisciplinarios responsables de planificar, ejecutar, evaluar programas de Educaci�n para la Salud, tendientes a promover acciones que mejoren la calidad de las prestaciones y servicios brindados en el medio."+
"Participar en la organizaci�n y supervisi�n de las prestaciones de servicios de salud en los sectores p�blicos, privados y comunitarios."+
"Desarrollar programas de higiene y seguridad de trabajo tendientes a un mayor margen de seguridad de trabajo tendientes a un mayor margen de seguridad y cobertura sanitaria para los trabajadores."+
"Integrar equipos responsables de los planes de desarrollo comunitario, promoviendo la participaci�n autogestionaria de los diferentes grupos en el planeamiento, ejecuci�n y evaluaci�n de su atenci�n en salud."+
"Prestar servicios en unidades t�cnicas tales como: Departamento de Educaci�n para la Salud, Hospitales, cabeceras de �reas program�ticas, puestos de salud."+
"Departamentos Pedag�gicos de Servicios Centrales y Descentralizados del �rea de Educaci�n, unidades educativas o equivalentes del �mbito nacional, provincial y municipal, as� como en gremios, obras sociales y otras instituciones que contemplen la problem�tica de la salud."+
"Asesorar a grupos comunitarios formales e informales en cuanto a cuidados de salud promoviendo acciones tendientes a preservar la salud de �la poblaci�n."+
"Participar en la elaboraci�n y ejecuci�n de proyectos preventivos sobre la base de un conocimiento integral de la problem�tica de la regi�n, que ponga de relieve las atenciones priorizadas."+
"Adecuar con creatividad y juicio cr�tico las estrategias b�sicas en su accionar e la ejecuci�n de proyectos y de acuerdo a las caracter�sticas de los destinatarios de los mismos."+
"Planificar y ejecutar programas de Educaci�n para la Salud en medios de comunicaci�n social utilizando �ptimamente el grado de cobertura de los mismos."+
"Cubrir tareas docente sobre problem�ticas espec�ficas �mbito de educaci�n formal y no formal."+
"Dise�ar y estructurar recursos did�cticos de diferente complejidad orientados a la Educaci�n para la Salud.");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
 ////////////////////////
 carrera=new Carrera();
 carrera.setId_carrera(10);
 carrera.setTitulo_carrera("CICLO SUPERIOR DE LICENCIATURA EN FILOSOFIA");
 carrera.setNivel_carrera("T�tulo de Grado");
 carrera.setDuracion_carrera(" 5 cuatrimestres");
 carrera.setAcreditacion_carrera("Licenciado en Filosof�a (R.M. N� 335/00)  .");
 carrera.setPerfil_carrera("");
 carrera.setAlcance_carrera("");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
   
return listCarrera;
		
		
	}
}
