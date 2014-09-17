package com.fe.bean.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.fe.R;
import com.fe.model.Carrera;
import com.fe.model.Comedor;
import com.fe.model.Constants;
import com.fe.model.ItemGrid;
import com.fe.model.Secretaria;

/**
 * Clase que permite generar la carga de elementos 
 * del grid 
 * @author Administrador
 *
 */
public final class UtilList {
  
	private static final List<ItemGrid> listItemGrid=new ArrayList<ItemGrid>();
	private static final List<Secretaria> listSecretarias=new ArrayList<Secretaria>();
	private static final List<Comedor> listComedor=new ArrayList<Comedor>();
	private static final List<Carrera> listCarrera=new ArrayList<Carrera>();
	
	/**
	 * Load Items Grid Principal
	 * Devuelve una lista de elementos de 
	 * ItemGrid : text - image
	 * @param res
	 * @return
	 */
	public static List<ItemGrid> loadItemGridPrincipal(Resources res)
	{
		listItemGrid.add(new ItemGrid("Mapa",res.getDrawable((R.drawable.location))));
		listItemGrid.add(new ItemGrid("Noticias",res.getDrawable(R.drawable.news)));
		listItemGrid.add(new ItemGrid("Comedor",res.getDrawable((R.drawable.tenedores))));
		listItemGrid.add(new ItemGrid("Secretarias",res.getDrawable(R.drawable.telephone_office)));
	    listItemGrid.add(new ItemGrid("Fotos",res.getDrawable(R.drawable.photo)));
	    listItemGrid.add(new ItemGrid("Eventos",res.getDrawable(R.drawable.calendar)));
	   // listItemGrid.add(new ItemGrid("Calendario",res.getDrawable(R.drawable.ic_launcher)));
	    listItemGrid.add(new ItemGrid("Autoridades",res.getDrawable(R.drawable.account))); 	
	    listItemGrid.add(new ItemGrid("Oferta Academica",res.getDrawable(R.drawable.university)));
	    
		return listItemGrid;
	}
	
	
	public static List<String> loadSecretaria()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Secretaria Bienestar");
		list.add("Secretaria Deporte");
		list.add("Secretaria Universitario");
		return list;
	}
	
	public static List<Secretaria> loadListSecretaria()
	{
		listSecretarias.add(
				new Secretaria("1",
						      "SECRETARIA GENERAL LEGAL Y TECNICA",
						      " Dr. C�sar Guillermo FARF�N", 
						      "descripcion",
						      "", 
						      "+54-(388)-4221-517",
						      "gfarfan@unju.edu.ar "));
		listSecretarias.add( new Secretaria(
				                 "2",
				                 "SECRETARIA DE ADMINISTRACION",
				                 "descripcion",
				                 "CPN Fernanda COLQUE",
				                 "direccion",
				                 "+54-(388)-4221-514",
				                 "secadmin@unju.edu.ar "));
		
		listSecretarias.add(new Secretaria(
				                           "3",
				                           "SECRETARIA DE CIENCIA Y TECNICA",
				                           "Dra. Mar�a Graciela del Valle BOVI MITRE",
				                           "descripcion",
				                           "direccion",
				                           "+54-(388)-4221-505",
				                           "secretariasectergb@unju.edu.ar"));
		listSecretarias.add(new Secretaria(
				                            "4",
				                           "SECRETARIA DE EXTENSION UNIVERSITARIA",
				                            "Dra. Elena Ester BELLI",
				                            "descripcion",
				                            "direccion",
				                            "+54-(388)-4244-100 ",
				                            "seu@unju.edu.ar"));
		listSecretarias.add(new Secretaria(
				                           "5",
				                           "SECRETARIO DE ASUNTOS ACADEMICOS",
				                          
				                           "Dr. Julio C�sar ARRUETA",
				                           "direccion",
				                           "descripcion",
				                           "+54-(388)-4221-504",
				                           "c.arrueta@unju.edu.ar"));
		listSecretarias.add(new Secretaria(
				                          "6",
				                         "SECRETARIO DE BIENESTAR UNIVERSITARIO",
				                         "Sr. Diego Esteban GUTIERREZ", 
				                         "descripcion"
				                         , "direccion", 
				                         " +54-(388)-4221-500", 
				                         "sbu@unju.edu.ar"));
		
		
		
		
		//listSecretarias.add(new )
		return listSecretarias;
		
		
	}
	
	public static List<Comedor> loadListComedor()
	{
		listComedor.add(new Comedor(1, "Bustamante","Comedor Bustamante", "00","00"));
	    listComedor.add(new Comedor(2,"Sociedad Obrera","Sociedad","00","00"));
	    listComedor.add(new Comedor(3, "Balcarce","Balcarce","0","0"));
		
	    return listComedor;
	}
	
	public static List<Carrera> loadListCarrera()
	{
	
		
	 return null;	
		
		
	}
	
	
	/**
	 * Load list Carrera Ingenieria
	 * @return
	 */
	public static List<Carrera>loadCarreraIngenieria()
	{
		//carrera de grado
		Carrera carrera=new Carrera();
		/*carrera.setId_carrera(1);
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
		carrera.setId_university(Constants.FACU_INGENIERIA_ID);*/
	
	    carrera=new Carrera();
		carrera.setId_carrera(1);
		carrera.setTitulo_carrera("INGENIER�A QU�MICA");
		carrera.setNivel_carrera("T�tulo de Grado");
		carrera.setAcreditacion_carrera(" Ingeniero Qu�mico");
		carrera.setPerfil_carrera("Perfil");
		carrera.setAlcance_carrera("Alcance");
		
		carrera.setDuracion_carrera("5 a�os");
		carrera.setId_grado(Constants.CARRERA_GRADO);
		carrera.setId_university(Constants.FACU_INGENIERIA_ID);
		
		
		listCarrera.add(carrera);
	   return listCarrera;
	}
	
	public static List<Carrera>loadCarreraEconomica()
	{
		
		return null;
	}
	
	
	
	
	
}
