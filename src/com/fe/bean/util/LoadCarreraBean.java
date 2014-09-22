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
		
		
	   return null;	
		
	}
	
	
	public List<Carrera>loadCarreraCienciasSociales()
	{
		//Carreras de Grado 
		Carrera carrera=new Carrera();
		carrera.setId_carrera(1);
		carrera.setTitulo_carrera("Prof. y Lic. en Ciencias de la Educaci�n ");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera(null);
		carrera.setPerfil_carrera(
    "Planificar, conducir y evaluar procesos de ense�anza-aprendizaje para la educaci�n formal, no formal e informal; presencial y a distancia."+
    "Elaborar y evaluar modelos y propuestas curriculares, a nivel macro y micro educativo, para la educaci�n formal, no formal e informal; presencial y a distancia."+
    "Dise�ar, dirigir, ejecutar y evaluar planes, programas y proyectos y culturales."+
    "Elaborar, ejecutar y evaluar modelos y dise�os de administraci�n educacional."+
    "Dise�ar, dirigir, ejecutar y evaluar proyectos de investigaci�n educativa."+
    "Dise�ar, producir y evaluar materiales educativos de distinta tecnol�gica."+
    "Planificar, conducir y evaluar programas de formaci�n, perfeccionamiento y actualizaci�n, para el desempe�o de los distintos roles educativos."+
    "Dise�ar, dirigir, ejecutar y evaluar programas y proyectos destinados a la capacitaci�n de recursos humanos."+
    "Planificar, conducir y evaluar procesos de ense�anza-aprendizaje destinados a personas con necesidades especiales."+
    "Elaborar, ejecutar y evaluar planes, programas y proyectos y acciones de prevenci�n y asistencia psicopedag�gica, destinados a personas con dificultades de aprendizaje."+
    "Elaborar, ejecutar y evaluar planes, programas y proyectos de informaci�n y orientaci�n educacional, vocacional y ocupacional."+
    "Administrar y organizar unidades y servicios educativos y pedag�gicos."+
    "Asesorar en la formulaci�n de pol�ticas educativas y culturales."+
    "Asesorar en la elaboraci�n de normas jur�dicas en materia educativa y las inherentes a la actividad profesional."+
    "Brindar asesoramiento pedag�gico a instituciones educativas y comunitarias."+
    "Participar, desde la perspectiva educativa, en la elaboraci�n, ejecuci�n y evaluaci�n de planes, programas y proyectos de acci�n sociocultural en comunidades."+
    "Asesorar en la formulaci�n de criterios y normas destinadas a promover la dimensi�n educativa de los medios de comunicaci�n social."+
    "Asesorar para el dise�o y planeamiento de los espacios y de la infraestructura  destinados a actividades educativas, recreativas y culturales.");
	 carrera.setAlcance_carrera(null);
	 carrera.setDuracion_carrera("5 a�os");
	 carrera.setId_grado(Constants.CARRERA_GRADO);
	 carrera.setId_university(Constants.FACU_HUMANIDADES_ID);
	 listCarrera.add(carrera);
	 
	 carrera=new Carrera();
	 carrera.setId_carrera(2);
	 carrera.setTitulo_carrera(" Licenciatura en Comunicaci�n Social ");
	 carrera.setNivel_carrera(
     "T�tulo de Grado: Licenciado en Comunicaci�n Social (R.M. 1121/94)     4 a�os"+
     "T�tulo Intermedio: T�cnico en Comunicaci�n Social (R.M. 1121/94       3 a�os");
		
		
		return null;
		
		
	}
}
