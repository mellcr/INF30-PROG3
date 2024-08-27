import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
/* Colocar sus datos
Nombre: ...
Apellido: ...
*/
class Principal{
	public static void main(String[] args) throws Exception{
		//Creamos un objeto para manejo de fechas
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//Creamos a la productora
		Productora prod01 = new Productora(1,"Artes PERU");
		//Inicializamos los eventos de la productora
		prod01.setEventos(new ArrayList<>());
		//Creamos un concierto organizado por la productora
		Concierto concert01 = new Concierto("ENANITOS VERDES EN TRACCION ACUSTICA",10000.00,false,true,true);
		//Inicializamos las funciones del evento
		concert01.setFunciones(new ArrayList<>());
		//Creamos locales
		Local local01 = new Local("GRAN TEATRO NACIONAL","Av. Javier Prado Este 2225",1500);
		Local local02 = new Local("TEATRO PERUANO JAPONES","Av. Gregorio Escobedo 803",1025);
		//Creamos las funciones
		Funcion funcion01 = new Funcion(sdf.parse("01-04-2023"),LocalTime.of(20,00,00),LocalTime.of(22,00,00),local01);
		Funcion funcion02 = new Funcion(sdf.parse("02-04-2023"),LocalTime.of(20,00,00),LocalTime.of(22,00,00),local02);
		//Asociamos las funciones al evento
		concert01.getFunciones().add(funcion01);
		concert01.getFunciones().add(funcion02);
		//Creamos el artista
		Persona per01 = new Persona("MARCIANO CANTERO",OrigenArtista.INTERNACIONAL,"HORACIO", "CANTERO", sdf.parse("25-08-1960"), 'M');
		Persona per02 = new Persona("FELIPE STAITI",OrigenArtista.INTERNACIONAL,"DANIEL", "STAITI", sdf.parse("29-08-1961"), 'M');
		Persona per03 = new Persona("DANIEL PICCOLO",OrigenArtista.INTERNACIONAL,"DANIEL", "PICCOLO", sdf.parse("15-04-1959"), 'M');
		Agrupacion agrupacion01 = new Agrupacion("LOS ENANITOS VERDES",OrigenArtista.INTERNACIONAL, 1979);
		agrupacion01.setMiembros(new ArrayList<>());
		agrupacion01.getMiembros().add(per01);
		agrupacion01.getMiembros().add(per02);
		agrupacion01.getMiembros().add(per03);
		//Asociamos el artista al evento
		concert01.setArtistas(new ArrayList<>());
		concert01.getArtistas().add(agrupacion01);
		//Asociamos el evento a la productora
		prod01.getEventos().add(concert01);
		//Creamos una obra teatral organizada por la productora
		ObraTeatral obrat01 = new ObraTeatral("AMAR LO QUE HACES",10000.00,false,2,false);
		//Inicializamos las funciones del evento
		obrat01.setFunciones(new ArrayList<>());
		//Creamos la función
		Funcion funcion03 = new Funcion(sdf.parse("08-04-2023"),LocalTime.of(21,00,00),LocalTime.of(23,00,00),local01);
		//Asociamos la función al evento
		obrat01.getFunciones().add(funcion03);
		//Creamos la artista
		Persona per04 = new Persona("WENDY RAMOS",OrigenArtista.NACIONAL, "JANET","RAMOS", sdf.parse("01-12-1966"), 'F');
		//Asociamos el artista al evento
		obrat01.setArtistas(new ArrayList<>());
		obrat01.getArtistas().add(per04);
		//Asociamos el evento a la productora
		prod01.getEventos().add(obrat01);
		//Consultamos todos los eventos de la productora
		String reporte = prod01.consultarEventos();
		//Imprimimos el reporte
		System.out.print(reporte);
		/**/
	}
}
