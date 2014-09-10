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
		
		
	   return null;	
		
	}
}
