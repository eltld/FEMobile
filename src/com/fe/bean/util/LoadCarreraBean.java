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
		//INGENIERO QUIMICO
		carrera.setId_carrera(1);
		carrera.setTitulo_carrera("INGENIER�A QU�MICA");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera(" <br>Resoluci�n Ministerial N� 1856/83"+
          "<br>Resoluci�n CONEAU N� 552/08"+
          "<br>Resoluci�n CONEAU N� 628/04");
		carrera.setPerfil_carrera("<br>1. Desempe�arse eficaz y eficientemente en un �mbito tecnol�gico de"
				+ "complejidad creciente de permanente cambio."
				+ "<br>2. Asumir responsablemente la preservaci�n del medio ambiente."
				+ "<br>3. Desenvolverse en equipos multidisciplinarios."
				+ "<br>4. Buscar, seleccionar, aprender y aplicar conocimientos nuevos y a�n"
				+ "abordar algunos no referidos espec�ficamente con su profesi�n. "
				+ "<br>5. Prever, detectar y comprender los cambios de las condiciones externas,"
				+ "tanto tecnol�gicas como econ�micas, sociales y culturales, y producir"
				+ "respuestas apropiadas a ellos r�pidamente."
				+ "<br>6. Encarar la b�squeda de las soluciones a los problemas tecnol�gicos "
				+ "sustent�ndose en las ciencias matem�ticas, f�sicas y qu�micas, y"
				+ "acompa��ndolas con criterio econ�mico, ambientalista y social. "
				+ "<br>7. Ejercer su profesi�n con sentido �tico y responsabilidad social en la"
				+ "b�squeda del bienestar com�n.");
		carrera.setAlcance_carrera("<br>1. Estudio, factibilidad, proyecto, direcci�n, construcci�n, instalaci�n,"+
 "inspecci�n, operaci�n y mantenimiento (excepto de obras civiles e"
				+ "industriales) de:"
				+ "<br>2. Industrias que involucren procesos qu�micos, fisicoqu�micos, de"
				+ "bioingenier�a y sus instalaciones complementarias."
				+ "<br>3. Instalaciones donde intervengan operaciones unitarias y/o procesos"
				+ "unitarios."
				+ "<br>4. Instalaciones destinadas a evitar la contaminaci�n ambiental por"
				+ "efluentes de todo tipo originados por la industria y/o sus servicios."
				+ "<br>5. Equipos, maquinarias, aparatos e instrumentos para las industrias"
				+ "indicadas en los incisos anteriores."
				+ "<br>6. Estudios, tareas y asesoramientos relacionados con:"
				+ "<br>7. Aspecto funcional de las construcciones industriales y de servicios"
				+ "indicados en el p�rrafo i) y sus obras e instalaciones complementarias."
				+ "<br>8. Factibilidad del aprovechamiento e industrializaci�n de los recursos"
				+ "naturales y materias primas que sufran transformaci�n y elaboraci�n"
				+ "de nuevos productos."
				+ "<br>9. Planificaci�n, programaci�n, direcci�n, organizaci�n, racionalizaci�n,"
				+ "control y optimizaci�n de los procesos industriales de las industrias"
				+ "citadas en el p�rrafo"
				+ "<br>10. Asuntos de Ingenier�a Legal, Econ�mica y Financiera relacionados con"
				+ "los incisos anteriores.");
		
		carrera.setDuracion_carrera("5 a�os");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_INGENIERIA_ID);
	    listCarrera.add(carrera);
	   
	    //INGENIERO DE MINAS
	    carrera.setId_carrera(2);
		carrera.setTitulo_carrera("INGENIERO EN MINAS");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera("Resoluci�n Ministerial N� 1856/8"+
         "<br>Resoluci�n CONEAU N� 555/08"+
         "<br>Resoluci�n CONEAU N� 627/04"  +
		 "<br>Carrera Acreditada");
		
		carrera.setPerfil_carrera("El Perfil del Egresado es polivalente, tal que le permita actuar de modo interdisciplinario con"+
"otras �reas involucradas en su actividad. Como Ingeniero de Minas ser� capaz de:"+
"<br>1. Establecer pol�ticas, objetivos y estrategias. "+
"<br>2. Gestionar sus actividades espec�ficas."+
"<br>3. Dirigir, proyectar, controlar y mantener las explotaciones mineras de yacimientos metal�feros, no"+
"<br>metal�feros, geot�rmicos, rocas de aplicaci�n y de combustibles s�lidos, l�quidos y gaseosos que"+
"<br>para su obtenci�n requieran el uso de tecnolog�a minera."+
"<br>4. Dirigir y controlar la totalidad de las actividades requeridas hasta su efectiva concreci�n teniendo"+
"<br>en cuenta los criterios de seguridad, impacto ambiental, relaciones humanas, calidad,"+
"productividad y costos."+
"<br>5. Dirigir, dise�ar y ejecutar obras relacionadas con el uso de explosivos, la voladura de rocas y"+
"movimiento de suelos. El manejo y buen uso de los explosivos hacen de este profesional un"+
"asistente indiscutido de la ingenier�a vial y de construcciones."+
"<br>6. En el �rea del procesamiento de los materiales, dirigir, dise�ar y optimizar plantas de trituraci�n,"+
"molienda, clasificaci�n y concentraci�n de productos minerales, alimenticios y cualquier otro"+
"producto industrial. Estar capacitado para el estudio, di-se�o y ubicaci�n de residuos industriales"+
"(relaves) y comunitarios, entre otros."+
"<br>7. En el campo de la metalurgia extractiva, dirigir, dise�ar y controlar plantas industriales donde se"+
"realizan procesos pirometal�rgicos, hidrometal�rgicos y combinados. "+
"<br>8. Comercializar, seleccionar y abastecer insumos, maquinarias, productos e instrumentales"+
"espec�ficos. Gestionar la log�stica para la producci�n. Actuar en el desarrollo de proveedores de"+
"materias primas e insumos. Programar, coordinar y controlar servicios y suministros."+
"<br>9. Desarrollar sus actividades en plena armon�a con el medio ambiente."+
"<br>10. Realizar trabajos topogr�ficos y geod�sicos necesarios para la ubicaci�n de puntos fijos en"+
"superficie y mensura de pertenencias mineras y de cateos."+
"<br>11. Generar y liderar emprendimientos empresariales y actividades legales que le permiten asumir"+
"funciones de planificaci�n y direcci�n empresaria. Actuar en consultor�as. Formular y evaluar la"+
"factibilidad t�cnico-econ�mica y financiera de proyectos de emprendimientos."+
"<br>12. Valorar la responsabilidad social de su desempe�o profesional."+ 
"<br>13. Buscar, seleccionar, aprender y aplicar nuevos conocimientos."+
"<br>14. Desempe�arse en el �mbito cient�fico, tecnol�gico y educativo."+
"<br>15. Desarrollar aplicaciones tecnol�gicas relacionadas con su formaci�n profesional en temas"+
"referentes a su especialidad y afines.");
		carrera.setAlcance_carrera("El t�tulo profesional obtenido por el Egresado de la carrera de Ingeniero de Minas, lo habilita"+
"para realizar:"+
"<br>1) Estudios, proyecto, direcci�n y ejecuci�n de obras concernientes a la exploraci�n y explotaci�n de"+
"yacimientos minerales de todo tipo, ubicados en el suelo o subsuelo, comprendiendo:"+
"<br>a) Estudios minero-geol�gicos y qu�mico mineral�rgicos de yacimientos, minas, minerales y rocas."+
"b) Muestreos, determinaci�n de reservas, estudios econ�mico-financieros, evaluaci�n de los"+
"yacimientos minerales."+
"c) Construcciones e Instalaciones mineras civiles, industriales y electromec�nicas des-tinadas a"+
"viviendas, dep�sitos, talleres, salas de motores y m�quinas; extracci�n, transporte, quebrantado,"+
"trituraci�n y molienda, clasificaci�n y almacenado, y concentraci�n de sustancias minerales de"+
"todo tipo, por medios mec�nicos, neum�ticos magn�ticos, electrost�ticos, hidro y"+
"pirometal�rgicos."+
"d) Obras de provisi�n de agua, energ�a, desag�es, producci�n y distribuci�n de aire comprimido,"+
"ventilaci�n e iluminaci�n."+
"e) Mec�nica de suelos, voladuras de rocas, trabajos con explosivos, excavaciones de pozos, galer�as,"+
"t�neles, obras de contenci�n y sost�n de empujes de terrenos. "+
"f) Evacuaci�n y cerramiento de las aguas, galer�as de derrame, sistemas de bombeo, terraplenes y"+
"represas."+
"g) Servicios auxiliares para el mantenimiento de motores y m�quinas de uso minero, herramientas y"+
"lamparer�a."+
"<br>2) Operaciones topogr�ficas y geod�sicas relativas a las tareas se�aladas en el cap�tulo 1) que"+
"corresponden a:"+
"a) Mensuras privadas y judiciales de yacimientos minerales, concesiones de exploraci�n y cateo y de"+
"explotaci�n."+
"b) Determinaciones para el c�lculo de coordenadas geogr�ficas, rumbos y azimutes."+
"c) Relevamiento de superficie y de labores subterr�neas de todo tipo."+
"d) Operaciones de triangulaci�n necesarias para la ubicaci�n de los distritos mineros y sus"+
"yacimientos."+
"<br>3) Estudios, asesoramiento de ingenier�a legal, relativos a la Legislaci�n minera y del trabajo en las"+
"minas y canteras, comprendiendo:"+
"a) La aplicaci�n de las disposiciones legales emanadas del C�digo de Miner�a, Leyes, Decretos y"+
"reglamentaciones conexas."+
"b) Contratos de exploraci�n y explotaciones de los yacimientos de minerales y organizaci�n del"+
"trabajo."+
"c) Higiene y seguridad en las minas y canteras, elaboraci�n y aplicaci�n de las disposiciones"+
"correspondientes a la polic�a minera."+
"<br>4) Arbitrajes, pericias y tasaciones, referidas a los yacimientos de minerales, su concesi�n y" +
"aprovechamiento."+
"<br>5) Ense�anza e investigaci�n de los conocimientos b�sicos, t�cnicos y cient�ficos de los temas" +
"contenidos en la carrera, en todos los niveles de acuerdo con las reglamentaciones existentes al"+
"efecto.");
		carrera.setDuracion_carrera("5 a�os");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_INGENIERIA_ID);
	    listCarrera.add(carrera);
	    
	    
	    /////////////////////////////////////
	    ////INGENIERIA INDUSTRIAL
	    carrera.setId_carrera(3);
		carrera.setTitulo_carrera("INGENIEIA INDUSTRIAL");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera("Resoluci�n Ministerial N� 335/02."+
				"<br>Resoluci�n CONEAU N� 514/07"+
                "<br>CARRERA ACREDITADA");
		carrera.setPerfil_carrera("La Ingenier�a Industrial tiene por objeto la planificaci�n, organizaci�n, an�lisis, medici�n y"+
"control de los hechos de cualquier naturaleza que ocurren en una empresa buscando optimizar la"+
"producci�n minimizando los costos. Por lo tanto con la presente carrera se espera conseguir el"+
"siguiente objetivo: formar profesionales con una s�lida base cient�fica y tecnol�gica,"+
"competentes en la gesti�n de empresas y organizaci�n de sistemas productivos, la interpretaci�n"+
"de nuevas tecnolog�as y de los desarrollos econ�micos para la toma de decisiones en el dise�o y"+
"direcci�n de las organizaciones, la coordinaci�n e integraci�n de sistemas que requieran de"+
"conocimientos cient�ficos, tecnol�gicos y de comercializaci�n, as� como el manejo de relaciones"+
"interpersonales con capacidad de trabajar en equipo."+
"Se espera lograr que el graduado en Ingenier�a Industrial est� formado en:"+
"<br>1. Ciencias b�sicas de la Ingenier�a: Matem�ticas, F�sica, Qu�mica, Inform�tica."+
"<br>2. Ciencias de las Ingenier�as Mec�nica, Qu�mica, Civil y Electr�nica."+
"<br>3. Ciencias propias de la especialidad: Investigaci�n Operativa, Econom�a, Finanzas de"+
"Empresas, Comercializaci�n, Organizaci�n de la Producci�n, Sistemas de Informaci�n,"+
"Gesti�n Empresaria."+
"<br>4. Complementos a los conocimientos anteriores con los de Proyectos, Pr�cticas Profesionales"+
"Supervisadas y otros trabajos de campo."+
"<br>5. El Ingeniero Industrial debe poseer aptitudes para las ciencias l�gico-matem�ticas,"+
"capacidad de an�lisis, talento para establecer relaciones interpersonales y vocaci�n para"+
"aceptar el desaf�o de afrontar problemas y situaciones nuevas en los sistemas productivos,"+
"estableciendo las alternativas de soluci�n.");
carrera.setAlcance_carrera("El Ingeniero Industrial resulta competente para:"+
"<br>1. Realizar estudios de factibilidad, proyectar, dirigir, implementar, operar y evaluar el"+
"proceso de producci�n de bienes industrializados y la administraci�n de los recursos"+
"destinados a la producci�n de dichos bienes."+
"<br>2. Planificar y organizar plantas industriales y plantas de transformaci�n de recursos naturales"+
"en bienes industrializados y servicios. "+
"<br>3. Proyectar las instalaciones necesarias para el desarrollo de procesos productivos"+
"destinados a la producci�n de bienes industrializados y dirigir su ejecuci�n y"+
"mantenimiento. "+
"<br>4. Proyectar, implementar y evaluar el proceso destinado a la producci�n de bienes"+
"industrializados. "+
"<br>5. Determinar las especificaciones t�cnicas y evaluar la factibilidad tecnol�gica de los"+
"dispositivos, aparatos y equipos necesarios para el proceso destinado a la producci�n de"+
"bienes industrializados."+
"<br>6. Programar y organizar el movimiento y almacenamiento de materiales para el desarrollo"+
"del proceso productivo y de bienes industrializados resultantes."+
"<br>7. Participar en el dise�o de productos en lo relativo a determinaci�n de la factibilidad de su"+
"elaboraci�n industrial. "+
"<br>8. Determinar las condiciones de instalaci�n y de funcionamiento que aseguren que el"+
"conjunto de operaciones necesarias para la producci�n y distribuci�n de bienes"+
"industrializados se realice en condiciones de higiene y seguridad; establecer las"+
"especificaciones de equipos, dispositivos y elementos de protecci�n y controlar su"+
"utilizaci�n. "+
"<br>9. Realizar la planificaci�n, organizaci�n, conducci�n y control de gesti�n del conjunto de"+
"operaciones necesarias para la producci�n y distribuci�n de bienes industriales. "+
"<br>10. Determinar la calidad y cantidad de los recursos humanos para la implementaci�n y"+
"funcionamiento del conjunto de operaciones necesarias para la producci�n de bienes"+
"industrializados; evaluar su desempe�o y establecer los requerimientos de capacitaci�n."+
"<br>11. Efectuar la programaci�n de los requerimientos financieros para la producci�n de bienes"+
"industrializados."+
"<br>12. Asesorar en lo relativo al proceso de producci�n de bienes industrializados y la"+
"administraci�n de los recursos destinados a la producci�n de dichos bienes."+
"<br>13. Efectuar tasaciones y valuaciones de plantas industriales en lo relativo a: sus instalaciones"+
"y equipos, sus productos semielaborados y elaborados y las tecnolog�as de transformaci�n"+
"utilizadas en la producci�n y distribuci�n de bienes industrializados. "+
"<br>14. Realizar arbitrajes y peritajes referidos a: planificaci�n y organizaci�n de plantas"+
"industriales, sus instalaciones y equipos, el proceso de producci�n, los procedimientos de"+
"operaci�n y las condiciones de higiene y seguridad en el trabajo, para la producci�n y"+
"distribuci�n de bienes industrializados.")	;
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
		carrera.setTitulo_carrera("BROMATOLOGO");
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

     
	public List<Carrera>loadCarreraEconomica()
	{
		
		Carrera carrera=new Carrera();
		carrera.setId_carrera(1);
		carrera.setTitulo_carrera(" CONTADOR PUBLICO");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera("");
		carrera.setPerfil_carrera("Planeamiento, organizaci�n, direcci�n, ejecuci�n y control de actividades contables y de administraci�n de recursos financieros"+
                                  "An�lisis, interpretaci�n, registro, clasificaci�n y resumen de datos contables."+ 
                                  "Organizaci�n y ejecuci�n de planes y pol�ticas relacionadas con sistemas de informaci�n contable, y aplicaci�n de tales sistemas con m�todos de todo tipos incluyendo los electr�nicos."+
                                  "Preparaci�n y examen de informaci�n administrativa y contable y emisi�n de informes resultante de su evaluaci�n ante organismos de toda �ndole o para publico conocimiento"+
"Examen y evaluaci�n de pruebas y evidencias admisibles en juicio, para la tarea pericial y la actuaci�n en concursos civiles y comerciales.-"+
"Interpretaci�n de leyes decretos y resoluciones gubernamentales en materia administrativo-contable."+
"Organizaci�n y ejecuci�n de procedimientos contables en la constituci�n, fusi�n, escisi�n y disoluci�n de entidades de todo tipo."+
"Actuaci�n en tareas administrativo-contables de la administraci�n p�blica, interpretando las disposiciones que concierne a la informaci�n contable y emitiendo dict�menes sobre ellas."+
"Liquidaci�n de impuestos y toda forma de grav�menes tributarios, interpretando las disposiciones que conciernen a tales temas y emitiendo dict�menes sobre ellas."+
"Liquidaci�n de haberes y beneficios laborales, sus cargas y sus compensaciones sociales, interpretando las disposiciones que conciernen a ellas y emitiendo dict�menes al respecto."+
"Actuaci�n en puestos de direcci�n y conducci�n de unidades de administraci�n contable y financieras, en funciones subordinadas de l�nea o de asesoramiento en esa materia.");
	 carrera.setAlcance_carrera(null);
	 carrera.setDuracion_carrera("5 a�os");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_ECONOMICA_ID);
	 listCarrera.add(carrera);
	
	 //LICENCIATURA EN ADMINISTRACI�N
	 carrera=new Carrera();
	 carrera.setId_carrera(2);
	 carrera.setTitulo_carrera("LICENCIATURA EN ADMINISTRACI�N");
	 carrera.setNivel_carrera("T�tulo de Grado");
	 carrera.setAcreditacion_carrera("");
	 carrera.setPerfil_carrera("Adem�s de la formaci�n cultural impartida a los analistas, el egresado con t�tulo de Licenciado en Administraci�n estar� capacitado para desarrollar "+
	 "con toda destreza profesional las siguientes tareas:"+ 
     "1.-Planeamiento, organizaci�n, direcci�n, ejecuci�n y control de la actividad empresaria en su conjunto"+
     "2.-Organizaci�n y ejecuci�n de planes y pol�ticas empresarias"+
     "3.-Organizaci�n de sistemas de informaci�n empresaria y el manejo y aplicaci�n de m�todos cibern�ticos a la administraci�n y gesti�n empresaria."+
     "4.-An�lisis y evaluaci�n de leyes, decretos, y resoluciones gubernamentales relativas a la gesti�n y administraci�n empresaria."+
     "5.-Conducci�n de gesti�n empresaria en todas sus etapas: constituci�n, fusi�n, escisi�n, y disoluci�n de entidades de todo tipo."+
     "6.-Actuaci�n en la administraci�n gubernamental, en los diferentes niveles de conducci�n, interpretando las disposiciones que conciernen a la gesti�n de las entidades gubernamentales."+
     "7.-Actuaci�n en puestos de direcci�n y conducci�n de unidades operativas o administrativas o de direcci�n general en funciones de l�nea o de asesoramiento en materia de gesti�n empresaria."+
     "8.-Analizar la informaci�n estad�stica y econ�mica para efectuar diagn�sticos y el dise�o de pol�ticas y estrategias empresariales y gubernamentales."+
     "9.-Realizar estudios e investigaciones para la formulaci�n y evaluaci�n de proyectos de inversi�n, peque�os, medianos y grandes, tanto de naturaleza p�blica como privada."+
     "10.-Realizar el seguimiento y control de la ejecuci�n de los proyectos de inversi�n"+
     "11.-Analizar la influencia de los procesos administrativos en la rentabilidad de las empresas y procesos de inversi�n de capital"+
     "12.-Actuar en todos los aspectos como agente de promoci�n del Desarrollo Econ�mico."+
     "13.-Realizar investigaciones cient�ficas y tecnol�gicas en el campo de las ciencias de la administraci�n.");
	 carrera.setAlcance_carrera(null);
	 carrera.setDuracion_carrera("5 a�os");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_ECONOMICA_ID);
	 listCarrera.add(carrera);
	
	 
	 //LICENCIADO EN ECONOM�A
	 carrera=new Carrera();
	 carrera.setId_carrera(3);
	 carrera.setTitulo_carrera("LICENCIADO EN ECONOMIA - CONVENIO CON LA FACULTA DE NACIONAL DE TUCUMAN");
	 carrera.setNivel_carrera("T�tulo de Grado");
	 carrera.setAcreditacion_carrera("");
	 carrera.setPerfil_carrera("" +
	 		"El egresado de esta carrera deber� estar capacitado para desarrollar con y toda destreza profesional las siguientes actividades:"+
            "Trabajar en entidades p�blicas (Ministerios, Gobernaciones, Intendencias, etc.)"+
            "Desempe�ar actividades de asesoramiento en empresas privadas."+
            "Realizar diagn�sticos, desarrollar, dirigir y coordinar."+
            "Funciones de planeamiento, organizaci�n, control de gesti�n de las actividades administrativas en su relaci�n a lo econ�mico, en entidades p�blicas como privadas."+
            "En cuanto a la especializaci�n, formaci�n que se desarrollar� luego de los estudios de grado, se han ido delimitando �reas dada la diversidad de los campos con que se vincula la actividad de un economista: Finanzas, Econom�a de las Empresas, Comercio Exterior, Sector P�blico, etc.");
	 carrera.setAlcance_carrera(null);
	 carrera.setDuracion_carrera("2 a�os");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_ECONOMICA_ID);
	 listCarrera.add(carrera);
	  
		
		return listCarrera;
	}


}
