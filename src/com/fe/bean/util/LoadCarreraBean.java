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
		carrera.setTitulo_carrera("INGENIERÍA QUÍMICA");
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera(" <br>Resolución Ministerial Nº 1856/83"+
          "<br>Resolución CONEAU Nº 552/08"+
          "<br>Resolución CONEAU Nº 628/04");
		carrera.setPerfil_carrera("<br>1. Desempeñarse eficaz y eficientemente en un ámbito tecnológico de"
				+ "complejidad creciente de permanente cambio."
				+ "<br>2. Asumir responsablemente la preservación del medio ambiente."
				+ "<br>3. Desenvolverse en equipos multidisciplinarios."
				+ "<br>4. Buscar, seleccionar, aprender y aplicar conocimientos nuevos y aún"
				+ "abordar algunos no referidos específicamente con su profesión. "
				+ "<br>5. Prever, detectar y comprender los cambios de las condiciones externas,"
				+ "tanto tecnológicas como económicas, sociales y culturales, y producir"
				+ "respuestas apropiadas a ellos rápidamente."
				+ "<br>6. Encarar la búsqueda de las soluciones a los problemas tecnológicos "
				+ "sustentándose en las ciencias matemáticas, físicas y químicas, y"
				+ "acompañándolas con criterio económico, ambientalista y social. "
				+ "<br>7. Ejercer su profesión con sentido ético y responsabilidad social en la"
				+ "búsqueda del bienestar común.");
		carrera.setAlcance_carrera("<br>1. Estudio, factibilidad, proyecto, dirección, construcción, instalación,"+
 "inspección, operación y mantenimiento (excepto de obras civiles e"
				+ "industriales) de:"
				+ "<br>2. Industrias que involucren procesos químicos, fisicoquímicos, de"
				+ "bioingeniería y sus instalaciones complementarias."
				+ "<br>3. Instalaciones donde intervengan operaciones unitarias y/o procesos"
				+ "unitarios."
				+ "<br>4. Instalaciones destinadas a evitar la contaminación ambiental por"
				+ "efluentes de todo tipo originados por la industria y/o sus servicios."
				+ "<br>5. Equipos, maquinarias, aparatos e instrumentos para las industrias"
				+ "indicadas en los incisos anteriores."
				+ "<br>6. Estudios, tareas y asesoramientos relacionados con:"
				+ "<br>7. Aspecto funcional de las construcciones industriales y de servicios"
				+ "indicados en el párrafo i) y sus obras e instalaciones complementarias."
				+ "<br>8. Factibilidad del aprovechamiento e industrialización de los recursos"
				+ "naturales y materias primas que sufran transformación y elaboración"
				+ "de nuevos productos."
				+ "<br>9. Planificación, programación, dirección, organización, racionalización,"
				+ "control y optimización de los procesos industriales de las industrias"
				+ "citadas en el párrafo"
				+ "<br>10. Asuntos de Ingeniería Legal, Económica y Financiera relacionados con"
				+ "los incisos anteriores.");
		
		carrera.setDuracion_carrera("5 años");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_INGENIERIA_ID);
	    listCarrera.add(carrera);
	   
	    //INGENIERO DE MINAS
	    carrera=new Carrera();
	    carrera.setId_carrera(2);
		carrera.setTitulo_carrera("INGENIERO EN MINAS");
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera("Resolución Ministerial Nº 1856/8"+
         "<br>Resolución CONEAU Nº 555/08"+
         "<br>Resolución CONEAU Nº 627/04"  +
		 "<br>Carrera Acreditada");
		
		carrera.setPerfil_carrera("El Perfil del Egresado es polivalente, tal que le permita actuar de modo interdisciplinario con"+
"otras áreas involucradas en su actividad. Como Ingeniero de Minas será capaz de:"+
"<br>1. Establecer políticas, objetivos y estrategias. "+
"<br>2. Gestionar sus actividades específicas."+
"<br>3. Dirigir, proyectar, controlar y mantener las explotaciones mineras de yacimientos metalíferos, no"+
"<br>metalíferos, geotérmicos, rocas de aplicación y de combustibles sólidos, líquidos y gaseosos que"+
"<br>para su obtención requieran el uso de tecnología minera."+
"<br>4. Dirigir y controlar la totalidad de las actividades requeridas hasta su efectiva concreción teniendo"+
"<br>en cuenta los criterios de seguridad, impacto ambiental, relaciones humanas, calidad,"+
"productividad y costos."+
"<br>5. Dirigir, diseñar y ejecutar obras relacionadas con el uso de explosivos, la voladura de rocas y"+
"movimiento de suelos. El manejo y buen uso de los explosivos hacen de este profesional un"+
"asistente indiscutido de la ingeniería vial y de construcciones."+
"<br>6. En el área del procesamiento de los materiales, dirigir, diseñar y optimizar plantas de trituración,"+
"molienda, clasificación y concentración de productos minerales, alimenticios y cualquier otro"+
"producto industrial. Estar capacitado para el estudio, di-seño y ubicación de residuos industriales"+
"(relaves) y comunitarios, entre otros."+
"<br>7. En el campo de la metalurgia extractiva, dirigir, diseñar y controlar plantas industriales donde se"+
"realizan procesos pirometalúrgicos, hidrometalúrgicos y combinados. "+
"<br>8. Comercializar, seleccionar y abastecer insumos, maquinarias, productos e instrumentales"+
"específicos. Gestionar la logística para la producción. Actuar en el desarrollo de proveedores de"+
"materias primas e insumos. Programar, coordinar y controlar servicios y suministros."+
"<br>9. Desarrollar sus actividades en plena armonía con el medio ambiente."+
"<br>10. Realizar trabajos topográficos y geodésicos necesarios para la ubicación de puntos fijos en"+
"superficie y mensura de pertenencias mineras y de cateos."+
"<br>11. Generar y liderar emprendimientos empresariales y actividades legales que le permiten asumir"+
"funciones de planificación y dirección empresaria. Actuar en consultorías. Formular y evaluar la"+
"factibilidad técnico-económica y financiera de proyectos de emprendimientos."+
"<br>12. Valorar la responsabilidad social de su desempeño profesional."+ 
"<br>13. Buscar, seleccionar, aprender y aplicar nuevos conocimientos."+
"<br>14. Desempeñarse en el ámbito científico, tecnológico y educativo."+
"<br>15. Desarrollar aplicaciones tecnológicas relacionadas con su formación profesional en temas"+
"referentes a su especialidad y afines.");
		carrera.setAlcance_carrera("El título profesional obtenido por el Egresado de la carrera de Ingeniero de Minas, lo habilita"+
"para realizar:"+
"<br>1) Estudios, proyecto, dirección y ejecución de obras concernientes a la exploración y explotación de"+
"yacimientos minerales de todo tipo, ubicados en el suelo o subsuelo, comprendiendo:"+
"<br>a) Estudios minero-geológicos y químico mineralúrgicos de yacimientos, minas, minerales y rocas."+
"b) Muestreos, determinación de reservas, estudios económico-financieros, evaluación de los"+
"yacimientos minerales."+
"c) Construcciones e Instalaciones mineras civiles, industriales y electromecánicas des-tinadas a"+
"viviendas, depósitos, talleres, salas de motores y máquinas; extracción, transporte, quebrantado,"+
"trituración y molienda, clasificación y almacenado, y concentración de sustancias minerales de"+
"todo tipo, por medios mecánicos, neumáticos magnéticos, electrostáticos, hidro y"+
"pirometalúrgicos."+
"d) Obras de provisión de agua, energía, desagües, producción y distribución de aire comprimido,"+
"ventilación e iluminación."+
"e) Mecánica de suelos, voladuras de rocas, trabajos con explosivos, excavaciones de pozos, galerías,"+
"túneles, obras de contención y sostén de empujes de terrenos. "+
"f) Evacuación y cerramiento de las aguas, galerías de derrame, sistemas de bombeo, terraplenes y"+
"represas."+
"g) Servicios auxiliares para el mantenimiento de motores y máquinas de uso minero, herramientas y"+
"lamparería."+
"<br>2) Operaciones topográficas y geodésicas relativas a las tareas señaladas en el capítulo 1) que"+
"corresponden a:"+
"a) Mensuras privadas y judiciales de yacimientos minerales, concesiones de exploración y cateo y de"+
"explotación."+
"b) Determinaciones para el cálculo de coordenadas geográficas, rumbos y azimutes."+
"c) Relevamiento de superficie y de labores subterráneas de todo tipo."+
"d) Operaciones de triangulación necesarias para la ubicación de los distritos mineros y sus"+
"yacimientos."+
"<br>3) Estudios, asesoramiento de ingeniería legal, relativos a la Legislación minera y del trabajo en las"+
"minas y canteras, comprendiendo:"+
"a) La aplicación de las disposiciones legales emanadas del Código de Minería, Leyes, Decretos y"+
"reglamentaciones conexas."+
"b) Contratos de exploración y explotaciones de los yacimientos de minerales y organización del"+
"trabajo."+
"c) Higiene y seguridad en las minas y canteras, elaboración y aplicación de las disposiciones"+
"correspondientes a la policía minera."+
"<br>4) Arbitrajes, pericias y tasaciones, referidas a los yacimientos de minerales, su concesión y" +
"aprovechamiento."+
"<br>5) Enseñanza e investigación de los conocimientos básicos, técnicos y científicos de los temas" +
"contenidos en la carrera, en todos los niveles de acuerdo con las reglamentaciones existentes al"+
"efecto.");
		carrera.setDuracion_carrera("5 años");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_INGENIERIA_ID);
	    listCarrera.add(carrera);
	    
	    
	    /////////////////////////////////////
	    ////INGENIERIA INDUSTRIAL
	    carrera=new Carrera();
	    carrera.setId_carrera(3);
		carrera.setTitulo_carrera("INGENIEIA INDUSTRIAL");
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera("Resolución Ministerial Nº 335/02."+
				"<br>Resolución CONEAU Nº 514/07"+
                "<br>CARRERA ACREDITADA");
		carrera.setPerfil_carrera("La Ingeniería Industrial tiene por objeto la planificación, organización, análisis, medición y"+
"control de los hechos de cualquier naturaleza que ocurren en una empresa buscando optimizar la"+
"producción minimizando los costos. Por lo tanto con la presente carrera se espera conseguir el"+
"siguiente objetivo: formar profesionales con una sólida base científica y tecnológica,"+
"competentes en la gestión de empresas y organización de sistemas productivos, la interpretación"+
"de nuevas tecnologías y de los desarrollos económicos para la toma de decisiones en el diseño y"+
"dirección de las organizaciones, la coordinación e integración de sistemas que requieran de"+
"conocimientos científicos, tecnológicos y de comercialización, así como el manejo de relaciones"+
"interpersonales con capacidad de trabajar en equipo."+
"Se espera lograr que el graduado en Ingeniería Industrial esté formado en:"+
"<br>1. Ciencias básicas de la Ingeniería: Matemáticas, Física, Química, Informática."+
"<br>2. Ciencias de las Ingenierías Mecánica, Química, Civil y Electrónica."+
"<br>3. Ciencias propias de la especialidad: Investigación Operativa, Economía, Finanzas de"+
"Empresas, Comercialización, Organización de la Producción, Sistemas de Información,"+
"Gestión Empresaria."+
"<br>4. Complementos a los conocimientos anteriores con los de Proyectos, Prácticas Profesionales"+
"Supervisadas y otros trabajos de campo."+
"<br>5. El Ingeniero Industrial debe poseer aptitudes para las ciencias lógico-matemáticas,"+
"capacidad de análisis, talento para establecer relaciones interpersonales y vocación para"+
"aceptar el desafío de afrontar problemas y situaciones nuevas en los sistemas productivos,"+
"estableciendo las alternativas de solución.");
carrera.setAlcance_carrera("El Ingeniero Industrial resulta competente para:"+
"<br>1. Realizar estudios de factibilidad, proyectar, dirigir, implementar, operar y evaluar el"+
"proceso de producción de bienes industrializados y la administración de los recursos"+
"destinados a la producción de dichos bienes."+
"<br>2. Planificar y organizar plantas industriales y plantas de transformación de recursos naturales"+
"en bienes industrializados y servicios. "+
"<br>3. Proyectar las instalaciones necesarias para el desarrollo de procesos productivos"+
"destinados a la producción de bienes industrializados y dirigir su ejecución y"+
"mantenimiento. "+
"<br>4. Proyectar, implementar y evaluar el proceso destinado a la producción de bienes"+
"industrializados. "+
"<br>5. Determinar las especificaciones técnicas y evaluar la factibilidad tecnológica de los"+
"dispositivos, aparatos y equipos necesarios para el proceso destinado a la producción de"+
"bienes industrializados."+
"<br>6. Programar y organizar el movimiento y almacenamiento de materiales para el desarrollo"+
"del proceso productivo y de bienes industrializados resultantes."+
"<br>7. Participar en el diseño de productos en lo relativo a determinación de la factibilidad de su"+
"elaboración industrial. "+
"<br>8. Determinar las condiciones de instalación y de funcionamiento que aseguren que el"+
"conjunto de operaciones necesarias para la producción y distribución de bienes"+
"industrializados se realice en condiciones de higiene y seguridad; establecer las"+
"especificaciones de equipos, dispositivos y elementos de protección y controlar su"+
"utilización. "+
"<br>9. Realizar la planificación, organización, conducción y control de gestión del conjunto de"+
"operaciones necesarias para la producción y distribución de bienes industriales. "+
"<br>10. Determinar la calidad y cantidad de los recursos humanos para la implementación y"+
"funcionamiento del conjunto de operaciones necesarias para la producción de bienes"+
"industrializados; evaluar su desempeño y establecer los requerimientos de capacitación."+
"<br>11. Efectuar la programación de los requerimientos financieros para la producción de bienes"+
"industrializados."+
"<br>12. Asesorar en lo relativo al proceso de producción de bienes industrializados y la"+
"administración de los recursos destinados a la producción de dichos bienes."+
"<br>13. Efectuar tasaciones y valuaciones de plantas industriales en lo relativo a: sus instalaciones"+
"y equipos, sus productos semielaborados y elaborados y las tecnologías de transformación"+
"utilizadas en la producción y distribución de bienes industrializados. "+
"<br>14. Realizar arbitrajes y peritajes referidos a: planificación y organización de plantas"+
"industriales, sus instalaciones y equipos, el proceso de producción, los procedimientos de"+
"operación y las condiciones de higiene y seguridad en el trabajo, para la producción y"+
"distribución de bienes industrializados.")	;
carrera.setDuracion_carrera("5 años");
carrera.setId_grado(Constants.CARRERA_GRADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

 
////////////////////////////////
//INGENIERIA EN INFORMATICA

carrera=new Carrera();
carrera.setId_carrera(4);
carrera.setTitulo_carrera("INGENIEIA INFORMATICA");
carrera.setNivel_carrera("Título de Grado");
carrera.setAcreditacion_carrera("Resolución Ministerial Nº 335/02. "+
"<br>Resolución CONEAU Nº 1220/12");
carrera.setPerfil_carrera("El Ingeniero Informático de la Facultad de Ingeniería de la Universidad Nacional de Jujuy posee "+
"una sólida formación conceptual en contenidos de Ciencias Básicas, comunes a todas las Carreras de "+
"Ingeniería, para sustento y desarrollo de las disciplinas específicas y un adecuado dominio de las"+ 
"Tecnologías Básicas traducido en la aplicación creativa del conocimiento de los principios "+
"fundamentales de las diferentes disciplinas, a la solución de problemas de Ingeniería Informática. "+
"<br>Desarrolla competencias para la identificación y solución de problemas abiertos de ingeniería, "+
"cuyo tratamiento requiera aplicación de conocimientos de Ciencias Básicas y de las Tecnologías. Está "+
"capacitado para la toma de decisiones, la aplicación de técnicas modernas de gestión industrial, la"+ 
"interpretación de tecnologías de procesos y el sentido económico de las decisiones."+
"<br>Está formado para la Integración en grupos de trabajo uni o multidisciplinarios y concientizado "+
"del rol de la Educación Continua en la especialización y permanente actualización del graduado. Podrá "+
"conducir y administrar los recursos y el personal en el marco legal y ambiental apropiado; analizar e "+
"interpretar la realidad informática internacional, nacional, regional y local con una visión prospectiva"+ 
"contribuir a la solución de problemas de las organizaciones, nacionales e internacionales mediante la "+
"aplicación de tecnologías informáticas; contribuir al desarrollo científico y tecnológico de la Región y"+ 
"del País; liderar y asesorar en el desarrollo de proyectos informáticos integrando los recursos "+
"tecnológicos de última generación y participar en la definición de políticas y estrategias en el área "+
"informática");
carrera.setAlcance_carrera("El título profesional obtenido por el Egresado de esta carrera, según Resolución Ministerial Nº "+
"722/97, lo habilita para realizar:"+
"<br>1) Estudio, factibilidad, proyecto, planificación, dirección, realización, instalación, puesta en marcha, "+
"operación, ensayo, mediciones, mantenimiento, modificación, transformación e inspección de:"+
"<br>a)Sistemas de información administrativos de una organización incluyendo los procesos, "+
"organización de datos, comunicaciones y normas de seguridad para protección de la información "+
"con exclusión de los dispositivos físicos y el equipamiento computacional involucrado."+
"<br>b)Sistemas de información de medición, control y diseño aplicados a la ingeniería y a otras "+
"disciplinas incluyendo sus sistemas de programación asociados, con exclusión de los dispositivos "+
"físicos y el equipamiento computacional involucrado."+
"<br>c)Sistemas de información para la automatización, operación y control de redes y otros sistemas"+ 
"de telecomunicaciones, incluyendo los sistemas de programación asociados, con exclusión de los "+
"dispositivos físicos y el equipamiento computacional involucrado."+
"<br>d)Sistemas de simulación computacional para el estudio de modelos matemáticos y sus"+ 
"aplicaciones en la toma de decisiones y entrenamiento de personal, incluidos los sistemas de"+ 
"programación asociados, con exclusión de los dispositivos físicos y el equipamiento computacional"+ 
"involucrado."+
"<br>e)Sistemas clasificados como de inteligencia artificial en general y en particular sistemas expertos"+ 
"con exclusión de los dispositivos físicos y el equipamiento computacional involucrado."+
"<br>f)Laboratorios de todo tipo relacionados con los incisos anteriores excepto obras civiles."+
"<br>2) Evaluar, seleccionar, desarrollar y adaptar software de base."+
"<br>3) Evaluar y seleccionar los equipos relacionados con los incisos del ítem i), incluyendo la"+ 
"determinación de las pautas y especificaciones técnicas de los mismos."+
"<br>4) Realizar auditorías, estudios, tareas y asesoramientos relacionados con:"+
"<br>a)Asuntos de Ingeniería legal, económica y financiera relacionados con los incisos del ítem i)."+
"<br>b)Arbitrajes, pericias y tasaciones relacionados con los incisos del ítem i)."+
"<br>c)Higiene, seguridad industrial y contaminación ambiental relacionados con los incisos del ítem 1)."+
"<br>5) Organizar y dirigir el funcionamiento de las áreas informáticas."+
"<br>6) Realizar estudios de auditoría de las áreas informáticas y de los sistemas automatizados, desde el"+ 
"punto de vista de los sistemas informáticos"+
"<br>7) Evaluar y seleccionar proveedores de productos y servicios informáticos en conjunto con otros"+ 
"profesionales relacionados en la tarea."+
"<br>8) Asesorar acerca del uso de nuevas tecnologías de la información para posibilitar la definición de"+ 
"políticas y la toma de decisiones estratégicas de la organización.");
	    
carrera.setDuracion_carrera("5 años");
carrera.setId_grado(Constants.CARRERA_GRADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

//LICENCIATURA EN SISTEMAS
carrera=new Carrera();
carrera.setId_carrera(5);
carrera.setTitulo_carrera("LICENCIATURA EN SISTEMAS");
carrera.setNivel_carrera("Título de Grado");
carrera.setAcreditacion_carrera("Resolución Ministerial Nº 578/02."+
"<br>Resolución CONEAU Nº 1230/12");
carrera.setAlcance_carrera("El título profesional obtenido por el Egresado de la carrera de Licenciatura en "+
"Sistemas, lo habilita para:"+
		"<br>Planificar, dirigir, realizar y/o evaluar proyectos de relevamiento de problemas del"+ 
		"mundo real. Especificación formal, diseño, implementación, prueba, verificación, "+
		"validación, mantenimiento y control de calidad de sistemas de software que se ejecuten"+
		"sobre sistemas de procesamiento de datos."+
		"<br>Organizar, dirigir y controlar las áreas informáticas de las organizaciones, seleccionando"+ 
        "y capacitando al personal técnico de los mismos."+
		"<br>Dirigir el relevamiento y análisis de los procesos funcionales de una Organización, con la"+ 
"finalidad de dirigir proyectos de diseño de Sistemas de Información asociados, así como "+
"los Sistemas de Software que hagan a su funcionamiento. Determinar, regular y "+
"administrar las pautas operativas y reglas de control que hacen al funcionamiento de las"+ 
"áreas informáticas de las empresas y organizaciones."+
"<br>Entender, planificar y/o participar de los estudios técnicos-económicos de factibilidad y/o"+ 
"referentes a la configuración y dimensionamiento de sistemas de procesamiento de "+
"información. Supervisar la implantación de los sistemas de información y organizar y"+ 
"capacitar al personal afectado por dichos sistemas."+
"<br>Entender, planificar y/o participar de los estudios técnicos-económicos de factibilidad y/o"+ 
"referentes a la configuración y dimensionamiento de sistemas de procesamiento de "+
"información. Supervisar la implantación de los sistemas de información y organizar y" +
"capacitar al personal afectado por dichos sistemas."+
"<br>Entender, planificar y/o participar de los estudios técnicos-económicos de factibilidad y/o"+ 
"referentes a la configuración y dimensionamiento de sistemas de procesamiento de "+
"información. Supervisar la implantación de los sistemas de información y organizar y "+
"capacitar al personal afectado por dichos sistemas.");
carrera.setPerfil_carrera("• Profesional con significativos fundamentos teóricos en informática y conocimientos actualizados en"+ 
"tecnologías de información y comunicación, con una sólida formación académica que le permitirá la "+
"capacitación continua al ritmo de la evolución tecnológica."+
"<br>• Especialmente apto para la supervisión del desarrollo de productos software, así como la planificación,"+ 
"realización y control, de proyectos de sistemas de información. "+
"<br>• Capaz de brindar asesoramiento a distintas organizaciones sobre políticas y estrategias de desarrollo de"+ 
"sistemas, y organización del área de sistemas, determinando para ella el per-fil de los recursos humanos, su "+
"selección y formación, como también la definición de las arquitecturas de hardware y de software."+
"<br>• Orientado al mercado profesional, vinculado con la evaluación y selección de los Sistemas Informáticos,"+ 
"Computacionales Complejos, Distribuidos, de Comunicación, etc., "+
"<br>• Competente en la ejecución de arbitrajes y pericias relacionadas con Sistemas de Información."+
"• Dotado de un enfoque sistémico, que deberá aplicar al desarrollo operación y mantenimiento de los "+
"productos, como a actividades de Investigación y Transferencia de las que podrá formar parte.");
carrera.setDuracion_carrera("5 años");
carrera.setId_grado(Constants.CARRERA_GRADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

//LICENCIATURA EN TECNOLOGIA DE LOS ALIMENTOS
carrera=new Carrera();
carrera.setId_carrera(6);
carrera.setTitulo_carrera("LICENCIATURA EN TECNOLOGÍA DE LOS ALIMENTOS");
carrera.setNivel_carrera("Título de Grado");
carrera.setAcreditacion_carrera("Resolución Ministerial Nº 916/00");
carrera.setAlcance_carrera("El Licenciado en Tecnología de los Alimentos de esta Facultad de Ingeniería "+
"estará capacitado para desarrollar sus actividades en el sector industrial "+
"alimentario, de contralor bromatológico y en el sector Académico y de "+
"Investigación en Ciencia y Tecnología de Alimentos; siendo los alcances del Título:"+
"<br>1. Investigar sobre el desarrollo de nuevos productos alimenticios, las técnicas "+
"aplicables a su elaboración y conservación y los procesos biotecnológicos "+
"destinados a su obtención."+
"<br>2. Participar de grupos multidisciplinarios, en la planeación y ejecución de"+ 
"proyectos orientados a prever y solucionar problemas de producción "+
"alimentaria diferenciada, según requerimientos poblacionales."+
"<br>3. Realizar el control de calidad y optimizar las operaciones intervinientes en los"+ 
"procesos industriales de fabricación, transformación y/o fraccionamiento y "+
"envasado de productos alimenticios contemplados en la legislación y/o "+
"normativa vigente."+
"<br>4. Participar en la evaluación y actualización de normas y programas de control"+ 
"de calidad de alimentos, tendientes a asegurar la calidad nutricional e "+
"higiénico sanitaria de los mismos, en el marco de los nuevos escenarios "+
"regionales o internacionales."+
"<br>5. Realizar estudios de recursos alimentarios y asesorar sobre su"+ 
"aprovechamiento."+
"<br>6. Realizar análisis físico-químicos y microbiológicos de alimentos."+
"<br>7. Investigar y asesorar sobre los valores nutricionales de los alimentos y las"+ 
"técnicas más adecuadas para se mejoramiento nutricional.LICENCIATURA EN TECNOLOGÍA DE LOS ALIMENTOS"+
"<br>8. Participar en la prevención, control y solución de problemas sobre el impacto "+
"ambiental de la producción alimentaria, que permitan asegurar un equilibrio "+
"entre el desarrollo socioeconómico y los ecosistemas."+
"<br>9. Realizar consultorías, asesorías y peritajes técnicos referidos a: Composición"+ 
"de materias primas alimentarias, los aditivos alimentarios y los alimentos"+
"elaborados.");
carrera.setPerfil_carrera("Perfil del Graduado: "+
"El título de Licenciado en Tecnología de los Alimentos acredita una formación"+ 
"científica y técnica suficientemente amplia como para realizar su trabajo "+
"profesional de manera individual o integrándose a equipos multidisciplinarios, que"+ 
"permitan desarrollar las capacidades, competencias, actitudes y habilidades en lo "+
"concerniente a:"+
"<br>1. El conocimiento de las propiedades de las materias primas, su evolución en el"+ 
"curso de los tratamientos que soporta y la calidad de los productos "+
"alimenticios elaborados."+
"<br>2. La participación en el desarrollo de trabajos interdisciplinarios de prevención,"+ 
"control y solución de problemas originados en el procesamiento, "+
"comercialización, almacenaje y distribución de alimentos."+
"<br>3. El desarrollo de nuevos productos y la optimización de los procesos, tendientes"+ 
"al mejoramiento del nivel de nutrición de la población y la eficiencia de la "+
"producción."+
"<br>4. El control de calidad y legal de los alimentos y de sus procesos de fabricación,"+ 
"comercialización, almacenaje y distribución.");
carrera.setDuracion_carrera("4 años");
carrera.setId_grado(Constants.CARRERA_GRADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);


//// LICENCIADO EN CIENCIAS GEOLOGICAS
carrera=new Carrera();
carrera.setId_carrera(7);
carrera.setTitulo_carrera("LICENCIATURA EN CIENCIAS GEOLOGICAS");
carrera.setNivel_carrera("Título de Grado");
carrera.setAcreditacion_carrera("");
carrera.setPerfil_carrera("Es un graduado universitario con adecuada formación en Ciencias Básicas (Matemática, Física, Química) y profundo"+ 
"conocimiento de las Ciencias Geológicas. Posee además conocimientos suficientes en sus distintas aplicaciones y en las "+
"relacionadas con las orientaciones del plan de estudios."+
"<br>Tiene una sólida formación práctica, experimental, predictiva, dominio del lenguaje informático que le permite afrontar"+ 
"la actividad profesional individualmente o integrando equipos de trabajo. Evidencia equilibrio entre competencias en "+
"conocimientos disciplinares (teorías, métodos), experiencias en tareas laborales profesionales y versatilidad en lo relativo a la"+ 
"aplicación profesional del conocimiento."+
"<br>Posee una formación en investigación aplicable al área de las Ciencias Geológicas con actitud crítica y racional frente"+ 
"a los fenómenos de las Ciencias. Está preparado para enriquecer la práctica profesional y poder desarrollar nuevos "+
"procedimientos."+
"<br>Está capacitado para el trabajo en equipo disciplinario e interdisciplinario, potenciando la creatividad y la innovación."+
"<br>Está capacitado para actuar sobre la realidad aplicando los conocimientos científicos pa-ra transformarla, sin afectar "+
"su integridad. Tiene la formación práctica, experimental y teórica que garantiza su desarrollo profesional.");
carrera.setAlcance_carrera("El título profesional de Licenciado en Ciencias Geológicas habilita para:"+
"<br>1) Planificar, dirigir, evaluar y efectuar estudios destinados a determinar la estructura, composición y génesis de minerales, "+
"rocas y suelos."+
"<br>2) Planificar, dirigir, coordinar, supervisar, evaluar y efectuar estudios sobre la determinación de génesis, evolución,"+ 
"estructura, composición físico química y dinámica interna y externa de la Tierra y demás cuerpos celestes."+
"<br>3) Dirigir, evaluar y efectuar estudios tecnológicos de minerales, rocas, áridos y gemas."+
"<br>4) Planificar, dirigir, coordinar, supervisar, evaluar y efectuar estudios estratigráficos, paleontológicos, geocronológicos,"+ 
"geomorfológicos, geotectónicos, vulcanológicos, glaciológicos."+
"<br>5) Efectuar estudios geológicos de cuencas hídricas y participar en la planificación y evaluación de su ordenamiento y"+ 
"sistematización."+
"<br>6) Planificar, dirigir, supervisar, evaluar y efectuar estudios para determinar áreas de riesgos geológicos, elaborar"+ 
"propuestas de solución y efectuar su control."+
"<br>7) Planificar, dirigir, coordinar, supervisar, evaluar y efectuar estudios geotécnicos de macizos rocosos y suelos, realizando"+ 
"su caracterización y acondicionamiento para la fundación de obras de ingeniería y de arquitectura, realizar el control "+
"geológico de las mismas durante su desarrollo y posterior operación."+
"<br>8) Planificar, dirigir, supervisar, evaluar y efectuar estudios sobre los movimientos de suelos y rocas y realizar el control"+ 
"geológico durante la ejecución de los trabajos."+
"<br>9) Planificar, dirigir, coordinar, evaluar y efectuar prospección, exploración, evaluación y cuantificación de minerales, rocas y"+ 
"de yacimientos líquidos, sólidos y gaseosos."+
"<br>10) Planificar, dirigir, supervisar, evaluar y efectuar control geológico en la explotación de yacimientos y participar en la"+ 
"planificación y en el tratamiento y beneficio de minerales y rocas."+
"<br>11) Dirigir, supervisar y efectuar reconocimientos geológicos, ubicación, delimitación, mensura y representación gráfica de las"+ 
"concesiones, pertenencias y/o propiedades mine-ras."+
"<br>12) Planificar, dirigir, coordinar, supervisar, evaluar y ejecutar la exploración, explotación y conservación de los recursos"+ 
"hídricos y geotérmicos, y efectuar el control geológico de su evolución."+
"<br>13) Participar en el planeamiento, supervisión y evaluación de la explotación de recursos hídricos y geotérmicos."+
"<br>14) Planificar, ubicar, dirigir, supervisar, evaluar, efectuar y representar gráficamente perforaciones de investigación, de"+ 
"prospección, exploración y explotación de recursos hidrogeológicos, mineros, geotérmicos y geotécnicos."+
"<br>15) Ubicar, evaluar, realizar el control geológico y representar gráficamente las perforaciones vinculadas a hidrocarburos y"+ 
"participar en la planificación, supervisión y ejecución de la exploración y explotación de yacimientos."+
"<br>16) Elaborar y aplicar sistemas de clasificación, análisis y tipificación científica y tecnológica de minerales, rocas, suelos y"+ 
"aguas, y asesorar en la utilización de los mismos."+
"<br>17) Planificar, dirigir, supervisar y efectuar el reconocimiento, inventario, evaluación y re-presentación gráfica de suelos,"+ 
"desde el punto de vista geológico."+
"<br>18) Planificar, dirigir, supervisar y efectuar levantamientos y carteos topográficos geológicos de superficie y subterráneos,"+ 
"estudios fotogeológicos e interpretación visual y digital de imágenes obtenidas por teledetección."+
"<br>19) Participar en la elaboración y ejecución de planes y programas de conservación, mejoramiento y recuperación de suelos"+ 
"y habilitación de tierras."+
"<br>20) Participar en el planeamiento y ejecución de estudios y proyectos destinados a asentamientos humanos, al saneamiento"+ 
"ambiental y al impacto ambiental."+
"<br>21) Asesorar acerca del aprovechamiento de los recursos geológicos para la formulación de políticas, normas, planes y"+ 
"programas de desarrollo nacional, provincial y municipal."+
"<br>22) Efectuar y controlar valuaciones y tasaciones de recursos geológicos y de las alteraciones causadas por los mismos.LICENCIATURA EN CIENCIAS GEOLOGICAS"+
"<br>23) Realizar arbitrajes y peritajes relacionados con la detección y aprovechamiento de recursos geológicos y efectuar "+
"estudios para la determinación de riesgos geológicos y de su control.");
carrera.setDuracion_carrera("5 años");
carrera.setId_grado(Constants.CARRERA_GRADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

//CARRERAS DE PREGRADO
//TECNICO UNIVERSITARIO EN EXPLOTACION DE MINAS 2007 PERFIL Y ALCANCES
carrera=new Carrera();
carrera.setId_carrera(8);
carrera.setTitulo_carrera("TECNICO UNIVERSITARIO EN EXPLOTACION DE MINAS");
carrera.setNivel_carrera("Título de PreGrado");
carrera.setAcreditacion_carrera("");
carrera.setPerfil_carrera("");
carrera.setAlcance_carrera("");
carrera.setDuracion_carrera("3 años");
carrera.setId_grado(Constants.CARRERA_PREGADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

//TECNICO UNIVERSITARIO EN PROCESAMIENTO DE MINERALES 2007 PERFIL Y ALCANCES
carrera=new Carrera();
carrera.setId_carrera(9);
carrera.setTitulo_carrera("TECNICO UNIVERSITARIO EN PROCESAMIENTO DE MINERALES ");
carrera.setNivel_carrera("Título de PreGrado");
carrera.setAcreditacion_carrera("");
carrera.setPerfil_carrera("El Profesional egresado de la carrera de Técnico Universitario en Procesamiento de Minerales "+
"debe ser polivalente tal que le permita actuar de modo interdisciplinario con otras áreas involucradas en"+ 
"su actividad. Tiene la formación, conocimientos y habilidades para:"+
"<br>1. Operar, Controlar y mantener los procesos relacionados con el Procesamiento de Minerales,"+ 
"incluido la Metalurgia Extractiva."+
"<br>2. Dirigir y controlar la totalidad de las actividades requeridas hasta su efectiva concreción teniendo en"+ 
"cuenta los criterios de seguridad, impacto ambiental, relaciones humanas, calidad, productividad y "+
"costos."+
"<br>3. Desarrollar sus actividades en plena armonía con el medio ambiente."+ 
"<br>4. Buscar, seleccionar, aprender y aplicar nuevos conocimientos. "+
"<br>5. Desempeñarse en el ámbito científico, tecnológico y educativo."+
"<br>6. Desempeñarse en aplicaciones tecnológicas relacionadas con su formación profesional en temas"+ 
"referentes a su especialidad y afines. "+
"<br>7. Interpretar e implementar el diseño de una aplicación.");
carrera.setAlcance_carrera("El Técnico Universitario en Procesamiento de Minerales ejecuta las directivas de sus superiores"+ 
"en tareas y obras relacionadas con el Procesamiento de Minerales incluido la Metalurgia Extractiva."+
"<br>1. En el área del procesamiento de los materiales, está capacitado para operar plantas de trituración,"+ 
"molienda, clasificación y concentración de productos minerales, alimenticios y cualquier otro "+
"producto industrial. Capacitado para el estudio, diseño y ubicación de residuos industriales "+
"(relaves) y comunitarios, entre otros."+
"<br>2. En el campo de la metalurgia extractiva opera y controla plantas industriales donde se realizan"+ 
"procesos pirometalúrgicos, hidrometalúrgicos y combinados. Por su formación, entiende muy bien "+
"esta temática, debido a las asignaturas de la Ciencia de la Tierra que componen su curricula."+
"<br>3. Control de Higiene y seguridad en plantas industriales de procesamiento de minerales.");
carrera.setDuracion_carrera("3 años");
carrera.setId_grado(Constants.CARRERA_PREGADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

//ANALISTA PROGRAMADOR UNIVERSITARIO
carrera=new Carrera();
carrera.setId_carrera(10);
carrera.setTitulo_carrera("ANALISTA PROGRAMADOR UNIVERSITARIO");
carrera.setNivel_carrera("Título de PreGrado");
carrera.setAcreditacion_carrera("");
carrera.setPerfil_carrera("El Profesional egresado de la carrera Analista Programador Universitario, tiene la "+
"formación, conocimientos y habilidades para:"+
"<br>1. Manejar los distintos paradigmas de la programación."+
"<br>2. Seleccionar y aplicar lenguajes de programación de diferentes características."+
"<br>3. Desarrollar un pensamiento lógico y estructurado que le permita un correcto y eficiente"+ 
"desempeño en las actividades relacionadas con la programación y administración de "+
"datos."+
"<br>4. Es capaz de interpretar e implementar el diseño de una aplicación");
carrera.setAlcance_carrera("El título profesional obtenido por el Egresado de la carrera de Analista Programador" +
"Universitario, lo habilita para:"+
"<br>1. Programar, documentar, instalar, poner en marcha, operar, modificar, probar, medir,"+ 
"mantener y transformar software en general o incluido en sistemas informáticos."+
"<br>2. Asistir al Profesional de grado informático en tareas de relevamiento y análisis y diseño de"+ 
"sistemas informáticos de cualquier envergadura."+
"<br>3. Participar en equipos de trabajo para desarrollo o transferencia tecnológica relacionados"+ 
"con la producción y/o manipulación de software");
carrera.setDuracion_carrera("3 años");
carrera.setId_grado(Constants.CARRERA_PREGADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

/////////
///TÉCNICO UNIVERSITARIO EN CIENCIAS GEOLOGICAS
carrera=new Carrera();
carrera.setId_carrera(11);
carrera.setTitulo_carrera("TÉCNICO UNIVERSITARIO EN CIENCIAS GEOLOGICAS");
carrera.setNivel_carrera("Título de PreGrado");
carrera.setAcreditacion_carrera("");
carrera.setPerfil_carrera("El Técnico Universitario en Ciencias Geológicas posee conocimientos en Ciencias Básicas y una"+ 
"formación básica en áreas fundamentales de la Geología que le permiten encarar tareas auxiliares en "+
"investigación, peritajes, servicios técnicos y administrativos, colaborar en grupos que trabajan en la"+ 
"línea de la Geología Aplicada en el marco de las culturas regionales."+
"<br>Está capacitado para el trabajo en equipo disciplinario e interdisciplinario."+
"<br>Es competente en la aplicación del lenguaje informático pertinente.");
carrera.setAlcance_carrera("El título profesional de Técnico Universitario en Ciencias Geológicas habilita para:"+
"<br>1) Realizar tareas técnicas de investigación, integrando los equipos especializados."+
"<br>2) Realizar tareas auxiliares en equipos técnicos y/o de investigación, vinculadas con actividades"+ 
"geológicas de empresas privadas o del Estado."+
"<br>3) Realizar tareas auxiliares en el área geológica en museos, archivos, banco de datos"+ 
"informatizados, etc."+
"<br>4) Dar asistencia técnica a grupos que realicen viajes de turismo científico a lugares con sitios"+ 
"geológicos de interés."+
"<br>5) Participar como auxiliares en grupos que tengan a su cargo proyectos interdisciplinarios de"+ 
"protección, preservación y desarrollo de asentamientos humanos."+
"<br>6) Colaborar en tareas de arbitraje y peritaje relacionadas con la detección y aprovechamiento de"+ 
"recursos geológicos.");
carrera.setDuracion_carrera("3 años");
carrera.setId_grado(Constants.CARRERA_PREGADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

//////carrera=new Carrera();
carrera.setId_carrera(12);
carrera.setTitulo_carrera("TECNICATURA UNIVERSITARIA EN PERFORACIONES");
carrera.setNivel_carrera("Título de PreGrado");
carrera.setAcreditacion_carrera("");
carrera.setPerfil_carrera("");
carrera.setPerfil_carrera("");
carrera.setDuracion_carrera("3 años");
carrera.setId_grado(Constants.CARRERA_PREGADO);
carrera.setId_university(Constants.FACU_INGENIERIA_ID);
listCarrera.add(carrera);

carrera.setId_carrera(13);
carrera.setTitulo_carrera("TECNICATURA UNIVERSITARIA EN CIENCIAS DE LA TIERRA ORIENTADA A PETROLEO");
carrera.setNivel_carrera("Título de PreGrado");
carrera.setAcreditacion_carrera("");
carrera.setPerfil_carrera("");
carrera.setPerfil_carrera("");
carrera.setDuracion_carrera("3 años");
carrera.setId_grado(Constants.CARRERA_PREGADO);
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
		carrera.setAlcance_carrera("");
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
		carrera.setAlcance_carrera("");
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
		carrera.setAlcance_carrera("");
		carrera.setDuracion_carrera("4 1/2 Años (Incluye Trabajo Final y Práctica Profesional)     ");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_AGRAGRIA_ID);
		listCarrera.add(carrera);
		
		//////////////////////////////////
		carrera =new Carrera();
		carrera.setId_carrera(4);
		carrera.setTitulo_carrera("BROMATOLOGO");
		carrera.setNivel_carrera("Título de PreGrado");
		carrera.setAcreditacion_carrera("Bromatólogo");
		carrera.setPerfil_carrera("A través de su conocimiento el Licenciado en Bromatología podrá desempeñarse en:"+
"Planificación y supervisión de la sanidad e higiene de establecimientos y equipos relacionados a la producción y comercialización de productos alimenticios."+
"Interpretación de resultados de análisis y determinación de calidad y aptitud para el consumo y la comercialización de alimentos, en cuanto a origen, elaboración y conservación."+
"Docencia e investigación científica en Instituciones privadas u oficiales."+
"Trabajos en laboratorios para el análisis físico, químico y biológico a los efectos de determinar el grado de contaminación de las materias primas y los productos alimenticios.");
		carrera.setAlcance_carrera("");
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
	 carrera.setAlcance_carrera("");
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

     
	public List<Carrera>loadCarreraEconomica()
	{
		
		Carrera carrera=new Carrera();
		carrera.setId_carrera(1);
		carrera.setTitulo_carrera(" CONTADOR PUBLICO");
		carrera.setNivel_carrera("Título de Grado");
		carrera.setAcreditacion_carrera("");
		carrera.setPerfil_carrera("Planeamiento, organización, dirección, ejecución y control de actividades contables y de administración de recursos financieros"+
                                  "Análisis, interpretación, registro, clasificación y resumen de datos contables."+ 
                                  "Organización y ejecución de planes y políticas relacionadas con sistemas de información contable, y aplicación de tales sistemas con métodos de todo tipos incluyendo los electrónicos."+
                                  "Preparación y examen de información administrativa y contable y emisión de informes resultante de su evaluación ante organismos de toda índole o para publico conocimiento"+
"Examen y evaluación de pruebas y evidencias admisibles en juicio, para la tarea pericial y la actuación en concursos civiles y comerciales.-"+
"Interpretación de leyes decretos y resoluciones gubernamentales en materia administrativo-contable."+
"Organización y ejecución de procedimientos contables en la constitución, fusión, escisión y disolución de entidades de todo tipo."+
"Actuación en tareas administrativo-contables de la administración pública, interpretando las disposiciones que concierne a la información contable y emitiendo dictámenes sobre ellas."+
"Liquidación de impuestos y toda forma de gravámenes tributarios, interpretando las disposiciones que conciernen a tales temas y emitiendo dictámenes sobre ellas."+
"Liquidación de haberes y beneficios laborales, sus cargas y sus compensaciones sociales, interpretando las disposiciones que conciernen a ellas y emitiendo dictámenes al respecto."+
"Actuación en puestos de dirección y conducción de unidades de administración contable y financieras, en funciones subordinadas de línea o de asesoramiento en esa materia.");
	 carrera.setAlcance_carrera("");
	 carrera.setDuracion_carrera("5 años");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_ECONOMICA_ID);
	 listCarrera.add(carrera);
	
	 //LICENCIATURA EN ADMINISTRACIÓN
	 carrera=new Carrera();
	 carrera.setId_carrera(2);
	 carrera.setTitulo_carrera("LICENCIATURA EN ADMINISTRACIÓN");
	 carrera.setNivel_carrera("Título de Grado");
	 carrera.setAcreditacion_carrera("");
	 carrera.setPerfil_carrera("Además de la formación cultural impartida a los analistas, el egresado con título de Licenciado en Administración estará capacitado para desarrollar "+
	 "con toda destreza profesional las siguientes tareas:"+ 
     "1.-Planeamiento, organización, dirección, ejecución y control de la actividad empresaria en su conjunto"+
     "2.-Organización y ejecución de planes y políticas empresarias"+
     "3.-Organización de sistemas de información empresaria y el manejo y aplicación de métodos cibernéticos a la administración y gestión empresaria."+
     "4.-Análisis y evaluación de leyes, decretos, y resoluciones gubernamentales relativas a la gestión y administración empresaria."+
     "5.-Conducción de gestión empresaria en todas sus etapas: constitución, fusión, escisión, y disolución de entidades de todo tipo."+
     "6.-Actuación en la administración gubernamental, en los diferentes niveles de conducción, interpretando las disposiciones que conciernen a la gestión de las entidades gubernamentales."+
     "7.-Actuación en puestos de dirección y conducción de unidades operativas o administrativas o de dirección general en funciones de línea o de asesoramiento en materia de gestión empresaria."+
     "8.-Analizar la información estadística y económica para efectuar diagnósticos y el diseño de políticas y estrategias empresariales y gubernamentales."+
     "9.-Realizar estudios e investigaciones para la formulación y evaluación de proyectos de inversión, pequeños, medianos y grandes, tanto de naturaleza pública como privada."+
     "10.-Realizar el seguimiento y control de la ejecución de los proyectos de inversión"+
     "11.-Analizar la influencia de los procesos administrativos en la rentabilidad de las empresas y procesos de inversión de capital"+
     "12.-Actuar en todos los aspectos como agente de promoción del Desarrollo Económico."+
     "13.-Realizar investigaciones científicas y tecnológicas en el campo de las ciencias de la administración.");
	 carrera.setAlcance_carrera("");
	 carrera.setDuracion_carrera("5 años");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_ECONOMICA_ID);
	 listCarrera.add(carrera);
	
	 
	 //LICENCIADO EN ECONOMÍA
	 carrera=new Carrera();
	 carrera.setId_carrera(3);
	 carrera.setTitulo_carrera("LICENCIADO EN ECONOMIA - CONVENIO CON LA FACULTA DE NACIONAL DE TUCUMAN");
	 carrera.setNivel_carrera("Título de Grado");
	 carrera.setAcreditacion_carrera("");
	 carrera.setPerfil_carrera("" +
	 		"El egresado de esta carrera deberá estar capacitado para desarrollar con y toda destreza profesional las siguientes actividades:"+
            "Trabajar en entidades públicas (Ministerios, Gobernaciones, Intendencias, etc.)"+
            "Desempeñar actividades de asesoramiento en empresas privadas."+
            "Realizar diagnósticos, desarrollar, dirigir y coordinar."+
            "Funciones de planeamiento, organización, control de gestión de las actividades administrativas en su relación a lo económico, en entidades públicas como privadas."+
            "En cuanto a la especialización, formación que se desarrollará luego de los estudios de grado, se han ido delimitando áreas dada la diversidad de los campos con que se vincula la actividad de un economista: Finanzas, Economía de las Empresas, Comercio Exterior, Sector Público, etc.");
	 carrera.setAlcance_carrera("");
	 carrera.setDuracion_carrera("2 años");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_ECONOMICA_ID);
	 listCarrera.add(carrera);
	  
		
		return listCarrera;
	}


}
