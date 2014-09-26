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
		carrera.setTitulo_carrera("INGENIERÍA QUÍMICA");
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera(" Ingeniero Químico");
		carrera.setPerfil_carrera("1. Desempeñarse eficaz y eficientemente en un ámbito tecnológico de"
				+ "complejidad creciente de permanente cambio."
				+ "2. Asumir responsablemente la preservación del medio ambiente."
				+ "3. Desenvolverse en equipos multidisciplinarios."
				+ "4. Buscar, seleccionar, aprender y aplicar conocimientos nuevos y aún"
				+ "abordar algunos no referidos específicamente con su profesión. "
				+ "5. Prever, detectar y comprender los cambios de las condiciones externas,"
				+ "tanto tecnológicas como económicas, sociales y culturales, y producir"
				+ "respuestas apropiadas a ellos rápidamente."
				+ "6. Encarar la búsqueda de las soluciones a los problemas tecnológicos "
				+ "sustentándose en las ciencias matemáticas, físicas y químicas, y"
				+ "acompañándolas con criterio económico, ambientalista y social. "
				+ "7. Ejercer su profesión con sentido ético y responsabilidad social en la"
				+ "búsqueda del bienestar común.");
		carrera.setAlcance_carrera("1. Estudio, factibilidad, proyecto, dirección, construcción, instalación,"+
 "inspección, operación y mantenimiento (excepto de obras civiles e"
				+ "industriales) de:"
				+ "2. Industrias que involucren procesos químicos, fisicoquímicos, de"
				+ "bioingeniería y sus instalaciones complementarias."
				+ "3. Instalaciones donde intervengan operaciones unitarias y/o procesos"
				+ "unitarios."
				+ "4. Instalaciones destinadas a evitar la contaminación ambiental por"
				+ "efluentes de todo tipo originados por la industria y/o sus servicios."
				+ "5. Equipos, maquinarias, aparatos e instrumentos para las industrias"
				+ "indicadas en los incisos anteriores."
				+ "6. Estudios, tareas y asesoramientos relacionados con:"
				+ "7. Aspecto funcional de las construcciones industriales y de servicios"
				+ "indicados en el párrafo i) y sus obras e instalaciones complementarias."
				+ "8. Factibilidad del aprovechamiento e industrialización de los recursos"
				+ "naturales y materias primas que sufran transformación y elaboración"
				+ "de nuevos productos."
				+ "9. Planificación, programación, dirección, organización, racionalización,"
				+ "control y optimización de los procesos industriales de las industrias"
				+ "citadas en el párrafo"
				+ "10. Asuntos de Ingeniería Legal, Económica y Financiera relacionados con"
				+ "los incisos anteriores.");
		
		carrera.setDuracion_carrera("5 años");
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
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera(" Ingeniero Agrónomo");
		carrera.setPerfil_carrera("El Ingeniero Agrónomo podrá desempeñarse a través de sus conocimientos tecnológicos y científicos en:"
				+ "Producción, conservación, transformación primaria, comercialización y certificación de productos agropecuarios."
				+ "Conservación, recuperación y aprovechamiento del ambiente natural."
				+ "Identificación de problemas y evaluación de soluciones alternativas a partir de un enfoque integral del sistema agrario y agroindustrial."
				+ "Participación en la formulación de políticas para el sector agropecuario."
				+ "Generación, adaptación y/o modificación de tecnologías compatibles con la disponibilidad de los recursos productivos."
				+ "Docencia e Investigación Científica en Instituciones Públicas o Privadas."
				+ "Asesoramiento al sector agroalimentario en cuanto a administración, crédito y desarrollo tecnológico.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera("5 años");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		
	
		
		listCarrera.add(carrera);
		////////////////////
		carrera =new Carrera();
		carrera.setId_carrera(2);
		carrera.setTitulo_carrera("LIC. EN CIENCIAS BIOLOGICAS");
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera("Licenciado en Ciencias Biológicas ");
		carrera.setPerfil_carrera(
				"El profesional podrá desempeñarse en:"+
                "Trabajos de Investigación básica aplicada en las distintas áreas de las Ciencias Biológicas."+
                "Planificación y conducción de proyectos de investigación biológica."+
                "Participación en el estudio y desarrollo de procesos biotecnológicos."+
                "Realización de investigación aplicada, diseño y ejecución de estrategias de aprovechamiento de los Recursos Naturales Renovables."+
                "Desarrollo de Proyectos tendientes a la conservación del equilibrio ecológico."+
                "Intervención en el diseño y manejo de áreas protegidas."+
                "Investigación sobre la incidencia de efluentes industriales en la contaminación ambiental."+
                "Elaboración, desarrollo, control y seguimiento de emprendimientos destinados al tratamiento de residuos o provenientes de cualquier tipo de actividad humana."+
                "Realiza actividades de peritaje en el área de las Ciencias Biológicas.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera("5 años");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		listCarrera.add(carrera);
		
		///////////////////////////
		carrera =new Carrera();
		carrera.setId_carrera(3);
		carrera.setTitulo_carrera("LIC. EN BROMATOLOGIA");
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera("Licenciado en Bromatología  ");
		carrera.setPerfil_carrera("A través de su conocimiento el Licenciado en Bromatología podrá desempeñarse en:"+
"Planificación y supervisión de la sanidad e higiene de establecimientos y equipos relacionados a la producción y comercialización de productos alimenticios."+
"Interpretación de resultados de análisis y determinación de calidad y aptitud para el consumo y la comercialización de alimentos, en cuanto a origen, elaboración y conservación."+
"Docencia e investigación científica en Instituciones privadas u oficiales."+
"Trabajos en laboratorios para el análisis físico, químico y biológico a los efectos de determinar el grado de contaminación de las materias primas y los productos alimenticios.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera("4 1/2 Años (Incluye Trabajo Final y Práctica Profesional)     ");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		listCarrera.add(carrera);
		
		//////////////////////////////////
		carrera =new Carrera();
		carrera.setId_carrera(4);
		carrera.setTitulo_carrera("Bromatólogo");
		carrera.setNivel_carrera("Título de PreGrado");
		carrera.setAcreditacion_carrera("Bromatólogo");
		carrera.setPerfil_carrera("A través de su conocimiento el Licenciado en Bromatología podrá desempeñarse en:"+
"Planificación y supervisión de la sanidad e higiene de establecimientos y equipos relacionados a la producción y comercialización de productos alimenticios."+
"Interpretación de resultados de análisis y determinación de calidad y aptitud para el consumo y la comercialización de alimentos, en cuanto a origen, elaboración y conservación."+
"Docencia e investigación científica en Instituciones privadas u oficiales."+
"Trabajos en laboratorios para el análisis físico, químico y biológico a los efectos de determinar el grado de contaminación de las materias primas y los productos alimenticios.");
		carrera.setAlcance_carrera(null);
		carrera.setDuracion_carrera(" 3 1/2 Años   ");
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
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera(" Licenciado en Comunicación Social (R.M. 1121/94)");
		carrera.setPerfil_carrera("Un Licenciado en Comunicación Social estará capacitado para:"+
"Diseñar o implementar actividades de Comunicación Social orientadas a la Comunidad para promover el desarrollo humano, social, educativo, preventivo, en áreas rurales y urbanas."+
"Organizar y coordinar campañas de salud, proyectos de viviendas; políticas, económicas y sociales en sindicatos y organizaciones intermedias."+
"Diseñar campañas publicitarias en empresas privadas y agencias de publicidad."+
"Realizar tareas de Docencia e Investigación en Centros de investigación y Formación de Profesionales de los distintos niveles del Sistema Educativo."+
"Realizar, coordinar y dirigir actividades periodísticas en medios gráficos, audiovisuales y agencias noticiosas, tanto en la producción periodística como en la evaluación, selección e interpretación de la información."+
"Comprender acciones tendientes al diagnóstico, planificación y diseño de políticas y estrategias de Comunicación Social a nivel nacional, regional y zonal en organizaciones gubernamentales, privadas y no gubernamentales.");
	 carrera.setAlcance_carrera(null);
	 carrera.setDuracion_carrera("5 años");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
	 listCarrera.add(carrera);
	 //////////////////////////////////////
		carrera = new Carrera();
		carrera.setId_carrera(2);
		carrera.setTitulo_carrera("TECNICO EN COMUNICACION SOCIAL");
		carrera.setNivel_carrera("Título de PreGrado");
		carrera.setAcreditacion_carrera("Técnico en Comunicación Social (R.M. 1121/94)");
		carrera.setPerfil_carrera("Un Técnico en Comunicación Social estará capacitado para:"
				+ "Desempeñarse en Periódicos y Revistas, en cargos como los de Corrector de Pruebas, Diagramador, Cronista Gráfico, Cronista Redactor, Corresponsal, Jefe de Noticias, Jefe de Redacción, Secretario de Redacción, Editorialista, Colaborador."
				+ "Trabajar en Radio y Televisión en carácter de: Reportero, Redactor-locutor, Corresponsal, Jefe de Noticias, Jefe de Redacción, Editorialista. "
				+ "Ejercer tareas en el ámbito de la Administración Pública como: Redactor, Jefe o Encargado de prensa a nivel de Gobierno Nacional, Gobierno Provincial, Municipalidades y Universidades: asimismo Agregado de Prensa en Embajadas y Legaciones."
				+ "Desempeñar tareas en la actividad privada, es el campo de la Comunicación Intermedia y en el de la Comunicación Social en: empresas, gremios, bancos, centros vecinales, instituciones de bien público y deportivo."
				+ "Ejercer tareas en las Agencias Noticiosas locales, Nacionales e Internacionales, desempeñándose como Reportero, Corresponsal, Redactor, Cronista Gráfico o colaborador."
				+ "Desempeñar tareas en corresponsalías de Agencias Noticiosas, Diarios, Periódicos, Radios y Televisión.");
		carrera.setAlcance_carrera("");
		carrera.setDuracion_carrera("3 años");
		carrera.setId_grado(Constants.CARRERA_PREGADO);
		carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
		listCarrera.add(carrera);
    
		
	
    carrera=new Carrera();
    carrera.setId_carrera(3);
    carrera.setTitulo_carrera("PROF . Y LIC. EN CIENCIAS DE LA EDUCACION");
    carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera("Profesor en Ciencias de la Educación (R.M. 2032/84 y R.M. 1076/98 - se accede cursando el módulo de Residencia)"
				+ "Licenciado en Ciencias de la Educación (R.M. R.M.2032/84, R.M. 1076/98, R.M. 0521/99, R.M.0552/05 - se accede cursando el módulo de trabajo de campo e investigación).");
		carrera.setPerfil_carrera("");
		carrera.setAlcance_carrera("Planificar, conducir y evaluar procesos de enseñanza-aprendizaje para la educación formal, no formal e informal; presencial y a distancia."
				+ "Elaborar y evaluar modelos y propuestas curriculares, a nivel macro y micro educativo, para la educación formal, no formal e informal; presencial y a distancia."
				+ "Diseñar, dirigir, ejecutar y evaluar planes, programas y proyectos y culturales."
				+ "Elaborar, ejecutar y evaluar modelos y diseños de administración educacional."
				+ "Diseñar, dirigir, ejecutar y evaluar proyectos de investigación educativa."
				+ "Diseñar, producir y evaluar materiales educativos de distinta tecnológica."
				+ "Planificar, conducir y evaluar programas de formación, perfeccionamiento y actualización, para el desempeño de los distintos roles educativos."
				+ "Diseñar, dirigir, ejecutar y evaluar programas y proyectos destinados a la capacitación de recursos humanos."
				+ "Planificar, conducir y evaluar procesos de enseñanza-aprendizaje destinados a personas con necesidades especiales."
				+ "Elaborar, ejecutar y evaluar planes, programas y proyectos y acciones de prevención y asistencia psicopedagógica, destinados a personas con dificultades de aprendizaje."
				+ "Elaborar, ejecutar y evaluar planes, programas y proyectos de información y orientación educacional, vocacional y ocupacional."
				+ "Administrar y organizar unidades y servicios educativos y pedagógicos."
				+ "Asesorar en la formulación de políticas educativas y culturales."
				+ "Asesorar en la elaboración de normas jurídicas en materia educativa y las inherentes a la actividad profesional."
				+ "Brindar asesoramiento pedagógico a instituciones educativas y comunitarias."
				+ "Participar, desde la perspectiva educativa, en la elaboración, ejecución y evaluación de planes, programas y proyectos de acción sociocultural en comunidades."
				+ "Asesorar en la formulación de criterios y normas destinadas a promover la dimensión educativa de los medios de comunicación social."
				+ "Asesorar para el diseño y planeamiento de los espacios y de la infraestructura  destinados a actividades educativas, recreativas y culturales.");
		carrera.setDuracion_carrera("");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
		listCarrera.add(carrera);

     carrera=new Carrera();
     carrera.setId_carrera(4);
     carrera.setTitulo_carrera("LICENCIADO EN ANTROPOLOGIA");
     carrera.setNivel_carrera("Título de Grado");
     carrera.setAcreditacion_carrera("Licenciado en Antropología (R.M. 2034/84 - R.M. 2269/98). 10 cuatrimestres");
     carrera.setPerfil_carrera("");
     carrera.setAlcance_carrera("El licenciado tiene puede realizar estudios, dirigir investigaciones y asesorar sobre"+
"Los modos de vida como expresión del comportamiento cultural, resultado de los cambios producidos a través del tiempo."+
"Las configuraciones culturales en su unidad y diversidad, consideradas como sistemas sociales, productivos, tecnológicos e ideológicos que integran al individuo a su medio socio-cultural."+
"La unidad y variación del comportamiento humano sobre la base del análisis, descripción, comparación y explicación de los comportamientos culturales."+
"La reconstrucción de formas de vida o comportamientos, vigentes en el pasado a través del estudio d restos y vestigios materiales."+
"Los métodos y técnicas apropiados para la indagación científica en su campo específico."+
"Participar en equipos interdisciplinarios responsables de la elaboración y evaluación de planes, programas y proyectos relacionados con la problemática socio-cultural."+
"Intervenir en arbitrajes, peritajes y todas aquellas actividades que requieran del ámbito de su especialidad."+
"Elaborar proyectos de protección de yacimientos y riquezas arqueológicas");
    carrera.setId_grado(Constants.CARRERA_GRADO);
	carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
	listCarrera.add(carrera);
	///////////////
	carrera=new Carrera();
	carrera.setId_carrera(5);
	carrera.setTitulo_carrera(" AUXILIAR TECNICO EN ANTROPOLOGIA");
	carrera.setNivel_carrera("Título de PreGrado");
	carrera.setAcreditacion_carrera("(R.M. 2269/98). Requisitos aprobar las primeras 18 materias incluyendo el 1º nivel de inglés.");
	carrera.setPerfil_carrera("");
	carrera.setAlcance_carrera("El licenciado tiene puede realizar estudios, dirigir investigaciones y asesorar sobre"+
			"Los modos de vida como expresión del comportamiento cultural, resultado de los cambios producidos a través del tiempo."+
			"Las configuraciones culturales en su unidad y diversidad, consideradas como sistemas sociales, productivos, tecnológicos e ideológicos que integran al individuo a su medio socio-cultural."+
			"La unidad y variación del comportamiento humano sobre la base del análisis, descripción, comparación y explicación de los comportamientos culturales."+
			"La reconstrucción de formas de vida o comportamientos, vigentes en el pasado a través del estudio d restos y vestigios materiales."+
			"Los métodos y técnicas apropiados para la indagación científica en su campo específico."+
			"Participar en equipos interdisciplinarios responsables de la elaboración y evaluación de planes, programas y proyectos relacionados con la problemática socio-cultural."+
			"Intervenir en arbitrajes, peritajes y todas aquellas actividades que requieran del ámbito de su especialidad."+
			"Elaborar proyectos de protección de yacimientos y riquezas arqueológicas");
			    carrera.setId_grado(Constants.CARRERA_PREGADO);
				carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
				
   listCarrera.add(carrera);
   
   //////////////////////////////////////////////
   carrera=new Carrera();
   carrera.setId_carrera(6);
   carrera.setTitulo_carrera("PROFESOR EN LETRAS "+
                             "LICENCIATURA EN LETRAS ");
   carrera.setNivel_carrera("Título de Grado");
   carrera.setDuracion_carrera("Profesor en Letras C.S. 280/06. 4 años"+
"Licenciado en Letras C.S. 280/06. 5 años y Tesina Final");
   carrera.setAcreditacion_carrera("Profesor en Letras C.S. 280/06. 4 años"
                                   +"Licenciado en Letras C.S. 280/06. 5 años y Tesina Final");
   carrera.setPerfil_carrera("PERFIL DEL PROFESOR"+
"Planificar, conducir y evaluar el proceso enseñanza-aprendizaje de la lengua y la literatura en los establecimientos educacionales de nivel medio y superior."+
"Integrar equipos de trabajo para el estudio y revisión de la metodología para la enseñanza de la lengua y la literatura en el nivel medio y superior."+
"Actualizar, adecuar y medir las técnicas de lecto-escritura."+
"Asesorar en su área a organismos científicos, técnicos y culturales oficiales o privados"+
"Integrar equipos de trabajo en los medios masivos de comunicación"+
"Asesorar y/o integrar equipos de trabajo para programas de alfabetización en el área de la lengua y la literatura"+
"Trabajar en el ámbito editorial"+
"Trabajar en el periodismo como crítico literario, corrector de estilo y de prueba."+
"Integrar equipos de investigación disciplinaria e interdisciplinaria."+
"PERFIL DEL LICENCIADO"+
"Investigar, en forma individual o como integrante de grupos disciplinarios o interdisciplinarios, en centros universitarios de investigación u otros estatales o privados destinados a la investigación en el área de la lingüística, de la literatura o las lenguas y literatura clásicas."+
"Asesorar en su área a organismos, municipios, direcciones de cultura, etc."+
"Integrar equipos de trabajo en los medios de comunicación."+
"Asesorar y/o integrar equipos de trabajos para programas de alfabetización en el área de lengua y literatura."+
"Trabajar en el ámbito editorial."+
"Trabajar en el periodismo especializado o general."+
"Ejercer la docencia universitaria y en otros niveles de educación.");
 carrera.setAlcance_carrera("");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
 
  //////////////////////////////
   carrera=new Carrera();
   carrera.setId_carrera(7);
   carrera.setTitulo_carrera("LICENCIADO EN TRABAJO SOCIAL");
   carrera.setNivel_carrera("Título de Grado");
   carrera.setAcreditacion_carrera("Licenciado en Trabajo Social (R.M. Nº 110/95)  -  4 semestres");
   carrera.setAlcance_carrera(
"Intervenir, a través de la investigación diagnóstico y/o tratamiento, en las relaciones entre individuos, grupos, instituciones y comunidades a nivel preventivo, asistencial, promocional y/o de rehabilitación por la aplicación de técnicas y métodos específicos."+
"Formular, dirigir, ejecutar y evaluar planes, programas y proyectos destinados a actuar sobre las causas que originan situaciones sociales problemáticas, interviniendo profesionalmente para lograr la participaci6n responsable y activa de los sujetos de dichas acciones."+
"Participar en la elaboración de política de acción social contribuyendo a su coherencia con la realidad y equilibrio en la relación recurso-necesidad."+
"Dirigir organismos e instituciones públicas o privadas de Bienestar Social, así como organizar, administrar, conducir y supervisar loe mismos."+
"Dirigir organismos de formación profesional en Trabajo Social y dictar cátedras de las materias especificas."+
"Intervenir en arbitrajes, asesoramientos, peritajes y todos aquellas actividades Ilegales o vinculadas al ámbito del Trabajo Social."+
"Diseñar, ejecutar y evaluar Proyectos de Investigación en temas específicos dentro del contexto socio-económico y cultural."+
"Participar en investigación, diseño, ejecución y evaluación de Programas de Desarrollo como parte integrante de equipos interdisciplinarios."+
"Cualquier, otra actividad que importe participación de un profesional del Trabajo Social y tienda al logro del Bienestar Social.");  
 carrera.setPerfil_carrera("Lo que caracteriza al Trabajo Social es la praxis social, es el contacto directo, cotidiano y continuado con la realidad social, su actuación con el hombre en su realidad histórica presente y la planificación de cara al futuro. Por ende, el Licenciado en Trabajo Social es un graduado universitario con adecuada formación en las líneas curriculares sociológica, psicológica, pedagógica, antropológica, filosófica y de investigaci6n que le permiten el conocimiento, comprensión y operacionalización de los principios y técnicas propios de la indagación de la realidad social. ");
 
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
  
 ////////////////////////////////////
 carrera=new Carrera();
 carrera.setId_carrera(8);
 carrera.setTitulo_carrera("LICENCIADO EN EDUCACION PARA LA SALUD");
 carrera.setNivel_carrera("Título de Grado");
 carrera.setDuracion_carrera("5 años");
 carrera.setAcreditacion_carrera("Licenciado en Educación para la Salud (R.M. 0297/00).  2.838.horas");
 carrera.setPerfil_carrera("");
 carrera.setAlcance_carrera("Participar en equipos interdisciplinarios responsables de planificar, ejecutar, evaluar programas de Educación para la Salud, tendientes a promover acciones que mejoren la calidad de las prestaciones y servicios brindados en el medio."+
"Participar en la organización y supervisión de las prestaciones de servicios de salud en los sectores públicos, privados y comunitarios."+
"Desarrollar programas de higiene y seguridad de trabajo tendientes a un mayor margen de seguridad de trabajo tendientes a un mayor margen de seguridad y cobertura sanitaria para los trabajadores."+
"Integrar equipos responsables de los planes de desarrollo comunitario, promoviendo la participación autogestionaria de los diferentes grupos en el planeamiento, ejecución y evaluación de su atención en salud."+
"Prestar servicios en unidades técnicas tales como: Departamento de Educación para la Salud, Hospitales, cabeceras de áreas programáticas, puestos de salud."+
"Departamentos Pedagógicos de Servicios Centrales y Descentralizados del Área de Educación, unidades educativas o equivalentes del ámbito nacional, provincial y municipal, así como en gremios, obras sociales y otras instituciones que contemplen la problemática de la salud."+
"Asesorar a grupos comunitarios formales e informales en cuanto a cuidados de salud promoviendo acciones tendientes a preservar la salud de ñla población."+
"Participar en la elaboración y ejecución de proyectos preventivos sobre la base de un conocimiento integral de la problemática de la región, que ponga de relieve las atenciones priorizadas."+
"Adecuar con creatividad y juicio crítico las estrategias básicas en su accionar e la ejecución de proyectos y de acuerdo a las características de los destinatarios de los mismos."+
"Planificar y ejecutar programas de Educación para la Salud en medios de comunicación social utilizando óptimamente el grado de cobertura de los mismos."+
"Cubrir tareas docente sobre problemáticas específicas ámbito de educación formal y no formal."+
"Diseñar y estructurar recursos didácticos de diferente complejidad orientados a la Educación para la Salud.");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
 ///////////////////////////////////////////
 carrera=new Carrera();
 carrera.setId_carrera(9);
 carrera.setTitulo_carrera("EDUCADOR SANITARIO");
 carrera.setNivel_carrera("Título de Grado");
 carrera.setDuracion_carrera("4 años");
 carrera.setAcreditacion_carrera("Educador Sanitario R.M. (2614/94).4 años.");
 carrera.setPerfil_carrera("");
 carrera.setAlcance_carrera("Participar en equipos interdisciplinarios responsables de planificar, ejecutar, evaluar programas de Educación para la Salud, tendientes a promover acciones que mejoren la calidad de las prestaciones y servicios brindados en el medio."+
"Participar en la organización y supervisión de las prestaciones de servicios de salud en los sectores públicos, privados y comunitarios."+
"Desarrollar programas de higiene y seguridad de trabajo tendientes a un mayor margen de seguridad de trabajo tendientes a un mayor margen de seguridad y cobertura sanitaria para los trabajadores."+
"Integrar equipos responsables de los planes de desarrollo comunitario, promoviendo la participación autogestionaria de los diferentes grupos en el planeamiento, ejecución y evaluación de su atención en salud."+
"Prestar servicios en unidades técnicas tales como: Departamento de Educación para la Salud, Hospitales, cabeceras de áreas programáticas, puestos de salud."+
"Departamentos Pedagógicos de Servicios Centrales y Descentralizados del Área de Educación, unidades educativas o equivalentes del ámbito nacional, provincial y municipal, así como en gremios, obras sociales y otras instituciones que contemplen la problemática de la salud."+
"Asesorar a grupos comunitarios formales e informales en cuanto a cuidados de salud promoviendo acciones tendientes a preservar la salud de ñla población."+
"Participar en la elaboración y ejecución de proyectos preventivos sobre la base de un conocimiento integral de la problemática de la región, que ponga de relieve las atenciones priorizadas."+
"Adecuar con creatividad y juicio crítico las estrategias básicas en su accionar e la ejecución de proyectos y de acuerdo a las características de los destinatarios de los mismos."+
"Planificar y ejecutar programas de Educación para la Salud en medios de comunicación social utilizando óptimamente el grado de cobertura de los mismos."+
"Cubrir tareas docente sobre problemáticas específicas ámbito de educación formal y no formal."+
"Diseñar y estructurar recursos didácticos de diferente complejidad orientados a la Educación para la Salud.");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
 ////////////////////////
 carrera=new Carrera();
 carrera.setId_carrera(10);
 carrera.setTitulo_carrera("CICLO SUPERIOR DE LICENCIATURA EN FILOSOFIA");
 carrera.setNivel_carrera("Título de Grado");
 carrera.setDuracion_carrera(" 5 cuatrimestres");
 carrera.setAcreditacion_carrera("Licenciado en Filosofía (R.M. Nº 335/00)  .");
 carrera.setPerfil_carrera("");
 carrera.setAlcance_carrera("");
 carrera.setId_grado(Constants.CARRERA_GRADO);
 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
 listCarrera.add(carrera);
 
   
return listCarrera;
		
		
	}
}
